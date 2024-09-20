package ch06;

public class Calculator {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 0;
		// 덧셈
		//System.out.println( a + b );
		// 메소드의 사용 : {메소드 이름}(파라미터 존재한다면, 파라미터 타입에 맞춰 입력);
		double result_value = (double) intAdd(a,b);
		intAdd( a, b);
		System.out.println("덧셈 출력값 : " + intAdd( a, b) ); // 출력값 : 10 + 20
		
		// 뺄셈
		//System.out.println( a - b );
		intMinus(a, b);
		System.out.println("뺄셈 출력값 : " + intMinus( a, b));
		
		// 곱셈
		//System.out.println( a * b );
		intMulti(a, b);
		System.out.println("곱셈 출력값 : " + intMulti( a, b));
		
		// 나눗셈
		//System.out.println( a / b );
		intDiv(a, b);
		System.out.println("나눗셈 출력값 : " + intDiv( a, b));
		
		
		// 나머지
		// System.out.println( a % b );
		intRemain(a, b);
		System.out.println("나머지 출력값 : " + intRemain( a, b));
 		
	}
	
	// method의 정의
	// {접근 제어자} {기타옵션} {반환 타입 / void} {Method 이름} (Parameter 선언) { // ... }
	// 정수형 +(덧셈) 메소드
	// 아래의 메소드를 실행할 때, 파라미터(인수, 인자)가 반드시 존재
	public static int intAdd( int x, int y ) {
		int sum = x + y;
		// 반환값을 생성하기 위해서
		return sum;
		// return x + y;
	}
	
	// overloading 기능
	// 더하기 : start 시ㅏ작 정수에서 end 끝 정수까지 모두 더하는 기능
	// 더한 합계가 limit를 넘을 수 없도록 
	
	// 중요 키워드 들은 변수형으로 사용할 수 없다.
	// start에서 end까지 정수를 1씩 증가하면서 합계를 return_value라고 하는 변수로 변환
	// intAdd( 1, 10, 500);
	public static int intAdd( int start, int end, double result_value ) {
		// 초기값이 선언되어 질 필요가 없다.
		// 메소드가 호출될때 return_value 변수는 초기화
		for(int i = start ; i <= end ; i++ ) {
			result_value += i;
		}
		// return_value 변수가 double 형으로 선언
		// 메소드의 반환값의 타입은 int 형으로 되어있기 때문에 형 변환이 필요합니다.
		return (int)result_value;
	}
	
	public static int intMinus( int x, int y ) {
		int minus = x - y;
		// 반환값을 생성하기 위해서
		return minus;
		// return x + y;
	}
	
	public static int intMulti( int x, int y ) {
		int multi = x * y;
		// 반환값을 생성하기 위해서
		return multi;
		// return x + y;
	}
	
	public static int intDiv( int x, int y ) {
		
		
		if(y != 0 ) {
		
			int div = x / y;
			return div;
		}else return 0;
		
	}
	
	public static int intRemain( int x, int y ) {
		if(y != 0 ) {
			int remain = x % y;
				return remain;
			}else return 0;
	}

}
