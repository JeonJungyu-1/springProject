package com.scit.mini1.dao;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scit.mini1.vo.TowerMonsterVO;
import com.scit.mini1.vo.TowerVO;

@Repository
public class TowerDao {

	@Autowired
	private SqlSession session;
	
	public int totalRecord() {
		int cnt = 0;
		
		try {
			TowerMapper mapper = session.getMapper(TowerMapper.class);
			cnt = mapper.totalRecord();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}
	
	public TowerVO tower(int currentTower, int startRecord, int countPerPage) {
		TowerVO result = null;
		
		try {
			TowerMapper mapper = session.getMapper(TowerMapper.class);
			RowBounds rb = new RowBounds(startRecord, countPerPage);
			result = mapper.tower(currentTower, rb);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public TowerMonsterVO towerMonster(TowerMonsterVO towermon) {
		TowerMonsterVO result = null;
		
		try {
			TowerMapper mapper = session.getMapper(TowerMapper.class);
			result = mapper.towerMonster(towermon);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
