package ch07;

// ������
/*
 * ��ü���� ���α׷��� : ��ǻ�� ���α׷��� ��ɾ��� ������� ���� �ð�(����/���)���� ���
 * 					�������� ������ ����(��ü)�� �������� �ľ�
 * 				- ������ ��ü�� �޼����� �ְ�ް�, �����͸� ó��
 * 				- �����ϰ� ������ �����ϰ� ����� ���� ���� : ��Ը� ����Ʈ����(SW) ���߿� �ַ� ���
 * 				- ���� �� ���� / �ڵ��� ��ǰ�� ��ü / ��ǻ�� ��ǰ ��ü ... 
 * 
 * ** ĸ��ȭ / ��� / ������ + �߻�ȭ : ��ǥ���� Ư��
 * 	 -> ���� �ҽ��ڵ尡 �� ���ɼ��� ����
 * 
 */

/* // ������
 * ���� ���ǰ� ��ü����(��ǻ�� ����)�� 1:1 ��Ī
 * 	 -> �� ǥ���ϱ⿡�� �������, ��κ��� ǥ��
 * 	 -> ���� / ���� : ������ ���� -> �ҽ��ڵ� �ۼ��ϰ� �Ǹ�, �ܼ�, ����, ���� ����
 * 		* ���� - Ŭ���̾�Ʈ
 * 		* Ŭ���̾�Ʈ�� ����� ����(�߻�ȭ)�� �˸� ��
 * 		* Ŭ���̾�Ʈ�� ��������� ���� ������ ���� ��
 * 		* Ŭ���̾�Ʈ�� ���� ����� ���α����� ����Ǿ ������ ���� �ʾƾ� ��
 * 		* Ŭ���̾�Ʈ�� ������� ��ü�� �����ص� ������ ���� �ʾƾ� ��
 * 
 * 	 ex)   ������ -	�ڵ���	(����) - �������̽�(�߻�ȭ)
 * 		->	��	-	�ҳ�Ÿ	(����) - �������̽��� ��ӹ޾� ������ Ŭ����, ��ü
 * 		// ��â��, �̻���, ������, �ڼ���, ������, ���ֿ�, ... , extends ������
 * 		// �ҳ�Ÿ, ���佺, �縮���̵�, 
 * 
 */

// ������(Polymorphism) : �پ��� ���� / ���� ���¸� ��������
// - ������ ���� / �޼ҵ� �������̵�

// ������ ���� (������, ĳ����)

class Driver {
	int distance = 0;
	int price = 0;
	void drive() {
		System.out.println("������ �մϴ�");
		
		this.checkDistance();
	}
	void talk() {}
	void cash() {
		distance = 0;
		price = 0;
	}
	void stop() {
		
	}
	void checkDistance() {
		distance += 10;
	}
}
class Son extends Driver { 
	public String name = "son";
	@Override
	void drive() {
		System.out.print(this.name + " �����ڰ� ");
		super.drive();
	}
	void childMethod() {}
}
class Park extends Driver { }
class Jeon extends Driver { }
class Jung extends Driver { }

public class Exam02 {
	public static void main(String[] args) {
	// Son �ڽ�Ŭ������ ��ü������ �ϴµ�, ������ Ÿ���� �θ� Ŭ������ Ÿ���� ����
		
		Son son = new Son();
		// Driver son = new Son();
		// Son Ŭ�������� drive() �޼ҵ带 �������� �޼ҵ� ȣ��(���)
		son.drive();
		
		// �������� drive() �޼ҵ尡 ���� -> ��ӹ��� �θ�Ŭ������ drive() �޼ҵ带 ȣ��
		Park park = new Park();
		park.drive();
		Jeon jeon = new Jeon();
		jeon.drive();
		Jung jung = new Jung();
		jung.drive();
		
		// ����ȯ - �Ϲ��� / �����
		
		// {�ڷ���} drivers = new {�ڷ���}[4];
		// son, park, jeon, jung class�� Dreiver class ���
		// �ڽ�Ŭ������ ��ü���� -> Heap �޸� �� ����Ŭ���� �Ӹ� �ƴ϶�, �θ� Ŭ������ ������ ���� �ö�
	
		Driver[] drivers = new Driver[] {new Son(), new Park()
										, (Driver)new Jeon(), (Driver)new Jung()};
		// drivers[0] = Son class
		/*
		// while
		int i = 0;
		while (i < drivers.length) {
			drivers[i].drive();
			i++;
		}
		// for
		for (int j = 0 ; j < drivers.length ; j++) {
			drivers[j].drive();
		}
		*/
		// for - each
		forDriver(drivers);
		/*
		for (Driver driver : drivers) {
			driver.drive();
		}*/
		
		// ������ ����, �θ�Ŭ������ �ڽ�Ŭ������ �����ϰ� �ִ�.
		// ��ĳ���� (�ڽ�Ŭ���� -> �θ� Ŭ����)
		Driver son01 = (Driver)new Son();
		// Ÿ�����ν� �ڽ� Ŭ������ �θ� Ŭ������ Ÿ������ ���� �Ұ���
		// Son son02 = new Driver();
		
		// �ٿ� ĳ���� (�θ�Ŭ���� -> �ڽ�Ŭ����)
		Driver driver03 = new Driver();
		// �θ� Ŭ������ �ڽ� Ŭ������ ������ ��� �������� ����
		// driver.childMethod();
		// Heap �� �ٿ�ĳ������ �����ϸ鼭,
		// ������ Heap �޸𸮿� �ִ� �����ϴ� ��ü�� Son �ڽ�Ŭ������ ������ ����
		
		
		Driver driver05 = new Son();
		Son son05 = (Son)driver05;
		
		Son son03 = (Son)driver03;
		son03.childMethod();
		
		
	}
	public static void forDriver(Driver[] array) {
		for(Driver driver : array) {
			driver.drive();
			driver.cash();
			
		}
	}
	
}
