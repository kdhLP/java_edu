package ch06;

// static
// static ����, �޼ҵ� ...

/*  // static �Ϲ����� ����
 * 	1. ���α׷��� ������ �Ǹ鼭 �ڵ�ȿ� static���� ����� ��� ����, ��ü���� �̸� �ҷ��ɴϴ�.
 * 		-> ��ü�� �������� ȣ���� ������ ����, �޼ҵ�, Ŭ����
 * 	2. ���α׷� �� �� 1���� ����
 * 
 */
class Temp{
	public String className;
	public static int count = 0;
	Temp(String name){
		this.className = name;
		count++;
	}
}

class Counter {
	public int count = 0;
}

//��ü�� ������ �� ���� ������ ��ü�� ����(int count)�� Ȯ��.
public class Exam0702 {
	public static void main(String[] args) {
	// �� ��ü �ȿ��� ���� ���Ǵ� count  -> �ϳ��� ��ü���� �����ϴ� ��.
	// ** ���� ������ Ŭ�������� ���谡 ����
	// ** �����ڿ� �Ű����� �߰� -> ���� / ������ ȣ�� ����
	Temp temp01 = new Temp("A");
	System.out.println("A count : " +temp01.count);
	Temp temp02 = new Temp("B");
	System.out.println("B count : " + temp02.count);
	Temp temp03 = new Temp("C");
	System.out.println("C count : " + temp03.count);
	
	}
}
