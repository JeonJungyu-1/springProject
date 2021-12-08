package com.scit.test11.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scit.test11.vo.MemberVO;
import com.scit.test11.vo.UserCharacterVO;

@Repository
public class MemberDao {
	
	@Autowired
	private SqlSession session;
	
	public int join(MemberVO member) {
		int cnt = 0;
		
		try {
			MemberMapper mapper = session.getMapper(MemberMapper.class);
			cnt = mapper.join(member);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}
	
	public MemberVO login(String userId) {
		MemberVO result = null;
		
		try {
			MemberMapper mapper = session.getMapper(MemberMapper.class);
			result = mapper.login(userId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public ArrayList<UserCharacterVO> listForm(UserCharacterVO userCharacter) {
		ArrayList<UserCharacterVO> result = null;
		
		try {
			MemberMapper mapper = session.getMapper(MemberMapper.class);
			result = mapper.listForm(userCharacter);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public int hitterCreate(UserCharacterVO usercharacter) {
		int result = 0;
		
		try {
			MemberMapper mapper = session.getMapper(MemberMapper.class);
			result = mapper.hitterCreate(usercharacter);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public int pitcherCreate(UserCharacterVO usercharacter) {
		int result = 0;
		
		try {
			MemberMapper mapper = session.getMapper(MemberMapper.class);
			result = mapper.pitcherCreate(usercharacter);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public int characterDelete(UserCharacterVO userCharacter) {
		int result = 0;
		
		try {
			MemberMapper mapper = session.getMapper(MemberMapper.class);
			result = mapper.characterDelete(userCharacter);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
}
