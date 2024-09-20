package ch10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.SocketException;

public class Exam02 {
	
	public static void main(String[] args) {
		
		
		
		try {
		FileReader fr = exceptionThrow01("test.txt");
		exceptionThrow03();
		} catch(ArithmeticException e) {
			// ???
		}catch(FileNotFoundException e) {
			System.out.println("������ �����ϴ�.");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("�ٸ� ���ܰ� �߻��Ͽ����ϴ�.");
		}
		
	}
	
	public static FileReader exceptionThrow01(String filename) throws FileNotFoundException {
		FileReader fr = new FileReader(filename);
		return fr;
	}
	
	public static void exceptionThrow02(String filename) 
			throws FileNotFoundException, SocketException, ClassCastException {
		exceptionThrow01(filename);
		
	}

	public static void exceptionThrow03()  {
		int a = 100;
		int b = 0;
		// �ϳ��� ����ó��
		if(b == 0) {
			// ��� Exception Ŭ������ ������ (String str) : ���ܸ޼���
			throw new ArithmeticException() {
				// �͸�Ŭ����
			};
		}else {
			System.out.println("a�� b�� ������ �������� " + (a%b) + "�Դϴ�.");
		}
	}
}
