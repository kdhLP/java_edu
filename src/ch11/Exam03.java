package ch11;

// 래퍼클래스 (Wrapper Class)
/*
 * 기본형 타입을 객체로 감싸서 더 편리하게 사용하도록 도와주는 클래스
 * 		byte > Byte
 * 		short > Short
 * 		int > Integer
 * 		long > Long
 *		float > Float
 * 		double > Double
 * 		char > Character
 * 		boolean > Boolean
 * 
 * * 래퍼 클래스 생성 - 박싱(Boxing)
 * 	- 기본형을 래퍼클래스로 변경하는 것을 마치 박스에 물건을 넣은것 같다 : Boxing
 * 	- 오토박싱(AutoBoxing) : 컴퓨터가 알아서 박싱을 함
 * 	- 언박싱(UnBoxing) : 래퍼클래스에 들어있는 기본형 값을 다시 꺼내는 작업/메소드/함수 
 * 	- String Class 와 성질이 같다
 * 		> 불변 : final 특징을 가지고 있음
 * 		> equals()를 통해서 값 비교 : 레퍼클래스 > 변수에 저장되는 건 주소값([==] 사용불가) 
 */

public class Exam03 {
	
	/*
	 * 기본형 타입이 가지는 한계점
	 *  1. 객체가 아님 : 객체지향 프로그래밍에 대한 장점을 살릴 수 없음
	 *  	> 객체 타입 : 메소드를 지원(기본형은 메소드를 이용할 수 없음)
	 *  2. null 값을 가질 수 없음 : NullPointException 
	 *  	> 기본형 데이터 타입은 null 값을 가질 수 없음
	 *  	> 기본형데이터 타입은 반드시 초기화(값의 대입) 과정을 거쳐야 합니다.
	 *  	> 때로는 항상 값을 없다라고 표현해야하는 경우 존
	 *  재
	 */

}
