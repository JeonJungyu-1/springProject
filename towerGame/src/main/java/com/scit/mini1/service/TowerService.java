package com.scit.mini1.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scit.mini1.dao.MemberDao;
import com.scit.mini1.dao.TowerDao;
import com.scit.mini1.vo.MemberVO;
import com.scit.mini1.vo.TowerMonsterVO;
import com.scit.mini1.vo.TowerVO;

@Service
public class TowerService {

	@Autowired
	private TowerDao dao;
	
	@Autowired
	private MemberDao daoM;
	
	@Autowired
	private HttpSession session;
	
	public int totalRecord() {
		return dao.totalRecord();
	}
	
	public TowerVO tower(int currentTower, int startRecord, int countPerPage) {
		String loginId = (String)session.getAttribute("loginId");
		MemberVO member = daoM.selectOne(loginId);
		if ((currentTower-1)/5 > member.getMember_boss()) {
			currentTower = (member.getMember_boss()+1)*5;
		}
		TowerVO result = dao.tower(currentTower, startRecord, countPerPage);
		
		return result;
	}
	
	public TowerMonsterVO towerMonster(int tower_boss) {
		TowerMonsterVO towermon = new TowerMonsterVO();
		TowerMonsterVO result = null;
		towermon.setMonster_boss(tower_boss);
		if(tower_boss == 1) {
			towermon.setMonster_num((int)(Math.random()*4) + 101);			
		}
		else {
			towermon.setMonster_num((int)(Math.random()*9) + 1);			
		}
		result = dao.towerMonster(towermon);
		return result;
		
	}
	
	public String fight(int tower_floor) {
		String path = "";
		String loginId = (String)session.getAttribute("loginId");
		MemberVO member = daoM.selectOne(loginId);
		if (member.getMember_attack() >= (tower_floor*5)) {
			member.setMember_exp((tower_floor/5)+3);
			daoM.updateExp(member);
			member = daoM.selectOne(loginId);
			if (tower_floor%5 == 0) {
				if ((tower_floor/5) > member.getMember_boss()) {
					member.setMember_boss(tower_floor/5);
					daoM.updateBoss(member);
				}
			}
			
			if (member.getMember_exp() >= 10) {
				daoM.updateLevel(member);				
			}
			path = "redirect:/tower/victoryForm?tower_floor="+tower_floor;
		}
		else {
			path = "redirect:/tower/defeatForm?tower_floor="+tower_floor;
		}
		return path;
	}
}
