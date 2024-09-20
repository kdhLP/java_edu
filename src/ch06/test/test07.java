package ch06.test;


public class test07 {
	
	/*
	 * 1. MaxCounter 클래스를 만드세요
	 * 		- 이 클래스는 최대값을 지정하고 최대값 까지만 값이 증가하는 기능을 제공
	 * 2. 필드(맴버변수)
	 * 		int count : 클래스 내부에서 사용하는 숫자형 변수 / 초기값은 0
	 * 		int max : 최대값입니다. 생성자를 통해서 입력 / 최대값은 10
	 * 3. 메소드(함수)
	 * 	 increment() : 숫자 하나를 증가합니다.
	 * 			// if 조건문을 사용하여 최대값보다 많아지면 "최대값을 초과할 수 없습니다." 라는 안내문구를 출력하세요.
	 * 	 getCount() : 지금까지 증가한 값을 반환합니다.
	 */
	
	public static void main(String[] args) {
		
		MaxCounter counter = new MaxCounter(10);
		
		counter.increment();
		
		int count = counter.getCount();
		System.out.println("입력된 증가값은 " + count + " 입니다.");
		
	}
}
