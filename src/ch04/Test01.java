package ch04;

public class Test01 {

	public static void main(String[] args) {

		// 문제 1. 2중 for 문을 이용하여 2단부터 9단까지 구구단을 출력하시오.
/*
		 * 
		 * ex) 1 * 1 = 1 1
		 * 
		 */
		/*
		 * for( int j = 2 ; j < 10 ; j++ ) {
		 * 
		 * for( int k = 1 ; k < 10 ; k++ ) {
		 * 
		 * //System.out.println( j + " * " + k + " = " + j * k); System.out.printf(
		 * "%d * %d = %d", j, k, j*k ); System.out.println();
		 * 
		 * 
		 * } }
*/
		//=======================================
/*
 		//while 문 사용
		int i = 2;
		while (i < 10) {
			int j = 0;
			while(j < 9) {
				j++;
				System.out.println( i + " * " + j + " = " + i*j);
			}
			i++;
		}
*/
/*
		//문제 2 반복문을 사용하여 0 ~ -100 사이에 3의 배수만 출력하세요.
		//단, continue는 꼭 사용할 것.
		
		//for ( int jj = 0 ; jj > -100 ; jj -- ) {
		for ( int jj = -100 ; jj < 0 ; jj ++ ) {
			if ( jj % 3 != 0 ) continue;
			System.out.println( jj );
		}
*/
	
/*
		//while 문 사용
		int jj = 0;
		while (jj > -100) {
			jj --;
			if ( jj % 3 != 0 ) continue;
			System.out.println( jj );
		}
		
*/
		
		
	}

}
