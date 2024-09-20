package ch08.animal;

public class Dog extends AbstractAnimal {

	@Override
	public void sound() {
		System.out.println("멍멍");
	}

	@Override
	public void move() {
		System.out.println("강아지가 움직입니다.");
	}

	@Override
	public void eat(String food) {
		System.out.println("강아지가 " + food + "를 먹습니다.");
	}

	
	
}
