package ch04;

//반복 제어문
public class Exam02 {

	public static void main(String[] args) {
		/*
		//1 ~ 10 까지 숫자를 출력
		System.out.println( 1 );
		System.out.println( 2 );
		System.out.println( 3 );
		System.out.println( 4 );
		System.out.println( 5 );
		System.out.println( 6 );
		System.out.println( 7 );
		System.out.println( 8 );
		System.out.println( 9 );
		System.out.println( 10 );
		
		System.out.println( "==============================" );
		*/
		
		/*
		 * 반복문은 무한히 반복하는 것을 조심해야 합니다.
		 * 반복문을 만들 때 고려해야 하는 3가지
		 * 1. 시작점
		 * 2. 종착점
		 * 3. 반복 횟수
		 * 
		 */
		
		// 1. while (반복)문
		// () 안의 조건식이 참인 경우, {} 안의 소스코드를 조건식이 거짓이 될 때까지 반복합니다.
		int i = 0;
		// while - true :: 범위(반복횟수)가 지정되지 않는 경우
		while ( true ) { 
			// ↓ 반복 내용
			// i = i + 1;
			i++;
			System.out.println( i );
			// ↑ 반복 내용
			
			// 끝나는 조건
			if ( i >= 10 ) {
				// 반복문을 그만두도록 하는 명령어
				break;
			}
			
		}
		
		System.out.println( "==============================" );
		
		i = 0;
		while (i < 10 ) {
			i++;
			System.out.println( i );
		}
		
		//do-while 문
		//반복여부와 상관없이 최소 한번 실행 > while 조건식을 확인하여 반복여부 결정
		// 반복문을 실행하는데, 초기값의 설정 등 
		// 		특정한 목적이 있어서 1번은 실행되어야 하는 내용이 있는 경우
		/*
		 
		 do{
		 //반복 실행문
		 } while (조건식);
		 
		*/
		
		System.out.println( "==============================" );
		
		//Exam02.java:31 - int 1를 재사용
		i = 0;
		do {
			i++;
			System.out.println( i );
		} while ( i > 10 );
		//일반 while 문으로 변경
		i = 0;
		i++;
		System.out.println( i );
		while (i < 10 ) {
			i++;
			System.out.println( i );
		}
		
		// for 반복문
		/*
		  for ( 시작점 ; 조건식 ; 증감량 ){
		  	// ... 반복내용
		  }
		 */
		for (int j = 0 ; j < 10 ; j++ ) {
			System.out.println( j );
		}
		/*
			//{} 생략된 형태
		for (int j = 0 ; j < 10 ; j++ ) System.out.println( j );
		for (int j = 0 ; j < 10 ; j++ ) 
			System.out.println( j );
		*/
		
		// while 문과 다르게 for 문은 반복횟수가 정해져 있는 경우에 사용
		// 되도록이면 while 문 보다 for 문을 사용하는 것이 안전함( 무한루프 / 무한 반복으로 부터 ) 
		int count = -10;
		for (int k = 0 ; k > count ; k-- ) {
			// 수정하기 위한 방법
			// 1. 조건식 : k < 100 >> k > -100
			// 2. 증감량 : k-- >> k++
		}

		// 중첩 for 문 ( 다중 for 문 )
		// 되도록 2중 반복문 까지만 사용할 수 있도록 한다.
		for( int j = 0 ; j < 10 ; j++ ) { // 1번 반복문
			for( int k = 0 ; k < 10 ; k++ ) { // 2번 반복문
				System.out.println( j + " / " + k);
				// break; 2번 반복문 중지
			}
			// break; 1번 반복문 중지
		}
		
		//break;
		// 반복문에서 특정 이벤트 혹은 기준에 맞춰 반복문을 종료시킴.
		for ( int ii = 0 ; ii < 10 ; ii += 2 ) {
			// 증가량 2씩 증가
			System.out.println( ii );
			// ii 변수의 값이 홀수이면, 반복문을 중단.
			if ( ii % 2 == 1 ) 
				break;
		}
		
		
		// continue;
		//반복문을 멈추지 않고, 선언되는 위치에서부터 다음 반복문으로 바로 넘어감.
		for ( int jj = 0 ; jj < 10 ; jj ++ ) {
			// jj 값이 홀수인 경우, 해당 위치에서 부터 다음 반복문으로 넘어감.
			if ( jj % 2 == 1 ) continue;
			// 짝수만 출력
			System.out.println( jj );
		}
		
		//label : 반복문의 중지 대상을 지정해준다.
		System.out.println( "==============================" );
		
		a: for (int aa = 0 ; aa < 10 ; aa++ ) {				// 1번 반복문
			for (int bb = 0 ; bb < 10 ; bb++ ) {			// 2번 반복문
				System.out.println( aa + " / " + bb );
				// 'label'이 없는 경우 2번 반복문을 중지
				// 'label'이 있는 경우, 해당 라벨을 선언한 반복문을 중지
				if ( aa == 5 ) break a;
			}
		}
		
		
		
		
	}

}
