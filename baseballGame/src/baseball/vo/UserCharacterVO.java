package baseball.vo;

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
	
	
	
	
	public UserCharacterVO() {
		super();
	}


	public UserCharacterVO(int gold,int characterId) {
		this.gold=gold;
		this.characterId = characterId;
	}

	public int getCharacterId() {
		return characterId;
	}

	public void setCharacterId(int characterId) {
		this.characterId = characterId;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getCharacterName() {
		return characterName;
	}


	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}


	public int getActive() {
		return active;
	}


	public void setActive(int active) {
		this.active = active;
	}


	public int getGold() {
		return gold;
	}


	public void setGold(int gold) {
		this.gold = gold;
	}


	public int getHealth() {
		return health;
	}


	public void setHealth(int health) {
		this.health = health;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public String getClassName() {
		return className;
	}


	public void setClassName(String className) {
		this.className = className;
	}


	public int getAllStat() {
		return allStat;
	}


	public void setAllStat(int allStat) {
		this.allStat = allStat;
	}


	public int getHitterPower() {
		return hitterPower;
	}


	public void setHitterPower(int hitterPower) {
		this.hitterPower = hitterPower;
	}


	public int getHitterHit() {
		return hitterHit;
	}


	public void setHitterHit(int hitterHit) {
		this.hitterHit = hitterHit;
	}


	public int getHitterRunSpeed() {
		return hitterRunSpeed;
	}


	public void setHitterRunSpeed(int hitterRunSpeed) {
		this.hitterRunSpeed = hitterRunSpeed;
	}


	public int getPitcherBallSpeed() {
		return pitcherBallSpeed;
	}


	public void setPitcherBallSpeed(int pitcherBallSpeed) {
		this.pitcherBallSpeed = pitcherBallSpeed;
	}


	public int getPitcherBallControl() {
		return pitcherBallControl;
	}


	public void setPitcherBallControl(int pitcherBallControl) {
		this.pitcherBallControl = pitcherBallControl;
	}


	public int getPitcherMentality() {
		return pitcherMentality;
	}


	public void setPitcherMentality(int pitcherMentality) {
		this.pitcherMentality = pitcherMentality;
	}


	@Override
	public String toString() {
		return "UserCharacterVO [characterId=" + characterId + ", userId=" + userId + ", characterName=" + characterName
				+ ", active=" + active + ", gold=" + gold + ", health=" + health + ", year=" + year + ", className="
				+ className + ", allStat=" + allStat + ", hitterPower=" + hitterPower + ", hitterHit=" + hitterHit
				+ ", hitterRunSpeed=" + hitterRunSpeed + ", pitcherBallSpeed=" + pitcherBallSpeed
				+ ", pitcherBallControl=" + pitcherBallControl + ", pitcherMentality=" + pitcherMentality + "]";
	}
	
	
	// 아이템 먹으면 디비에서 연산하는거 아니라 연산 결과를 모아서 한번에 디비 업데이트 하려고 
	// 만든 메서드들.
	public UserCharacterVO(String userId, String characterName, String className) {
		super();
		this.userId = userId;
		this.characterName = characterName;
		this.className = className;
	}
	
	public UserCharacterVO goldUpdate(int gold, int characterId) {
		this.gold=gold;
		this.characterId = characterId;
		return null;
	}
	
	public UserCharacterVO pitcherMentality(int characterId,int pitcherMentality ) {
		this.characterId = characterId;
		this.pitcherMentality=pitcherMentality;
		return null;
	}
	
	public UserCharacterVO pitcherBallSpeed(int characterId,int pitcherBallSpeed) {
		this.characterId = characterId;
		this.pitcherBallSpeed=pitcherBallSpeed;
		return null;
	}
	
	public UserCharacterVO hitterRunSpeed(int characterId,int hitterRunSpeed) {
		this.characterId = characterId;
		this.hitterRunSpeed=hitterRunSpeed;
		return null;
	}
	public UserCharacterVO pitcherBallControl(int characterId,int pitcherBallControl) {
		this.characterId = characterId;
		this.pitcherBallControl=pitcherBallControl;
		return null;
	}
	
	public UserCharacterVO hitterPower(int characterId,int hitterPower) {
		this.characterId = characterId;
		this.pitcherBallControl=hitterPower;
		return null;
	}



	
	
}
