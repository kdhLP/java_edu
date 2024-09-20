package test;

import java.util.Scanner;

public class Test01 {
	/*
	<< 조건문 혹은 반복문, 혹은 둘다 사용하여 아래의 문제를 푸시오. >>
	20. 1부터 50까지의 숫자 중 3의 배수일 때 "3의 배수", 5의 배수일 때 "5의 배수", 3과 5의 공배수일 때 "3과 5의 공배수"라고 출력하세요.
	21. 정수를 입력받아 1부터 그 수까지의 모든 짝수의 합을 구하여 출력하세요.
	22. 두 정수를 입력받아 그 사이의 모든 홀수를 출력하세요.
	23. 1부터 100까지의 숫자 중 3의 배수이면서 5의 배수인 숫자를 출력하세요.
	24. 2부터 100까지의 숫자 중 소수만 출력하세요.
	    ( 소수 : 양의 약수가 1과 자기자신만을 약수로 가지는 수 )
	25. 5개의 정수를 입력받아 그 중 가장 큰 수를 출력하세요.
	26. 10개의 정수를 입력받아, 그 중 짝수와 홀수의 개수를 각각 출력하세요.
	27. 10보다 작은 수를 입력받아, 그 수만큼 별(*)을 출력하세요.
	    단, 각 줄에 별의 개수가 아래와 같이 점차적으로 증가시키세요.
	    *
	    **
	    ***
	    ****
	    ...
	28. 3자리의 정수를 2개 입력받아 각 수의 자리수의 합을 계산하여 출력하세요.
	    ex) 123, 456 : 1+2+3 = 6, 4+5+6 = 15
	29. 정수를 입력받아 그 수의 약수를 모두 출력하세요.
	30. 2개의 정수를 입력받아, 두 수의 최대공약수를 구하여 출력하세요.
	*/
	public static void main(String[] args) {
		//q1();
		//q2();
		//q3();
		//q4();
		//q5();
		//q6();
		//q7();
		//q8();
		//q9();
		//q10();
		//q11();
		//q12();
		//q13();
		//q14();
		//q15();
		//q16();
		//q17();
		//q18();
		//q19();
		
		

	}
	// 1. 정수를 입력받아 그 값이 짝수인지 홀수인지 출력하세요.
	public static void q1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해주세요 : ");
		int a = sc.nextInt();
		
		if(a % 2 == 1) {
			System.out.println("홀수");
		}else if(a == 0) {
			System.out.println("0은 홀수/짝수에 포함되지 않는 숫자입니다!");
		}else {
			System.out.println("짝수");
		}
		
	}
	
	// 2. 세 개의 정수를 입력받아 그 중 가장 큰 값을 출력하세요.
	public static void q2() {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[3];
		int chek = 0;
		for(int i = 0 ; i < num.length ; i++) {
			System.out.println("정수를 입력해주세요 : ");
			num[i] = sc.nextInt();
			if(num[i] > chek) {
				chek = num[i];
			}
		}
		System.out.println("가장 큰 수 : " + chek);
		
	}
	
	// 3. 두 정수를 입력받아, 첫 번째 수가 두 번째 수의 2배수인지 판별하는 문구를 출력하세요.
	public static void q3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해주세요 : ");
		int a = sc.nextInt();
		System.out.println("정수를 입력해주세요 : ");
		int b = sc.nextInt();
		
		if(a == b*2) {
			System.out.println(a + "는 "+ b +"의 2배수입니다.");
		}else {
			System.out.println(a + "는 "+ b +"의 2배수가 아닙니다.");
		}
		
	}
	
	// 4. 입력된 점수가 90점 이상이면 "A", 80점 이상이면 "B", 70점 이상이면 "C", 60점 이상이면 "D", 그 외에는 "F"를 출력하세요.
	public static void q4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력해주세요 : ");
		int a = sc.nextInt();
		
		if (a >= 90) System.out.println("A");
		else if(a >= 80) System.out.println("B");
		else if(a >= 70) System.out.println("C");
		else if(a >= 60) System.out.println("D");
		else System.out.println("F");
	}
	
	// 5. 나이를 입력받아, 19세 이상이면 "성인", 그렇지 않으면 "미성년자"를 출력하세요.
	public static void q5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력해주세요 : ");
		int a = sc.nextInt();
		
		if(a >= 19) {
			System.out.println("성인 입니다");
		}else System.out.println("미성년자 압니다.");
		
	}
	
	// 6. 사용자로부터 월(month)을 입력받아, 해당 월의 계절을 출력하세요.
	public static void q6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("월을 입력해주세요 : ");
		int a = sc.nextInt();
		
		String[] mon = {"겨울", "겨울", "봄", "봄", "봄", "여름", "여름", "여름", "가을", "가을", "가을", "겨울"};
		
		if(1 <= a && a <= 12 ) {
		System.out.println("현재 날씨는 "+ (mon[a-1]) + "입니다.");
		}
		
	}
	
	// 7. 입력된 정수가 양수, 음수, 또는 0인지 판별하여 출력하세요.
	public static void q7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해주세요 : ");
		int a = sc.nextInt();
		
		if(a < 0) System.out.println("음수입니다.");
		else if(a == 0) System.out.println("0은 0입니다.");
		else if (a > 0) System.out.println("양수입니다.");
		
	}
	
	// 8. 세 개의 정수를 입력받아, 이 중 두 수가 같은지 판별하여 출력하세요.
	public static void q8() {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[3];
		for(int i = 0 ; i < num.length ; i++) {
			System.out.println("정수를 입력해주세요 : ");
			num[i] = sc.nextInt();
		}
		if(num[0] == num[1]) {
			System.out.println(1 + "번째 수와 "+ 2 + "번째 수는 같습니다.");
		}else if(num[1] == num[2]){
			System.out.println(2 + "번째 수와 "+ 3 + "번째 수는 같습니다.");
		}else if(num[0] == num[2]){
			System.out.println("1번째 수와 "+ 3 + "번째 수는 같습니다.");
		}else System.out.println("같은 숫자가 없습니다.");
	}
	
/*
 	9. 사용자로부터 연도를 입력받아 그 해가 윤년인지 아닌지 판별하여 출력하세요.
	( 윤년 : 1년이 366일인 년도 )
	윤년 계산법
	1) 4로 나누어서 나머지가 0인 년도
	2) 100으로 나누어 나머지가 없는 년도를 400으로도 나누었을 때, 나머지가 0인 경우
*/
	public static void q9() {
		Scanner sc = new Scanner(System.in);
		System.out.println("년도를 입력해주세요 : ");
		int a = sc.nextInt();
		if(a % 4 == 0) {
			System.out.println("윤년입니다.");
		}else System.out.println("윤년이 아닙니다.");
	}
	
	// 10. 두 숫자를 입력받아, 두 숫자의 차이가 10 이상이면 "차이가 큽니다", 그렇지 않으면 "차이가 작습니다"를 출력하세요.
	// 10. 두 숫자를 입력받아, 두 숫자의 차이가 10 이상이면 "차이가 큽니다", 그렇지 않으면 "차이가 작습니다"를 출력하세요.
	public static void q10() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해주세요 : ");
		int a = sc.nextInt();
		System.out.println("정수를 입력해주세요 : ");
		int b = sc.nextInt();
		int c = a-b;
		c = Math.abs(c);
		if (c <= 10) {
			System.out.println("차이가 작습니다.");
		}else System.out.println("차이가 큽니다.");
		
		
	}
	
	// 11. 1부터 10까지 숫자를 출력하세요.
	public static void q11() {
		for(int i = 1 ; i <= 10 ; i++ ) {
			System.out.println(i);
		}
	}
	
	// 12. 1부터 100까지 숫자 중 홀수만 출력하세요.
	public static void q12() {
		for(int i = 1 ; i <= 100 ; i++ ) {
			if(i % 2 == 1) {
			System.out.println(i);
			}else continue;
		}
	}
	
	// 13. 정수를 입력받아, 그 정수까지 모든 숫자의 합을 출력하세요.
	public static void q13() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해주세요 : ");
		int a = sc.nextInt();
		int sum = 0;
		for( int i = 0 ; i <= a ; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
		
	// 14. 5의 배수를 50까지 출력하세요.
	public static void q14() {
		for(int i = 1 ; i <= 50 ; i++ ) {
			if(i % 5 == 0) {
			System.out.println(i);
			}else continue;
		}
	}
		
	// 15. 두 정수를 입력받아, 두 수 사이의 모든 정수를 출력하세요.
	public static void q15() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해주세요 : ");
		int a = sc.nextInt();
		System.out.println("정수를 입력해주세요 : ");
		int b = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 0 ; i <= Math.abs(a-b) ; i++ ) {
			int sub = i+a;
			sum += sub;
		}
		System.out.println(sum);
		
	}
		
	// 16. 정수를 입력받아, 그 정수가 소수인지 아닌지 출력하세요.
    //	( 소수 : 양의 약수가 1과 자기자신만을 약수로 가지는 수 )
	public static void q16() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해주세요 : ");
		int a = sc.nextInt();
		
		for(int i = 2 ; i <= a ; i++ ) {
			if(a == i) {
				System.out.println("소수 입니다.");
				break;
			}
			
			if(a % i == 0) {
				System.out.println("소수가 아닙니다.");
				break;
			}
		}
		
	}
	
	// 17. 구구단 중 7단을 출력하세요.
	public static void q17() {
		for(int i = 1 ; i < 10 ; i++) {
			System.out.println(7 + "x" + i + " = " + 7*i);
		}
	}
	
	// 18. 정수를 입력받아 그 수의 팩토리얼을 계산하여 출력하세요.
    //	( 팩토리얼 : 정수 n보다 작거나 같은 모든 양의 정수의 곱 )
	public static void q18() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해주세요 : ");
		int a = sc.nextInt();
		int fact = a;
		
		for(int i = 1 ; i < a ; i++ ) {
			fact = fact*i;
		}
		System.out.println(fact);
	}
	
	// 19. 정수를 입력받아, 그 수만큼 "Hello~ world!"를 출력하세요.
	public static void q19() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해주세요 : ");
		int a = sc.nextInt();
		
		for(int i = 0 ; i < a ; i++) {
			System.out.println("Hello~ world!");
		}
		
	}
	
	// 20. 1부터 50까지의 숫자 중 3의 배수일 때 "3의 배수", 5의 배수일 때 "5의 배수", 3과 5의 공배수일 때 "3과 5의 공배수"라고 출력하세요.
	public static void q20() {
		
	}
	
	// 21. 정수를 입력받아 1부터 그 수까지의 모든 짝수의 합을 구하여 출력하세요.
	public static void q21() {
		
	}
	
	// 22. 두 정수를 입력받아 그 사이의 모든 홀수를 출력하세요.
	public static void q22() {
		
	}
	
	// 23. 1부터 100까지의 숫자 중 3의 배수이면서 5의 배수인 숫자를 출력하세요.
	public static void q23() {
		
	}
	
	// 
	public static void q24() {
		
	}
		
	// 
	public static void q25() {
		
	}

}
