package ch07.test.animal;

public class Dog extends Animal{
	/*
	String category = "������";
	String name;
	String sound = "������� ��,��...";
	*/
	public Dog(String name) {
		
		super("������", "������� ��,��...");
		this.name = name;
	}
	// ���� ������ ���
	public void careSheep() {
		
	}
	// ���� ��Ű�� ���
	public void barkStrangePeople() {
		printSound();
	}
	// �޼ҵ��� ������
	@Override
	public void printSound() {
		// �켱����, �������̵� �� �޼ҵ尡 �׻� �켱������ ����.
		System.out.println(super.sound);
	}
}
