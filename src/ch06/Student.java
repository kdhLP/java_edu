package ch06;

import java.util.Date;

//변수의 기능(메소드)로 이루어진 구성체
//				객체를 만들기 위한 설계도

public class Student {
	
	// 필드(Field) - (클래스/맴버) 변수
	// 변수를 사용함에 있어서 nullPointException
	// 선언만 해놓은 변수는 사용할 수 없습니다. (초기화/값의 대입이 반드시 이루어져야 함)
	// 보통 일반적으로 변수를 성언하면서 초기화
	// 아래와 같이 클래스 변수인 경우, 생성과 동시에 초기화 진행
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
	// cf. flutter - dart 언어
	// dart 언어 : nullsafty(NULL연장선)
	
	// Java 생성자가 하나라도 작성되어 있다면, 기본생성자를 자동 생성하지 않는다
	
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
		// 클래스 맴버 내 String 등의 타입들은 null
		System.out.println("생년월일 : " + birthDate);
		System.out.println("연락처 : " + phoneNumber);
		
		// 클래스 맴버 내 정수형(실수형) 타입은 초기화(값을 대입)하지 않앋ㅎ 자동 0으로 맞춰줍니다.
		System.out.println("국어점수 : " + scoreKorean);
		System.out.println("영어점수 : " + scoreEnglish);
		System.out.println("수학점수 : " + scoreMath);
		
		double avg = (scoreKorean + scoreEnglish + scoreMath) / 3.0;
		System.out.println("과목 평균 : " + avg);
	}
	
/*
	public void setScoreKorean(int score) {
		this.scoreKorean = score;
		// Test01 클래스의 main() 함수를 실행시키라는 함수
		this.testPage.main(nickname);
	}
*/
}


