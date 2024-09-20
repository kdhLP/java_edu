package ch06;

public class Item {
	// 필드(맴버변수)
	
	// 이름
	private String itemName;
	// 개별가격
	private int itemPrice;
	// 총 주문 수량
	private int itemCount;
	
	//todo. method 를 작성
	
	public Item() {
		
	}
	
	public Item(String iName, int iPrice, int iCount) {
		this.itemName = iName;
		this.itemPrice = iPrice;
		this.itemCount = iCount;
	}
	
	 public void setItem(String iName, int iPrice, int iCount) {
		this.itemName = iName;
		this.itemPrice = iPrice;
		this.itemCount = iCount;
	 }

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}

	public int getItemCount() {
		return itemCount;
	}

	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}

	
	
	
}
