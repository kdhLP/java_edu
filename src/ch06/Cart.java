package ch06;


// ���Ÿ� ���� Ŭ����
public class Cart {
	// �ʵ�(�ɹ�����)
	
	// ��ٱ��Ͽ� ���� �� �ִ� ��ǰ�� �ִ� 10��
	private Item[] items = new Item[10];
	// ��ǰ�� �߰��ɶ� ���� ��ٱ��Ͽ� ��� �� ����
	private int itemTotalCount = 0;
	
	// todo. method �ۼ�
	public Cart() {
		
	}
	
	public void addItem(Item item) {
		this.items[itemTotalCount] = item;
		this.itemTotalCount++;
	}
	
	public int getItemTotalCount() {
		return this.itemTotalCount;
	}

	public void printItems() {
		for(int i = 0 ; i < this.items.length; i++) {
		System.out.println("��ǰ �� : " + this.items[i].getItemName());
		System.out.println("��ǰ ���� : " + this.items[i].getItemPrice());
		System.out.println("��ǰ ��� : " + this.items[i].getItemCount());
		}
	}
	
}
