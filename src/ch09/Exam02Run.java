package ch09;

import ch09.Exam02.Nested;

public class Exam02Run {

	public static void main(String[] args) {
		
		// Exam02 : non-static Ŭ����
		Exam02 ex = new Exam02();
		
		// Exam02.Nested : static Ŭ����
		// ����Ŭ������ ������� 01.
		Nested ns = new Nested();
		// ����Ŭ������ ������� 02.
		Exam02.Nested ns02 = new Exam02.Nested();
		
		/* 1. ���� ��ø Ŭ������ new �ܺ�Ŭ����.��øŬ����()
		 * import�� ���ؼ� �����ϰ� ��� ����
		 * 2. �ܺ�Ŭ������ ��ü�� ���� ��øŬ������ ��ü : ���� �ƹ� ���谡 ���� �ν��Ͻ�(��ü)
		 * 	 - ������ ��ø�� �ξ��� �� : ��øŬ������ �ν��Ͻ��� ���� ������ ����
		 * 3. ��øŬ������ �������� �ܺ� Ŭ������ private ���������ڷ� ������ ��ü�� ���� ����
		 * 		- ����� ��ġ : ����Ŭ������ �ܺ�Ŭ������ �ɹ������� ��ġ���� ����
		 */
		
		ns.print();
		
		System.out.println("NestedClass = " + ns.getClass());

	}

}
