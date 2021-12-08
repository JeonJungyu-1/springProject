package com.scit.mini1.dao;

import java.util.HashMap;

import com.scit.mini1.vo.BoardVO;

public interface BoardMapper {
	//글 정보 불러오기
	public HashMap<String, Object> search(String searchText);
	//글 업데이트
	public int update(BoardVO board);
	//글 제목을 보내서 글 1개 받아오기
	public BoardVO selectOne(String board_title);
	//파일 삭제 후 파일 정보 업데이트
	public int updateDeleteFile(String board_title);
}
