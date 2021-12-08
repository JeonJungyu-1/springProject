package com.scit.test11.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scit.test11.vo.BoardVO;

@Repository
public class BoardDao {
	
	@Autowired
	SqlSession session;
	
	public ArrayList<BoardVO> list(String member_id) {
		ArrayList<BoardVO> result = null;
		
		try {
			BoardMapper mapper = session.getMapper(BoardMapper.class);
			result = mapper.list(member_id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public int write(BoardVO board) {
		int cnt = 0;
		
		try {
			BoardMapper mapper = session.getMapper(BoardMapper.class);
			cnt = mapper.write(board);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}
	
	public BoardVO detail(int board_num) {
		BoardVO result = null;
		
		try {
			BoardMapper mapper = session.getMapper(BoardMapper.class);
			result = mapper.detail(board_num);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public void like(int board_num) {
		
		try {
			BoardMapper mapper = session.getMapper(BoardMapper.class);
			mapper.like(board_num);
		} catch (Exception e) {
			e.printStackTrace();
		}
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
	
	public int delete(BoardVO board) {
		int cnt = 0;
		
		try {
			BoardMapper mapper = session.getMapper(BoardMapper.class);
			cnt = mapper.delete(board);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}
}
