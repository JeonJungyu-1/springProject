package com.scit.mini1.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scit.mini1.vo.MemberVO;

@Repository
public class MemberDao {

	@Autowired
	SqlSession session;
	
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
	
	public MemberVO login(String member_id) {
		MemberVO result = null;
		
		try {
			MemberMapper mapper = session.getMapper(MemberMapper.class);
			result = mapper.login(member_id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public MemberVO selectOne(String member_id) {
		MemberVO result = null;
		
		try {
			MemberMapper mapper = session.getMapper(MemberMapper.class);
			result = mapper.selectOne(member_id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public int updateLevel(MemberVO member) {
		int cnt = 0;
		
		try {
			MemberMapper mapper = session.getMapper(MemberMapper.class);
			cnt = mapper.updateLevel(member);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}
	
	public int updateExp(MemberVO member) {
		int cnt = 0;
		
		try {
			MemberMapper mapper = session.getMapper(MemberMapper.class);
			cnt = mapper.updateExp(member);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}
	
	public int updateBoss(MemberVO member) {
		int cnt = 0;
		
		try {
			MemberMapper mapper = session.getMapper(MemberMapper.class);
			cnt = mapper.updateBoss(member);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}
}
