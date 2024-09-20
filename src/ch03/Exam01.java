package ch03;

//chapter 03 p125
public class Exam01 {
	
	public static void main(String[] args) {
		
		// 연산자
		// 산술 연산자
		// + - * /(몫) %(나머지)
		System.out.println( 4 + 3 );		// result : 7
		System.out.println( 4 - 3 );		// result : 1
		System.out.println( 4 * 3 );		// result : 12
		System.out.println( 4 / 3 );		// result : 1(몫)
		System.out.println( 4 % 3 );		// result : 1(나머지)
		
		System.out.println( 6 % 4 );		// result : 2(나머지)
		System.out.println( 9 % 9 );		// result : 0(나머지)
		
		//if-eles 조건제어문
		int random = 101;
		if (random % 2 == 0 ) {
			//'짝수입니다.' || '2의 배수입니다.' || '2는 랜덤값의 약수입니다.'
			System.out.println( " 2x " );
		} else {
			//'홀수업니다.'
			System.out.println( "2x + 1 " );
		}
		//계산순서
		System.out.println( 4 + 3 * 10 );		// result : 34
		System.out.println( ( 4 + 3 ) * 5 );	// result : 35
		
		//증가 & 감소
		int a = 1;
		System.out.println( a++ ); 			// result : 1
		System.out.println( ++a ); 			// result : 3
		//a++ > a = a + 1
		a++;
		System.out.println( a ); 			// result : 4
		//a-- > a = a - 1
		a--;
		System.out.println( a ); 			// result : 3
		
		System.out.println("=====================================");
		// 대입 연산자
		// =, +=, -=, *=, /= 
		//대입
		int b = 1;
		System.out.println( b );
		//b의 값을 2만큼 증가
		//b = b + 2;
		b += 2;
		System.out.println( b );
		//b = b - 2;
		b -= 2;
		System.out.println( b );
		b *= 2;
		b /= 2;
		// b = b % 2
		// b %= 2;
		// b %= a;
		System.out.println( b );
		
		//비교 연산자(부등호)
		// <, >, <=, >=, !=, ==, ===
		//if-eles if 조건문
		if ( a < b ) {
			// a가 b 보다 작은 경우
		} else if ( a > b ) {
			// a와 b 보다 큰 경우
		} else if ( a == b ) {
				// cf.=== : (타언어 기준) 값 뿐만 아니라 자료형까지 비교.
		}
		
		// 비트연산자, 논리연산자
		// |, ||, &, &&, !
		// 부호를 1개, 혹은 2개에 대한 결과는 같음.
		//처리(확인)과정이 다름
		//항상 참(1)의 결과를 얻을 때, boolean ( true / false )
		if ( a > 10 | b < 100 ) {
			//먼저 검증하는 조건식의 결과값과 상관없이 두 조건식 모두 검증
		} else if ( a > 10 || b < 100 ) {
			//...
		} else if ( a > 10 & b < 100 ) {
			//...
		} else if ( a > 10 && b < 100 ) {
			//...
		}
		
		// + : 문자열에 대해서는 연결연산자
		String s00 = "abc", s01 = "def";
		System.out.println( s00 + s01 );
		
		//삼향 연산자
		//if 조건문과 비슷한 기능
		// (특정 조건식) ? (true 일 떄,결과값) : (false일 때, 결과);
		System.out.println( ( a > 10 )?"Success":"Failed" );
		
		if ( a < 10 ) {
			System.out.println("Success");
		} else {
			System.out.println("Failed");
		}
		
		
	}
		
}
