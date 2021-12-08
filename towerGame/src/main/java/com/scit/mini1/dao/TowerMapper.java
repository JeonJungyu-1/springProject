package com.scit.mini1.dao;

import org.apache.ibatis.session.RowBounds;

import com.scit.mini1.vo.TowerMonsterVO;
import com.scit.mini1.vo.TowerVO;

public interface TowerMapper {
	//타워 개수
	public int totalRecord();
	//타워 불러오기
	public TowerVO tower(int currentTower, RowBounds rb);
	//몬스터 정보
	public TowerMonsterVO towerMonster(TowerMonsterVO towermon);
	
}
