// ��Ű�� : Ư���� ����, ��ɿ� ���� �з��Ͽ� Ŭ������ ��Ƶ� ��.
package practice;

// Ŭ���� : �ʵ�(����), �޼ҵ�(�Լ�)�� ������ �� ���赵
// ������ �� ������ ������ Ŭ����
public class Test01 {
	
	// �ʵ�(����) ����� �ʱ�ȭ
	// nullPointException(NullSafty)
	// ���� �ؼ��� �ȵǸ�, �ʱ�ȭ�� ���� ����� �Ѵ�.
	int numb = 100;
	
	//�ż���(�Լ�)
	public void method() {
		// �ʵ�(����) ����
		int num;
		//�ʵ�(����) �ʱ�ȭ
		num = 10;
		System.out.println( "�޼��带 ���� �߽��ϴ�" + num);
		
		
	}
	
	// ������ ���ѵ� Ŭ����
	private class PrivateClass{
		
	}
	
	// main() �޼��� : Ŭ������ ����Ǳ� ���� ù��° �޼���(�Լ�)
	public static void main(String[] args) {
		
		System.out.println("Hello World!");
		
	}
	
}
