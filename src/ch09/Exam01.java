package ch09;

// 중첩 클래스, 내부 클래스
public class Exam01 {
	// 중첩 클래스, 내부 클래스
	// 	- 선언되는 위치에 따라서 이름이 다르게 불려짐
	/*
	 * //	* 중첩(Nested) / 내부(Inner) ::  단어가 주는 차이점
	 * 			- 무언가를 포함하고, 내부에 있다.
	 * 			- 중첩 : 내부에 있지만, 내 겻이 아닌것
	 * 			- 내부 : 내부에서 구성하고 있는 것
	 * 
	 * static 영역에 올라가는 내부클래스 : 정적 중첩 클래스
	 * Inner Class > local Class > anonymous Class
	 * 
	 * cf. 변수 선언
	 * static 변수 > 정적변수
	 * 맴버변수 > 지역변수
	 * 
	 * * 중첩(내부) 클래스는 언제 사용하는가
	 * 	- 특정 클래스가 다른 하나의 클래스 안에서만 사용
	 * 	- 클래스 간의 관계가 아주 긴밀하게 연결되어 있는 특별하 구조(경우)
	 * 	- * 외부 클래스에서 내부 클래스를 자주 사용한다거나 많은 외부 클래스들이 사용한다면
	 * 		-> 내부클래스를 선언하면 안되는 경우
	 * 
	 * * 이유
	 * 	1. 논리적 그룹화 
	 * 		- 특정 클래스가 다른 하나의 클래스 안에서만 사용되는 경우, 해당 클래스 안으로 포함
	 * 		- 패키지를 열었을 때 다른 곳에서 사용할 필요가 없는 중첩 클래스가 외부에 노출되지 않도록 하는 장점
	 *  2. 캡슐화 (정보 은닉)
	 *  	- 중첩(내부) 클래스는 외부 클래스의 private 맴버에 접근할 수 있음
	 *  		-> public 매서드(getter.setter)를 사용하지 않을 수 있음
	 * 
	 * 
	 */
	
	static int a = 100;
	// static  내부클래스 (정적 중첩 클래스)
	static class StaticNestedClass{
		
	}
	
	int b = 1000;
	// 내부클래스 (inner Class)
	class InnerClass {
		
	}
	
	// 지역 클래스 (local Class)
	public void process() {
		// 지역변수
		int c = 10;
		// 지역클래스
		class LocalClass{
		}
		LocalClass local = new LocalClass();
	}
	
	public static void main(String[] args) {
		
		
	}
}
