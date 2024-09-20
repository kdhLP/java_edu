package ch06.access.b;

import java.util.Arrays;

import ch06.access.a.AccessData;

public class AccessOuter {

	public static void main(String[] args) {
		
		// ��Ű���� ��ġ(���)�� Ȯ��(***)
		// �ٸ� ��Ű�� �� Ŭ������ ȣ��
		AccessData data = new AccessData();
		
		// public ȣ�� ����
		data.publicField = 1;
		data.publicMethod();
		
		// ���� ��Ű�� protected ȣ��
		// is not visble - error : ���ٺҰ�
		//data.protectedField = 2;
		//data.protectedMethod();
		
		// ���� ��Ű�� default ȣ��
		// is not visble - error : ���ٺҰ�
		//data.defaultField = 3;
		//data.defaultMethod();
		
		// private ȣ��
		// is not visible - error : ���ٺҰ�
		//data.privateField = 4;
		//data.privateMethod();
		
		// innerAccess() : public
		data.innerAcces();
		
		// Arrays �⺻(ǥ��)���̺귯��
		// �迭�� ���õ� ����� �������ִ� ��ƿ��Ƽ
		int[] arr = {5, 6, 1, 10 , 0};
		System.out.println(arr);
		
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		

	}

}
