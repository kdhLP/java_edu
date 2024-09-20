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
		
		/*  (��¿���)
		 * 		��ǰ�� : ��Ʈ�� / �ֹ����� : 1,600,000
		 * 		��ǰ�� : ���콺 / �ֹ����� : 40,000
		 * 		=====================
		 * 		��ü �ֹ����� : 1,640,000
		 * */
		
		int total = 0;
		for (T item : list) {
			System.out.println("��ǰ �� : " + item.getName() 
								+ " / �ֹ����� : " + item.getTotalPrice()
								+"��"
					);
			total += item.getTotalPrice();
		}
		System.out.println("==============");
		System.out.println("��ü �ֹ� ���� : " + total);
	}


}
