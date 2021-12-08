package com.scit.test11.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.scit.test11.service.MemberService;
import com.scit.test11.vo.MemberVO;
import com.scit.test11.vo.UserCharacterVO;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService service;
	
	
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
	
	@RequestMapping(value="/member/classSelect" , method=RequestMethod.GET)
	public String classSelect() {
		return "member/classSelect";
	}
	
	@RequestMapping(value="/member/list" , method=RequestMethod.GET)
	public String list(String className) {
		service.list(className);
		return "redirect:/member/listForm";
	}
	
	@RequestMapping(value="/member/listForm" , method=RequestMethod.GET)
	public String listForm(Model model) {
		ArrayList<UserCharacterVO> result = service.listForm();
		
		model.addAttribute("result", result);
		
		return "member/listForm";
	}
	
	@RequestMapping(value="/member/characterMenu" , method=RequestMethod.GET)
	public String characterMenu(Model model, 
			@RequestParam(name = "yes" , defaultValue = "0") int yes) {
		model.addAttribute("yes", yes);
		return "member/characterMenu";
	}
	
	@RequestMapping(value="/member/characterCreateForm" , method=RequestMethod.GET)
	public String characterCreateForm() {
		return "member/characterCreateForm";
	}
	
	@RequestMapping(value = "/member/hitterCreate" , method=RequestMethod.GET)
	public String hitterCreate(Model model, String characterName) {
		int yes = service.hitterCreate(characterName);
		model.addAttribute("yes", yes);
		return "redirect:/member/characterCreateForm";

	}
	
	@RequestMapping(value = "/member/pitcherCreate" , method=RequestMethod.GET)
	public String pitcherCreate(Model model, String characterName) {
		int yes = service.pitcherCreate(characterName);
		model.addAttribute("yes", yes);
		return "redirect:/member/characterCreateForm";
	}
	
	@RequestMapping(value = "/member/characterDeleteForm" , method=RequestMethod.GET)
	public String characterDeleteForm(Model model) {
		ArrayList<UserCharacterVO> result = service.listForm("타자");
		ArrayList<UserCharacterVO> result2 = service.listForm("투수");
		model.addAttribute("result", result);
		model.addAttribute("result2", result2);
		return "member/characterDeleteForm";
	}
	
	@RequestMapping(value = "/member/characterDelete" , method=RequestMethod.GET)
	public String characterDelete(Model model, int characterId) {
		int yes = service.characterDelete(characterId);
		model.addAttribute("yes", yes);
		return "redirect:/member/characterDeleteForm";
	}
	
}
