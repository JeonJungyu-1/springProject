package com.scit.test11.dao;

import java.util.ArrayList;

import com.scit.test11.vo.BoardVO;

public interface BoardMapper {
	//글목록
	public ArrayList<BoardVO> list(String member_id);
	//글쓰기
	public int write(BoardVO board);
	//글 정보
	public BoardVO detail(int board_num);
	//추천수 증가
	public void like(int board_num);
	//글 수정
	public int update(BoardVO board);
	//글 삭제
	public int delete(BoardVO board);
}
