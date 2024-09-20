package ch05;

import java.util.Scanner;

// 배열(Array)
public class Exam01 {

	public static void main(String[] args) {
		/*
		// 자바에서는 동적 이름을 사용하는 변수를 선언할 수 없습니다.
		// 적은 변수의 선언은 부담 되지 않지만, 수백, 수천 등의 관리 데이터 값이 많아진다면 부담이 되므로 배열을 통해 관리한다.
		int score01 = 100
				, score02 = 90
				, score03 = 80
				, score04 = 70
				, score05 = 0;
		
		
		// 배열 - 칸막이로 나눠진 수납 바구니. ( 첫번쨰 칸을 셀때는 0부터 시작합니다. )
		// ex. main( String[] args ) -> String[] : 문자열의 데이터를 가진 배열
		// 배열을 선언 : 같은 자료형끼리 묶어서 사용
		// [](대괄호)를 통해서 배열임을 선언
		// 배열도 참조(형) 자료형 - new 라는 키워드를 통해서 객체를 생성
		// new 키워드 다음 해당 배열의 크기를 정해줍니다.
		int[] scores = new int[5];
		// 값의 대입
		scores[0] = 100;
		scores[1] = 90;
		scores[2] = 80;
		scores[3] = 70;
		scores[4] = 0;
		
		// (Array).length : 배열이 가지고 있는 크기(정수)
		// for 반복문 -> scores 배열이 가지고 있는 크기(5)만큼 반복
		// 배열을 사용할 때, index(목차/순번)도 중요하지만, 사이즈(크기)도 중요함
		for ( int i = 0 ; 1 < scores.length ; i++ ) {
			// 배열에 값을 대입
			switch(i) {
				case 0 : scores[i] = 100; break;
				case 1 : scores[i] = 80; break;
				case 2 : scores[i] = 70; break;
				case 3 : scores[i] = 60; break;
				case 4 : scores[i] = 0; break;
				default : scores[i] = 0; break;
				
			}
		}
		
		//scanner
		Scanner sc = new Scanner(System.in);
		for ( int i = 0 ; i < scores.length ; i++ ) {
			System.out.println( (i+1) + "번째 정수를 입력하세요. " );
			// 사용자로부터 받은 입력값을 score 변수에 저정
			int score = sc.nextInt();
			// 변수의 값을 score 첫번째 칸부터 차례로 채워감.
			scores[i] = score;
			// scores[i] = sc.nextInt;	
			// 지정된 값을 확인하기 위해 배열을 출력합니다.
			// result :: [ 100, 90, 80, 70, 0 ]
			
		} System.out.println( scores );
		//배열을 사용할 때, 일반적으로 String[]을 많이 사용한다.
		*/
		
		// 배열 리펙토링
		// 리펙토링 : 기능을 유지하면수 구조를 개선하여가독성을 높이고,유지보수를  용이하게 하는 과정)(튜닝 / 마이그레이션)
		
		//선언을 분리
		int[] arrayName00;
		// 배열의 크기가 특정한 과정을 통해서 정해지는 경우, 분리해서 선언 가능
		int arraySize = 20;
		arrayName00 = new int[arraySize];
		//배열의 선언 1
		int[] arrayName01 = new int[10];
		//배열의 선언 2
		int[] arrayName011 = { 1, 2, 3, 4, 5, 6, 7, 8 };
		//배열 선언과 초기화(값의 대입)
		int[] arrayName02 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		//배열의 값 출력
		for ( int i = 0 ; i < arrayName02.length ; i++ ) {
			System.out.println( arrayName02[i] );
		}
		
		// 2차 배열 : 고등학교 수학(난 안배웠는데?) 중 행렬과 흡사
		int[][] arrayName03 = new int[2][2];
		int[][] arrayName031 = new int[20][20];
		int[][] arrayName032 = { 
				{1, 2, 3, 4, 5 }, 
				{6, 7, 8, 9, 10 } 
			};
		// 값의 사용
		System.out.println( arrayName032[0][3] ); // result : 4
		System.out.println( arrayName032[1][0] ); // result : 6
		// System.out.println( arrayName032[1][5] ); // result : Error
		
		//중첩 for 문
		int array04Width = 5, array04Height = 2;
		int[][] arrayName04 = new int[array04Height][array04Width];
		// 반복문을 통해서 배열에 '100'이라고 하는 값을 일괄적으로 대입.
		// i는 배열의 줄(row)를 의미.
		for (int i = 0 ; i < array04Height ; i++ ) {
			// j는 배열의 칸(column)의 수를 의미.
			for ( int j = 0 ; j < array04Width ; j++) {
				arrayName04[i][j] = 100;
			}
			
		}
		// 배열의 첫번째 길이(row 수) 값 을 불러옵니다. (arrays).length
		for (int i = 0 ; i < arrayName04.length ; i++ ) {
			// 배열의 두번째 길이값(column 수)을 불러옵니다. (arrays)[i].length
			for (int j = 0 ; j < arrayName04[i].length ; j++ ) {
				arrayName04[i][j] = 100;
				/*
				 * 0,0 / 0,1 / 0,2 / 0,3 / 0,4 
				 * 1,0 / 1,1 / 1,2 / 1,3 / 1,4 
				 */
			}
			
		}
 		
		
	}

}
