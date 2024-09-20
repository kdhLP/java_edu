package ch06;

import java.util.Scanner;

public class Extest {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		
		
		System.out.print( " 숫자를 입력하세요 : " );
		int x = s.nextInt();
		
		
		for ( int i = 1 ; i < 10 ; i++ ) {

			System.out.println( x + "*" + i + "=" + (x*i) );
				
			}
		
	}
	

}
