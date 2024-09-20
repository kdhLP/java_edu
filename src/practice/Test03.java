// package practicejavalanguage;
// package practice.java.language;
// package practice.java.language.String;
package practice;

import java.util.Scanner;

public class Test03 {
	
	public static void main(String[] args) {
/*		
		int a = 10;
		// if 조건문
		// 중괄호 안에 영역은 코드블럭이라고 합니다.
		// if (조건식){(해당 조건식이 참이면 코드블럭 안의 내용을 실행합니다.)}
		// 경우의 수가 한가지인 경우
		// .. 기존 소스코드
		if (a < 10) {
			System.out.println("a는 10보다 큽니다.");
		}
		
		if (a % 2 == 0) {
			System.out.println("a는 짝수.");
		}else{
			System.out.println("a는 홀수.");
		}
*/		
		
		
		/*
		 * 문제 1.
		 * 
		 * 		90점 이상이면 'A'
		 * 		80점 이상, 90점 미만 'B'
		 * 		70점 이상, 80점 미만 'C'
		 * 		60점 이상, 70점 미만 'D'
		 * 		나머지는 'F'
		 */
		/*
		Scanner s = new Scanner(System.in);
		
		System.out.print( "점수를 입력하세요 : " );
		int x = s.nextInt();
		
		int score = x;
		
		if (score <= 100 && score >= 80) {
			System.out.println("학점은 A 입니다.");
		}
		else if(score < 90 && score >= 80){
			System.out.println("학점은 B 입니다.");
		}
		else if(score < 80 && score >= 70){
			System.out.println("학점은 C 입니다.");
		}
		else if(score < 70 && score >= 60){
			System.out.println("학점은 D 입니다.");
		}
		else if(score < 60 && score >= 0){
			System.out.println("학점은 F 입니다.");
		}
		else {
			System.out.printf("Error: %d점은 출력할 수 없는 학점입니다!\n", x);
		}
		*/
		
		/*
		 * 거리에 따라서 대중교통 수단을 결정
		 * 
		 * 1km 이하이면 '도보'
		 * 5km 이하이면 '자전거'
		 * 10km 이하이면 '버스'
		 * 20km 이하이면 '자동차'
		 * 20km 이상이면 '비행기'
		 * 
		 */
		/*
		Scanner km = new Scanner(System.in);
		
		System.out.print( "거리(km)를 입력하세요 : " );
		int y = km.nextInt();
		int distance = y;
		
		if ( distance > 20) {
			System.out.println("비행기를 이용하세요.");
		}
		else if(distance <= 20 && distance > 10){
			System.out.println("자동차를 이용하세요.");
		}
		else if(distance <= 10 && distance > 5){
			System.out.println("버스를 이용하세요.");
		}
		else if(distance <= 5 && distance > 1){
			System.out.println("자전거를 이용하세요.");
		}
		else if(distance <= 1 && distance >= 0){
			System.out.println("도보를 이용하세요.");
		}
		else {
			System.out.println("저승입니다.");
		}
		*/
		
		/*
		 * 금액 계산 문제
		 *  - 달러를 계산할 때, 
		 *  	0달러 미만이면 "잘못된 금액입니다."
		 *  	0일 때, "계산할 금액이 없습니다."
		 *  	0 초과일 때, "원화로 .....원 입니다." 입력값*1300
		 *  	
		 */
		/*
		Scanner d = new Scanner(System.in);
		
		System.out.print( "계산할 달러를 입력하세요 : " );
		double i = d.nextDouble();
		
		if (i < 0) {
			System.out.println("잘못된 금액입니다.");
		}
		else if(i == 0) {
			System.out.println("계산할 금액이 없습니다.");
		}
		else if(i > 0) {
			
			double won = i * 1300;
			
			System.out.println("원화로 " + (int)won + "원 입니다.");
		}
		else {
			System.out.println("입력 할 수 없는 값입니다!");
		}
		*/
		
		
		
		/*
		 * 문제1	소수점을 포함하는 0 ~ 10점 사이의 평점을 입력받아
		 * 		입력받은 평점보다 높은 영화들을 출력해주세요.
		 * 
		 * 		9점 이상 : 어바웃 타임
		 * 		8점 이상 : 트루먼 쇼
		 * 		7점 이상 : 귀멸의 칼날
		 * 		6점 이상 : 왕의 남자
		 * 		6점 미만 : 추천할 영화가 없습니다.
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println(" 평점(소숫점을 포함하는 실수)을 입력해주세요. : ");
		double rating = scan.nextDouble();
		/*입력값을 위함 메소드와 입력값을 저장할 변수의 자료형을 일치시켜줘야함.
		 * String str = scanner.nextLine();
		 * int num = scanner.nextInt();
		 */
		String restr = "";
		
		/*
		if ((int)rating <= 9) restr += "[어바웃 타임(9+)]";
		if ((int)rating <= 8) restr += "[트루먼 쇼(8+)]";
		if ((int)rating <= 7) restr += "[귀멸의 칼날(7+)]";
		if ((int)rating <= 6) restr += "[왕의 남자(6+)]";
		restr += "을(를) 추천합니다.";
		if (rating < 6) restr += "추천할 영화가 없습니다.";
		System.out.println( restr );
		*/	
		/*
		restr = "";
		switch( (int)rating) {
		case 6: 
			restr += "[왕의 남자(6+)]";
		case 7: 
			restr += "[귀멸의 칼날(7+)]";
		case 8: 
			restr += "[트루먼 쇼(8+)]";
		case 9: 
			restr += "[어바웃 타임(9+)]"; 
			break;
		default: 
			restr += "추천할 영화가 없습니다."; 
			break;
		}
		System.out.println( restr );
		*/
		/*
		int a = 3;
		
		// 삼(3)항 연산자 ( 조건식 ? 참인 출력값 : 거짓인 출력값 )
		if (a > 10) {
			System.out.println("10보다 큰 수");
		}else {
			System.out.println("10보다 작은 수");
		}
		System.out.println((a>10) ? "10보다 큰 수" : "10 보다 작은 수");
		String result = (a>10) ? "10보다 큰 수" : "10보다 작은 수";
		*/
		// Q. 아래의 값이 짝수인지 홀수인지 삼항 연산자를 사용하여 String pStr에 저장하세요.
		int question = 120983;
		String pStr = (question % 2 == 0) ? "짝수" : "홀수";
		System.out.println(pStr);
		
		
		
		
		// String -> int/integer 형변환이 가능하다면 string 선언을 해도 괜찮다. String price
		
		//method(메소드/함수)
		// {메소드 이름}({인수(인자})
		//methodName(prm, prm1, prm2) ::: f(x, y, z)
		//정의 : {접근제어자} {기타옵션값}{반환값-자료형}{메소드 이름}({파라미터}){
		// 		}
		
		
	}
	
	public void operater() {
	
	// 연산자
	// 산술연산자 / 비교연산자 / 대입연산자 / 논리연산자 / 연결연산자 / ...
	// 대입연산자
	// int i = 0;
	// i += 1;
	// i += 2; // i = i + 2
	// i -= -5;
	// 논리연산자
	// &, && :: 논리곱/교집합 - 양쪽 비교값이 둘 다 참 -> 결과값이 참
	// |, || :: 논리합(OR) - 양쪽 비교값 중에 하나라도 참 -> 결과값이 참 (둘 다 거짓 -> 결과 거짓)
	// ! :: 부정은 결과값의 반대값
	
	// 연결연산자 (./+)
	// import java.util.scanner
	// TheOtherClass.methodName();
	// "Hello~" + "World!"
	
	
	}
	

}
