package com.scit.mini1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.scit.mini1.service.MemberService;
import com.scit.mini1.service.TowerService;
import com.scit.mini1.util.PageNavigator;
import com.scit.mini1.vo.MemberVO;
import com.scit.mini1.vo.TowerMonsterVO;
import com.scit.mini1.vo.TowerVO;

@Controller
public class TowerController {

	@Autowired
	private TowerService service;
	
	@Autowired
	private MemberService serviceM;
	
	private final int countPerPage = 1;
	private final int pagePerGroup = 5;
	
	@RequestMapping(value="/tower/towerForm" , method = RequestMethod.GET)
	public String towerForm(Model model
			, @RequestParam(name = "currentPage" , defaultValue = "1") int currentPage) {
		int currentTower = currentPage;
		int totalRecordsCount = service.totalRecord();
		
		PageNavigator navi = new PageNavigator(countPerPage, pagePerGroup, currentPage, totalRecordsCount);
		
		TowerVO result = service.tower(navi.getCurrentPage(), navi.getStartRecord(), navi.getCountPerPage());
		MemberVO member = serviceM.selectOne();
		TowerMonsterVO towermon = service.towerMonster(result.getTower_boss());
		model.addAttribute("result", result);
		model.addAttribute("navi", navi);
		model.addAttribute("member", member);
		model.addAttribute("towermon", towermon);
		
		return "tower/towerForm";
	}
	
	@RequestMapping(value="/tower/fight" , method = RequestMethod.GET)
	public String fight(int tower_floor) {
		return service.fight(tower_floor);
	}
	
	@RequestMapping(value="/tower/victoryForm" , method = RequestMethod.GET)
	public String victoryForm(Model model, int tower_floor) {
		model.addAttribute("tower_floor", tower_floor);
		return "tower/victoryForm";
	}
	
	@RequestMapping(value="/tower/defeatForm" , method = RequestMethod.GET)
	public String defeatForm(Model model, int tower_floor) {
		model.addAttribute("tower_floor", tower_floor);
		return "tower/defeatForm";
	}
	
}
