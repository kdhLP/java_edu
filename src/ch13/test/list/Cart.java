package ch13.test.list;

import java.util.ArrayList;
import java.util.List;

public class Cart<T extends CartItem> {
	private List<T> list;

	public Cart() {
		list = new ArrayList<>();
	}

	public void select(T item) {
		list.add(item);
	}
	
	public void printItems() {
		
		/*  (출력예시)
		 * 		상품명 : 노트북 / 주문가격 : 1,600,000
		 * 		상품명 : 마우스 / 주문가격 : 40,000
		 * 		=====================
		 * 		전체 주문가격 : 1,640,000
		 * */
		
		int total = 0;
		for (T item : list) {
			System.out.println("상품 명 : " + item.getName() 
								+ " / 주문가격 : " + item.getTotalPrice()
								+"원"
					);
			total += item.getTotalPrice();
		}
		System.out.println("==============");
		System.out.println("전체 주문 가격 : " + total);
	}


}
