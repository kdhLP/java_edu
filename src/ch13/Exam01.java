// Generic & Collection Framework
package ch13;

/*
 * 데이터를 저장, 관리하기 위해서 사용되는 방법
 * 	 변수(기본형+참조형)	- 변수 동적으로 생성할 수 없음
 * 	 > 배열			- 같은 타입의 값을 저장 / 선언할 때, 크기가 정해짐
 * 	 > 클래스(다형성)	- 타입안정성(다운캐스팅을 통해) / 형변환(다운캐스팅)
 * 	 > 제네릭(Generic)
 */
// 다형성을 이용한 클래스
class PolyClass {
	// obj 필드에 다양한 타입의 데이터를 저장하기 위해서 object 타입 선언
	private Object obj;
	public Object getObject() {
		return this.obj;
	}
	public void setObject(Object obj) {
		this.obj = obj;
	}
}

/*
 * Generic (제네릭 / 일반적인 의미)
 * 	 : 특정 타입이 정해지지 않아 일반적으로 사용할 수 있다.
 * 
 * * 사용방법
 * 		1. 클래스 이름 뒤에 <>(다이아몬드/앵커브라켓) 사용
 * 		2. <> 안에 사용되는 문자 T : 타입 매개변수
 * 			* 타입 매개변수 : 제네릭에서 사용되는 변수, 실제타입으로 대입되는 것
 * 			  ex) E(Element), K(Key), V(Value), N(Number), T(Type), ...
 * 			* raw Type (원시타입)
 * 				- < >를 사용하여 타입을 지정하지 않아도 됨
 * 				- < >를 사용하지 않는 제네릭
 * 				- 되도록이면 사용하지 않도록 함
 * 				( 제네릭 개념이 자바 버전 초기에는 없음 > 기존 코드와 호환성 )  
 * 		3. 클래스 내부에 타입 매개변수(T)를 사용
 * 			* 타입 매개변수(T) : 기본형(int, double, ...) 사용할 수 없음
 * 							> 객체의 형태를 타입 매개변수로 사용할 수 있음
 * 
 * ** 클래스의 선언할 때, 타입을 정해주는 것이 아닌
 * 타입의 선언을 클래스 객체의 생성(사용)할 때, 나중에 정해주겠다는 의미
 * 
 * ** 정리
 * 	 1. 사용할 타입을 미리 결정하지 않음
 * 	 2. 실제 사용하는 타입은 생성 시점에 결절
 * 		- 사용할 타입에 대한 결정의 시점을 나중으로 미룸
 * 
 * :: DAO(Data Access Object), DTO(Data Transfer Object), VO(Value Object)
 * class VO<K, V> {
 * 		private K userId;
 * 		private V userName
 * 
 *		// ... getter / setter
 * }
 * 
 * // VO<Integer, String> data = new VO<Integer, String>();
 * 
 */
class GenericClass<T>{
	
	private T obj;
	public T getObject() {
		return this.obj;
	}
	public void setObject( T obj) {
		this.obj = obj;
	}
}

public class Exam01 {
	
	public static void main(String[] args) {
		
		// 다형성 관련된 예시
		polyExample();
		
		// 제네릭을 이용한 예시
		GenericClass<Integer> gC = new GenericClass<Integer>();
		// auto-Boxing
		// gC.setObject(11);
		gC.setObject(Integer.valueOf(11));
		// 다운 캐스팅이 필요없음
		Integer i = gC.getObject();
		
		GenericClass<String> generic02 = new GenericClass<String>();
		generic02.setObject("HAHAHA");
		String str = generic02.getObject();
		
		// 원시타입 - 제네릭
		// 초기자바 > 제네릭 개념이 없음 : 초기자바 코드와의 호환성이 필요
		// <Object> 생략
		// GenericClass<Object> generic03 = new GenericClass();
		GenericClass generic03 = new GenericClass();
		generic03.setObject(11);
		// int <> Object >> 다운캐스팅, 형변환 >> 되도록이면 사용하지 말라
		int ii = (int)generic03.getObject();
		
		
	}
	
	public static void polyExample() {
		PolyClass poly = new PolyClass();
		// set > int
		poly.setObject(11);
		// 형변환
		int i = (int)poly.getObject();
		System.out.println("int 1 = " + i);
		
		// set > Integer
		poly.setObject(Integer.valueOf(10));
		// 형변환(다운캐스팅) - 예외(오류) 발생 위험성
		Integer iC = (Integer)poly.getObject();
		System.out.println("Integer iC = " + iC);
		
		// set > String
		poly.setObject("다양한 형태의 값을 저장할 수 있습니다.");
		// ... 코드 라인 수 : 10 ~ 300(1000)
		// DB 연동 > 저장되는 데이터의 타입을 알 수 없을때가 존재
		// 형변환(다운캐스팅) 
		String str = (String)poly.getObject();
	}
	
}
