package ch13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/*
 * Collection Framework - List
 * 
 * 데이터를 저장, 관리하기 위해서 사용되는 방법
 * 	 변수(기본형+참조형)	- 변수 동적으로 생성할 수 없음
 * 	 > 배열			- 같은 타입의 값을 저장 / 선언할 때, 크기가 정해짐
 * 	 > 클래스(다형성)	- 타입안정성(다운캐스팅을 통해_ / 형변환(다운캐스팅)
 * 	 > 제네릭(Generic)
 * 	 > Collection Framework
 * 
 * * Array
 * 	 - 가장 기본적인 자료구조
 * 	 - 순서가 있고 중복을 허용, 크기가 고정적
 * 	 - 주로 인덱스(목차, 순번)를 사용할 때, 최고의 효율을 보이는 자료구조
 * 	 - 단점 : 배열을 선언(생성)하는 시점에 배열의 크기를 미리 정해야 함 
 * 			/ 같은 자료형을 담아야 한다.
 * 
 * * List
 * 	 - (interface) Collection - (interface) List
 * 	 	 > ArrayList / Vector // LinkedList
 * 	 - 값의 (입력된) 순서가 있고, (값의) 중복을 허용하는 자료구조
 * 
 * * ArrayList
 * 	 - 배열을 사용한 리스트
 * 		: 순서가 있고 중복을 허용, 크기가 동적
 * 	 - 기본적인 크기 : 10
 * 		> 데이터의 수, 크기가 변경 > 50% 증가
 * 		ex) 10 > 15 > 22 > 33 > 49 > ...
 * 	 - 활용 
 * 		: 데이터가 순서대로 입력 / 순서대로 출력되는 경우(Queue)
 * 		: 일반적으로 제일 많이 사용하는 Collection
 * 	 - 처음 혹은 마지막 데이터를 추가, 수정할때는 속도가 빠름
 * 		/ 중간에 데이터를 추가, 수정, 삭제할 때는 속도가 상대적으로 느림
 * 		// 자세한 내용 : 알고리즘 <시간복잡도> - 빅오표기법
 * 	 [] [] [] [] [] [] [] []
 * 
 * * LinkedList <> ArrayList
 * 	 - 중간에 데이터를 추가, 수정, 삭제가 빠름
 * 	 - ArrayList가 가지는 단점을 보완한 리스트
 * 	 - ArrayList가 하나의 바구니에 수납영역을 나눈것이라 비유를 하자면
 * 		LinkedList는 조그마한 바구니는 테인으로 엮은것이라 비유
 * 	 - ArrayList보다 무겁다 : 메모리 할당량이 높음.
 * 	 - 기본크기 : ??
 * 
 * * Vector
 * 	 - ArrayList와 기능, 구조상 거의 동일
 * 	 - Thread의 동기화 기능이 추가 (ch12.Thread)
 * 	 - 초기에는 유용한 기능 (유행이라 표현해도 될 만큼 자주 사용)
 * 	 - 단일 Thread 환경에서도 불필요한 동기화 발생
 * 		> 성능저하, 불필요한 메모리에 내용 할당
 * 		> 점차 사용을 안하게 됨
 * 		> 현재는 하위 호환성을 위해서 남겨놓음
 * 	 - Thread 동기화에 대한 대안이 많이 나옴
 * 
 */

public class Exam02 {
	
	public static void main(String[] args) {
		
		// 배열 변수의 선언
		int[] intArray = new int[5];
		int[] intArray02 = {1, 2, 3, 4, 5};
		// 1, 2, 3, ... 순서대로 입력, for 출력 1, 2, 3, ...
		
		// ArrayList
		// 타입추론 : 객체 생성(생성자)에 <> 사용하고 안에 타입을 선언하지 않았더라도
		//			좌변의 변수를 선언하는 위치에 타입이 선언되어 있으면
		//			자바가 알아서 타입을 맞춰줌.
		ArrayList<String> list = new ArrayList<>();
		// 새로운 데이터를 추가.add(Object obj)
		// list 생성할 당시, list 크기 : 10 (index : 0~9)
		// 순서가 존재
		list.add("김나연"); 		// index 0
		list.add("김도형");		// index 1
		list.add("박세혁");		// index 2
		list.add("김나연"); 		// index 3, 값의 중복 허용
		// ...
		list.add("이상진");		// list 크기 : 15 > index 10
		list.add("전지은"); 		// index 11
		list.add("정규현");		// index 12
		// 새로운 데이터를 추가 .add(int index, Object obj)
		list.add(3, "손창인");	// index 3, 값을 추가
		// 기존의 데이터를 수정 .set(int index, Object obj)
		list.set(3,  "강사");
		// 기존의 데이터를 삭제 .remove(int index)
		list.remove(3);
		// 데이터를 확인
		System.out.println(list);
		// for-each 문 : 출력
		for(String name : list) {
			System.out.println(name);
		}
		
		// 데이터를 입력 : for-each문 보다 for문 효과
		// ArrayList 크기를 확인하는 메소드 .size
		// cf. Array.length / String.length()
		/*
		int size = list.size();
		for (int i = 0 ; i < size ; i++) {
			// 데이터 추가
			list.add("새로운 데이터");
			// 데이터 수정
			if (i == 3) {
				list.set(i,  "강사");
			}
			// if 조건문을 사용하지 않는다면 list.size()만큼 아래 소스코드를 실행
			// list.set(3, "강사");
			// 데이터 삭제
			if(i == 0 || i == 4 ) {
				list.remove(i);
			}
		}
		*/
		
		// 데이터를 조회 .get(int index)
		System.out.println("4번째 값 : " + list.get(3));
		
		// Iterator
		Iterator<String> e00 = list.iterator();
		while (e00.hasNext()) {
			// Iterator : get(), set() 없음
			System.out.println(e00.next());
		}
		
		ListIterator<String> e01 = list.listIterator();
		while (e01.hasNext()) {
			e01.set(e01.next() + " 추가문자열");
		}
		System.out.println(list);
		
		
		
	}
}
