package ch06;

// 패키지가 다른 경우, import 
//import java.util.Scanner;

// 클래스
public class Exam01 {
	
	public static void main(String[] args) {
		
		// 연습문제 
		// 배열인 경우, 데이터의 삭제 혹은 수정이 필요한 경우, index(순번)이 정말 중요함
		int[][] scores = {
		// { 국어, 영어, 수학 }
			{ 90, 80, 90 },	// 학생1  : 손창인
			{ 80, 55, 60 },	// 학생2  : 손흥민 
			{ 80, 70, 65 }	// 학생3  : 손연재
		};
		
		/*
		System.out.println( student1.name );
		Student student1Backup = student1;
		student1Backup.name = "손정식";
		System.out.println( student1Backup.name );
		System.out.println( student1.name );
		*/
		// Java는 변수의 동적생성을 허용하지 않습니다. -> 배열
		// 변수의 이름 : student1 / 변수의 자료형 : Student Class (참조형)
		/*
		// 학생 1.
		Student student1 = new Student();
		student1.name = "손창인";
		// 학생 2.
		Student student2 = new Student();
		student2.name = "손흥민";
		// 학생 3.
		Student student3 = new Student();
		student3.name = "손연재";
		System.out.println( student1.name );
		System.out.println( student2.name );
		System.out.println( student3.name );
		*/
		/*
		// 클래스를 변수로 선언 -> 배열
		// []의 값의 형태(자료형)은 'Student'라는 클래스의 형태로 값이 저장됨
		Student[] students = new Student[3];
		// Student[] students = { student1, new Student(), new Student() }; 
		students[0] = new Student();
		Student student1 = students[0];
		student1.name = "손창인";
		// 메소드의 사용방법
		System.out.println(student1.scoreKorean);
		student1.setScoreKorean(100);
		System.out.println(student1.scoreKorean);
		// 클래스변수가 배열인 경우 
		student1.nickname[0] = "별명1";
		student1.nickname[1] = "별명2";
		student1.nickname[2] = "별명3";
		student1.nickname[3] = "별명4";
		student1.nickname[4] = "별명5";
		// error. OutOfBounds
		//student1.nickname[5] = "별명6";
		
		students[1] = new Student();
		students[1].name = "손흥민";
		// 회원가입. 글자의 수를 제한 (validate)
		String nicknamePrac = "쏘니";
		System.out.println( " nicknamePrac 의 글자수 :: " + nicknamePrac.length() );
		
		students[2] = new Student();
		students[2].name = "손연재";
		
		for ( int i = 0 ; i < students.length ; i++ ) {
			System.out.println( students[i].name );
		}
		
		*/
		
		
		
		
	}
	
}








