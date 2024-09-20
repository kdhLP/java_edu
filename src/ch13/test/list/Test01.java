package ch13.test.list;

import java.util.ArrayList;
import java.util.Scanner;


public class Test01 {
	
	public static void main(String[] args) {
		//q1();
		//q2();
		q3();
	}
	
	// Q1. �迭�� ����Ʈ�� ����
	// 	 - arrScore ������ Scanner�� ���ؼ� ���� �Է¹�������
	public static void q1() {
		
		//int[] arrScore = { 90, 80, 70, 60, 50};
		
		ArrayList<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�迭�� ������ �Է����ּ��� : ");
		int len = sc.nextInt();
		int total = 0;
		
		for(int i = 0 ; i < len ; i++) {
			System.out.println( (i+1) + "��° �迭�� �Է����ּ��� : ");
			list.add(sc.nextInt());
			total += list.get(i);
		}
		
		double avg = (double) total / len;
		System.out.println("���� : " + total );
		System.out.println("��� : " + avg );
		
	}
	
	// Q2. Scanner�� ������ �Է¹޾Ƽ� List�� �����ϰ� �Է¼������ ���
	// 		- 0�� �Է��ϸ� �Է��� �����ϰ� ����� ���
	//		- ��� ������ ,(��ǥ)�� ����ؼ� ����, ������ ��ǥ�� ǥ������ �ʴ´�.
	//			(��°�� ����) 1, 2, 3, 4, 5
	public static void q2() {
		ArrayList<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		String print = "";
		while(true){
			System.out.println( (i+1) + "��° �迭�� �Է����ּ��� : ");
			list.add(sc.nextInt());
			
			if(list.get(i) != 0 ) {
				print += list.get(i);
				i++;
			}else {
				break;
			}
			print += ", ";
		}
		System.out.println("��� ��� : " + print.substring(0, print.length()-2));
	}
	
	// Q3. ����Ʈ�� ����� ��ٱ���
	
	public static void q3() {
		// Q3-1. Cart Ŭ������ �ۼ�
		// Q3-2. CartItem ��ü ����
		/*		��ǰ�� : ��Ʈ�� / ���� : 800,000 / �ֹ����� : 2
		 * 		��ǰ�� : ���콺 / ���� : 20,000 / �ֹ����� : 2
		 * 		��ǰ�� : Ű���� / ���� : 55,000	/ �ֹ����� : 1
		 * */
		
		Cart<CartItem> cart = new Cart<CartItem>();
		CartItem[] carts = {
				new CartItem("��Ʈ��", 800000, 2),
				new CartItem("���콺", 20000, 2),
				new CartItem("Ű����", 55000, 1),
		};
		
		for(CartItem cartList : carts) {
			cart.select(cartList);
		}
		
		// Q3-3. ��ٱ���(Cart)�� ���Ե� ��ǰ(Item) ���
		/*  (��¿���)
		 * 		��ǰ�� : ��Ʈ�� / �ֹ����� : 1,600,000
		 * 		��ǰ�� : ���콺 / �ֹ����� : 40,000
		 * 		=====================
		 * 		��ü �ֹ����� : 1,640,000
		 * */
		cart.printItems();
		
	}
	
}
