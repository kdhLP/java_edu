package ch02;
// import java.util.*;
import java.util.Scanner;
// Scanner ���̺귯�� (�⺻������ �������ִ� ���)
// ������� �Է��� �޴� ��� : Scanner
// KeyCode - System.in.read();
// �׷��� �ڹٰ� �����ϴ� System.in �� ���ؼ� �Է��� �ޱ⿣ ���� ���ŷο�
// ������� �Է��� ���� ���� �޴� ��� : Scanner
public class Exam02 {
	public static void main(String[] args) {
		
		// ������ ����(Ŭ����-Scanner)�� ����
		// ������ ������ ���, �Ϲ������� ��ü�� ���� > new Ű���� ���� ���
		Scanner s = new Scanner(System.in);
		
		// ���ڿ��� �Է¹���
		System.out.print( "���ڿ��� �Է��ϼ��� : " );
		// �Է¹��� ���ڿ��� str �̶�� ������ ����
		String str = s.nextLine();
		// �Է¹��� ���ڿ��� ���
		System.out.println( str );
		
		System.out.print( "���������� ���ڸ� �Է��ϼ��� " );
		// ��ĳ�ʸ� ���ؼ� �����͸� �Է¹��� ��,
		// �Է¹޴� �ڷ����� ��ġ��������մϴ�.
		int number01 = s.nextInt();
		System.out.println( number01 );
		
		
		System.out.print( "�Ǽ������� ���ڸ� �Է��ϼ��� : " );
		double number02 = s.nextDouble();
		System.out.println( number02 );
		
		//����Ǵ� �Է°� : 20010629 / 2001-06-29 / 2001�� 6�� 29��
		System.out.println(  "������ ��������� �Է��ϼ��� (YYYYMMDD�� ���·� ����ϼ��� )" );
	}
}