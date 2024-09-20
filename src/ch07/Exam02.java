package ch07;

// 다형성
/*
 * 객체지향 프로그래밍 : 컴퓨터 프로그램을 명령어의 목록으로 보는 시각(절차/명령)에서 벗어나
 * 					여러개의 독립된 단위(댇체)의 모임으로 파악
 * 				- 각각의 객체는 메세지를 주고받고, 데이터를 처리
 * 				- 유연하고 변경이 용이하게 만드는 것을 목적 : 대규모 소프트웨어(SW) 개발에 주로 사용
 * 				- 레고 블럭 조립 / 자동차 부품을 교체 / 컴퓨터 부품 교체 ... 
 * 
 * ** 캡슐화 / 상속 / 다형성 + 추상화 : 대표적인 특성
 * 	 -> 좋은 소스코드가 될 가능성이 높음
 * 
 */

/* // 다형성
 * 실제 현실과 객체지향(컴퓨터 세계)와 1:1 매칭
 * 	 -> 다 표현하기에는 어렵지만, 대부분은 표현
 * 	 -> 역할 / 구현 : 세상을 구분 -> 소스코드 작성하게 되면, 단순, 유연, 편리한 수정
 * 		* 서버 - 클라이언트
 * 		* 클라이언트는 대상의 역할(추상화)만 알면 됨
 * 		* 클라이언트는 구현대상의 내부 구조를 몰라도 됨
 * 		* 클라이언트는 구현 대상의 내부구조가 변경되어도 영향을 받지 않아야 함
 * 		* 클라이언트는 구현대상 자체를 변경해도 영향을 받지 않아야 함
 * 
 * 	 ex)   운전자 -	자동차	(역할) - 인터페이스(추상화)
 * 		->	나	-	소나타	(구현) - 인터페이스를 상속받아 구현한 클래스, 객체
 * 		// 손창언, 이상진, 전지은, 박세혁, 정규현, 박주영, ... , extends 운전자
 * 		// 소나타, 셀토스, 펠리세이드, 
 * 
 */

// 다형성(Polymorphism) : 다양한 형태 / 여러 형태를 가진성질
// - 다형적 참조 / 메소드 오버라이딩

// 다형적 참조 (다형성, 캐스팅)

class Driver {
	int distance = 0;
	int price = 0;
	void drive() {
		System.out.println("운전을 합니다");
		
		this.checkDistance();
	}
	void talk() {}
	void cash() {
		distance = 0;
		price = 0;
	}
	void stop() {
		
	}
	void checkDistance() {
		distance += 10;
	}
}
class Son extends Driver { 
	public String name = "son";
	@Override
	void drive() {
		System.out.print(this.name + " 운전자가 ");
		super.drive();
	}
	void childMethod() {}
}
class Park extends Driver { }
class Jeon extends Driver { }
class Jung extends Driver { }

public class Exam02 {
	public static void main(String[] args) {
	// Son 자식클래스를 객체생성을 하는데, 변수의 타입을 부모 클래스의 타입을 설정
		
		Son son = new Son();
		// Driver son = new Son();
		// Son 클래스에서 drive() 메소드를 재정의한 메소드 호출(사용)
		son.drive();
		
		// 재정의한 drive() 메소드가 없음 -> 상속받은 부모클래스의 drive() 메소드를 호출
		Park park = new Park();
		park.drive();
		Jeon jeon = new Jeon();
		jeon.drive();
		Jung jung = new Jung();
		jung.drive();
		
		// 형변환 - 암묵적 / 명시적
		
		// {자료형} drivers = new {자료형}[4];
		// son, park, jeon, jung class는 Dreiver class 상속
		// 자식클래스의 객체생성 -> Heap 메모리 상에 지식클래스 뿐만 아니라, 부모 클래스의 정보도 같이 올라감
	
		Driver[] drivers = new Driver[] {new Son(), new Park()
										, (Driver)new Jeon(), (Driver)new Jung()};
		// drivers[0] = Son class
		/*
		// while
		int i = 0;
		while (i < drivers.length) {
			drivers[i].drive();
			i++;
		}
		// for
		for (int j = 0 ; j < drivers.length ; j++) {
			drivers[j].drive();
		}
		*/
		// for - each
		forDriver(drivers);
		/*
		for (Driver driver : drivers) {
			driver.drive();
		}*/
		
		// 다형적 참조, 부모클래스는 자식클래스를 포함하고 있다.
		// 업캐스팅 (자식클래스 -> 부모 클래스)
		Driver son01 = (Driver)new Son();
		// 타입으로써 자식 클래스는 부모 클래스를 타입으로 설정 불가능
		// Son son02 = new Driver();
		
		// 다운 캐스팅 (부모클래스 -> 자식클래스)
		Driver driver03 = new Driver();
		// 부모 클래스는 자식 클래스의 정보를 모두 가져가지 않음
		// driver.childMethod();
		// Heap 상 다운캐스팅을 진행하면서,
		// 기존의 Heap 메모리에 있던 참조하는 객체에 Son 자식클래스의 정보를 포함
		
		
		Driver driver05 = new Son();
		Son son05 = (Son)driver05;
		
		Son son03 = (Son)driver03;
		son03.childMethod();
		
		
	}
	public static void forDriver(Driver[] array) {
		for(Driver driver : array) {
			driver.drive();
			driver.cash();
			
		}
	}
	
}
