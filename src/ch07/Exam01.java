package ch07;



//Design Patterns : 전략(Strategy) 패턴
// 상속(Inheritance)
/*	- 객체지향 프로그래밍의 핵심요소 중 하나
 * 	- 기존 클래스의 필드(속성)와 메소드(기능)를 새로운 클래스에서 재사용이 가능
 * 	- 부모 클래스 (기존 클래스/ 상속하는 클래스)
 * 		: 다른 클래스에 자신의 속성, 기능을 제공하는 클래스
 * 	- 자식클래스 (새로운 클래스/상속받는 클래스)
 * 		: 부모클래스로부터 속성, 기능을 제공받는 클래스
 * 	- 상속 개념을 사용하기 위한 키워드 : extends
 * 	- 자바에서는 다중 상속이 되지 않음. 단일 상속만 가능.
*/

class Vehicle{ } // 최상위 부모 클래스

// 자동차
class Car extends Vehicle {
	// 소스 코드 재사용성 향상
	int speed;
	int temp;
	public void move() {
		speed++;
	}
	public void stop() {}
	public void navigation() {}
	public void aircondition() {}
	public void heater() {}
}

class motoCycle extends Vehicle { }

class SUV extends Car{
	// 확장성
	public void runOffLoad() {}
	public void carriage() {}
}

class Palisade extends SUV {
	public void setForCamping() {}
}

class G90 extends SUV{
	public void camera360() { }
}

class E300 extends Car {
	
}

class Carnival extends Car {
	public void setForCamping() {}
}
// 콘크리트 클래스 : 상속받은 마지막 클래스
class Boxer extends Car{
	int tireCount;
	// 슈퍼카 : move() 다른 차보다 좀 더 빠르게 움직입니다.
	// 메소드 오버라이딩 : 부모클래스에서 선언된 기능(메소드)를
	//			자식 클래스에서 재정의하여 사용할 수 있도록 제공된 기능
	//			cf) 메소드 오버로딩 : 동일한 메소드를 여러개 사용 가능(매개변수를 통해 구분)
	// 어노테이션(Annotation) : 하나의 주석 / 컴퓨터가 이해하는 메타데이터의 일종
	/*
	 * 메소드 오버라이딩 조건
	 * 1. 상속(부모-자식 관계를 맺어야 함)
	 * 2. 동일한 메서드 이름
	 * 3. 동일한 매개변수 (파라미터의 순서, 갯수, 타입)
	 * 4. 접근제어자 사용제한
	 * 	 : 부모클래스의 접근제어자보다 좁은 범위의 접근제어자를 사용금지
	 * 	   public > protected > default > private
	 * 5. 예외처리(throws) - 상위 클래스의 예외처리 되는 수보다 많이 선언 할 수 없습니다.
	 * 6. static, final, private 키워드가 붙은 매서드는 오버라이딩을 사용할 수 없음
	 * 7. 생성자는 오버라이딩을 할 수 없음
	 * 		- super / super()	cf) this / this()
	 * 
	 */
	@Override
	public void move() {
		super.speed+=2;
		this.tireCount = 4;
	}
}

// 오토바이

class Monkey extends motoCycle { }
class msx125 extends motoCycle { }
class CB125R extends motoCycle { }

public class Exam01 {
	public static void main(String[] args) {
		// 상속받은 자식클래스의 객체 생성
		E300 yoo = new E300();
		// 자식클래스에서는 작성한 소스코드가 없다고 하더라도,
		// 부모 클래스에 선언된 속성, 기능을 사용할 수 있음. 
		/*
		 * ** 상속관계의 객체를 생성하면 하나의 주소에 부모, 자식 클래스가 모두 생성
		 * * 상속 관계의 객체를 호출할 때, 대상 타입 정해줘야 함 (다형성)
		 * ** 현재 타입에서 기능을 찾지 못하면 상위 부모 타입으로 기능을 찾아서 실행
		 * 		-> 상위 부모 클래스에서도 기능을 찾지 못하면 오류가 발생
		 */
		yoo.move();
		
		SUV jeep = new SUV();
		jeep.carriage();
		// 부모클래스는 자식클래스의 method를 이용할 수 없음
		// jeep.camera360();
		
		Palisade jeon = new Palisade();
		// class SUV :: method
		jeon.runOffLoad();
		// class CAR :: method
		jeon.stop();
		
		G90 jung = new G90();
		// class SUV :: method
		jung.carriage();
	}
	
	
}
