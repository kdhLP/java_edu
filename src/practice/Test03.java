// package practicejavalanguage;
// package practice.java.language;
// package practice.java.language.String;
package practice;

import java.util.Scanner;

public class Test03 {
	
	public static void main(String[] args) {
/*		
		int a = 10;
		// if ���ǹ�
		// �߰�ȣ �ȿ� ������ �ڵ���̶�� �մϴ�.
		// if (���ǽ�){(�ش� ���ǽ��� ���̸� �ڵ�� ���� ������ �����մϴ�.)}
		// ����� ���� �Ѱ����� ���
		// .. ���� �ҽ��ڵ�
		if (a < 10) {
			System.out.println("a�� 10���� Ů�ϴ�.");
		}
		
		if (a % 2 == 0) {
			System.out.println("a�� ¦��.");
		}else{
			System.out.println("a�� Ȧ��.");
		}
*/		
		
		
		/*
		 * ���� 1.
		 * 
		 * 		90�� �̻��̸� 'A'
		 * 		80�� �̻�, 90�� �̸� 'B'
		 * 		70�� �̻�, 80�� �̸� 'C'
		 * 		60�� �̻�, 70�� �̸� 'D'
		 * 		�������� 'F'
		 */
		/*
		Scanner s = new Scanner(System.in);
		
		System.out.print( "������ �Է��ϼ��� : " );
		int x = s.nextInt();
		
		int score = x;
		
		if (score <= 100 && score >= 80) {
			System.out.println("������ A �Դϴ�.");
		}
		else if(score < 90 && score >= 80){
			System.out.println("������ B �Դϴ�.");
		}
		else if(score < 80 && score >= 70){
			System.out.println("������ C �Դϴ�.");
		}
		else if(score < 70 && score >= 60){
			System.out.println("������ D �Դϴ�.");
		}
		else if(score < 60 && score >= 0){
			System.out.println("������ F �Դϴ�.");
		}
		else {
			System.out.printf("Error: %d���� ����� �� ���� �����Դϴ�!\n", x);
		}
		*/
		
		/*
		 * �Ÿ��� ���� ���߱��� ������ ����
		 * 
		 * 1km �����̸� '����'
		 * 5km �����̸� '������'
		 * 10km �����̸� '����'
		 * 20km �����̸� '�ڵ���'
		 * 20km �̻��̸� '�����'
		 * 
		 */
		/*
		Scanner km = new Scanner(System.in);
		
		System.out.print( "�Ÿ�(km)�� �Է��ϼ��� : " );
		int y = km.nextInt();
		int distance = y;
		
		if ( distance > 20) {
			System.out.println("����⸦ �̿��ϼ���.");
		}
		else if(distance <= 20 && distance > 10){
			System.out.println("�ڵ����� �̿��ϼ���.");
		}
		else if(distance <= 10 && distance > 5){
			System.out.println("������ �̿��ϼ���.");
		}
		else if(distance <= 5 && distance > 1){
			System.out.println("�����Ÿ� �̿��ϼ���.");
		}
		else if(distance <= 1 && distance >= 0){
			System.out.println("������ �̿��ϼ���.");
		}
		else {
			System.out.println("�����Դϴ�.");
		}
		*/
		
		/*
		 * �ݾ� ��� ����
		 *  - �޷��� ����� ��, 
		 *  	0�޷� �̸��̸� "�߸��� �ݾ��Դϴ�."
		 *  	0�� ��, "����� �ݾ��� �����ϴ�."
		 *  	0 �ʰ��� ��, "��ȭ�� .....�� �Դϴ�." �Է°�*1300
		 *  	
		 */
		/*
		Scanner d = new Scanner(System.in);
		
		System.out.print( "����� �޷��� �Է��ϼ��� : " );
		double i = d.nextDouble();
		
		if (i < 0) {
			System.out.println("�߸��� �ݾ��Դϴ�.");
		}
		else if(i == 0) {
			System.out.println("����� �ݾ��� �����ϴ�.");
		}
		else if(i > 0) {
			
			double won = i * 1300;
			
			System.out.println("��ȭ�� " + (int)won + "�� �Դϴ�.");
		}
		else {
			System.out.println("�Է� �� �� ���� ���Դϴ�!");
		}
		*/
		
		
		
		/*
		 * ����1	�Ҽ����� �����ϴ� 0 ~ 10�� ������ ������ �Է¹޾�
		 * 		�Է¹��� �������� ���� ��ȭ���� ������ּ���.
		 * 
		 * 		9�� �̻� : ��ٿ� Ÿ��
		 * 		8�� �̻� : Ʈ��� ��
		 * 		7�� �̻� : �͸��� Į��
		 * 		6�� �̻� : ���� ����
		 * 		6�� �̸� : ��õ�� ��ȭ�� �����ϴ�.
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println(" ����(�Ҽ����� �����ϴ� �Ǽ�)�� �Է����ּ���. : ");
		double rating = scan.nextDouble();
		/*�Է°��� ���� �޼ҵ�� �Է°��� ������ ������ �ڷ����� ��ġ���������.
		 * String str = scanner.nextLine();
		 * int num = scanner.nextInt();
		 */
		String restr = "";
		
		/*
		if ((int)rating <= 9) restr += "[��ٿ� Ÿ��(9+)]";
		if ((int)rating <= 8) restr += "[Ʈ��� ��(8+)]";
		if ((int)rating <= 7) restr += "[�͸��� Į��(7+)]";
		if ((int)rating <= 6) restr += "[���� ����(6+)]";
		restr += "��(��) ��õ�մϴ�.";
		if (rating < 6) restr += "��õ�� ��ȭ�� �����ϴ�.";
		System.out.println( restr );
		*/	
		/*
		restr = "";
		switch( (int)rating) {
		case 6: 
			restr += "[���� ����(6+)]";
		case 7: 
			restr += "[�͸��� Į��(7+)]";
		case 8: 
			restr += "[Ʈ��� ��(8+)]";
		case 9: 
			restr += "[��ٿ� Ÿ��(9+)]"; 
			break;
		default: 
			restr += "��õ�� ��ȭ�� �����ϴ�."; 
			break;
		}
		System.out.println( restr );
		*/
		/*
		int a = 3;
		
		// ��(3)�� ������ ( ���ǽ� ? ���� ��°� : ������ ��°� )
		if (a > 10) {
			System.out.println("10���� ū ��");
		}else {
			System.out.println("10���� ���� ��");
		}
		System.out.println((a>10) ? "10���� ū ��" : "10 ���� ���� ��");
		String result = (a>10) ? "10���� ū ��" : "10���� ���� ��";
		*/
		// Q. �Ʒ��� ���� ¦������ Ȧ������ ���� �����ڸ� ����Ͽ� String pStr�� �����ϼ���.
		int question = 120983;
		String pStr = (question % 2 == 0) ? "¦��" : "Ȧ��";
		System.out.println(pStr);
		
		
		
		
		// String -> int/integer ����ȯ�� �����ϴٸ� string ������ �ص� ������. String price
		
		//method(�޼ҵ�/�Լ�)
		// {�޼ҵ� �̸�}({�μ�(����})
		//methodName(prm, prm1, prm2) ::: f(x, y, z)
		//���� : {����������} {��Ÿ�ɼǰ�}{��ȯ��-�ڷ���}{�޼ҵ� �̸�}({�Ķ����}){
		// 		}
		
		
	}
	
	public void operater() {
	
	// ������
	// ��������� / �񱳿����� / ���Կ����� / �������� / ���Ῥ���� / ...
	// ���Կ�����
	// int i = 0;
	// i += 1;
	// i += 2; // i = i + 2
	// i -= -5;
	// ��������
	// &, && :: ����/������ - ���� �񱳰��� �� �� �� -> ������� ��
	// |, || :: ����(OR) - ���� �񱳰� �߿� �ϳ��� �� -> ������� �� (�� �� ���� -> ��� ����)
	// ! :: ������ ������� �ݴ밪
	
	// ���Ῥ���� (./+)
	// import java.util.scanner
	// TheOtherClass.methodName();
	// "Hello~" + "World!"
	
	
	}
	

}
