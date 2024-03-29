package baseball.vo;

public class ItemHaveInfoVO {
	private int characterid;
	private int itemid;
	private int quantity;
	private String characterName;
	private String itemClass;
	private String itemName;
	private String Summary;
	
	
	public ItemHaveInfoVO() {
		super();
	}

	public ItemHaveInfoVO(int purchaseId) {
		this.characterid=purchaseId;
	}
	
	public ItemHaveInfoVO(int charaterid,int itemid,int quantity) {
		this.characterid=charaterid;
		this.itemid=itemid;
		this.quantity=quantity;
	}
	
	public ItemHaveInfoVO(int charaterid,int itemid) {
		this.characterid=charaterid;
		this.itemid=itemid;
	}
	public int getCharacterid() {
		return characterid;
	}
	public void setCharacterid(int characterid) {
		this.characterid = characterid;
	}
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getCharacterName() {
		return characterName;
	}
	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getSummary() {
		return Summary;
	}

	public void setSummary(String summary) {
		Summary = summary;
	}

	public String getItemClass() {
		return itemClass;
	}

	public void setItemClass(String itemClass) {
		this.itemClass = itemClass;
	}
	
	@Override
	public String toString() {
		return "�� ��� [+ itemName=" + itemName +
						", itemclass= " + itemClass+
						", summary= " + Summary;
					
	}

}
