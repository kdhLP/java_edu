package ch02;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		// ���� 1. �������� ���� �ΰ��� �Է¹޾Ƽ� �� ������ ���� ����Ͻÿ�.
		/*
		
		
		System.out.print( " ù���� ���� �Է� :  " );
		int number01 = s.nextInt();
		
		System.out.print(  " �ι��� ���� �Է� : " );
		int number02 = s.nextInt();
		
		int number03 = number02 + number01;
		
		System.out.println(  number01 + " + " + number02 + " = " + number03 );
		 */
		
		// ���� 2. �������� ���ڸ� 1���� �Է� �޾Ƽ�, Ȧ������ ¦������ ����ϼ���.
		
		/*
		System.out.print( " ���� �Է� :  " );
		int numChek = s.nextInt();
		
		if ( numChek % 2 == 0 ) {
			
			System.out.println( numChek + " �� ¦�� �Դϴ�." );
			
		} else System.out.println( numChek + " ��(��) Ȧ�� �Դϴ�." );
		
		*/
		// ���� 3. (�ݺ����� ���) "�̸��� �Է����ּ���." ���ڿ��� �Է¹޵��� �ϰ�, "[exit]��� �Է��Ͻø� ����˴ϴ�."��� �ȳ��ϵ��� �մϴ�.
		// ���� �Ǳ� �������� ��� �Է� ���� �� �ֵ��� �ۼ��մϴ�.
		
		String info = "�̸��� �Է����ּ���.( exit�� �Է��Ͻø� ����˴ϴ�. )";
		System.out.println( info );
		
		while ( true ) {
			
			System.out.print( "�̸� : " );
			String str = s.nextLine();
			System.out.println( str );
			if(str.toLowerCase().equals("exit")) {
	            break;
	         }
			
		}
		System.out.println("�Է��� ����Ǿ����ϴ�.");
		

	}

}
