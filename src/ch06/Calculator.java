package ch06;

public class Calculator {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 0;
		// ����
		//System.out.println( a + b );
		// �޼ҵ��� ��� : {�޼ҵ� �̸�}(�Ķ���� �����Ѵٸ�, �Ķ���� Ÿ�Կ� ���� �Է�);
		double result_value = (double) intAdd(a,b);
		intAdd( a, b);
		System.out.println("���� ��°� : " + intAdd( a, b) ); // ��°� : 10 + 20
		
		// ����
		//System.out.println( a - b );
		intMinus(a, b);
		System.out.println("���� ��°� : " + intMinus( a, b));
		
		// ����
		//System.out.println( a * b );
		intMulti(a, b);
		System.out.println("���� ��°� : " + intMulti( a, b));
		
		// ������
		//System.out.println( a / b );
		intDiv(a, b);
		System.out.println("������ ��°� : " + intDiv( a, b));
		
		
		// ������
		// System.out.println( a % b );
		intRemain(a, b);
		System.out.println("������ ��°� : " + intRemain( a, b));
 		
	}
	
	// method�� ����
	// {���� ������} {��Ÿ�ɼ�} {��ȯ Ÿ�� / void} {Method �̸�} (Parameter ����) { // ... }
	// ������ +(����) �޼ҵ�
	// �Ʒ��� �޼ҵ带 ������ ��, �Ķ����(�μ�, ����)�� �ݵ�� ����
	public static int intAdd( int x, int y ) {
		int sum = x + y;
		// ��ȯ���� �����ϱ� ���ؼ�
		return sum;
		// return x + y;
	}
	
	// overloading ���
	// ���ϱ� : start �ä��� �������� end �� �������� ��� ���ϴ� ���
	// ���� �հ谡 limit�� ���� �� ������ 
	
	// �߿� Ű���� ���� ���������� ����� �� ����.
	// start���� end���� ������ 1�� �����ϸ鼭 �հ踦 return_value��� �ϴ� ������ ��ȯ
	// intAdd( 1, 10, 500);
	public static int intAdd( int start, int end, double result_value ) {
		// �ʱⰪ�� ����Ǿ� �� �ʿ䰡 ����.
		// �޼ҵ尡 ȣ��ɶ� return_value ������ �ʱ�ȭ
		for(int i = start ; i <= end ; i++ ) {
			result_value += i;
		}
		// return_value ������ double ������ ����
		// �޼ҵ��� ��ȯ���� Ÿ���� int ������ �Ǿ��ֱ� ������ �� ��ȯ�� �ʿ��մϴ�.
		return (int)result_value;
	}
	
	public static int intMinus( int x, int y ) {
		int minus = x - y;
		// ��ȯ���� �����ϱ� ���ؼ�
		return minus;
		// return x + y;
	}
	
	public static int intMulti( int x, int y ) {
		int multi = x * y;
		// ��ȯ���� �����ϱ� ���ؼ�
		return multi;
		// return x + y;
	}
	
	public static int intDiv( int x, int y ) {
		
		
		if(y != 0 ) {
		
			int div = x / y;
			return div;
		}else return 0;
		
	}
	
	public static int intRemain( int x, int y ) {
		if(y != 0 ) {
			int remain = x % y;
				return remain;
			}else return 0;
	}

}
