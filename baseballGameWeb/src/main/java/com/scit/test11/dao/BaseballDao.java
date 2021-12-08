package com.scit.test11.dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scit.test11.vo.ItemHaveInfoVO;
import com.scit.test11.vo.ItemVO;
import com.scit.test11.vo.QuizScoreVO;
import com.scit.test11.vo.QuizVO;
import com.scit.test11.vo.TrainingVO;
import com.scit.test11.vo.UserCharacterVO;

@Repository
public class BaseballDao {
	
	@Autowired
	SqlSession session;
	
	public int totalNow() {
		int result = 0;
		
		try {
			BaseballMapper mapper = session.getMapper(BaseballMapper.class);
			result = mapper.totalNow();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public ArrayList<UserCharacterVO> rank(int currentPage, int startRecord, int countPerPage) {
		ArrayList<UserCharacterVO> result = null;
		
		try {
			BaseballMapper mapper = session.getMapper(BaseballMapper.class);
			RowBounds rb = new RowBounds(startRecord, countPerPage);
			result = mapper.rank(currentPage, rb);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public ArrayList<UserCharacterVO> hof() {
		ArrayList<UserCharacterVO> result = null;
		
		try {
			BaseballMapper mapper = session.getMapper(BaseballMapper.class);
			result = mapper.hof();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	
	public UserCharacterVO characterStat(int characterId) {
		UserCharacterVO result = null;
		
		try {
			BaseballMapper mapper = session.getMapper(BaseballMapper.class);
			result = mapper.characterStat(characterId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	
	public int rest1(int characterId) {
		int result = 0;
		
		try {
			BaseballMapper mapper = session.getMapper(BaseballMapper.class);
			result = mapper.rest1(characterId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public int rest2(int characterId) {
		int result = 0;
		
		try {
			BaseballMapper mapper = session.getMapper(BaseballMapper.class);
			result = mapper.rest2(characterId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public int play(int characterId) {
		int result = 0;
		
		try {
			BaseballMapper mapper = session.getMapper(BaseballMapper.class);
			result = mapper.play(characterId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public int training(TrainingVO training) {
		int result = 0;
		
		try {
			BaseballMapper mapper = session.getMapper(BaseballMapper.class);
			result = mapper.training(training);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	
	public ArrayList<QuizVO> quizForm() {
		ArrayList<QuizVO> result = null;
		
		try {
			BaseballMapper mapper = session.getMapper(BaseballMapper.class);
			result = mapper.quizForm();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public int quizScoreInsert(QuizScoreVO quizScore) {
		int result = 0;
		 
		try {
			BaseballMapper mapper = session.getMapper(BaseballMapper.class);
			result = mapper.quizScoreInsert(quizScore);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	
	public QuizScoreVO quizResult() {
		QuizScoreVO result = null;
		
		try {
			BaseballMapper mapper = session.getMapper(BaseballMapper.class);
			result = mapper.quizResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public ArrayList<QuizScoreVO> quizRank() {
		ArrayList<QuizScoreVO> result = null;
		
		try {
			BaseballMapper mapper = session.getMapper(BaseballMapper.class);
			result = mapper.quizRank();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public ArrayList<ItemVO> storeForm() {
		ArrayList<ItemVO> result = null;
		
		try {
			BaseballMapper mapper = session.getMapper(BaseballMapper.class);
			result = mapper.storeForm();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public int itemPur(ItemHaveInfoVO itemHave) {
		int result = 0;
		
		try {
			BaseballMapper mapper = session.getMapper(BaseballMapper.class);
			result = mapper.itemPur(itemHave);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public int itemGoldUpdate(HashMap<String, Object> map) {
		int result = 0;
		
		try {
			BaseballMapper mapper = session.getMapper(BaseballMapper.class);
			result = mapper.itemGoldUpdate(map);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public ItemVO itemInfo(int itemId) {
		ItemVO result = null;
		
		try {
			BaseballMapper mapper = session.getMapper(BaseballMapper.class);
			result = mapper.itemInfo(itemId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public ArrayList<ItemVO> itemHaveForm(int characterId) {
		ArrayList<ItemVO> result = null;
		
		try {
			BaseballMapper mapper = session.getMapper(BaseballMapper.class);
			result = mapper.itemHaveForm(characterId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public ArrayList<ItemVO> itemEquipHaveForm(int characterId) {
		ArrayList<ItemVO> result = null;
		
		try {
			BaseballMapper mapper = session.getMapper(BaseballMapper.class);
			result = mapper.itemEquipHaveForm(characterId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public ItemVO itemHaveFormOne(ItemVO item) {
		ItemVO result = null;
		
		try {
			BaseballMapper mapper = session.getMapper(BaseballMapper.class);
			result = mapper.itemHaveFormOne(item);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public ItemVO itemEquipHaveFormOne(ItemVO item) {
		ItemVO result = null;
		
		try {
			BaseballMapper mapper = session.getMapper(BaseballMapper.class);
			result = mapper.itemEquipHaveFormOne(item);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public ArrayList<ItemVO> itemEquipHaveFormClass(ItemVO item) {
		ArrayList<ItemVO> result = null;
		
		try {
			BaseballMapper mapper = session.getMapper(BaseballMapper.class);
			result = mapper.itemEquipHaveFormClass(item);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	
	public int itemEquip(ItemVO item) {
		int result = 0;
		
		try {
			BaseballMapper mapper = session.getMapper(BaseballMapper.class);
			result = mapper.itemEquip(item);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public int itemEquipUpdate(ItemVO item) {
		int result = 0;
		
		try {
			BaseballMapper mapper = session.getMapper(BaseballMapper.class);
			result = mapper.itemEquipUpdate(item);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	public int itemEquipDelete(ItemVO item) {
		int result = 0;
		
		try {
			BaseballMapper mapper = session.getMapper(BaseballMapper.class);
			result = mapper.itemEquipDelete(item);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public int itemRemove(ItemVO item) {
		int result = 0;
		
		try {
			BaseballMapper mapper = session.getMapper(BaseballMapper.class);
			result = mapper.itemRemove(item);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public int itemRemoveUpdate(ItemVO item) {
		int result = 0;
		
		try {
			BaseballMapper mapper = session.getMapper(BaseballMapper.class);
			result = mapper.itemRemoveUpdate(item);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public int itemRemoveInsert(ItemVO item) {
		int result = 0;
		
		try {
			BaseballMapper mapper = session.getMapper(BaseballMapper.class);
			result = mapper.itemRemoveInsert(item);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public int hofInsert(UserCharacterVO uc) {
		int result = 0;
		
		try {
			BaseballMapper mapper = session.getMapper(BaseballMapper.class);
			result = mapper.hofInsert(uc);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	

}
