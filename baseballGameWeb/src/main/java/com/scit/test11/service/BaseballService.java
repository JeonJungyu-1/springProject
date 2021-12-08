package com.scit.test11.service;

import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scit.test11.dao.BaseballDao;
import com.scit.test11.dao.MemberDao;
import com.scit.test11.vo.ItemHaveInfoVO;
import com.scit.test11.vo.ItemVO;
import com.scit.test11.vo.QuizCheckVO;
import com.scit.test11.vo.QuizScoreVO;
import com.scit.test11.vo.QuizVO;
import com.scit.test11.vo.TrainingVO;
import com.scit.test11.vo.UserCharacterVO;

@Service
public class BaseballService {

	@Autowired
	private HttpSession session;
	
	@Autowired
	private BaseballDao dao;
	
	@Autowired
	private MemberDao mdao;
	
	public int totalNow() {
		return dao.totalNow();
	}
	
	public ArrayList<UserCharacterVO> rank(int currentPage, int startRecord, int countPerPage) {
		ArrayList<UserCharacterVO> result = dao.rank(currentPage, startRecord, countPerPage);
		
		return result;
	}
	
	public ArrayList<UserCharacterVO> hof() {
		return dao.hof();
	}
	
	public void main(int characterId) {
		session.setAttribute("characterId", characterId);
	}
	
	public UserCharacterVO characterStat() {
		int characterId = (int)session.getAttribute("characterId");
		return dao.characterStat(characterId);
	}
	
	public int rest1() {
		int characterId = (int)session.getAttribute("characterId");
		UserCharacterVO vo = dao.characterStat(characterId);
		if(vo.getHealth() > 80) {
			return 2;
		}
		else if(vo.getGold() < 2000) {
			return 3;
		}
		else if(vo.getActive() <= 0) {
			return 4;
		}
		else {
			dao.rest1(characterId);
			return 1;
		}
	}

	public int rest2() {
		int characterId = (int)session.getAttribute("characterId");
		UserCharacterVO vo = dao.characterStat(characterId);
		if(vo.getHealth()>=100) {
			return 6;
		}
		else if(vo.getGold() < 4000) {
			return 7;
		}
		else if(vo.getActive() <= 0) {
			return 8;
		}
		else {
			dao.rest2(characterId);
			return 5;
		}
	}
	
	public String play() {
		int characterId = (int)session.getAttribute("characterId");
		UserCharacterVO vo = dao.characterStat(characterId);
		if(vo.getYear() >= 5) {
			//명예의 전당 이동
			//캐릭터 정보 불러오고 그걸 명예전당 테이블로 이동 그후 캐릭터 테이블에서 삭제/세션도 초기화하면서 캐릭터선택메뉴로
			dao.hofInsert(vo);
			mdao.characterDelete(vo);
			session.removeAttribute("characterId");
			return "redirect:/member/characterMenu?yes=" + 1;
		}
		else {
			dao.play(characterId);
			return "redirect:/baseball/playForm?yes=" + 1;
		}
	}
	
	public int training(TrainingVO training) {
		int characterId = (int)session.getAttribute("characterId");
		UserCharacterVO vo = dao.characterStat(characterId);
		training.setCharacterId(characterId);
		int result = dao.training(training);
		if (vo.getActive() <= 0) {
			return 3;
		}
		else if (vo.getHealth() < 25) {
			return 4;
		}
		else {
			if (result == 1) {
				return 1;
			}
			else {
				return 2;
			}
		}
	}
	
	public ArrayList<QuizVO> quizForm() {
		return dao.quizForm();
	}
	
	public QuizCheckVO quiz(QuizCheckVO chk) {
		//form으로 정답 받아옴 5개 받아와서
		//히든으로 정답도 넘기
		//그냥 바로 처리해도 될거도 같고 왜냐면 정답도 넘기거든
		if (chk.getProblem0().equals(chk.getCorrect0())) {
			chk.setYes0(1);
		}
		else {
			chk.setYes0(2);
		}
		
		if (chk.getProblem1().equals(chk.getCorrect1())) {
			chk.setYes1(1);
		}
		else {
			chk.setYes1(2);
		}
		
		if (chk.getProblem2().equals(chk.getCorrect2())) {
			chk.setYes2(1);
		}
		else {
			chk.setYes2(2);
		}
		
		if (chk.getProblem3().equals(chk.getCorrect3())) {
			chk.setYes3(1);
		}
		else {
			chk.setYes3(2);
		}
		if (chk.getProblem4().equals(chk.getCorrect4())) {
			chk.setYes4(1);
		}
		else {
			chk.setYes4(2);
		}
		
		QuizScoreVO score = new QuizScoreVO();
		String userId = (String)session.getAttribute("loginId");
		int correct = 0;
		int wrong = 0;
		//퀴즈 정답률 데이터 베이스에 입력하기
		if(chk.getYes0()==1) {
			correct += 1;
		}
		else if(chk.getYes0()==2) {
			wrong += 1;
		}
		if(chk.getYes1()==1) {
			correct += 1;
		}
		else if(chk.getYes1()==2) {
			wrong += 1;
		}
		if(chk.getYes2()==1) {
			correct += 1;
		}
		else if(chk.getYes2()==2) {
			wrong += 1;
		}
		if(chk.getYes3()==1) {
			correct += 1;
		}
		else if(chk.getYes3()==2) {
			wrong += 1;
		}
		if(chk.getYes4()==1) {
			correct += 1;
		}
		else if(chk.getYes4()==2) {
			wrong += 1;
		}
		score.setUserId(userId);
		score.setCorrectAnswer(correct);
		score.setWrongAnswer(wrong);
		int correctPercent = (correct*100)/5;
		score.setCorrectPercent(correctPercent);
		dao.quizScoreInsert(score);
		return chk;
	}
	
	public QuizScoreVO quizResult() {
		return dao.quizResult();
	}
	
	public ArrayList<QuizScoreVO> quizRank() {
		return dao.quizRank();
	}
	
	public ArrayList<ItemVO> storeForm() {
		return dao.storeForm();
	}
	
	public int itemPur(int itemId) {
		ItemHaveInfoVO itemHave = new ItemHaveInfoVO();
		int characterId = (int)session.getAttribute("characterId");
		itemHave.setCharacterId(characterId);
		itemHave.setItemId(itemId);
		ItemVO itemInfo = dao.itemInfo(itemId);
		UserCharacterVO vo = dao.characterStat(characterId);
		if(vo.getGold() >= itemInfo.getPrice()) {
			dao.itemPur(itemHave);
			//골드소모 업뎃
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("price", itemInfo.getPrice());
			map.put("characterId", characterId);
			dao.itemGoldUpdate(map);
			return 1;
		}
		else {
			return 2;
		}
	}
	
	public ArrayList<ItemVO> itemHaveForm() {
		int characterId = (int)session.getAttribute("characterId");
		return dao.itemHaveForm(characterId);
	}
	
	public ArrayList<ItemVO> itemEquipHaveForm() {
		int characterId = (int)session.getAttribute("characterId");
		return dao.itemEquipHaveForm(characterId);
	}
	
	public int itemEquip(int itemId) {
		//아이템 id 가져왔어
		ItemVO item = new ItemVO();
		int characterId = (int)session.getAttribute("characterId");
		item.setItemId(itemId);
		item.setCharacterId(characterId);
		ItemVO check = dao.itemHaveFormOne(item);
		ItemVO check2 = dao.itemEquipHaveFormOne(item);
		
		//그 아이템이 소지가 충분한지/소지가 충분하지 않으면 셀렉트가 안되는거지 ㅇㅇㅇ
		if (check == null) {
			//아이템 없음
			return 3;
		}
		//그리고 소지가 충분해 그럼 캐릭터 장착정보에 인섵트하고 소지정보에도 업데이트하기,만약 개수가 1개였다면 행 삭제하기
		else {
			//이 클래스가 장착되있는지확인
			item.setItemClass(check.getItemClass());
			ArrayList<ItemVO> check3 = dao.itemEquipHaveFormClass(item);
			if (!(check3.isEmpty())) {
				//장착 되있음
				return 2;
			}
			else {
				//캐릭터장착정보 인서트
				dao.itemEquip(item);
				//소지정보 업데이트//개수1개면 삭제
				if (check.getQuantity() == 1) {
					dao.itemEquipDelete(item);
				}
				else {
					dao.itemEquipUpdate(item);
				}
				return 1;
			}
		}
	}
	
	
	public int itemRemove(int itemId) {
		//아이템 id 가져왔어
		ItemVO item = new ItemVO();
		int characterId = (int)session.getAttribute("characterId");
		item.setItemId(itemId);
		item.setCharacterId(characterId);
		ItemVO check = dao.itemHaveFormOne(item);
		ItemVO check2 = dao.itemEquipHaveFormOne(item);
		//현재 아이템 끼고 있는지 확인
		if (check2 == null) {
			//아이템 끼고 있지 않음
			return 2;
		}
		//아이템 끼고 있으면 빼야됨 장착정보에서 삭제하고/ 소지정보에 있으면 1개추가하고 없으면 insert하기
		else {
			//장착정보에서 삭제
			dao.itemRemove(item);
			if (check == null) {
				dao.itemRemoveInsert(item);
			}
			else {
				dao.itemRemoveUpdate(item);
			}
			return 1;
		}
	}
	
}
