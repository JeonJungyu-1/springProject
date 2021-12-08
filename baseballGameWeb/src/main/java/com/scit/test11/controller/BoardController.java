package com.scit.test11.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scit.test11.service.BoardService;
import com.scit.test11.vo.BoardVO;

@Controller
public class BoardController {
	
	@Autowired
	BoardService service;
	
	@RequestMapping(value="/board/listForm" , method=RequestMethod.GET)
	public String listForm(Model model, String member_id) {
		ArrayList<BoardVO> result = service.list(member_id);
		
		model.addAttribute("result", result);
		model.addAttribute("member_id", member_id);
		
		return "board/listForm";
	}
	
	@RequestMapping(value="/board/writeForm" , method=RequestMethod.GET)
	public String writeForm() {
		return "board/writeForm";
	}
	
	@RequestMapping(value="/board/write" , method=RequestMethod.POST)
	public String write(BoardVO board) {
		return service.write(board);
	}
	
	@RequestMapping(value="/board/detail" , method=RequestMethod.GET)
	public String detail(Model model, int board_num) {
		BoardVO result = service.detail(board_num);
		
		model.addAttribute("result", result);
		
		return "board/detail";
	}
	
	@RequestMapping(value="/board/like" , method=RequestMethod.GET)
	public String like(int board_num) {
		service.like(board_num);
		
		return "redirect:/board/detail?board_num="+board_num;
	}
	
	@RequestMapping(value="/board/updateForm" , method=RequestMethod.GET)
	public String updateForm(Model model, int board_num) {
		BoardVO result = service.detail(board_num);
		
		model.addAttribute("result", result);
		return "board/updateForm";
	}
	
	@RequestMapping(value="/board/update" , method=RequestMethod.POST)
	public String update(BoardVO board) {
		return service.update(board);
	}
	
	@RequestMapping(value="/board/delete" , method=RequestMethod.GET)
	public String delete(BoardVO board) {
		return service.delete(board);
	}

}
