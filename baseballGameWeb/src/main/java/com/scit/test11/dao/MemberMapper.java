package com.scit.test11.dao;

import java.util.ArrayList;

import com.scit.test11.vo.MemberVO;
import com.scit.test11.vo.UserCharacterVO;

public interface MemberMapper {
	//회원가입
	public int join(MemberVO member);
	//로그인
	public MemberVO login(String userId);
	//회원목록
	public ArrayList<UserCharacterVO> listForm(UserCharacterVO userCharacter);
	public int hitterCreate(UserCharacterVO userCharacter);
	public int pitcherCreate(UserCharacterVO userCharacter);
	public int characterDelete(UserCharacterVO userCharacter);
}
