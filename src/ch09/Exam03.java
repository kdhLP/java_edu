package ch09;

/* ����Ŭ����
 * 	 : ��ü�� �����ϴµ� �־ ���� ��ø Ŭ������ �ٸ���
 * 		�ܺ� Ŭ������ �ν��Ͻ��� �̷�� ��Ұ� �˴ϴ�.
 * 	 -> �ܺ�Ŭ������ ��ü�� �����Ǿ�� ����Ŭ������ ��ü�� ������ �� ����
 */
public class Exam03 {
	private static int outClassValue = 10;
	private int outInstanceValue = 20;
	
	// ����Ŭ����(Inner Class)
	class InnerClass {
		private int innerInstanceVlaue = 30;
		public void print() {
			// ����Ŭ������ �ν��Ͻ� ���� - ���
			System.out.println(innerInstanceVlaue);
			// �ܺ�Ŭ������ �ν��Ͻ� ���� - ���
			System.out.println(outInstanceValue);
			// �ܺ�Ŭ������ Ŭ���� ���� - ���
			System.out.println(outClassValue);
		}
	}
}
