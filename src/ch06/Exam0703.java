package ch06;

// Ŭ���� ������ �޼ҵ带 ���� ����
import static java.util.Arrays.*;

// static method(�Լ�) 
public class Exam0703 {
	
	static int normalParam = 10;
	
	// �ν��Ͻ� �޼ҵ� : ��ü�� ������ �̷���������� ����� ������ �޼ҵ�
	public static void printData() {
		
	}
	
	// Ŭ���� �޼���, ���� �޼���, static �޼��� : ��ü�� ���� ���� ��밡�� �޼ҵ�
	// 		-> ��ü������ �ʿ���� �޼ҵ��� ȣ�⸸���� �ʿ��� ����� ������ �� �ַ� ���(��ƿ��Ƽ�� �޼���)
	//		 : �迭�� �����ϱ� ���� Arrays.sort();
	/*
	 * ����(Ŭ����/static) �޼ҵ� ����
	 * 	 1. static �޼���� static �� ��밡����
	 * 	 2. �ݴ�� ��𼭵��� ȣ�Ⱑ��
	 */
	public static void main(String[] args) {
		// Arrays -> Ŭ����
		// sort() -> �޼ҵ�
		java.util.Arrays.sort(args);
		// import �� ���ؼ� �ٸ� ��Ű���� �����ϴ� static �Լ��� ���
		// Arrays.sort(args);
		// import Arrays.* ... Ŭ������ ���� ����
		sort(args);
		// ������ ��ü�� ���� : ��ü������ ����
		// Arrays util = new Arrays();
		
		System.out.println(normalParam);
		
		printData();
		
	}

}
