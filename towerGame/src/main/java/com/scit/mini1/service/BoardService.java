package com.scit.mini1.service;

import java.io.FileInputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

import com.scit.mini1.dao.BoardDao;
import com.scit.mini1.util.FileService;
import com.scit.mini1.vo.BoardVO;

@Service
public class BoardService {

	@Autowired
	private HttpSession session;
	
	@Autowired
	private BoardDao dao;
	
	@Autowired
	private HttpServletResponse response;
	
	private static final String UPLOAD_PATH = "/uploadFiles";
	
	public HashMap<String, Object> search(String searchText) {
		HashMap<String, Object> result = dao.search(searchText);
		if (result == null) {
			result = new HashMap<String, Object>();
			result.put("path", "board/searchFailForm");
		}
		else {
			result.put("path", "board/detail");
		}
		return result;
	}
	
	
	public String update(BoardVO board, MultipartFile upload) {
		
		if (upload != null) {
			if (!upload.isEmpty()) {
				String original = upload.getOriginalFilename();
				String saved = FileService.saveFile(upload, UPLOAD_PATH);
				
				board.setBoard_original(original);
				board.setBoard_saved(saved);
			}
		}
		
		String loginId = (String)session.getAttribute("loginId");
		board.setMember_lastid(loginId);
		
		int cnt = dao.update(board);
		String path = "";
		
		if (cnt > 0) {
			String board_title;
			try {
				board_title = URLEncoder.encode(board.getBoard_title(), "UTF-8");
				path = "redirect:/board/search?searchText="+ board_title;
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
			path = "redirect:/board/searchForm";
		}
		return path;
	}
	
	public void download(String board_title) {
		BoardVO board = dao.selectOne(board_title);
		
		String originalFile = board.getBoard_original();
		
		try {
			response.setHeader("Content-Disposition", "attachment;filename="+ URLEncoder.encode(originalFile, "UTF-8").replaceAll("\\+", "%20"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String fullPath = UPLOAD_PATH + "/" + board.getBoard_saved();
		
		FileInputStream filein = null;
		ServletOutputStream fileout = null;
		
		try {
			filein = new FileInputStream(fullPath);
			fileout = response.getOutputStream();
			
			FileCopyUtils.copy(filein, fileout);
			
			filein.close();
			fileout.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String deleteFile(String board_title) {
		
		String path = null;
		int cnt = 0;
		BoardVO board = dao.selectOne(board_title);
		
		if (board.getBoard_saved() != null) {
			cnt = dao.updateDeleteFile(board_title);
			if (cnt > 0) {
				String fullFath = UPLOAD_PATH + "/" + board.getBoard_saved();
				FileService.deleteFile(fullFath);				
			}
		}
		try {
			board_title = URLEncoder.encode(board.getBoard_title(), "UTF-8");
			path = "redirect:/board/updateForm?board_title="+board_title;
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		return path;
		
	}
	
}
