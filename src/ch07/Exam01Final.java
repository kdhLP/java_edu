package ch07;

public class Exam01Final {

	private static final int[] no = null;
	public static void main(String[] args) {
		
		// ����
		/*
		 * 
		 * �⺻��(Primitive Type) :: �ϳ��� ���� ���� �������� ����� �������� ����
		 * 		- byte, short, int, long, char, boolean, float, double
		 * 		ex) int number = 10;
		 * 			int number02 = number;
		 * ������(Reference Type) :: �ϳ��� ��ü�� �������� ���� ���� �������� ����
		 * 		-�迭, Ŭ����,... �� ��ü(�ν��Ͻ�)
		 * 		ex) String str = "Hello World!";
		 * 
		 *** null / "" >> ������ �Ǿ�� ��
		 * java�� �⺻������ �ƹ��͵� ���� ���� ������ ������ ����� �� ����.
		 * 	:: �ƹ��� ���� ������ �ʴ� ������ ����ϰ� �Ǹ� ������ ��Ÿ�� (NullPointException)
		 * 
		 */
		// ��� : final Ű���� - ������, ��
		/*
		 * 1. final Ű����� class, method�� ������ �������� ���� �� ����.
		 * 2. ���������� ������ ���, ���� �ѹ��� ������.
		 * 3. �Ű������� final Ű���带 �ٿ� ���� ���� ������ �� ���� ���·� ����.
		 */
		// ������ final Ű���带 �ٿ� ���� ���� ������ �� ���� ���·� ����
		// ���� ����
		final int number = 10;
		/*
		number = 20; 
		number = 100;
		number += 100;
		*/
		
		String printStr = "Hello World!";
		printStr = "Hello~ world~!";
		printData(printStr);
		
		System.out.println(no);
		System.out.println(OtherNameFinal00.no);
		
		changeReference();
		
	}
	// �޼ҵ��� �Ű�����(�Ķ����/����/�μ�)�� �ش� �޼ҵ� �ȿ��� ����� ������ ���� ����
	public static void printData(final String str) {
		// str ���� �Ұ�
	}
	
	// �ʵ�(�ɹ����� - Ŭ���� ����/�ν��Ͻ� ����)
	// �ʵ忡 ���� ����(�ʱ�ȭ)�ϴ� ��� 01.
	static final int fieldNumber = 0;
	// ���� �������� ���� final field(����)�� ���, �����ڸ� ���ؼ� �ѹ��� �ʱ�ȭ ����
	final int fieldNo;
	
	// �ʵ忡 ���� ����(�ʱ�ȭ)�ϴ� ��� 02. �����ڸ� ���ؼ�
	public Exam01Final() {
		this.fieldNo = 10;
	}
	public Exam01Final(int fieldNo){
		this.fieldNo = fieldNo;
	}
	
	// Static final : ���(Constant) - ������ �ʰ� �׻� ������ ���� ���� ��
	/*	����� ���ÿ� �ʱ�ȭ�� �ݵ�� �ʿ�� ��
	 * 	- ����� �ƴ϶� ������ �� ��ü�� ����ϴ� ���� ����
	 * 	- ����� ���� ������ �� ����. �ʵ忡 ���� �����ص� �����Ͱ� ������ ����
	 * 	- ����� public ���� ��� : ���α׷�(����/���ø����̼�) ���������� ���Ǳ� ����
	 * 	- �߾ӿ��� ���� �ϳ��� ���� �� �� ����
	 * 	- ����� ��Ÿ��(����ǰ� �ִ� ����)�� ���� ������ �� ����
	 * 	- ����� ���� �����ϰ��� �Ѵٸ�, �ҽ��ڵ忡�� ���� �����ϰ� ���α׷��� ����� 
	 */
	// �ڹٿ����� ���� �� �ϳ��� �����ϴ� ������ �ʴ� ������ ��
	// ��Ÿ ǥ����� ���ܷ� ǥ�� : ���� �빮�ڿ� ����� �����(_)�� ���
	static final int FIEID_NUMBER = 0;
	
	public static final double PIE = 3.14;
	public static final int HOURS_IN_DAY = 24;
	public static final int MINUTES_IN_HOUR = 60;
	public static final int SECOUNDS_IN_MINUTE = 60;
	// ���α׷� �� �ʿ��� ���
	public static final String THIS_PROJECT_NAME = "������Ʈ �̸�";
	
	// ������ ���� + final
	/*
	 * 1. ������ ������ ��ü�� ������ �����°� �ƴ϶�, ��ü�� �ּҰ��� ������ ����
	 * 2. ������ ������ final Ű���带 ����ϸ�, �����ϴ� ��ü�� �ٲ��� ���Ѵٴ� �ǹ̸� ����
	 * 2-1. �����ϴ� ��ü�� �������� ���Ѵٴ� �ǹ��� ��, ��ü���� ���� �������� ���Ѵٴ� �ǹ̴� �ƴ�
	 * 2-2. final  ������ ������ ��ü�� �ٲ��� ���� ��, ��ü ���� ���� ������ ������.
	 */
	public static void changeReference() {
		final OtherNameFinal ref = new OtherNameFinal();
		// final Ű���带 ����� ref ��ü�� ���̻� �ٸ� ��ü�� ������ �� ����
		// ref = new OtherNameFinal00();
		System.out.println(ref.localParam);
		ref.localParam = 100;
		System.out.println(ref.localParam);
	}
	
	// method. class - final
	// ���̻� ����� ��Ű�� ����
	// method - final : �� �̻� �ڽ�Ŭ������ ��ӹ޾� ������(Overriding)�� ���� ���ϰ� ��.
	// class - fianl : ���̻� ����� ��Ű�� �ʰڴ�(�θ� Ŭ������ �� �� ����/������ �ڽ� Ŭ����)
	
} // The end. Class

// �ٸ� Ŭ���������� ���� �̸��� final ������ ��� ����
// static final ������ �� �ϳ��� ����
class OtherNameFinal{
	final int finalNumber = 0;
	static final int no = 0;
	public int localParam = 10;
}
// Ŭ���������� final : ���̻� ��ӽ�Ű�� �ʰڴ� (���� Ŭ������ ������ �ڽ�Ŭ������ Ȯ��)
final class OtherNameFinal00{
	final int finalNumber = 0;
	static final int no = 1;
	// �ڽ� Ŭ�������� ��ӹ޾� �����Ǹ� �� �� ���� �޼ҵ�
	public final void finalMethod() {
		
	}
}
/*
// ��ӹ��� Ŭ���� (�ڽ�Ŭ����)
class OtherFinal extends OtherNameFinal00{
	
	@Override
	public void finalMethod() {	}
}
*/