package ch08;

import ch07.test.animal.Animal;
import ch08.animal.AbstractAnimal;
import ch08.animal.Dog;

// �߻�Ŭ����
/*
 * ��ü(Object) : ������ ����(����)�� �� �ִ� Ŭ����
 * 		-> ������ ����(����)�� �� �� ���� Ŭ������ ���� : �߻�Ŭ����
 * //�߻�Ŭ����
 * 	 - �߻����� ������ �����ϴ� Ŭ����
 * 	 - ��ü�� �ν��Ͻ��� �������� ���� (��ü������ ���� ����)
 * 	 - ����� �������� ���(�θ�Ŭ������ ����)
 * 
 * �߻����� ������ Ư¡
 * 	1. ����(����) ���� -> ���� ����
 * 
 * �߻�ȭ keyword : abstract / interface
 * 	 - abstract�� �ǹ����� ���� ������� ���� / 90% - interface�� �����
 * 
 */
public class Exam01 {

	public static void main(String[] args) {
		
		// ����(�߽����� ����) -> ����(�ν��Ͻ�)�� �Ǹ� �ȵ�
		//Animal animal = new Animal("�����", "�߿�");
		// �߻�Ŭ���� : ��ü�� ������ ���� ����
		// ������ ���� : �߻�Ŭ������ �ν��Ͻ�(��ü����)�� ���� �ʽ��ϴ�.
		//AbstractAnimal animal = new AbstractAnimal();
		
		Dog bbobbi = new Dog();
		bbobbi.move();
		bbobbi.eat("���");
		bbobbi.sound();
		
	}

}
