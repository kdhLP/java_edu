package ch06;

// ��Ű���� �ٸ� ���, import 
//import java.util.Scanner;

// Ŭ����
public class Exam01 {
	
	public static void main(String[] args) {
		
		// �������� 
		// �迭�� ���, �������� ���� Ȥ�� ������ �ʿ��� ���, index(����)�� ���� �߿���
		int[][] scores = {
		// { ����, ����, ���� }
			{ 90, 80, 90 },	// �л�1  : ��â��
			{ 80, 55, 60 },	// �л�2  : ����� 
			{ 80, 70, 65 }	// �л�3  : �տ���
		};
		
		/*
		System.out.println( student1.name );
		Student student1Backup = student1;
		student1Backup.name = "������";
		System.out.println( student1Backup.name );
		System.out.println( student1.name );
		*/
		// Java�� ������ ���������� ������� �ʽ��ϴ�. -> �迭
		// ������ �̸� : student1 / ������ �ڷ��� : Student Class (������)
		/*
		// �л� 1.
		Student student1 = new Student();
		student1.name = "��â��";
		// �л� 2.
		Student student2 = new Student();
		student2.name = "�����";
		// �л� 3.
		Student student3 = new Student();
		student3.name = "�տ���";
		System.out.println( student1.name );
		System.out.println( student2.name );
		System.out.println( student3.name );
		*/
		/*
		// Ŭ������ ������ ���� -> �迭
		// []�� ���� ����(�ڷ���)�� 'Student'��� Ŭ������ ���·� ���� �����
		Student[] students = new Student[3];
		// Student[] students = { student1, new Student(), new Student() }; 
		students[0] = new Student();
		Student student1 = students[0];
		student1.name = "��â��";
		// �޼ҵ��� �����
		System.out.println(student1.scoreKorean);
		student1.setScoreKorean(100);
		System.out.println(student1.scoreKorean);
		// Ŭ���������� �迭�� ��� 
		student1.nickname[0] = "����1";
		student1.nickname[1] = "����2";
		student1.nickname[2] = "����3";
		student1.nickname[3] = "����4";
		student1.nickname[4] = "����5";
		// error. OutOfBounds
		//student1.nickname[5] = "����6";
		
		students[1] = new Student();
		students[1].name = "�����";
		// ȸ������. ������ ���� ���� (validate)
		String nicknamePrac = "���";
		System.out.println( " nicknamePrac �� ���ڼ� :: " + nicknamePrac.length() );
		
		students[2] = new Student();
		students[2].name = "�տ���";
		
		for ( int i = 0 ; i < students.length ; i++ ) {
			System.out.println( students[i].name );
		}
		
		*/
		
		
		
		
	}
	
}








