package ch09;

// 익명 클래스 (anonymous Class)
// - 지역 클래스의 특별한 종류
// - 지역클래스인데, 클래스의 이름이 없다는 특징
// - 선언과 생성이 동시에 이루어 짐
// - 부모클래스를 상속받거나, 인터페이스 구현을 목적으로 사용
//	 익명클래스를 사용할 떄는 상위(부모)클래스나 인터페이스(추상클래스)가 필요
// - 생성자 : 기본 생성자만 사용가능 ( 생성자를 가질 수 없음 )
// - 클래스를 별도로 정의하지 않고도 인터페이스나 클래스를 즉석해서 구현(상속) 할 수 있어서 코드가 간결함
// - 시스템의 구조가 복잡해지거나 재사용이 필요한 경우, 중첩(내부) 클래스가 아니라 일반적인 클래스 선언
// - 일회성으로 끝나는 경우, 익명 클래스를 보통 많이 사용
public class Exam05 {
	
	public void outerClassMethod( int methodParamValue) {
		
		// 
		class LocalClass extends Exam01 implements ch08.Exam02{
			public void localMethod() {
				
			}

			@Override
			public void method01() {	}

			@Override
			public void method02() {	}

			@Override
			public void method03() {	}
		}
		 // 상속
		/*
		 * Exam01 클래스를 상속받는 이름없는 클래스(익명클래스)의
		 * 주소값을 가지는 변수의 이름 : tmpClass01
		 */
		new Exam01() {
			public void print() {
				
			}
		}.print();
		
		// 구현
		/*
		 * ch08.Exam02 인터페이스를 구현하는 이름없는 클래스의 
		 * 	주소값을 가지는 변수의 이름 tmpClass02
		 */
		
		ch08.Exam02 tmpClass02 = new ch08.Exam02() {
			@Override
			public void method01() {	}
			@Override
			public void method02() {	}
			@Override
			public void method03() {	}	
		};
		// 사용
		tmpClass02.method01();
		
	}
	
}
