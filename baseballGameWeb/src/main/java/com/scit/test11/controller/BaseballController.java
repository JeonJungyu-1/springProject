package com.scit.test11.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.scit.test11.service.BaseballService;
import com.scit.test11.util.PageNavigator;
import com.scit.test11.vo.ItemVO;
import com.scit.test11.vo.QuizCheckVO;
import com.scit.test11.vo.QuizScoreVO;
import com.scit.test11.vo.QuizVO;
import com.scit.test11.vo.TrainingVO;
import com.scit.test11.vo.UserCharacterVO;

@Controller
public class BaseballController {
	
	@Autowired
	BaseballService service;
	
	private final int countPerPage = 5;
	private final int pagePerGroup = 5;
	
	@RequestMapping(value = "/rank" , method=RequestMethod.GET)
	public String rank(Model model
			, @RequestParam(name = "currentPage" , defaultValue = "1") int currentPage) {
		int totalRecordsCount = service.totalNow();
		
		PageNavigator navi = new PageNavigator(countPerPage, pagePerGroup, currentPage, totalRecordsCount);
		ArrayList<UserCharacterVO> result = service.rank(navi.getCurrentPage(), navi.getStartRecord(), navi.getCountPerPage());
		model.addAttribute("result", result);
		model.addAttribute("navi", navi);
		return "rank";
	}
	
	@RequestMapping(value = "/hof" , method=RequestMethod.GET)
	public String hof(Model model) {
		ArrayList<UserCharacterVO> result = service.hof();
		model.addAttribute("result", result);
		return "hof";
	}
	
	
	@RequestMapping(value = "/baseball/main" , method=RequestMethod.GET)
	public String main(int characterId) {
		service.main(characterId);
		return "redirect:/baseball/mainMenu";
	}
	
	
	@RequestMapping(value = "/baseball/mainMenu" , method=RequestMethod.GET)
	public String mainMenu() {
		return "baseball/mainMenu";
	}
	
	@RequestMapping(value = "/baseball/characterInfoMenu" , method=RequestMethod.GET)
	public String characterInfoMenu() {
		return "baseball/characterInfoMenu";
	}
	
	@RequestMapping(value = "/baseball/characterStat" , method=RequestMethod.GET)
	public String characterStat(Model model) {
		UserCharacterVO result = service.characterStat();
		ArrayList<ItemVO> item = service.itemEquipHaveForm();
		model.addAttribute("result", result);
		model.addAttribute("item", item);
		return "baseball/characterStat";
	}
	
	@RequestMapping(value = "/baseball/restForm" , method=RequestMethod.GET)
	public String restForm() {
		return "baseball/restForm";
	}
	
	@RequestMapping(value = "/baseball/rest1" , method=RequestMethod.GET)
	public String rest1(Model model) {
		int result = service.rest1();
		model.addAttribute("result", result);
		return "redirect:/baseball/restForm";
	}
	
	@RequestMapping(value = "/baseball/rest2" , method=RequestMethod.GET)
	public String rest2(Model model) {
		int result = service.rest2();
		model.addAttribute("result" , result);
		return "redirect:/baseball/restForm";
	}
	
	@RequestMapping(value = "/baseball/playForm" , method=RequestMethod.GET)
	public String playForm(Model model, 
			@RequestParam(name = "yes" , defaultValue = "0") int yes) {
		model.addAttribute("yes", yes);
		return "baseball/playForm";
	}
	
	@RequestMapping(value = "/baseball/play" , method=RequestMethod.GET)
	public String play() {
		String result = service.play();
		return result;
	}
	
	@RequestMapping(value = "/baseball/trainingForm" , method=RequestMethod.GET)
	public String trainingForm() {
		return "baseball/trainingForm";
	}
	
	@RequestMapping(value = "/baseball/coachForm" , method=RequestMethod.GET)
	public String coachForm(Model model, int trainingId) {
		model.addAttribute("trainingId", trainingId);
		return "baseball/coachForm";
	}
	
	@RequestMapping(value = "/baseball/training" , method=RequestMethod.GET)
	public String training(Model model, int trainingId, int coachId) {
		TrainingVO training = new TrainingVO();
		training.setTrainingId(trainingId);
		training.setCoachId(coachId);
		int yes = service.training(training);
		model.addAttribute("yes", yes);
		return "redirect:/baseball/trainingForm";
	}
	
	@RequestMapping(value = "/baseball/quizMenu" , method=RequestMethod.GET)
	public String quizMenu() {
		
		return "baseball/quizMenu";
	}
	
	@RequestMapping(value = "/baseball/quizForm" , method=RequestMethod.GET)
	public String quizForm(Model model) {
		ArrayList<QuizVO> quiz = service.quizForm();
		model.addAttribute("quiz", quiz);
		return "baseball/quizForm";
	}
	
	@RequestMapping(value = "/baseball/quiz" , method=RequestMethod.POST)
	public String quiz(Model model, QuizCheckVO chk) {
		QuizCheckVO yes = service.quiz(chk);
		model.addAttribute("yes", yes);
		return "redirect:/baseball/quizResultForm";
	}
	
	@RequestMapping(value = "/baseball/quizResultForm" , method=RequestMethod.GET)
	public String quizResultForm(Model model) {
		QuizScoreVO result = service.quizResult();
		model.addAttribute("result", result);
		return "baseball/quizResultForm";
	}
	
	@RequestMapping(value = "/baseball/quizRank" , method=RequestMethod.GET)
	public String quizRank(Model model) {
		ArrayList<QuizScoreVO> result = service.quizRank();
		model.addAttribute("result", result);
		return "baseball/quizRank";
	}
	
	@RequestMapping(value = "/baseball/storeForm" , method=RequestMethod.GET)
	public String storeForm(Model model) {
		ArrayList<ItemVO> result = service.storeForm();
		model.addAttribute("result", result);
		return "baseball/storeForm";
	}
	
	@RequestMapping(value = "/baseball/itemPur" , method=RequestMethod.GET)
	public String itemPur(Model model, int itemId) {
		int yes = service.itemPur(itemId);
		model.addAttribute("yes", yes);
		return "redirect:/baseball/storeForm";
	}
	
	@RequestMapping(value = "/baseball/itemHaveForm" , method=RequestMethod.GET)
	public String itemHaveForm(Model model) {
		ArrayList<ItemVO> result = service.itemHaveForm();
		model.addAttribute("result", result);
		return "baseball/itemHaveForm";
	}
	
	@RequestMapping(value= "/baseball/itemEquipHaveForm" , method=RequestMethod.GET)
	public String itemEquipHaveForm(Model model) {
		ArrayList<ItemVO> result = service.itemEquipHaveForm();
		model.addAttribute("result", result);
		return "baseball/itemEquipHaveForm";
	}
	
	@RequestMapping(value = "/baseball/itemEquip" , method=RequestMethod.GET)
	public String itemEquip(Model model, int itemId) {
		int yes = service.itemEquip(itemId);
		model.addAttribute("yes", yes);
		return "redirect:/baseball/itemHaveForm";
	}
	
	@RequestMapping(value = "/baseball/itemRemove" , method=RequestMethod.GET)
	public String itemRemove(Model model, int itemId) {
		int yes = service.itemRemove(itemId);
		model.addAttribute("yes", yes);
		return "redirect:/baseball/itemEquipHaveForm";
	}
	
}
