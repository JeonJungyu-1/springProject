package com.scit.mini1.dao;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scit.mini1.vo.BoardVO;

@Repository
public class BoardDao {

	@Autowired
	private SqlSession session;
	
	public HashMap<String, Object> search(String searchText) {
		HashMap<String, Object> result = null;
		
		try {
			BoardMapper mapper = session.getMapper(BoardMapper.class);
			result = mapper.search(searchText);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	
	public int update(BoardVO board) {
		int cnt = 0;
		
		try {
			BoardMapper mapper = session.getMapper(BoardMapper.class);
			cnt = mapper.update(board);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}
	
	public BoardVO selectOne(String board_title) {
		BoardVO result = null;
		
		try {
			BoardMapper mapper = session.getMapper(BoardMapper.class);
			result = mapper.selectOne(board_title);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public int updateDeleteFile(String board_title) {
		int cnt = 0;
		try {
			BoardMapper mapper = session.getMapper(BoardMapper.class);
			cnt = mapper.updateDeleteFile(board_title);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return cnt;
	}
}
