package ch06;

public class Test06 {

	public static void main(String[] args) {
		
		// Q. 쇼핑몰 클래스 : 판매자의 입장으로 물건이름, 가격을 책정, 수량을 확인.
		
		
		// 생성자를 통해 인스턴스 생성
		Item item1 = new Item("이것이 Mysql이다.", 28000, 15);
		Item item2= new Item("혼자 공부하는 자바", 32000, 10);
		
		// 인스턴스의 메소드를 통해서 필드를 제어
		Cart cart = new Cart();
		cart.addItem( item1 );
		cart.addItem( item2 );
		
		// 추가된 데이터를 모두 출력하는 메소드
		cart.printItems();
		cart.getItemTotalCount();
		
	}

}
