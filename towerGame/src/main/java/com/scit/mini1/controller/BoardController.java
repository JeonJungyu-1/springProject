package com.scit.mini1.controller;

import java.awt.geom.GeneralPath;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.scit.mini1.service.BoardService;
import com.scit.mini1.vo.BoardVO;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService service;
	
	
	@RequestMapping(value="/board/searchForm" , method=RequestMethod.GET)
	public String searchForm() {
		return "board/searchForm";
	}

	@RequestMapping(value="/board/search" , method=RequestMethod.GET)
	public String search(Model model
			, @RequestParam(name="searchText" , defaultValue = "") String searchText) {
		HashMap<String, Object> result = service.search(searchText);
		model.addAttribute("result", result);
		return (String)result.get("path");
	}
	
	@RequestMapping(value="/board/updateForm" , method=RequestMethod.GET)
	public String updateForm(String board_title, Model model) {
		HashMap<String, Object> result = service.search(board_title);
		model.addAttribute("result", result);
		return "board/updateForm";
	}
	
	@RequestMapping(value="/board/update" , method=RequestMethod.POST)
	public String update(BoardVO board, MultipartFile upload) {
		return service.update(board, upload);
	}
	
	@RequestMapping(value="/board/download" , method=RequestMethod.GET)
	public String download(String board_title) {
		service.download(board_title);
		return null;
	}
	
	@RequestMapping(value="/board/deleteFile" , method=RequestMethod.GET)
	public String deleteFile(String board_title) {
		return service.deleteFile(board_title);
	}
	
}
