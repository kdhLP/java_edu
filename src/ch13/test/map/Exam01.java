package ch13.test.map;

import java.util.ArrayList;
import java.util.HashMap;

public class Exam01 {
	
	public static void main(String[] args) {
		String[][] arrStr = {
				{"Math", "Science", "Korean", "English"},
				{"100", "90", "90", "60" },
				{"95", "85", "90", "70"}
				
		};
		
		// ArrayList
		ArrayList<String> al = new ArrayList<String>();
		al.add("100"); // ����
		String MathMidScore = al.get(0);
		al.add("90"); // ����
		String ScienceMidScore = al.get(1);
		al.add("90"); // ����
		String KoreanMidScore = al.get(2);
		al.add("60"); // ����
		String EnglishMidScore = al.get(3);
		
		// Map
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put(MathMidScore, "100");
		hm.put(ScienceMidScore, "90");
		hm.put(KoreanMidScore, "90");
		hm.put(EnglishMidScore, "60");
		// ���� �߰���� ����
		String score01 = hm.get("MathMidScore");
		String score02 = hm.get("ScienceMidScore");
		String score03 = hm.get("KoreanMidScore");
		String score04 = hm.get("EnglishMidScore");
		
		/*
		// Oracle - HR - Employees
		String firstName = hm.get("FIRST_NAME");
		
		// ������� Ǯ ����
		if (hm.get("FIRST_NAME") != null || !hm.get("FIRST_NAME").isEmpty()) {
			System.out.println(hm.get("FIRST_NAME")+" "+hm.get("LAST_NAME"));
		} else {
			System.out.println("���� ������ Ȯ���� �� �����ϴ�.");
		}
		*/
		
		
		
	}
}
