package ch06;

import java.util.Date;

//������ ���(�޼ҵ�)�� �̷���� ����ü
//				��ü�� ����� ���� ���赵

public class Student {
	
	// �ʵ�(Field) - (Ŭ����/�ɹ�) ����
	// ������ ����Կ� �־ nullPointException
	// ���� �س��� ������ ����� �� �����ϴ�. (�ʱ�ȭ/���� ������ �ݵ�� �̷������ ��)
	// ���� �Ϲ������� ������ �����ϸ鼭 �ʱ�ȭ
	// �Ʒ��� ���� Ŭ���� ������ ���, ������ ���ÿ� �ʱ�ȭ ����
	String name;
	String[] nickname = new String[5];
	Test01 testPage;
	
	Date birthDate;
	String gender;
	
	int age;
	double height;
	
	String address;
	String nation;
	String phoneNumber;
	
	
	int scoreKorean;
	int scoreEnglish;
	int scoreMath;
	// cf. flutter - dart ���
	// dart ��� : nullsafty(NULL���弱)
	
	// Java �����ڰ� �ϳ��� �ۼ��Ǿ� �ִٸ�, �⺻�����ڸ� �ڵ� �������� �ʴ´�
	
	public Student() {
		
	}
	
	public Student(String s1Name, int s1Age, double s1Height
			, String[] s1Nickname, String s1Nation, String s1Address, String s1Gender ) {
		
		name = s1Name;
		age = s1Age;
		height = s1Height;
		nickname = s1Nickname;
		nation = s1Nation;
		address = s1Address;
		gender = s1Gender;
		
		
	}
	
	public void averageSubject() {
		// Ŭ���� �ɹ� �� String ���� Ÿ�Ե��� null
		System.out.println("������� : " + birthDate);
		System.out.println("����ó : " + phoneNumber);
		
		// Ŭ���� �ɹ� �� ������(�Ǽ���) Ÿ���� �ʱ�ȭ(���� ����)���� �ʝҤ� �ڵ� 0���� �����ݴϴ�.
		System.out.println("�������� : " + scoreKorean);
		System.out.println("�������� : " + scoreEnglish);
		System.out.println("�������� : " + scoreMath);
		
		double avg = (scoreKorean + scoreEnglish + scoreMath) / 3.0;
		System.out.println("���� ��� : " + avg);
	}
	
/*
	public void setScoreKorean(int score) {
		this.scoreKorean = score;
		// Test01 Ŭ������ main() �Լ��� �����Ű��� �Լ�
		this.testPage.main(nickname);
	}
*/
}


