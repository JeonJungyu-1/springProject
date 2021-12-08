package com.scit.test11.vo;

import lombok.Data;

@Data
public class UserCharacterVO {
	private int characterId;
	private String userId;
	private String characterName;
	private int active;
	private int gold;
	private int health;
	private int year;
	private String className;
	private int allStat;
	private int hitterPower;
	private int hitterHit;
	private int hitterRunSpeed;
	private int pitcherBallSpeed;
	private int pitcherBallControl;
	private int pitcherMentality;
	
	
	
	// ������ ������ ��񿡼� �����ϴ°� �ƴ϶� ���� ����� ��Ƽ� �ѹ��� ��� ������Ʈ �Ϸ��� 
	// ���� �޼����.
//	public UserCharacterVO(String userId, String characterName, String className) {
//		super();
//		this.userId = userId;
//		this.characterName = characterName;
//		this.className = className;
//	}
//	
//	public UserCharacterVO goldUpdate(int gold, int characterId) {
//		this.gold=gold;
//		this.characterId = characterId;
//		return null;
//	}
//	
//	public UserCharacterVO pitcherMentality(int characterId,int pitcherMentality ) {
//		this.characterId = characterId;
//		this.pitcherMentality=pitcherMentality;
//		return null;
//	}
//	
//	public UserCharacterVO pitcherBallSpeed(int characterId,int pitcherBallSpeed) {
//		this.characterId = characterId;
//		this.pitcherBallSpeed=pitcherBallSpeed;
//		return null;
//	}
//	
//	public UserCharacterVO hitterRunSpeed(int characterId,int hitterRunSpeed) {
//		this.characterId = characterId;
//		this.hitterRunSpeed=hitterRunSpeed;
//		return null;
//	}
//	public UserCharacterVO pitcherBallControl(int characterId,int pitcherBallControl) {
//		this.characterId = characterId;
//		this.pitcherBallControl=pitcherBallControl;
//		return null;
//	}
//	
//	public UserCharacterVO hitterPower(int characterId,int hitterPower) {
//		this.characterId = characterId;
//		this.pitcherBallControl=hitterPower;
//		return null;
//	}
//


	
	
}
