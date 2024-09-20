package ch04;


//scope(스코프/범위)
/*
 * 목적
 *  1. 비효율적인 메모리 사용을 방지함.
 *  2. 간단하게 코드를 작성하기 위함.
 */
public class Exam03 {
	
	//클래스 변수 : 클래스를 기준으로는 지역변수, 메소드를 기준으로는 광역(글로벌) 변수가 된다. (상대적인 개념)
	int classV = 10;

	public static void main(String[] args) {
		
		//변수 : 선언한 위치에 따라서 지역변수,멤버 변수(클래스 변수, 인스턴스 변수)
		/*
		 * 지역변수(Local Variable)
		 * 		 : 특정 지역(범위 ~ 코드블럭)에서만 사용할 수 있는 변수
		 * */
		
		int a = 10;
		
		if ( true ) {
			int b = 20;
			//'a'는 'main method' 안에서 선언되었기 때문에 
			//	'main' 안에 선언된 'if'문 안에서도 사용 가능
			System.out.println( a );
			System.out.println( b );
		}
		System.out.println( a );
		// 'b'는 'if'문 안에서 선언되었기 때문에 
		//		'if'문 밖에서는 사용할 수 없다.
		// System.out.println( b );
		
	}
	
	public void method01 () {
		System.out.println( classV );
	}
	
	public void method02 () {
		System.out.println( classV );
		// 'main method'에서 사용된 a 변수는 사용할 수 없음 
		// System.out.println( a );
		
		int i;
		for ( i = 0 ; i < 10 ; i++ ) {
			// ...
			// 변수 'i'는 'method02' 메소드 안, 선언되어진 위치 이후로 사용 가능
		}
		
		for ( int j = 0 ; j < 20 ; j++ ) {
			// ...
			// 변수 'j'는 'for'문 안에서만 사용 가능
		}
		
		a: for ( int k = 0 ; k < 10 ; k++ ) {
			//변수 'k'는 반복문 a, b, 둘 다 사용가능
			b: for ( int l = 0 ; l < 10; l++ ) {
				//변수 'l'은 반복문 'b'에서만 사용 가능
			}
			//반복문 'b'가 종료된 다음에 'l' 이라는 이름을 사용 가능
			c: for ( int l = 0 ; l < 10; l++ ) {
				//변수 'l'은 반복문 'b'에서만 사용 가능
			}
			//반복문 'b'의 변수 'l' 과 반복문 'c'의 변수'l'은 다른 객체입니다. 
		}
		
	}

}
