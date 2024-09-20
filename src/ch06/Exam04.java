package ch06;

// 생성자
public class Exam04 {

	public static void main(String[] args) {
		
		
		/* 객체를 생성하는 시점에
		 * 	속성(필드)값을 대입시킨다거나
		 * 	어떠한 기능(메소드)를 실행시킨다거나
		 * 	등 의 어떠한 작업이 필요한 경우
		 * 	생성자를 사용합니다.
		 * 
		 * 생성자(Constructor)
		 * 	- 메소드 : ()
		 * 	- 클래스와 이름이 같은 메소드
		 * 	- 매개변수를 사용 가능
		 * 
		 * 정의
		 * 	{접근제어자} {클래스 이름} (){
		 *		// ...
		 * 	}
		 */
		Car sonata = new Car();
		sonata.name = "소나타";
		sonata.color = "흰색";
		sonata.category = "세단";
		
		// 객체의 생성과 동시에 필드에 대입할 값을 한꺼번에 처리(클래스내 필드 초기화)
		Car mohabi = new Car("모하비", "블랙", "SUV");
		
		// 학생 1 객체를 생성
		// 생성자를 통해서 아래의 정보를 생성과 동시에 필드에 값을 대입
		/*
		 * 이름 : 손흥민
		 * 나이 : 33
		 * 키 : 183
		 * 별명 : 쏘니
		 * 국적 :대한민국
		 * 주소 : 강원도 춘천시 후평동
		 * 성별 : 남 
		 */
		
		// String[] nickName = {"쏘니"};
		String[] nickName = new String[5];
		nickName[0] = "쏘니";
		Student student1 = new Student("손흥민", 33, 183.0, nickName, "대한민국", "강원도 춘천시 후평동", "남" );
		
		// 메소드 호출(실행)
		student1.averageSubject();
		
		// 메소드 내 사용되는 지역변수는 초기화가 반드시 이루어져야 합니다.
		int var = 0;
		System.out.println(var);
		String strVal;
		// Exception : The local variable ... may not have been initialized
		// 반드시 초기화(값의 대입)이 필요함
		//System.out.println(strVal);
		
		// this 키워드 : Car.java(Class)를 참조
		// this()
		//	- 생성자 내부에서 자신의 
		
		
	}

}
