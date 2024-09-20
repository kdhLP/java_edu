package test.last;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Questions {
	/*
	 * 
	 *
	 * 6. ����(Employees) Ŭ������ �ۼ��ϰ�, ����(����) �� ������ ����ϴ� ���α׷��� �����ϼ���.
	 * 	- Employees Ŭ������ employeeName(String), salary(int), tax(int) ������ �߰��ϰ�, private���� �����ϼ���.
	 * 	- ��ü�� ������ ��, �����ڸ� ���ؼ� �� ������ ���� �Ʒ��� ���� �ʱ�ȭ�մϴ�.
	 * 		* �����̸�, �����ݾ�, ����
	 * 		* Steven, 10000000, 30%
	 * 		* Mike, 4500000, 15%
	 * 		* John, 3000000, 12%
	 * 	- �濵������(AdministrationTeam) Ŭ������ �����, main()���� ���� ��ü�� �����ѵ�,
	 * 		�� ������ �̸��� �Ǽ��� ���޾��� ����ϼ���.
	 *
	 * 7. ��ȣȭ �ý��ۿ� ���� ������ ������ ����
	 * 	- Encryption �������̽��� �ۼ��ϰ�, encrypt(String data) �޼��带 �����ϼ���.
	 * 	- AESEncryption, DESEncryption, NoEncryption �̶�� 3���� ��ȣȭ Ŭ������ Encryption �������̽��� �����ϴ� ���α׷��� �ۼ��ϼ���.
	 * 		* AESEncryption ��ü�� �����Ͽ� encrypt �޼��带 �����ϸ� "AES ��ȣȭ�� ������ ��� : {data} " �� ���·� ����ϼ���.
	 * 		* DESEncryption ��ü�� �����Ͽ� encrypt �޼��带 �����ϸ� "DES ��ȣȭ�� ������ ��� : {data} " �� ���·� ����ϼ���.
	 * 		* NoEncryption ��ü�� �����Ͽ� encrypt �޼��带 �����ϸ� "��ȣȭ�� �������� ���� ��� : {data} " �� ���·� ����ϼ���.
	 * 	- DataStorage Ŭ������ �����, main() �޼ҵ忡�� �� Ŭ������ ��ü�� �����ϰ� ������ ����� ����ϼ���.
	 *
	 * 8. FileDownload �������̽��� �ۼ��ϰ�, download()��� �޼ҵ带 �ۼ��մϴ�.
	 * 	- EXEDownload, IMGDownload, DocumentDownload Ŭ������ FileDownload �������̽��� �����մϴ�.
	 * 	- 3���� �ٸ� ������ �ٿ�ε��ϴ� ����� �����մϴ�.
	 * 		"git.exe", "image.png", "report.hwp"
	 * 	- 3���� �����带 �̿��Ͽ� ���� ���Ŀ� �´� ��ü�� �̿��Ͽ� �ٿ�ε� ����� �����մϴ�.
	 * 	- �� ������� 0%���� 100%���� �ٿ�ε� ���¸� 1�� �������� 10%�� ����ϸ� �����մϴ�.
	 * 	- 100%�� �Ǹ� �ٿ�ε� �Ϸ� �޽����� ����մϴ�.
	 *
	 * */
	
	public static void main(String[] args) {
		//q1();
		//q2();
		//q3();
		//q4();
		//q5();
	}
	
	public static void q1(){
		/*
		 * 1. �ߺ��� ��Ҹ� �����ϴ� ���α׷��� �ۼ��ϼ���.
		 * 	List<Integer> list = Arrays.asList(1,2,3,4,3,2,5);
		 */
		List<Integer> list = Arrays.asList(1,2,3,4,3,2,5);
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i = 0 ; i < list.size() ; i++) {
			set.add(list.get(i));
		}
		System.out.println("�ߺ� ���� : " + set);
	}
	
	public static void q2() {
		/*
		 * 2. HashMap�� ����Ͽ� �־��� ���ڿ����� �� ������ �󵵸� ���� ���α׷��� �ۼ��ϼ���.
		 * String input = "hello world Java world Welcome Developer's world";
		 */
		
		String input = "hello world Java world Welcome Developer's world";	// Ž�� ����
		String[] str = input.split(" ");	// ���� ���� �迭 ����
		HashMap<String, Integer> chek = new HashMap<String, Integer>();	//�ؽø� ����
		
		for(int i = 0 ; i < str.length ; i++) {	// �迭 ũ�⸸ŭ �ݺ�
			if(chek.containsKey(str[i])) {	
				// str i ��° �迭�� �ؽøʿ� ��������� �� ���� +1
				chek.put(str[i], chek.get(str[i])+1);
			}else{
				// �ؽøʿ� ������ 1�� �߰�
				chek.put(str[i], 1);
			}
		}
		
		for(String key : chek.keySet()) {
			// chek ũ�� ��ŭ �ݺ� �ϸ� key ������ �� ����
			System.out.println(key + "�� " + chek.get(key) +"�� �ֽ��ϴ�.");
		}
		
	}
	
	public static void q3() {
		/*
		 * 3. HashMap�� ����Ͽ� �л��� �̸��� ������ �����ϰ�, ��� ������ ���ϴ� ���α׷��� �ۼ��ϼ���.
		 * 	Map<String, Integer> students = new HashMap<>();
		 * students.put("Alpha", 85);
		 * students.put("Bravo", 92);
		 * students.put("Chalie", 78);
		 */
		
		Map<String, Integer> students = new HashMap<>(); // student�� �ؽð� ����
		students.put("Alpha", 85);
		students.put("Bravo", 92);
		students.put("Chalie", 78);
		int sum = 0;
		for(String key : students.keySet()) {
			sum += students.get(key);
		}
		
		int evg = sum/students.size();
		
		System.out.println("�л����� ��� ���� : " + evg);
		
	}
	
	public static void q4() {
		
		/*
		 * 4. List���� ¦���� ����� ������ ���ڸ� �����ϴ� ���α׷��� �ۼ��ϼ���.
		 * 	List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		 */
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		List<Integer> list = new ArrayList<Integer>();
		
		for(int a : arr) {
			list.add(a);
		}
		
		System.out.println(list);
		for (int i = 0 ; i < list.size() ; i++) {
			
			if( list.get(i) % 2 == 1 ) {
				list.remove(i);
			}
		}
		System.out.println(list);
		
	}
	
	public static void q5() {
		/*
		 * 5. �ڵ���(Car) Ŭ������ �ۼ��ϰ�, �ӵ��� ����, ���� ����� �����ϼ���.
		 * 	- Car Ŭ������ speed(int) ������ �߰��ϰ�, �⺻ �����ڿ��� speed�� 0���� �ʱ�ȭ�ϼ���.
		 * 	- accelerate() �޼���� 1�ʿ� 1�� ������Ű�� ����� �մϴ�.
		 * 		(�ְ�ü��� 60���� �����մϴ�.)
		 * 	- brake() �޼���� �ӵ��� 5�� ���ҽ�Ű�� ����� �մϴ�.
		 * - �ڵ����� ���� �ӵ��� ����ϴ� getSpeed() �޼����� �����ϼ���.
		 */
		
		Car car = new Car();
		System.out.println("61km/h ��ŭ �����մϴ�.");
		for(int i = 0 ; i < 61 ; i++ ) {
			car.accelerate();
		}
		car.getSpeed();
		
		System.out.println("0km/h ��ŭ �����մϴ�.");
		for(int i = 0 ; i < 13 ; i++ ) {
			car.brake();
		}
		car.getSpeed();
		
		car.accelerate();
		car.accelerate();
		car.accelerate();
		car.accelerate();
		car.accelerate();
		car.accelerate();
		car.getSpeed();
		
		car.brake();
		
		car.getSpeed();
		
		
	}

	

}

class Car {
	private int speed;
	
	public Car() {
		this.speed = 0;
	}
	
	public Car(int speed) {
		this.speed = speed;
	}
	
	public void accelerate() {
		if(speed >= 60) {
			System.out.println("60km/h �̻����� ������ �� �����ϴ�.");
		}else {
		this.speed++;
		}
	}
	
	public void brake() {
		if(speed < 5) {
			speed = 0;
			System.out.println("0km/h : ���� �ӵ����� �����߽��ϴ�.");
		}else {
		this.speed -= 5;
		}
	}
	
	public void getSpeed() {
		System.out.println("���� �ӵ� : " + speed + "km/h");
	}
	
}
