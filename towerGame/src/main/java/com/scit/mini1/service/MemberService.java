package com.scit.mini1.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scit.mini1.dao.MemberDao;
import com.scit.mini1.vo.MemberVO;

@Service
public class MemberService {

	@Autowired
	MemberDao dao;
	
	@Autowired
	HttpSession session;
	
	public String join(MemberVO member) {
		int cnt = 0;
		String path = "";
		
		cnt = dao.join(member);
		
		if (cnt > 0) {
			path = "redirect:/";
		}
		else {
			path = "redirect:/member/joinForm";
		}
		return path;
	}
	
	public String login(MemberVO member) {
		String path = "";
		MemberVO result = dao.login(member.getMember_id());
		
		if (result == null) {
			return "redirect:/member/loginForm";
		}
		else {
			if (member.getMember_password().equals(result.getMember_password())) {
				session.setAttribute("loginId", member.getMember_id());
				session.setAttribute("loginNm", member.getMember_name());
				return "redirect:/mainForm";
			}
			else {
				return "redirect:/member/loginForm";
			}
		}
		
	}
	
	public void logout() {
		session.removeAttribute("loginId");
		session.removeAttribute("loginNm");
	}
	
	public MemberVO selectOne() {
		String loginId = (String)session.getAttribute("loginId");
		return dao.selectOne(loginId);
	}
}
