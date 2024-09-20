// Generic & Collection Framework
package ch13;

/*
 * �����͸� ����, �����ϱ� ���ؼ� ���Ǵ� ���
 * 	 ����(�⺻��+������)	- ���� �������� ������ �� ����
 * 	 > �迭			- ���� Ÿ���� ���� ���� / ������ ��, ũ�Ⱑ ������
 * 	 > Ŭ����(������)	- Ÿ�Ծ�����(�ٿ�ĳ������ ����) / ����ȯ(�ٿ�ĳ����)
 * 	 > ���׸�(Generic)
 */
// �������� �̿��� Ŭ����
class PolyClass {
	// obj �ʵ忡 �پ��� Ÿ���� �����͸� �����ϱ� ���ؼ� object Ÿ�� ����
	private Object obj;
	public Object getObject() {
		return this.obj;
	}
	public void setObject(Object obj) {
		this.obj = obj;
	}
}

/*
 * Generic (���׸� / �Ϲ����� �ǹ�)
 * 	 : Ư�� Ÿ���� �������� �ʾ� �Ϲ������� ����� �� �ִ�.
 * 
 * * �����
 * 		1. Ŭ���� �̸� �ڿ� <>(���̾Ƹ��/��Ŀ�����) ���
 * 		2. <> �ȿ� ���Ǵ� ���� T : Ÿ�� �Ű�����
 * 			* Ÿ�� �Ű����� : ���׸����� ���Ǵ� ����, ����Ÿ������ ���ԵǴ� ��
 * 			  ex) E(Element), K(Key), V(Value), N(Number), T(Type), ...
 * 			* raw Type (����Ÿ��)
 * 				- < >�� ����Ͽ� Ÿ���� �������� �ʾƵ� ��
 * 				- < >�� ������� �ʴ� ���׸�
 * 				- �ǵ����̸� ������� �ʵ��� ��
 * 				( ���׸� ������ �ڹ� ���� �ʱ⿡�� ���� > ���� �ڵ�� ȣȯ�� )  
 * 		3. Ŭ���� ���ο� Ÿ�� �Ű�����(T)�� ���
 * 			* Ÿ�� �Ű�����(T) : �⺻��(int, double, ...) ����� �� ����
 * 							> ��ü�� ���¸� Ÿ�� �Ű������� ����� �� ����
 * 
 * ** Ŭ������ ������ ��, Ÿ���� �����ִ� ���� �ƴ�
 * Ÿ���� ������ Ŭ���� ��ü�� ����(���)�� ��, ���߿� �����ְڴٴ� �ǹ�
 * 
 * ** ����
 * 	 1. ����� Ÿ���� �̸� �������� ����
 * 	 2. ���� ����ϴ� Ÿ���� ���� ������ ����
 * 		- ����� Ÿ�Կ� ���� ������ ������ �������� �̷�
 * 
 * :: DAO(Data Access Object), DTO(Data Transfer Object), VO(Value Object)
 * class VO<K, V> {
 * 		private K userId;
 * 		private V userName
 * 
 *		// ... getter / setter
 * }
 * 
 * // VO<Integer, String> data = new VO<Integer, String>();
 * 
 */
class GenericClass<T>{
	
	private T obj;
	public T getObject() {
		return this.obj;
	}
	public void setObject( T obj) {
		this.obj = obj;
	}
}

public class Exam01 {
	
	public static void main(String[] args) {
		
		// ������ ���õ� ����
		polyExample();
		
		// ���׸��� �̿��� ����
		GenericClass<Integer> gC = new GenericClass<Integer>();
		// auto-Boxing
		// gC.setObject(11);
		gC.setObject(Integer.valueOf(11));
		// �ٿ� ĳ������ �ʿ����
		Integer i = gC.getObject();
		
		GenericClass<String> generic02 = new GenericClass<String>();
		generic02.setObject("HAHAHA");
		String str = generic02.getObject();
		
		// ����Ÿ�� - ���׸�
		// �ʱ��ڹ� > ���׸� ������ ���� : �ʱ��ڹ� �ڵ���� ȣȯ���� �ʿ�
		// <Object> ����
		// GenericClass<Object> generic03 = new GenericClass();
		GenericClass generic03 = new GenericClass();
		generic03.setObject(11);
		// int <> Object >> �ٿ�ĳ����, ����ȯ >> �ǵ����̸� ������� ����
		int ii = (int)generic03.getObject();
		
		
	}
	
	public static void polyExample() {
		PolyClass poly = new PolyClass();
		// set > int
		poly.setObject(11);
		// ����ȯ
		int i = (int)poly.getObject();
		System.out.println("int 1 = " + i);
		
		// set > Integer
		poly.setObject(Integer.valueOf(10));
		// ����ȯ(�ٿ�ĳ����) - ����(����) �߻� ���輺
		Integer iC = (Integer)poly.getObject();
		System.out.println("Integer iC = " + iC);
		
		// set > String
		poly.setObject("�پ��� ������ ���� ������ �� �ֽ��ϴ�.");
		// ... �ڵ� ���� �� : 10 ~ 300(1000)
		// DB ���� > ����Ǵ� �������� Ÿ���� �� �� �������� ����
		// ����ȯ(�ٿ�ĳ����) 
		String str = (String)poly.getObject();
	}
	
}
