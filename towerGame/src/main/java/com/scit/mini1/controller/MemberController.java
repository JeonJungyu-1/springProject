package com.scit.mini1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scit.mini1.service.MemberService;
import com.scit.mini1.vo.MemberVO;

@Controller
public class MemberController {

	@Autowired
	MemberService service;
	
	
	@RequestMapping(value="/member/joinForm" , method=RequestMethod.GET)
	public String joinForm() {
		return "member/joinForm";
	}
	
	@RequestMapping(value="/member/join" , method=RequestMethod.POST)
	public String join(MemberVO member) {
		return service.join(member);
	}
	
	@RequestMapping(value="/member/loginForm" , method=RequestMethod.GET)
	public String loginForm() {
		return "member/loginForm";
	}
	
	@RequestMapping(value="/member/login" , method=RequestMethod.POST)
	public String login(MemberVO member) {
		return service.login(member);
	}
	
	@RequestMapping(value="/member/logout" , method=RequestMethod.GET)
	public String logout() {
		service.logout();
		return "redirect:/";
	}
}
