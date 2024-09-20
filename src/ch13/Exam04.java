package ch13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// Collection - Map
public class Exam04 {
	
	/*
	 * Map : Ű(key)-��(Value)�� ���� �����ϴ� �ڷᱸ��
	 * 	 - Key : Set�� ���� ����(�ߺ��� ��������ʰ� ������ �������� ����)
	 * 		> ArrayList(index ����) - HashSet(Value Ư��)
	 * 		cf. ArrayList.get(i);
	 * 			Map.get(Key);
	 * 		> Map �� ���� : Key�� ���ؼ� ���� ������ �˻�
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
	 * 	 - ���� : �ؽø� ����ؼ� ��Ҹ� ����
	 * 	 / Key ���� �ؽ� �Լ��� ���� �ؽ��ڵ�� ��ȯ > �����͸� �����ϰ� �˻��ϴµ� ���
	 * 	 - Ư¡ : ����, ����, �˻� �۾��� �ؽ� �ڷᱸ�� ���
	 * 	 - ���� : ������ �������� ����
	 * 
	 * * LinkedHashMap (LinkedHashSet)
	 * 	 - ���� ����Ʈ�� ����Ͽ� ���� ���� �Ǵ� �ֱ� ���� ������ ���� ��Ҹ� ����
	 * 	 - Ư¡ : �Է� ������ ���� ��ȸ
	 * 	 - ���� : �Է¼����� ����
	 * 
	 * * TreeMap
	 * 	 - ����-�� Ʈ�� ������� ����
	 * 	 - Ư¡	: ��� Ű�� �ڿ����� �Ǵ� �����ڿ� ������ Comparator�� ���� ����
	 * 	 	  	: �ð� ���⵵�� ũ�Ⱑ ŭ > ����ӵ��� ����
	 * 	 - ���� : �Է� ������ ����
	 * 	 - ������ ������ ������ ���� ��, ����ӵ��� �ٸ� �� ���� ���� �� ����
	 * 
	 * ** �˰���, AI, ����ȸ��
	 * 
	 */
	
	public static void main(String[] args) {
		Map<String, String> StevenKing = new HashMap<>();
		
		// Step. sql Query - select * from HR.EMPLOYEES where employee_id = 101;
		//		> Java.Sql Result : userDAO -> StevenKing(Map) ����
		//		StevenKing.put("userId", userDAO.getUserId() );
		// ���� DB���� ��ȸ�� ����� ������ ��
		
		// �����͸� �߰� .put(K key, V value)
		StevenKing.put("userId", "100");
		StevenKing.put("userFirstName", "Steven");
		StevenKing.put("userLastName", "King");
		StevenKing.put("userEmail", "SKING");
		StevenKing.put("userPhoneNumber", "515.123.4567");
		StevenKing.put("deprecatedColumn", null);
		
		System.out.println(StevenKing);
		
		// �����͸� ��ȸ .get(K key)
		String stevenFirstName = StevenKing.get("userFirstName");
		System.out.println(stevenFirstName);
		
		// �����͸� ���� .put(K key, V value)
		StevenKing.put("userEmail", "SteKING");
		System.out.println(" # # ���� �� # # ");
		System.out.println(StevenKing);
		
		// �����͸� ���� .remove(K key)
		StevenKing.remove("deprecatedColumn");
		System.out.println(" # # ���� �� # # ");
		System.out.println(StevenKing);
		
		// StevenKing - user<Map>
		// Lex De Haan - user <Map>
		ArrayList<Map> users = new ArrayList<Map>();
		users.add(StevenKing);
	}
	
}
