package practice;

public class Test04 {

	public static void main(String[] args) {

		// 반복되어질 내용을 직접 코딩하여 입력하기 보다 반복문을 통해서 내용을 반복 실행 가능

		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);

		/*
		 * while - 조건식/값은 해당 결과값이 참인경우. while 반복문을 실행 while(조건식/값) { //... } for({시작값} ;
		 * {종료값} ; {증감값} ;) { //... }
		 */

		// while 반복문
		System.out.println("While");
		int i = 1;
		while (i <= 5) {
			System.out.println(i);
			i++;
		}
		// 종료지점이 확실하지 않았다 = 반복횟수가 정해지지 않았다.
		i = 1;
		while (true) {
			System.out.println(i);
			i++;
			// continue; -> 반복문을 종료하지 않고 해당 조건을 만족하면 skip(건너뛰기)
			if (i == 2)
				continue;
			// 아래의 break를 사용하지 않으면 무한루프에 빠짐.
			if (i > 5)
				break;

		}

		// for 반복문
		System.out.println("For");
		for (int j = 1; j <= 5; j++) {
			// continue; -> 반복문을 종료하지 않고 해당 조건을 만족하면 skip(건너뛰기)
			if (i == 2)
				continue;
			System.out.println(j);
		}

		// Q. 2단 ~ 9단 구구단을 출력하세요.

		for (int x = 2; x < 10; x++) {
			System.out.println(x + "단");
			for (int y = 1; y < 10; y++) {
				System.out.println(x + " x " + y + " = " + x * y);
			}
		}

		// Q. 반복문을 사용해서 1 ~ 100 까지 숫자 중 짝수만 출력하세요.

		for (int j = 2; j <= 100; j += 2) {
			System.out.println(j);
		}

		// Q. 합계 출력
		// 1~200 까지의 정수중에서 홀수만 더해 총 합계를 출력하세요.
		int sum = 0;
		for (int f = 1; f <= 200; f += 2) {
			sum += f;
		}
		System.out.println(sum);

		// Q. 피라미드 생성
		/*
		 * for(int d = 1 ; d <= 5 ; d++) { for(int v = 1 ; v <= d ; v++) {
		 * System.out.print("*"); } System.out.println(); }
		 * 
		 * for(int d = 1 ; d <= 5 ; d++) { System.out.println("*".repeat(d)); }
		 * 
		 * String star = ""; for(int d = 1 ; d <= 5 ; d++) { star += "*";
		 * System.out.println(star); }
		 */

		// Q. 피라미드 생성 2
		String blanck = "";
		String star = "";
		int s = 1;
		for (int b = 2; b >= 0; b -= 1) {
			blanck = " ".repeat(b);
			if (b == 0) {
				System.out.println(blanck + "*".repeat(5));
			} else if (b == 1) {
				System.out.println(blanck + "*".repeat(3));
			} else if (b == 2) {
				System.out.println(blanck + "*".repeat(1));
			}
		}
		
		System.out.println("============================");
		
		
		int w = 7;
			for (int j = 1 ; j < w ; j+=2 ) {
				int half = (w-j)/2;
				System.out.println(" ".repeat(half) + "*".repeat(j) );
			}
			for (int j = w ; j >= 0 ; j-=2 ) {
				int half = (w-j)/2;
				System.out.println(" ".repeat(half) + "*".repeat(j) );
			}
		
		
		
		
		
	}

}
