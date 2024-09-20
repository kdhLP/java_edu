package ch09.inner;

public class Car {
	// 차 이름
	private String modelName;
	
	// 내부클래스로 만들어지게 될 Engine
	private Engine engine;
	// 기름 잔여량
	private int gasLevel;
	
	// 생성자
	public Car( String modelName, int gasLevel ) {
		// 생성자를 통해서 객체가 생성되었을 때, 그 인스턴스를 일컫는 키워드 : this
		this.modelName = modelName;
		this.gasLevel = gasLevel;
		// 객체를 생성 > 해당 클래스의 생성자를 실행시킴
		this.engine = new Engine();
	}
	
	public void start() {
		engine.start();
		System.out.println(this.modelName + " 시동 완료");
	}
	
	class Engine {
		
		public void start() {
			
			System.out.println("기름 잔여량 확인: " + gasLevel );
			System.out.println( modelName + "의 엔진의 시동을 켭니다.");
			
		}
		
	}
	
}
