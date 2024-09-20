package ch13.example;

// 제네릭 타입 매개변수의 제한
// <T> 타입 매개변수는 Animal 타입만 허용 : extends Keyword 사용
// 개발자가 원하는 타입만 제네릭 타입으로 설정가능
public class AnimalCage<T extends Animal> {
	
	private T var;
	
	public void set(T var) {
		this.var = var;
	}
	public T get() {
		return this.var;
	}
}
