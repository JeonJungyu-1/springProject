package com.scit.test11.service;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scit.test11.dao.BoardDao;
import com.scit.test11.vo.BoardVO;

@Service
public class BoardService {
	
	@Autowired
	BoardDao dao;
	
	@Autowired
	HttpSession session;
	
	public ArrayList<BoardVO> list(String member_id) {
		return dao.list(member_id);
	}
	
	public String write(BoardVO board) {
		int cnt = 0;
		String path = "";
		
		String loginId = (String)session.getAttribute("loginId");
		board.setMember_id(loginId);
		
		cnt = dao.write(board);
		
		if (cnt > 0) {
			path = "redirect:/board/listForm?member_id="+board.getMember_id();
		}
		else {
			path = "redirect:/board/writeForm";
		}
		return path;
	}
	
	public BoardVO detail(int board_num) {
		return dao.detail(board_num);
	}
	
	public void like(int board_num) {
		dao.like(board_num);
	}
	
	public String update(BoardVO board) {
		int cnt = 0;
		String path = "";
		
		String loginId = (String)session.getAttribute("loginId");
		board.setMember_id(loginId);
		
		cnt = dao.update(board);
		
		if (cnt > 0) {
			path = "redirect:/board/detail?board_num="+board.getBoard_num();
		}
		else {
			path = "redirect:/board/listForm?member_id="+board.getMember_id();
		}
		return path;
	}
	
	public String delete(BoardVO board) {
		int cnt = 0;
		String path = "";
		
		String loginId = (String)session.getAttribute("loginId");
		board.setMember_id(loginId);
		
		cnt = dao.delete(board);
		
		if (cnt > 0) {
			path = "redirect:/board/listForm?member_id="+board.getMember_id();
		}
		else {
			path = "redirect:/board/detail?board_num="+board.getBoard_num();
		}
		return path;
		
	}
	
}
