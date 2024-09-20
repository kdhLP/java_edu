package ch06;

public class Car {
	
	String name;
	String color;
	String category;
	
	// JAVA 
	//	- 개발자가 작성한 생성자가 없으면 기본 생성자(default Constructor)를 만듬
	//	- 개발자가 작성한 생성자가 하나라도 있으면 기본 생성자 조자 만들지 않
	
	// 기본적인 형태의 생성자 (기본 생성자 / default Constructor)
	public Car() {
		// 어떤 값이 감지되었다는 조건문
		// 생성자 내부에 다른 생성자를 호출
		// error 생성자 코드의 첫줄에만 작성 가능 (한번만 사용)
		this("테슬라", "흰색", "전기차");
	}
	
	// 생성자는 여러개 선언할 수 있습니다. : Method Overloading
	// new Car("모하비", "블랙", "SUV");
	// 순서 신경쓸것
	// * collection : 키값을 활용하여 필드에 값을 대입
	public Car( String name, String carColor, String carCategory ) {
		// 메소드의 파라미터는 해당 메소드의 파라미터 안에서 사용되는 지역변수
		// this 생략이 가능한 키워드
		// this : 인스턴스(실체화된 구현체 / 메모리에 구현된 실체) 자신을 가리킴
		// 생성자 안에서의 this -> 맴버 변수(클래스 번수)
		// 이름이 같은 경우, 이클립스의 셩우 '경고' 수준으로 좀 더 명확히 할것을 요구함
		// this를 사용해서 지역변수와 맴버변수를 쉽게 구분하고자 함.
		this.name = name;
		// 이름이 같지 않은 경우, 명확하게 색깔로 해당 변수의 종류(맴버/지역)를 구분해줌
		// this.를 생략해도 괜찮음.
		// 1. java가 color라는 변수를 찾을 때, 가까운 지역변수 중 color 가 있는지 확인
		// 2. 맴버 변수 안에서 color라는 변수를 탐색 -> color(파란색으로 표시)
		// 3. 맴버 변수 안에도 color가 없다면 오류가 발생되었다고 출력.
		color = carColor;
		this.category = carCategory;
	}

	public void printCarName() {
		
	}
	public void setCarOption() {
		
	}
	public void renorvationThisCar() {
		
	}


}
