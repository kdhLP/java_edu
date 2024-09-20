package ch07.test;

import ch07.test.animal.*;

// ������ �Ҹ��� ��Ÿ���� ��� + ������ ������ Ŭ������ �����ô�.
/* ���
 * 
 * ������ �����Ҹ�
 * �۸�
 * 
 * ����� �����Ҹ�
 * �߿�
 * 
 * �� �����Ҹ�
 * ����
 * 
 */
public class Test02 {
	
	public static void printSound(String animal, String sound) {
		System.out.println(animal + " �����Ҹ�");
		System.out.println(sound);
	}
	
	public static void main(String[] args) {
		/*
		 * ��µǴ� �޼ҵ�� ����� ���� 1
		printSound("������", "�۸�");
		printSound("�����", "�߿�");
		printSound("��", "����");
		nina.barkStrangePeople();
		navi.bakeBread();
		nurungee.makeMilk();
		*/
		
		// �����Ҹ��� ����ϴ� �޼ҵ� �̿ܿ�
		// �ٸ� ���, ������(�Ӽ�)���� �߰��� �� �ֵ��� ��ü�� ����
		// �������� �������� ������ �� ���� -> ���������� �迭(���� Ÿ�Ը� ����)
		Dog nina = new Dog("�ϳ� ��Ŀ");
		nina.printSound();
		Cat navi = new Cat("����");
		navi.printSound();
		Cow nurungee = new Cow("������");
		nurungee.printSound();
		
		//������ : ��ĳ����
		Animal[] animals = { (Animal)new Dog("�ϳ� ��Ŀ"), new Cat("����"), new Cow("������") };
		for(Animal animal : animals) {
			animal.printSound();
		}
		
		
		
		
		// ���� -> ������-������ : �ٿ� ĳ����
		if(animals[0] instanceof Dog dog) {
			dog.barkStrangePeople();
		}
		if(animals[1] instanceof Cat cat) {
		cat.bakeBread();
		}
		((Cow)animals[2]).makeMilk();
		
	}
	
}






