package ch02;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		// 문제 1. 정수형의 문자 두개를 입력받아서 두 숫자의 합을 출력하시오.
		/*
		
		
		System.out.print( " 첫번쨰 정수 입력 :  " );
		int number01 = s.nextInt();
		
		System.out.print(  " 두번쨰 정수 입력 : " );
		int number02 = s.nextInt();
		
		int number03 = number02 + number01;
		
		System.out.println(  number01 + " + " + number02 + " = " + number03 );
		 */
		
		// 문제 2. 정수형의 숫자를 1개를 입력 받아서, 홀수인지 짝수인지 출력하세요.
		
		/*
		System.out.print( " 정수 입력 :  " );
		int numChek = s.nextInt();
		
		if ( numChek % 2 == 0 ) {
			
			System.out.println( numChek + " 은 짝수 입니다." );
			
		} else System.out.println( numChek + " 은(는) 홀수 입니다." );
		
		*/
		// 문제 3. (반복문을 사용) "이름을 입력해주세요." 문자열을 입력받도록 하고, "[exit]라고 입력하시면 종료됩니다."라고 안내하도록 합니다.
		// 종료 되기 전까지는 계속 입력 받을 수 있도록 작성합니다.
		
		String info = "이름을 입력해주세요.( exit를 입력하시면 종료됩니다. )";
		System.out.println( info );
		
		while ( true ) {
			
			System.out.print( "이름 : " );
			String str = s.nextLine();
			System.out.println( str );
			if(str.toLowerCase().equals("exit")) {
	            break;
	         }
			
		}
		System.out.println("입력이 종료되었습니다.");
		

	}

}
