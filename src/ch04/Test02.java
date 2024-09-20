package ch04;

public class Test02 {

	// 문제 1. 1월 부터 12월 까지 출력하면서 해당 월이 속하는 계절을 같이 출력하세요.
	// 문제 2. 1 ~ 25까지의 합계를 출력하세요.
	// 문제 3. 1~30까지의 홀수와 짝수의 합을 각각 구하세요.
	// 문제 4. 1~50까지의 수 중 일의 자리 수가 3, 6, 9인 수의 합을 구하세요.
	// 문제 5. 1 ~ n 까지의 합한 결과가 100을 넘지 않는 제일 큰 n의 값을 구하세요.
	
	public static void main(String[] args) {
		
		// 문제 1. 1월 부터 12월 까지 출력하면서 해당 월이 속하는 계절을 같이 출력하세요.
		for (int i = 1 ; i < 13 ; i++ ) {
			if(i < 3) System.out.println( i + "month : winter" );
			else if( i < 6 ) System.out.println( i + "month : spring" );
			else if( i < 9 ) System.out.println( i + "month : summer" );
			else if( i < 12 ) System.out.println( i + "month : autumn" );
			else System.out.println( i + "month : winter" );
			
		}
		
		// 문제 2. 1 ~ 25까지의 합계를 출력하세요.
		// 반복문, 변수선언/스코프
		int j = 0;
		int sum2 = 0;
		while (j < 25) {
			while (j < 25) {
				j++;
				sum2 = sum2 + j;
			}
			
			System.out.println( "result answer : " + sum2 );
		}
		
		
		// 문제 3. 1~30까지의 홀수와 짝수의 합을 각각 구하세요.
		// 변수선언/스코프, 홀/짝 구분
		
		int even3 = 0;
		int odd3 = 0;
		for ( int ii = 0 ; ii < 31 ; ii ++ ) {
			if ( ii % 2 == 0 ) even3 = even3 + ii; //even3 += ii;
			else if ( ii % 2 == 1 )	odd3 = odd3 + ii;
		}
		System.out.println( "result answer (even) : " + even3 );
		System.out.println( "result answer (odd) : " + odd3 );
		
		
		// 문제 4. 1~50까지의 수 중 일의 자리 수가 3, 6, 9인 수의 합을 구하세요.
		// 반복문, 1~50의 1의 자리 구하는 공식
		//공식에 따라 3, 6, 9로 끝나는 숫자들을 더하는 변수 (선언/스코프)
		
		int sum4 = 0;
		for ( int jj = 0 ; jj < 51; jj ++ ) {
			//if (n÷10의 나머지가 0이 아니고, n÷10의 나머지가 3으로 나누어 떨어질 때) sum4 = sum4 + jj
			if ( jj % 10 != 0 && jj % 10 % 3 == 0) sum4 += jj;
		}
		System.out.println( "result answer (sum(3, 6, 9)) : " + sum4 );
		
		// 문제 5. 1 ~ n 까지의 합한 결과가 100을 넘지 않는 제일 큰 n의 값을 구하세요.
		//1~n의 합 (while), 100이하의 합계를 기준으로 조건문(if/조건식에 부등호 포함)  
		
		int sum5 = 0, k = 0;

		while (true) {
			
			k++;
			sum5 += k;
			
			if (sum5 >= 100 ) {
				k--;
				break;
			}
			
		}
		
		
		/*
		int sum5 = 0;

		for ( int k = 0 ; sum5 < 101; k ++ ) {
			
			k++;
			sum5 += k;
			if (sum5 >= 100 ) {
				k--;
				break;
			}
			
		}
		*/
		System.out.println( "result answer (1 ~ n < 100) : " + sum5 );
			
			
			
		
	}

}
