package ch10;

import java.io.FileNotFoundException;
import java.net.SocketException;
import java.util.Scanner;

// ����(Exception) ó��
//			: �������ٴ� ���� �ܰ��� �߸��� ����
//			ex : ������ �־�� ����Ǵ� ���α׷� > ������ ���� ��� 
// cf. ����(Error) : ������ ���� �ʰų�,
// 				��ǻ�Ͱ� �� �̻� ó���� �� ���� ���¿� �־ ��Ÿ���� ����
//		ex) OutofMemory : ��ǻ�� �޸𸮿� �� �̻� ���α׷��� ������ �� ���� ���

/*
 * ��� 
 * 	 : ����ó�� ������ ó�� ������ ���� ������ ���
 * 	 > ���ŷο� �۾�(������ ���α׷����� �Ǵ� ���)
 * 	 > �ǹ������� �ּ����� ����ó���� �۾�
 * 	 > Spring Framework ... �� ������ ��ũ�� ����ϰ� �Ǹ�
 * 		���� ���� ��ǻ�Ͱ� �˾Ƽ� ���ִ� ���� �� �ϳ�
 * 		(�������� ����� ���� ���� �ʴ� ���)	
 */
public class Exam01 {
	/*
	 * * Throwable : �ֻ��� ���� ��ü / Exception, Error ����
	 * * Exception 
	 * 	 - üũ ����	: �����ڰ� ��������� ó���ؾ� �ϴ� ���� (�����Ϸ��� üũ)
	 * 		:: ���� - �����ڰ� �Ǽ��� ���ܸ� �������� �ʵ��� �����Ϸ��� ���� ������ ����� ( �Ǹ��� ������ġ )
	 * 		:: ���� - �����ϰ� ���ŷο� �۾��� �� ���ɼ��� ������
	 * 	 - ��üũ ����	: RumtimeException, ����Ǿ������ Ȯ���� �� �ִ� ����
	 * 				: �����Ϸ��� üũ���� �ʴ� ����
	 * 				: throws Ű���带 ���ؼ� ǥ�� > ��������
	 * 		:: ���� - �Ű澲�� ���� �ʴ� ���ܴ� ���� ����
	 * 		   ���� - �Ǽ��� ����ó���� ������ ���ɼ��� ������
	 * *** Exception(����) > �ֻ��� ��ü : Object > ��� - ����
	 * 		::
	 * 
	 * 
	 * ����ó�� Keyword : try, catch, finally, throw, throws
	 * 
	 * - ��� (��ź����)
	 * 	 1. ���� Ŭ�������� ó�� (try-catch-finally)
	 * 	 2. �ٸ� Ŭ�������� ó�� (throw, throws)
	 * 
	 */
	
	public static void main(String[] args) {
		try {
			// ���ܰ� �߻��� ���ɼ��� �ִ� �ҽ��ڵ尡 �ۼ��Ǵ� ����
			
			// A
			// B 
			// C - Exception()
			// D : ������� �ʰ�, catch()�� �Ѿ
			//	 : C���� ����ó���� ������� ������ ����
			
			int a = 10;
			int b = 0;
			System.out.println( a + b );
			System.out.println( a - b );
			System.out.println( a * b );
			System.out.println( a / b );
			System.out.println( a % b );
			
			System.out.println( "��Ģ������ ����� Ȯ���մϴ�." );
			
		}catch (ArithmeticException ae) {
			
			System.out.println(" ���� catch ��� : / by zero");
			
		}catch (Exception e) {
			// catch : () �ȿ� ����� ���ܸ� ó��
			// ���ܰ� �߻��ϸ� ����Ǵ� ����
			
			// C > Exception()
			// 	 > ����, ���õ� �α׸� ����� ���� ������ ����
			//	 > ���α׷��� ������� �ʵ��� �������� ���·� �ǵ���
			
			// ���� ������ Ȯ���ϴ� ���
			System.out.println("getMessage() : " + e.getMessage());	// ������ ������ �����ϰ� ���
			System.out.println("toString() : " + e.toString());	// ������ ����� ������ ���
			e.printStackTrace();				// ���ܰ� �߻��� �ҽ��ڵ带 �����Ͽ� �ܰ躰�� ���
			
			// ... ������ �����ϴ� �ڵ�
			// ... ������ �� ���� ���� > �α� > ���α׷��� ������Ʈ
			//		> ����� : �ȳ����� (Ŭ���� ������)
			
			// out, err : ��ɻ����δ� ���̰� ����(������), ������ ���� ���� : �ٸ� ���۸� ���
			// err.println() > ��� ��ġ�� �����Ӱ� ���
			System.out.println("���ܰ� �߻��Ǿ����ϴ�.");
			
		} finally {
			// finally : ���� ��Ȳ�� ������� ����� ����
			
			// ����ó�� > ����� ����
			System.out.println("���ܰ� �߻��� ���� �ڵ� �� �ݵ�� ����Ǿ�� �ϴ� ��ó���Դϴ�.");
		}
		
		//System.out.println(a);
		
		// E : ����
		// F : ����
		// G : ����
		System.out.println("���� �߻��� ������� ����Ǵ� �ҽ��ڵ���Դϴ�.");
		
	}
	
	public void exceptionMethod() throws Exception{
		// �����ȿ��� �߻��� ���ܸ� ���� ó������ �������� throws
		// throws ������ ��ü : exceptionMethod()
		// throws �޴� ��ü : exceptionMethod()�� ������ ��ü
	}
	
}
