package ch13.test.map;

import java.util.HashMap;
import java.util.Map;

public class Test01 {
	
	public static void main(String[] args) {
		
		// 아래의 내용을 HashMap으로 변경해보세요
		String[] studentNames = {"Alpha", "Bravo", "Charlie"};
		int[] studentScore = {90, 80, 70};
		
		for( int i = 0 ; i < studentNames.length ; i++) {
			System.out.println(
					studentNames[i] + "학생의 점수는"
					+ studentScore[i] + "입니다."
					);
		}
		
		HashMap<String, Integer> sc = new HashMap<String, Integer>();
		
		for( int i = 0 ; i < studentNames.length ; i++) {
			sc.put(studentNames[i], studentScore[i]);
			System.out.println(studentNames[i] + " 학생의 점수는 " + sc.get(studentNames[i]) + "점 입니다.");
		}
		
		// Q2. 아래 배열을 Map으로 변경, 모든 데이터를 출력 
		String[][] productArr = {
				{"Java", "10000"},
				{"Spring", "20000"},
				{"JPA","30000"} 
		};
		HashMap<String,Integer> pd = new HashMap<String,Integer>();
		for( String[] product : productArr) {
			pd.put(product[0], Integer.valueOf(product[1]));
		}
		for(String key : pd.keySet()) {
			System.out.println("상품의 이름 : " + key + " / 상품의 가격 : " + pd.get(key));
		}
		
		// Q3. 공통 Key를 찾고 해당 Key가 가지고 있는 값을 더하여 출력
		Map<String, Integer> map001 = new HashMap<String, Integer>();
		map001.put("A", 1);
		map001.put("C", 3);
		map001.put("E", 5);
		
		Map<String, Integer> map002 = new HashMap<String, Integer>();
		map002.put("E", 7);
		map002.put("G", 9);
		map002.put("I", 11);
		
		for(String key1 : map001.keySet()) {
			for(String key2 : map002.keySet()) {
				if(key1.equals(key2)) {
					System.out.println(map001.get(key1) + map002.get(key2));
				}
			}
			if (map002.containsKey(key1)) {
				System.out.println(map001.get(key1) + map002.get(key1));
			}
		}
		
		// 중첩 Map
		// 과목정보 : 수학, 과학, 영어
		// 과목 당 학생 성적을 입력
		
		
		
	}
	
}
