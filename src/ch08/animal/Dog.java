package ch08.animal;

public class Dog extends AbstractAnimal {

	@Override
	public void sound() {
		System.out.println("�۸�");
	}

	@Override
	public void move() {
		System.out.println("�������� �����Դϴ�.");
	}

	@Override
	public void eat(String food) {
		System.out.println("�������� " + food + "�� �Խ��ϴ�.");
	}

	
	
}
