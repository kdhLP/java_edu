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
			System.out.println("파일이 없습니다.");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("다른 예외가 발생하였습니다.");
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
		// 하나의 예외처리
		if(b == 0) {
			// 모든 Exception 클래스의 생성자 (String str) : 예외메세지
			throw new ArithmeticException() {
				// 익명클래스
			};
		}else {
			System.out.println("a를 b로 나누는 나머지는 " + (a%b) + "입니다.");
		}
	}
}
