package ch13.test.list;

import java.util.ArrayList;
import java.util.Scanner;


public class Test01 {
	
	public static void main(String[] args) {
		//q1();
		//q2();
		q3();
	}
	
	// Q1. 배열을 리스트로 변경
	// 	 - arrScore 점수는 Scanner를 통해서 직접 입력받으세요
	public static void q1() {
		
		//int[] arrScore = { 90, 80, 70, 60, 50};
		
		ArrayList<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("배열의 갯수를 입력해주세요 : ");
		int len = sc.nextInt();
		int total = 0;
		
		for(int i = 0 ; i < len ; i++) {
			System.out.println( (i+1) + "번째 배열을 입력해주세요 : ");
			list.add(sc.nextInt());
			total += list.get(i);
		}
		
		double avg = (double) total / len;
		System.out.println("총합 : " + total );
		System.out.println("평균 : " + avg );
		
	}
	
	// Q2. Scanner로 정수를 입력받아서 List에 저장하고 입력순서대로 출력
	// 		- 0을 입력하면 입력을 종료하고 결과를 출력
	//		- 출력 포맷은 ,(쉼표)를 사용해서 구분, 마지막 쉼표는 표시하지 않는다.
	//			(출력결과 예시) 1, 2, 3, 4, 5
	public static void q2() {
		ArrayList<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		String print = "";
		while(true){
			System.out.println( (i+1) + "번째 배열을 입력해주세요 : ");
			list.add(sc.nextInt());
			
			if(list.get(i) != 0 ) {
				print += list.get(i);
				i++;
			}else {
				break;
			}
			print += ", ";
		}
		System.out.println("출력 결과 : " + print.substring(0, print.length()-2));
	}
	
	// Q3. 리스트를 사용한 장바구니
	
	public static void q3() {
		// Q3-1. Cart 클래스를 작성
		// Q3-2. CartItem 객체 생성
		/*		상품명 : 노트북 / 가격 : 800,000 / 주문수량 : 2
		 * 		상품명 : 마우스 / 가격 : 20,000 / 주문수량 : 2
		 * 		상품명 : 키보드 / 가격 : 55,000	/ 주문수량 : 1
		 * */
		
		Cart<CartItem> cart = new Cart<CartItem>();
		CartItem[] carts = {
				new CartItem("노트북", 800000, 2),
				new CartItem("마우스", 20000, 2),
				new CartItem("키보드", 55000, 1),
		};
		
		for(CartItem cartList : carts) {
			cart.select(cartList);
		}
		
		// Q3-3. 장바구니(Cart)에 포함된 상품(Item) 출력
		/*  (출력예시)
		 * 		상품명 : 노트북 / 주문가격 : 1,600,000
		 * 		상품명 : 마우스 / 주문가격 : 40,000
		 * 		=====================
		 * 		전체 주문가격 : 1,640,000
		 * */
		cart.printItems();
		
	}
	
}
