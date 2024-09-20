package ch06;


// 구매를 위한 클래스
public class Cart {
	// 필드(맴버변수)
	
	// 장바구니에 담을 수 있는 상품은 최대 10개
	private Item[] items = new Item[10];
	// 상품이 추가될때 마다 장바구니에 담긴 총 갯수
	private int itemTotalCount = 0;
	
	// todo. method 작성
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
		System.out.println("상품 명 : " + this.items[i].getItemName());
		System.out.println("상품 가격 : " + this.items[i].getItemPrice());
		System.out.println("상품 재고 : " + this.items[i].getItemCount());
		}
	}
	
}
