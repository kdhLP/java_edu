package ch13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

// Collection - Set
/*
 * (interface) Collection - (interface) Set - HashSet
 * 											- LinkedHashSet
 * 											- TreeSet
 * 
 * Set
 * 	 - Hash 자료구조를 사용해서 요소를 저장
 * 	 	* Hash
 * 			(index 존재) 0:[1] 1:[2] 2:[5] 3:[8] 4:[10]
 * 			(index 미존재) [1] [2] [5] [8] [10]
 * 	 	> 0:[] 1:[1] 2:[2] 3:[] 4:[] 5:[5] 6:[] 7:[] 8:[8] 9:[] 10:[10] 
 * 	 	> 순번없이 뒤섞여있는 데이터를 불러올 때, 값을 순번처럼 사용
 * 	 - 특정한 순서 없이 저장(추가한 순서를 보장하지 않음)
 * 	 - 활용	: 데이터의 유일성만 중요 
 * 			> 중복을 허용하지 않는다
 * 			> 일반적으로 중복 데이터를 제거할 때 사용
 * 
 * * HashSet
 * 
 * * TreeSet
 * 	 - 이진 탐색트리를 개선한 레드-블랙트리 알고리즘을 사용
 * 	 - 요소들은 정렬된 순서로 저장 (입력된 순서가 아님)
 * 	 - 활용 : 범위 검색, 정렬된 데이터가 필요한 경우
 * 		ex) 네비게이션, 길찾기 프로그램
 * 
 */
public class Exam03 {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();
		// 데이터 추가 .add()
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("E");

		// 데이터를 수정, 조회 없음 (포함 여부 확인)
		// set.get();
		// set.set();
		// 자료의 크기 .size()
		System.out.println("크기 : " + set.size());
		// 삭제
		set.remove("E");

		System.out.println("Set 테이터 : " + set);
		// 데이터 중복제거를 위해서 Set
		// > 남아있는 데이터를 활용하기 위해서 ArrayList 변환

		/*
		 * Iterator : 반복자
		 * 	 - Conrainer, 특히 List를 순회할 수 있게 해주는 객체
		 * 	 -ArrayList, HashSet... Collection을 반복하는데 사용가능
		 * 	 - ** Collection에서 요소를 제어하는 기능
		 * 	 - next() / previous() 메소드를 사용하여 요소들 간의 이동 가능
		 * 	 - hasNext()를 통해서 더 많은 요소가 있는지를 확인 가능
		 */
		/*
		 * Set : index가 없음
		 * 	 - for문을 사용할 수 없음
		 * 	 - for-each문 사용 가능
		 * 
		 */

		for (int i = 0; i < set.size(); i++) {
			// Set : index도 없지만 get() 메소드도 없다
			// String alpha = set.get(i);
		}
		int i = 0;
		for (String alpha : set) {
			i++;
			if (i == 2) {
				alpha = "Z";
			}
			System.out.println(alpha);
		}
		System.out.println(set);

		Iterator e = set.iterator();
		while (e.hasNext()) {
			System.out.println(e.next());
		}
		
		// 직접구현 : Set
		ArrayList<String> list = new ArrayList<String>();
		for(String str : set ) {
			list.add(str);
		}
		System.out.println("값 조회 : " + list.get(2));
		list.set(2,  "Z");
		System.out.println("값 확인 : " + list.get(2));
		
		/*
		 * Java-Program : DB 요청
		 * > result = select * from table where ...;
		 * > (중복데이터 저거) Set set = result;
		 * > (활용 목적) Set > ArrayList 변환
		 * 
		 * > result = select 	DISTINCT * from table where ... group by
		 * > ArrayList = result
		 */
		
		// 예제문제
		// 다음 배열을 중복제거하라
		int[] inputArr = {30, 20, 20, 10, 10, 5, 2, 30};
		
		HashSet<Integer> setArr = new HashSet<Integer>();
		
		for(int j = 0 ; j < inputArr.length ; j++) {
			setArr.add(inputArr[j]);
		}
		System.out.println(setArr);
		

	}
}
