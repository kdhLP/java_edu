package test;

import java.util.Scanner;

public class Test01 {
	/*
	<< ���ǹ� Ȥ�� �ݺ���, Ȥ�� �Ѵ� ����Ͽ� �Ʒ��� ������ Ǫ�ÿ�. >>
	20. 1���� 50������ ���� �� 3�� ����� �� "3�� ���", 5�� ����� �� "5�� ���", 3�� 5�� ������� �� "3�� 5�� �����"��� ����ϼ���.
	21. ������ �Է¹޾� 1���� �� �������� ��� ¦���� ���� ���Ͽ� ����ϼ���.
	22. �� ������ �Է¹޾� �� ������ ��� Ȧ���� ����ϼ���.
	23. 1���� 100������ ���� �� 3�� ����̸鼭 5�� ����� ���ڸ� ����ϼ���.
	24. 2���� 100������ ���� �� �Ҽ��� ����ϼ���.
	    ( �Ҽ� : ���� ����� 1�� �ڱ��ڽŸ��� ����� ������ �� )
	25. 5���� ������ �Է¹޾� �� �� ���� ū ���� ����ϼ���.
	26. 10���� ������ �Է¹޾�, �� �� ¦���� Ȧ���� ������ ���� ����ϼ���.
	27. 10���� ���� ���� �Է¹޾�, �� ����ŭ ��(*)�� ����ϼ���.
	    ��, �� �ٿ� ���� ������ �Ʒ��� ���� ���������� ������Ű����.
	    *
	    **
	    ***
	    ****
	    ...
	28. 3�ڸ��� ������ 2�� �Է¹޾� �� ���� �ڸ����� ���� ����Ͽ� ����ϼ���.
	    ex) 123, 456 : 1+2+3 = 6, 4+5+6 = 15
	29. ������ �Է¹޾� �� ���� ����� ��� ����ϼ���.
	30. 2���� ������ �Է¹޾�, �� ���� �ִ������� ���Ͽ� ����ϼ���.
	*/
	public static void main(String[] args) {
		//q1();
		//q2();
		//q3();
		//q4();
		//q5();
		//q6();
		//q7();
		//q8();
		//q9();
		//q10();
		//q11();
		//q12();
		//q13();
		//q14();
		//q15();
		//q16();
		//q17();
		//q18();
		//q19();
		
		

	}
	// 1. ������ �Է¹޾� �� ���� ¦������ Ȧ������ ����ϼ���.
	public static void q1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է����ּ��� : ");
		int a = sc.nextInt();
		
		if(a % 2 == 1) {
			System.out.println("Ȧ��");
		}else if(a == 0) {
			System.out.println("0�� Ȧ��/¦���� ���Ե��� �ʴ� �����Դϴ�!");
		}else {
			System.out.println("¦��");
		}
		
	}
	
	// 2. �� ���� ������ �Է¹޾� �� �� ���� ū ���� ����ϼ���.
	public static void q2() {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[3];
		int chek = 0;
		for(int i = 0 ; i < num.length ; i++) {
			System.out.println("������ �Է����ּ��� : ");
			num[i] = sc.nextInt();
			if(num[i] > chek) {
				chek = num[i];
			}
		}
		System.out.println("���� ū �� : " + chek);
		
	}
	
	// 3. �� ������ �Է¹޾�, ù ��° ���� �� ��° ���� 2������� �Ǻ��ϴ� ������ ����ϼ���.
	public static void q3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է����ּ��� : ");
		int a = sc.nextInt();
		System.out.println("������ �Է����ּ��� : ");
		int b = sc.nextInt();
		
		if(a == b*2) {
			System.out.println(a + "�� "+ b +"�� 2����Դϴ�.");
		}else {
			System.out.println(a + "�� "+ b +"�� 2����� �ƴմϴ�.");
		}
		
	}
	
	// 4. �Էµ� ������ 90�� �̻��̸� "A", 80�� �̻��̸� "B", 70�� �̻��̸� "C", 60�� �̻��̸� "D", �� �ܿ��� "F"�� ����ϼ���.
	public static void q4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է����ּ��� : ");
		int a = sc.nextInt();
		
		if (a >= 90) System.out.println("A");
		else if(a >= 80) System.out.println("B");
		else if(a >= 70) System.out.println("C");
		else if(a >= 60) System.out.println("D");
		else System.out.println("F");
	}
	
	// 5. ���̸� �Է¹޾�, 19�� �̻��̸� "����", �׷��� ������ "�̼�����"�� ����ϼ���.
	public static void q5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���̸� �Է����ּ��� : ");
		int a = sc.nextInt();
		
		if(a >= 19) {
			System.out.println("���� �Դϴ�");
		}else System.out.println("�̼����� �дϴ�.");
		
	}
	
	// 6. ����ڷκ��� ��(month)�� �Է¹޾�, �ش� ���� ������ ����ϼ���.
	public static void q6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է����ּ��� : ");
		int a = sc.nextInt();
		
		String[] mon = {"�ܿ�", "�ܿ�", "��", "��", "��", "����", "����", "����", "����", "����", "����", "�ܿ�"};
		
		if(1 <= a && a <= 12 ) {
		System.out.println("���� ������ "+ (mon[a-1]) + "�Դϴ�.");
		}
		
	}
	
	// 7. �Էµ� ������ ���, ����, �Ǵ� 0���� �Ǻ��Ͽ� ����ϼ���.
	public static void q7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է����ּ��� : ");
		int a = sc.nextInt();
		
		if(a < 0) System.out.println("�����Դϴ�.");
		else if(a == 0) System.out.println("0�� 0�Դϴ�.");
		else if (a > 0) System.out.println("����Դϴ�.");
		
	}
	
	// 8. �� ���� ������ �Է¹޾�, �� �� �� ���� ������ �Ǻ��Ͽ� ����ϼ���.
	public static void q8() {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[3];
		for(int i = 0 ; i < num.length ; i++) {
			System.out.println("������ �Է����ּ��� : ");
			num[i] = sc.nextInt();
		}
		if(num[0] == num[1]) {
			System.out.println(1 + "��° ���� "+ 2 + "��° ���� �����ϴ�.");
		}else if(num[1] == num[2]){
			System.out.println(2 + "��° ���� "+ 3 + "��° ���� �����ϴ�.");
		}else if(num[0] == num[2]){
			System.out.println("1��° ���� "+ 3 + "��° ���� �����ϴ�.");
		}else System.out.println("���� ���ڰ� �����ϴ�.");
	}
	
/*
 	9. ����ڷκ��� ������ �Է¹޾� �� �ذ� �������� �ƴ��� �Ǻ��Ͽ� ����ϼ���.
	( ���� : 1���� 366���� �⵵ )
	���� ����
	1) 4�� ����� �������� 0�� �⵵
	2) 100���� ������ �������� ���� �⵵�� 400���ε� �������� ��, �������� 0�� ���
*/
	public static void q9() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�⵵�� �Է����ּ��� : ");
		int a = sc.nextInt();
		if(a % 4 == 0) {
			System.out.println("�����Դϴ�.");
		}else System.out.println("������ �ƴմϴ�.");
	}
	
	// 10. �� ���ڸ� �Է¹޾�, �� ������ ���̰� 10 �̻��̸� "���̰� Ů�ϴ�", �׷��� ������ "���̰� �۽��ϴ�"�� ����ϼ���.
	// 10. �� ���ڸ� �Է¹޾�, �� ������ ���̰� 10 �̻��̸� "���̰� Ů�ϴ�", �׷��� ������ "���̰� �۽��ϴ�"�� ����ϼ���.
	public static void q10() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է����ּ��� : ");
		int a = sc.nextInt();
		System.out.println("������ �Է����ּ��� : ");
		int b = sc.nextInt();
		int c = a-b;
		c = Math.abs(c);
		if (c <= 10) {
			System.out.println("���̰� �۽��ϴ�.");
		}else System.out.println("���̰� Ů�ϴ�.");
		
		
	}
	
	// 11. 1���� 10���� ���ڸ� ����ϼ���.
	public static void q11() {
		for(int i = 1 ; i <= 10 ; i++ ) {
			System.out.println(i);
		}
	}
	
	// 12. 1���� 100���� ���� �� Ȧ���� ����ϼ���.
	public static void q12() {
		for(int i = 1 ; i <= 100 ; i++ ) {
			if(i % 2 == 1) {
			System.out.println(i);
			}else continue;
		}
	}
	
	// 13. ������ �Է¹޾�, �� �������� ��� ������ ���� ����ϼ���.
	public static void q13() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է����ּ��� : ");
		int a = sc.nextInt();
		int sum = 0;
		for( int i = 0 ; i <= a ; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
		
	// 14. 5�� ����� 50���� ����ϼ���.
	public static void q14() {
		for(int i = 1 ; i <= 50 ; i++ ) {
			if(i % 5 == 0) {
			System.out.println(i);
			}else continue;
		}
	}
		
	// 15. �� ������ �Է¹޾�, �� �� ������ ��� ������ ����ϼ���.
	public static void q15() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է����ּ��� : ");
		int a = sc.nextInt();
		System.out.println("������ �Է����ּ��� : ");
		int b = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 0 ; i <= Math.abs(a-b) ; i++ ) {
			int sub = i+a;
			sum += sub;
		}
		System.out.println(sum);
		
	}
		
	// 16. ������ �Է¹޾�, �� ������ �Ҽ����� �ƴ��� ����ϼ���.
    //	( �Ҽ� : ���� ����� 1�� �ڱ��ڽŸ��� ����� ������ �� )
	public static void q16() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է����ּ��� : ");
		int a = sc.nextInt();
		
		for(int i = 2 ; i <= a ; i++ ) {
			if(a == i) {
				System.out.println("�Ҽ� �Դϴ�.");
				break;
			}
			
			if(a % i == 0) {
				System.out.println("�Ҽ��� �ƴմϴ�.");
				break;
			}
		}
		
	}
	
	// 17. ������ �� 7���� ����ϼ���.
	public static void q17() {
		for(int i = 1 ; i < 10 ; i++) {
			System.out.println(7 + "x" + i + " = " + 7*i);
		}
	}
	
	// 18. ������ �Է¹޾� �� ���� ���丮���� ����Ͽ� ����ϼ���.
    //	( ���丮�� : ���� n���� �۰ų� ���� ��� ���� ������ �� )
	public static void q18() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է����ּ��� : ");
		int a = sc.nextInt();
		int fact = a;
		
		for(int i = 1 ; i < a ; i++ ) {
			fact = fact*i;
		}
		System.out.println(fact);
	}
	
	// 19. ������ �Է¹޾�, �� ����ŭ "Hello~ world!"�� ����ϼ���.
	public static void q19() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է����ּ��� : ");
		int a = sc.nextInt();
		
		for(int i = 0 ; i < a ; i++) {
			System.out.println("Hello~ world!");
		}
		
	}
	
	// 20. 1���� 50������ ���� �� 3�� ����� �� "3�� ���", 5�� ����� �� "5�� ���", 3�� 5�� ������� �� "3�� 5�� �����"��� ����ϼ���.
	public static void q20() {
		
	}
	
	// 21. ������ �Է¹޾� 1���� �� �������� ��� ¦���� ���� ���Ͽ� ����ϼ���.
	public static void q21() {
		
	}
	
	// 22. �� ������ �Է¹޾� �� ������ ��� Ȧ���� ����ϼ���.
	public static void q22() {
		
	}
	
	// 23. 1���� 100������ ���� �� 3�� ����̸鼭 5�� ����� ���ڸ� ����ϼ���.
	public static void q23() {
		
	}
	
	// 
	public static void q24() {
		
	}
		
	// 
	public static void q25() {
		
	}

}
