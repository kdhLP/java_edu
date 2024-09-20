package ch06;

public class Car {
	
	String name;
	String color;
	String category;
	
	// JAVA 
	//	- �����ڰ� �ۼ��� �����ڰ� ������ �⺻ ������(default Constructor)�� ����
	//	- �����ڰ� �ۼ��� �����ڰ� �ϳ��� ������ �⺻ ������ ���� ������ ��
	
	// �⺻���� ������ ������ (�⺻ ������ / default Constructor)
	public Car() {
		// � ���� �����Ǿ��ٴ� ���ǹ�
		// ������ ���ο� �ٸ� �����ڸ� ȣ��
		// error ������ �ڵ��� ù�ٿ��� �ۼ� ���� (�ѹ��� ���)
		this("�׽���", "���", "������");
	}
	
	// �����ڴ� ������ ������ �� �ֽ��ϴ�. : Method Overloading
	// new Car("���Ϻ�", "��", "SUV");
	// ���� �Ű澵��
	// * collection : Ű���� Ȱ���Ͽ� �ʵ忡 ���� ����
	public Car( String name, String carColor, String carCategory ) {
		// �޼ҵ��� �Ķ���ʹ� �ش� �޼ҵ��� �Ķ���� �ȿ��� ���Ǵ� ��������
		// this ������ ������ Ű����
		// this : �ν��Ͻ�(��üȭ�� ����ü / �޸𸮿� ������ ��ü) �ڽ��� ����Ŵ
		// ������ �ȿ����� this -> �ɹ� ����(Ŭ���� ����)
		// �̸��� ���� ���, ��Ŭ������ �Ϳ� '���' �������� �� �� ��Ȯ�� �Ұ��� �䱸��
		// this�� ����ؼ� ���������� �ɹ������� ���� �����ϰ��� ��.
		this.name = name;
		// �̸��� ���� ���� ���, ��Ȯ�ϰ� ����� �ش� ������ ����(�ɹ�/����)�� ��������
		// this.�� �����ص� ������.
		// 1. java�� color��� ������ ã�� ��, ����� �������� �� color �� �ִ��� Ȯ��
		// 2. �ɹ� ���� �ȿ��� color��� ������ Ž�� -> color(�Ķ������� ǥ��)
		// 3. �ɹ� ���� �ȿ��� color�� ���ٸ� ������ �߻��Ǿ��ٰ� ���.
		color = carColor;
		this.category = carCategory;
	}

	public void printCarName() {
		
	}
	public void setCarOption() {
		
	}
	public void renorvationThisCar() {
		
	}


}
