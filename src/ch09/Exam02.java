package ch09;

public class Exam02 {
	
	// ���� Ŭ���� ����
	private static int outerClassValue = 10;
	// �ν��Ͻ� ����
	private int outerInstanceValue = 20;
	
	// ���� ��ø Ŭ����
	static class Nested {
		// ���� ��ø Ŭ������ �ν��Ͻ� ����
		private int nestedInstanceValue = 30;
		
		public void print() {
			// ���� Ŭ������ ������ ����
			System.out.println(nestedInstanceValue);
			
			// �ܺ� Ŭ������ �ν��Ͻ� ������ ����]
			//System.out.println(outerInstanceValue);
			Exam02 ex = new Exam02();
			System.out.println(ex.outerInstanceValue);
			
			// �ܺ� Ŭ������ Ŭ���� ������ ����
			System.out.println(outerClassValue);
			System.out.println(Exam02.outerClassValue);
		}
	}
	
}
