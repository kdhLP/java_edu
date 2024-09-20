package ch06.access.a;

public class AccessMain {

	public static void main(String[] args) {
		
		AccessData data = new AccessData();
		// public ȣ�� ����
		data.publicField = 1;
		data.publicMethod();
		
		// ���� ��Ű�� protected ȣ��
		data.protectedField = 2;
		data.protectedMethod();
		
		// ���� ��Ű�� default ȣ��
		data.defaultField = 3;
		data.defaultMethod();
		
		// private ȣ��
		// is not visible - error : ���ٺҰ�
		//data.privateField = 4;
		//data.privateMethod();
		
		// innerAccess() : public
		data.innerAcces();
		
		

	}

}
