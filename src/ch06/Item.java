package ch06;

public class Item {
	// �ʵ�(�ɹ�����)
	
	// �̸�
	private String itemName;
	// ��������
	private int itemPrice;
	// �� �ֹ� ����
	private int itemCount;
	
	//todo. method �� �ۼ�
	
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
