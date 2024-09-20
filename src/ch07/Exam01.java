package ch07;



//Design Patterns : ����(Strategy) ����
// ���(Inheritance)
/*	- ��ü���� ���α׷����� �ٽɿ�� �� �ϳ�
 * 	- ���� Ŭ������ �ʵ�(�Ӽ�)�� �޼ҵ�(���)�� ���ο� Ŭ�������� ������ ����
 * 	- �θ� Ŭ���� (���� Ŭ����/ ����ϴ� Ŭ����)
 * 		: �ٸ� Ŭ������ �ڽ��� �Ӽ�, ����� �����ϴ� Ŭ����
 * 	- �ڽ�Ŭ���� (���ο� Ŭ����/��ӹ޴� Ŭ����)
 * 		: �θ�Ŭ�����κ��� �Ӽ�, ����� �����޴� Ŭ����
 * 	- ��� ������ ����ϱ� ���� Ű���� : extends
 * 	- �ڹٿ����� ���� ����� ���� ����. ���� ��Ӹ� ����.
*/

class Vehicle{ } // �ֻ��� �θ� Ŭ����

// �ڵ���
class Car extends Vehicle {
	// �ҽ� �ڵ� ���뼺 ���
	int speed;
	int temp;
	public void move() {
		speed++;
	}
	public void stop() {}
	public void navigation() {}
	public void aircondition() {}
	public void heater() {}
}

class motoCycle extends Vehicle { }

class SUV extends Car{
	// Ȯ�强
	public void runOffLoad() {}
	public void carriage() {}
}

class Palisade extends SUV {
	public void setForCamping() {}
}

class G90 extends SUV{
	public void camera360() { }
}

class E300 extends Car {
	
}

class Carnival extends Car {
	public void setForCamping() {}
}
// ��ũ��Ʈ Ŭ���� : ��ӹ��� ������ Ŭ����
class Boxer extends Car{
	int tireCount;
	// ����ī : move() �ٸ� ������ �� �� ������ �����Դϴ�.
	// �޼ҵ� �������̵� : �θ�Ŭ�������� ����� ���(�޼ҵ�)��
	//			�ڽ� Ŭ�������� �������Ͽ� ����� �� �ֵ��� ������ ���
	//			cf) �޼ҵ� �����ε� : ������ �޼ҵ带 ������ ��� ����(�Ű������� ���� ����)
	// ������̼�(Annotation) : �ϳ��� �ּ� / ��ǻ�Ͱ� �����ϴ� ��Ÿ�������� ����
	/*
	 * �޼ҵ� �������̵� ����
	 * 1. ���(�θ�-�ڽ� ���踦 �ξ�� ��)
	 * 2. ������ �޼��� �̸�
	 * 3. ������ �Ű����� (�Ķ������ ����, ����, Ÿ��)
	 * 4. ���������� �������
	 * 	 : �θ�Ŭ������ ���������ں��� ���� ������ ���������ڸ� ������
	 * 	   public > protected > default > private
	 * 5. ����ó��(throws) - ���� Ŭ������ ����ó�� �Ǵ� ������ ���� ���� �� �� �����ϴ�.
	 * 6. static, final, private Ű���尡 ���� �ż���� �������̵��� ����� �� ����
	 * 7. �����ڴ� �������̵��� �� �� ����
	 * 		- super / super()	cf) this / this()
	 * 
	 */
	@Override
	public void move() {
		super.speed+=2;
		this.tireCount = 4;
	}
}

// �������

class Monkey extends motoCycle { }
class msx125 extends motoCycle { }
class CB125R extends motoCycle { }

public class Exam01 {
	public static void main(String[] args) {
		// ��ӹ��� �ڽ�Ŭ������ ��ü ����
		E300 yoo = new E300();
		// �ڽ�Ŭ���������� �ۼ��� �ҽ��ڵ尡 ���ٰ� �ϴ���,
		// �θ� Ŭ������ ����� �Ӽ�, ����� ����� �� ����. 
		/*
		 * ** ��Ӱ����� ��ü�� �����ϸ� �ϳ��� �ּҿ� �θ�, �ڽ� Ŭ������ ��� ����
		 * * ��� ������ ��ü�� ȣ���� ��, ��� Ÿ�� ������� �� (������)
		 * ** ���� Ÿ�Կ��� ����� ã�� ���ϸ� ���� �θ� Ÿ������ ����� ã�Ƽ� ����
		 * 		-> ���� �θ� Ŭ���������� ����� ã�� ���ϸ� ������ �߻�
		 */
		yoo.move();
		
		SUV jeep = new SUV();
		jeep.carriage();
		// �θ�Ŭ������ �ڽ�Ŭ������ method�� �̿��� �� ����
		// jeep.camera360();
		
		Palisade jeon = new Palisade();
		// class SUV :: method
		jeon.runOffLoad();
		// class CAR :: method
		jeon.stop();
		
		G90 jung = new G90();
		// class SUV :: method
		jung.carriage();
	}
	
	
}
