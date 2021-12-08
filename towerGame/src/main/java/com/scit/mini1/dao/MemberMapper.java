package com.scit.mini1.dao;

import com.scit.mini1.vo.MemberVO;

public interface MemberMapper {
	//회원가입
	public int join(MemberVO member);
	//로그인(아이디 보내고 그 아이디의 회원정보 일부 받음)
	public MemberVO login(String member_id);
	//1명의 회원 정보 모두 가져오기
	public MemberVO selectOne(String member_id);
	//레벨 업데이트
	public int updateLevel(MemberVO member);
	//경험치 업데이트
	public int updateExp(MemberVO member);
	//보스라운드 업데이트
	public int updateBoss(MemberVO member);

}
