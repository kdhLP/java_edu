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
	 * 6. 직원(Employees) 클래스를 작성하고, 월급(세후) 및 세금을 계산하는 프로그램을 구현하세요.
	 * 	- Employees 클래스에 employeeName(String), salary(int), tax(int) 변수를 추가하고, private으로 선언하세요.
	 * 	- 객체를 생성할 때, 생성자를 통해서 각 변수의 값를 아래와 같이 초기화합니다.
	 * 		* 직원이름, 세전금액, 세율
	 * 		* Steven, 10000000, 30%
	 * 		* Mike, 4500000, 15%
	 * 		* John, 3000000, 12%
	 * 	- 경영관리팀(AdministrationTeam) 클래스를 만들고, main()에서 직원 객체를 생성한뒤,
	 * 		각 직원의 이름과 실수령 월급액을 출력하세요.
	 *
	 * 7. 암호화 시스템에 전략 패턴을 적용한 문제
	 * 	- Encryption 인터페이스를 작성하고, encrypt(String data) 메서드를 선언하세요.
	 * 	- AESEncryption, DESEncryption, NoEncryption 이라는 3가지 암호화 클래스가 Encryption 인터페이스를 구현하는 프로그램을 작성하세요.
	 * 		* AESEncryption 객체를 생성하여 encrypt 메서드를 실행하면 "AES 암호화를 적용한 결과 : {data} " 의 형태로 출력하세요.
	 * 		* DESEncryption 객체를 생성하여 encrypt 메서드를 실행하면 "DES 암호화를 적용한 결과 : {data} " 의 형태로 출력하세요.
	 * 		* NoEncryption 객체를 생성하여 encrypt 메서드를 실행하면 "암호화를 적용하지 않은 결과 : {data} " 의 형태로 출력하세요.
	 * 	- DataStorage 클래스를 만들고, main() 메소드에서 위 클래스의 객체를 생성하고 실행한 결과를 출력하세요.
	 *
	 * 8. FileDownload 인터페이스를 작성하고, download()라는 메소드를 작성합니다.
	 * 	- EXEDownload, IMGDownload, DocumentDownload 클래스는 FileDownload 인터페이스를 구현합니다.
	 * 	- 3개의 다른 파일을 다운로드하는 기능을 구현합니다.
	 * 		"git.exe", "image.png", "report.hwp"
	 * 	- 3개의 스레드를 이용하여 파일 형식에 맞는 객체를 이용하여 다운로드 기능을 구현합니다.
	 * 	- 각 스레드는 0%에서 100%까지 다운로드 상태를 1초 간격으로 10%씩 출력하며 진행합니다.
	 * 	- 100%가 되면 다운로드 완료 메시지를 출력합니다.
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
		 * 1. 중복된 요소를 제거하는 프로그램을 작성하세요.
		 * 	List<Integer> list = Arrays.asList(1,2,3,4,3,2,5);
		 */
		List<Integer> list = Arrays.asList(1,2,3,4,3,2,5);
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i = 0 ; i < list.size() ; i++) {
			set.add(list.get(i));
		}
		System.out.println("중복 제거 : " + set);
	}
	
	public static void q2() {
		/*
		 * 2. HashMap을 사용하여 주어진 문자열에서 각 문자의 빈도를 세는 프로그램을 작성하세요.
		 * String input = "hello world Java world Welcome Developer's world";
		 */
		
		String input = "hello world Java world Welcome Developer's world";	// 탐색 글자
		String[] str = input.split(" ");	// 공백 기준 배열 변경
		HashMap<String, Integer> chek = new HashMap<String, Integer>();	//해시맵 선언
		
		for(int i = 0 ; i < str.length ; i++) {	// 배열 크기만큼 반복
			if(chek.containsKey(str[i])) {	
				// str i 번째 배열이 해시맵에 들어있으면 뒷 값을 +1
				chek.put(str[i], chek.get(str[i])+1);
			}else{
				// 해시맵에 없으면 1로 추가
				chek.put(str[i], 1);
			}
		}
		
		for(String key : chek.keySet()) {
			// chek 크기 만큼 반복 하며 key 변수에 값 저장
			System.out.println(key + "는 " + chek.get(key) +"개 있습니다.");
		}
		
	}
	
	public static void q3() {
		/*
		 * 3. HashMap을 사용하여 학생의 이름과 점수를 저장하고, 평균 점수를 구하는 프로그램을 작성하세요.
		 * 	Map<String, Integer> students = new HashMap<>();
		 * students.put("Alpha", 85);
		 * students.put("Bravo", 92);
		 * students.put("Chalie", 78);
		 */
		
		Map<String, Integer> students = new HashMap<>(); // student에 해시값 저장
		students.put("Alpha", 85);
		students.put("Bravo", 92);
		students.put("Chalie", 78);
		int sum = 0;
		for(String key : students.keySet()) {
			sum += students.get(key);
		}
		
		int evg = sum/students.size();
		
		System.out.println("학생들의 평균 점수 : " + evg);
		
	}
	
	public static void q4() {
		
		/*
		 * 4. List에서 짝수만 남기고 나머지 숫자를 제거하는 프로그램을 작성하세요.
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
		 * 5. 자동차(Car) 클래스를 작성하고, 속도와 가속, 감속 기능을 구현하세요.
		 * 	- Car 클래스에 speed(int) 변수를 추가하고, 기본 생성자에서 speed를 0으로 초기화하세요.
		 * 	- accelerate() 메서드는 1초에 1씩 증가시키는 기능을 합니다.
		 * 		(최고시속은 60으로 제한합니다.)
		 * 	- brake() 메서드는 속도를 5씩 감소시키는 기능을 합니다.
		 * - 자동차의 현재 속도를 출력하는 getSpeed() 메서도를 구현하세요.
		 */
		
		Car car = new Car();
		System.out.println("61km/h 만큼 가속합니다.");
		for(int i = 0 ; i < 61 ; i++ ) {
			car.accelerate();
		}
		car.getSpeed();
		
		System.out.println("0km/h 만큼 감속합니다.");
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
			System.out.println("60km/h 이상으로 가속할 수 없습니다.");
		}else {
		this.speed++;
		}
	}
	
	public void brake() {
		if(speed < 5) {
			speed = 0;
			System.out.println("0km/h : 최저 속도까지 감속했습니다.");
		}else {
		this.speed -= 5;
		}
	}
	
	public void getSpeed() {
		System.out.println("현재 속도 : " + speed + "km/h");
	}
	
}
