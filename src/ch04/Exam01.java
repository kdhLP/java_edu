package ch04;

//조건 제어문
public class Exam01 {

	public static void main(String[] args) {

		// if 조건문 : 소괄호() 안의 조건식이 참이면 중괄호{}(코드블럭)안의 소스코드 실행
		int a = 10;
		if (a > 10) {
			System.out.println("Big for 10. (1)");
		}
		// 코드블럭 안의 실행될 명령어(내용)이 한줄이면 {}(코드즐럭) 생략 가능
		if (a > 10)
			System.out.println("Big for 10. (2)");
		if (a > 10)
			System.out.println("Big for 10. (3)");
		System.out.println("Big for 10. (4)"); // if에 영향받지 않음.

		// 문자열을 비교할 떄.
		// equals() -> true / false
		String exampleStr = "if";
		// if ( exampleStr.equals( "if" ) ) {
		if (!"apple".equals("phone")) {
			System.out.println("Different");
		} else {
			System.out.println("Same");
		}

		// if - else 조건문 / if - else if 조건문
		/*
		 * if ( 조건식 A ) {
		 * 
		 * } else if ( 조건식 A` ) {
		 * 
		 * } else if ( 조건식 A`` ) {
		 * 
		 * } else {
		 * 
		 * }
		 */
		// a는 int 자료형
		String aName = "양수";
		if (a < 0) {
			// a는 음수인 경우, 코드블럭 안의 코드를 실행합니다.
			aName = "음수";
		} else if (a == 0) {
			// a가 0인 경우, 코드블럭 안의 코드를 실행합니다.
			aName = "영";
		} /*else {
			// a는 양수인 경우, 코드블럭 안의 코드를 실행합니다.
		}*/
		System.out.println( aName );

		String examResult = "F";
		int examScore = 87;
		/*
		 * 1. A && B || C
		 * 2. A && ( B || C )
		 * 3. ( A && B ) || C
		 */
		if (examScore >= 0 && examScore <= 100) {
			// 중첩 if
			if (examScore == 100) {
				examResult = "A+";
			} else if (examScore >= 90 && examScore < 100) {
				examResult = "A";
			}else if (examScore >= 80 && examScore < 100) {
				examResult = "B";
			// C, D ...
			}else
				examResult = "F";
			System.out.println(examResult);
		} else {
			System.out.println("Not Allowed Data!");
		}

		// switch 조건문(선택문)
		// 값의 범위까지 조건식으로 사용할 수 있었던 if 문과 다르게
			//switch 문은 특정값을 비교한다.
		//switch 문 다음의 ()에 조건식을 가진다.
		//case 키워드를 통해서 값을 비교
		String standard = "1" ;
		switch ( standard ) {
		case "1":
			break;
		case "2":
			break;
		case "3": case "4": case "5": case "6":
			break;
		case "banana":
			break;
			default:
				break;
		}
		
		switch ( a ) {
		case 1:
			break;
		case 2:
			break;
		case 3: case 4: case 5: case 6:
			break;
			default:
				break;
		}
		if ( a == 1 ) {
			// switch-case 1:
		} else if ( a == 2 ) {
			// switch-case 2:
		} else if ( a >= 3 && a <= 6 ) {
			// switch-case 3, 4, 5, 6:
		} else {
			// switch-default:
		}
		
		// if - switch
		if ( a < 0 && a < 10 ) {
			switch ( a ) {
			case 1: case 6:
				System.out.println( " 1 " );
				break;
			case 2: case 7:
				System.out.println( " 2 " );
				break;
			case 3: case 8:
				System.out.println( " 3 " );
				break;
			case 4: case 9:
				System.out.println( " 4 " );
				break;
			case 5:
				System.out.println( " 5 " );
				break;
			}
		}
		
	}

}