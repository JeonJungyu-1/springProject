package com.scit.test11.dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.session.RowBounds;

import com.scit.test11.vo.ItemHaveInfoVO;
import com.scit.test11.vo.ItemVO;
import com.scit.test11.vo.QuizScoreVO;
import com.scit.test11.vo.QuizVO;
import com.scit.test11.vo.TrainingVO;
import com.scit.test11.vo.UserCharacterVO;

public interface BaseballMapper {

	public int totalNow();
	public ArrayList<UserCharacterVO> rank(int currentPage, RowBounds rb);
	public ArrayList<UserCharacterVO> hof();
	public UserCharacterVO characterStat(int characterId);
	public int rest1(int characterId);
	public int rest2(int characterId);
	public int play(int characterId);
	public int training(TrainingVO training);
	public ArrayList<QuizVO> quizForm();
	public int quizScoreInsert(QuizScoreVO quizScore);
	public QuizScoreVO quizResult();
	public ArrayList<QuizScoreVO> quizRank();
	public ArrayList<ItemVO> storeForm();
	public int itemPur(ItemHaveInfoVO itemHave);
	public int itemGoldUpdate(HashMap<String, Object> map);
	public ItemVO itemInfo(int itemId);
	public ArrayList<ItemVO> itemHaveForm(int characterId);
	public ArrayList<ItemVO> itemEquipHaveForm(int characterId);
	public ItemVO itemHaveFormOne(ItemVO item);
	public ItemVO itemEquipHaveFormOne(ItemVO item);
	public ArrayList<ItemVO> itemEquipHaveFormClass(ItemVO item);
	public int itemEquip(ItemVO item);
	public int itemEquipUpdate(ItemVO item);
	public int itemEquipDelete(ItemVO item);
	public int itemRemove(ItemVO item);
	public int itemRemoveUpdate(ItemVO item);
	public int itemRemoveInsert(ItemVO item);
	public int hofInsert(UserCharacterVO uc);
}
