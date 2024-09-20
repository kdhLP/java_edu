package ch13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// Collection - Map
public class Exam04 {
	
	/*
	 * Map : 키(key)-값(Value)의 쌍을 저장하는 자료구조
	 * 	 - Key : Set과 같은 구조(중복을 허용하지않고 순서를 보장하지 않음)
	 * 		> ArrayList(index 역할) - HashSet(Value 특성)
	 * 		cf. ArrayList.get(i);
	 * 			Map.get(Key);
	 * 		> Map 내 유일 : Key를 통해서 값을 빠르게 검색
	 * 		> Map = Set(Key) + Value
	 * 
	 * ==============================================
	 * 	 ArrayList
	 * 		[ 0:[] 1:[] 2:[] 3:[] ]
	 * 		ex) ArrayList.get(0);
	 * 	 Map
	 * 	 	"userId":[] / "userName":[] / "userAge":[] / "userAddress":[]
	 * 		"0":[] "1":[] "2":[] "3":[]
	 * 		ex) Map.get("userId");
	 * 			Map.get(3); > Map.get("3");
	 * ======================================
	 * 
	 * * HashMap
	 * 	 - 구조 : 해시를 사용해서 요소를 저장
	 * 	 / Key 값은 해시 함수를 통해 해시코드로 변환 > 데이터를 저장하고 검색하는데 사용
	 * 	 - 특징 : 삽입, 삭제, 검색 작업은 해시 자료구조 사용
	 * 	 - 순서 : 순서를 보장하지 않음
	 * 
	 * * LinkedHashMap (LinkedHashSet)
	 * 	 - 연결 리스트를 사용하여 삽입 순서 또는 최근 접근 순서에 따라 요소를 유지
	 * 	 - 특징 : 입력 순서에 따라 순회
	 * 	 - 순서 : 입력순서를 보장
	 * 
	 * * TreeMap
	 * 	 - 레드-블랙 트리 기반으로 구현
	 * 	 - 특징	: 모든 키는 자연순서 또는 생성자에 제공된 Comparator에 의해 정렬
	 * 	 	  	: 시간 복잡도의 크기가 큼 > 연산속도가 느림
	 * 	 - 순서 : 입력 순서를 보장
	 * 	 - 복잡한 구조를 가지고 있을 때, 연산속도가 다른 것 보다 빠를 수 있음
	 * 
	 * ** 알고리즘, AI, 선형회귀
	 * 
	 */
	
	public static void main(String[] args) {
		Map<String, String> StevenKing = new HashMap<>();
		
		// Step. sql Query - select * from HR.EMPLOYEES where employee_id = 101;
		//		> Java.Sql Result : userDAO -> StevenKing(Map) 저장
		//		StevenKing.put("userId", userDAO.getUserId() );
		// 보통 DB에서 조회한 결과를 저장할 때
		
		// 데이터를 추가 .put(K key, V value)
		StevenKing.put("userId", "100");
		StevenKing.put("userFirstName", "Steven");
		StevenKing.put("userLastName", "King");
		StevenKing.put("userEmail", "SKING");
		StevenKing.put("userPhoneNumber", "515.123.4567");
		StevenKing.put("deprecatedColumn", null);
		
		System.out.println(StevenKing);
		
		// 데이터를 조회 .get(K key)
		String stevenFirstName = StevenKing.get("userFirstName");
		System.out.println(stevenFirstName);
		
		// 데이터를 수정 .put(K key, V value)
		StevenKing.put("userEmail", "SteKING");
		System.out.println(" # # 수정 후 # # ");
		System.out.println(StevenKing);
		
		// 데이터를 삭제 .remove(K key)
		StevenKing.remove("deprecatedColumn");
		System.out.println(" # # 삭제 후 # # ");
		System.out.println(StevenKing);
		
		// StevenKing - user<Map>
		// Lex De Haan - user <Map>
		ArrayList<Map> users = new ArrayList<Map>();
		users.add(StevenKing);
	}
	
}
