package ch13.test.map;

import java.util.HashMap;
import java.util.Map;

public class Test01 {
	
	public static void main(String[] args) {
		
		// �Ʒ��� ������ HashMap���� �����غ�����
		String[] studentNames = {"Alpha", "Bravo", "Charlie"};
		int[] studentScore = {90, 80, 70};
		
		for( int i = 0 ; i < studentNames.length ; i++) {
			System.out.println(
					studentNames[i] + "�л��� ������"
					+ studentScore[i] + "�Դϴ�."
					);
		}
		
		HashMap<String, Integer> sc = new HashMap<String, Integer>();
		
		for( int i = 0 ; i < studentNames.length ; i++) {
			sc.put(studentNames[i], studentScore[i]);
			System.out.println(studentNames[i] + " �л��� ������ " + sc.get(studentNames[i]) + "�� �Դϴ�.");
		}
		
		// Q2. �Ʒ� �迭�� Map���� ����, ��� �����͸� ��� 
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
			System.out.println("��ǰ�� �̸� : " + key + " / ��ǰ�� ���� : " + pd.get(key));
		}
		
		// Q3. ���� Key�� ã�� �ش� Key�� ������ �ִ� ���� ���Ͽ� ���
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
		
		// ��ø Map
		// �������� : ����, ����, ����
		// ���� �� �л� ������ �Է�
		
		
		
	}
	
}
