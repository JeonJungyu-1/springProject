package com.scit.test11.service;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scit.test11.dao.MemberDao;
import com.scit.test11.vo.MemberVO;
import com.scit.test11.vo.UserCharacterVO;

@Service
public class MemberService {
	
	@Autowired
	private MemberDao dao;
	
	@Autowired
	private HttpSession session;
	
	public String join(MemberVO member) {
		int cnt = dao.join(member);
		String path = "";
		
		if (cnt > 0) {
			path = "redirect:/";
		}
		else {
			path = "redirect:/joinForm";
		}
		return path;
	}
	
	public String login(MemberVO member) {
		MemberVO result = dao.login(member.getUserId());
		String path = "";
		
		if(result == null) {
			path = "redirect:/member/loginForm";
		}
		else {
			if(member.getPassword().equals(result.getPassword())) {
				session.setAttribute("loginId", result.getUserId());
				path = "redirect:/member/characterMenu";
			}
			else {
				path = "redirect:/member/loginForm";
			}
		}
		
		return path;
	}
	
	public void logout() {
		session.removeAttribute("loginId");
		session.removeAttribute("classNm");
		session.removeAttribute("characterId");
	}
	
	public void list(String className) {
		session.setAttribute("classNm", className);
	}
	
	public ArrayList<UserCharacterVO> listForm() {
		String className = (String)session.getAttribute("classNm");
		String loginId = (String)session.getAttribute("loginId");
		UserCharacterVO userCharacter = new UserCharacterVO();
		userCharacter.setUserId(loginId);
		userCharacter.setClassName(className);
		return dao.listForm(userCharacter);
	}
	
	public ArrayList<UserCharacterVO> listForm(String className) {
		String loginId = (String)session.getAttribute("loginId");
		UserCharacterVO userCharacter = new UserCharacterVO();
		userCharacter.setUserId(loginId);
		userCharacter.setClassName(className);
		return dao.listForm(userCharacter);
	}
	
	public int hitterCreate(String characterName) {
		String loginId = (String)session.getAttribute("loginId");
		UserCharacterVO userCharacter = new UserCharacterVO();
		userCharacter.setUserId(loginId);
		userCharacter.setClassName("타자");
		userCharacter.setCharacterName(characterName);
		int result = dao.hitterCreate(userCharacter);
		if (result == 1) {
			return 1;
		}
		else {
			return 2;
		}
	}
	
	public int pitcherCreate(String characterName) {
		String loginId = (String)session.getAttribute("loginId");
		UserCharacterVO userCharacter = new UserCharacterVO();
		userCharacter.setUserId(loginId);
		userCharacter.setClassName("투수");
		userCharacter.setCharacterName(characterName);
		int result = dao.pitcherCreate(userCharacter);
		if (result == 1) {
			return 1;
		}
		else {
			return 2;
		}
	}
	
	public int characterDelete(int characterId) {
		String loginId = (String)session.getAttribute("loginId");
		UserCharacterVO userCharacter = new UserCharacterVO();
		userCharacter.setUserId(loginId);
		userCharacter.setCharacterId(characterId);
		int result = dao.characterDelete(userCharacter);
		if (result == 1) {
			return 1;
		}
		else {
			return 2;
		}
	}

	
}
