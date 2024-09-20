package ch07.test.animal;

public class Dog extends Animal{
	/*
	String category = "강아지";
	String name;
	String sound = "에드워드 오,빠...";
	*/
	public Dog(String name) {
		
		super("강아지", "에드워드 오,빠...");
		this.name = name;
	}
	// 양을 돌보는 기능
	public void careSheep() {
		
	}
	// 집을 지키는 기능
	public void barkStrangePeople() {
		printSound();
	}
	// 메소드의 재정의
	@Override
	public void printSound() {
		// 우선순위, 오버라이딩 된 메소드가 항상 우선순위를 가짐.
		System.out.println(super.sound);
	}
}
