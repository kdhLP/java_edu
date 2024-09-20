package practice;

import java.util.Scanner;

public class Test05 {
	
	public static void main(String[] args) {
		
		/*
		// 정의 (선언, 생성)
		// 제한사항 : 같은 자료형 값만 하나의 배열로 묶을 수 있음.
		// 변수
		int number = 10;
		// 배열 : 참조형 데이터 타입 - new 객체를 통해 생성.
		// 생성방법 1
		int[] numbers = { 1, 2, 3, 4, 5 };
		// 생성방법 2. new {자료형}[배열크기];
		String[] strs = new String[5];
		// 배열의 순번은 0부터 시작 -> 마지막 칸의 사용 번호는 n-1(4)
		strs[0] = "자바";
		strs[1] = "자바 스크립트";
		strs[2] = "오라클";
		// 지정된 크기를 벗어나는 순번(index)를 사용할 수 없습니다.
		//strs[10] = "에러예정"; //Error.ArrayIndexOutofBounds
		
		//배열 출력 : [Ljava.lang.String;@36baf30c
		//메모리 주소값을 출력
		System.out.println(strs);
		//(Array).length : (return int type) 배열의 크기를 불러오는 속성값
		for (int i = 0 ; i <= strs.length - 1 ; i++) {
			System.out.println("배열의 "+ i +" 번째 칸에 값은 :: " + strs[i] + "입니다");
		}
		
		// 생성방법 3.
		int[] newNumbers = new int[] { 10, 20, 30, 40, 50 };
		*/
		
		// Q. 
		/*
		 * int num01 = 100;
		 * system.out.println( num01 );
		 * int num02 = 200;
		 * system.out.println( num02 );
		 * int num03 = 300;
		 * system.out.println( num03 );
		 * int num04 = 400;
		 * system.out.println( num04 );
		 * int num05 = 500;
		 * system.out.println( num05 );
		 * int num06 = 600;
		 * system.out.println( num06 );
		 * 
		 * 배열의 이름 : nums
		 */
		
		int[] nums = new int[6];
		// 배열의 순번은 0부터 시작 -> 마지막 칸의 사용 번호는 n-1(4)
		nums[0] = 100;
		nums[1] = 200;
		nums[2] = 300;
		nums[3] = 400;
		nums[4] = 500;
		nums[5] = 600;
		for (int i = 0 ; i <= nums.length - 1 ; i++) {
			System.out.println("nums "+ (i+1) +" 번째 칸의 값은 :: " + nums[i] + "입니다");
		}
		
		// 배열 안의 배열 사용
		// 2차 배열
		// 선언 방법 1.
		int[][] numbers2 = {
				{ 1, 2, 3,4, 5 },
				{ 6, 7, 8, 9, 10 },
				{ 11, 12 }
		};
		// 방법 2. new 키워드 이후의 대괄호 안에는 배열의 크기를 입력.
		// new {자료형}[{row(recode) 크기}][{column 크기}]
		// cf. DB - table
		int[][] numbers2_1 = new int[5][5];
		/*
		numbers2_1[0][0] = 1;
		numbers2_1[0][1] = 2;
		numbers2_1[0][2] = 3;
		// ...
		numbers2_1[1][2] = 8;
		numbers2_1[1][3] = 9;
		// ...
		numbers2_1[2][1] = 12;
		//numbers2_1[4][4] = null;
		*/
		
		// Q. 방법 2. 적혀있는 값의 대입하는 식을 반복문을 사용하여 값을 대입하세요.
		int n = 1;
		A: for(int i = 0 ; i < numbers2_1.length ; i++) {
			B: for(int j = 0 ; j < numbers2_1[i].length ; j++) {
				numbers2_1 [i][j] = n;
				System.out.println(i + " , " + j + "의 행렬 값은 " + n);
				n++;
				if(n > 12) break A;
			}
		}
		System.out.println("======================================");
		/*
		System.out.println( numbers2_1[2][1]); // 12
		// 방법 3.
		int[][] numbers2_2 = new int[][] {
			{ 1, 2, 3,4, 5 },
			{ 6, 7, 8, 9, 10 },
			{ 11, 12 }
		};
		*/
		System.out.println("======================================");
		/*
		// Q. 10 이상 30미만 짝수들을 반복문을 이용하여 배열에 대입하세요.
		// { 10, 12, 14, 16, 18, 20, ..., 28 }
		// 배열의 이름은 evenArray
		
		int[] evenArray = new int[15];
		int idx = 0;
		for(int i = 10 ; i < 30 ; i+=2) {
			evenArray [idx] = i;
			System.out.println(idx + "의 행렬 값은 " + i);
			idx++;
			}
		*/
		System.out.println("======================================");
		/*
		int[] evenArray01 = new int[10];
		for(int i = 0 ; i < evenArray01.length ; i++) {
			evenArray[i] = (i*2)+10;
			System.out.println( i + "의 행렬 값은 " + evenArray[i]);
			
		}
		*/
		System.out.println("======================================");
		/*
		// Q. 피보나치 수열 - 반복문을 사용하여 피보나치 수열을 1차 배열로 생성하세요.
		int a0 = 0;
		int a1 = 1;
		
		int[] fibonacci = new int[50];
		for(int i = 0 ; i < fibonacci.length ; i++) {
			fibonacci[i] = a0 + a1;
			System.out.println( i + "의 행렬 값은 " + fibonacci[i]);
			a0 = a1;
			a1 = fibonacci[i];
			if((a0 + a1) > 50) break;
		}
		*/
		System.out.println("======================================");
		
		// Q. 피보나치 수열 - 반복문을 사용하여 피보나치 수열을 1차 배열로 생성하세요.
		
		int[] fibonacci02 = new int[50];
		fibonacci02[0] = 0;
		fibonacci02[1] = 1;
		for(int i = 2 ; i < fibonacci02.length ; i++) {
			int inpval = fibonacci02[i-1] + fibonacci02[i-2];
			if( inpval >= 50 ) break;
			System.out.println( (i-2) + "의 행렬 값은 " + inpval);
			fibonacci02[i] = inpval;	
		}
		
		// 향상된 (for each 문)
		/*
		 * for({자료형}{변수형 x} : {배열 등 참조자료형}){
		 * 		// 반복 될 내용
		 * }
		 * 변수명 x : 배열 등 참조자료형 처음 칸 부터 데이터를 순차적으로 불러옵니다.
		 * 배열등의 참조형이 가지고 있는 크기(자동 계산)만큼 반복합니다.
		 */
		
		/*
		for( int even : evenArray ) {
			// evenArray 라는 배열 안의 값을 even 이라는 변수로 사용할 수 있도록 만드는 반복문.
			System.out.println(even);
		}
		*/
		
			/* even 변수가 가지는 값
			 * 
			 * 1번째 실행된 반복문 even = 10;
			 * 2번째 실행된 반복문 even = 12;
			 * 3번째 실행된 반복문 even = 14;
			 * ...
			 * n번째 실행된 반복문 even = 10+n*2;
			 */
			/*
			 * int[] arr = { 1, 2, 3, 4, 5 };
			 * 
			 */
		/*
			// 변수 선언 프로그래밍 쉽지않음
			//java 변수의 동적 선언은 허용되지 않음.
			int a = 1;
			int b = 2;
			int c = 3;
			int d = 4;
			int e = 5;
			
			int[] arrFor = new int[5];
			// i : arrFor 배열에 사용될 index(순번)
			// 5 : 배열을 만들게 될 마지막 번호 +1 (번호 : 4 / 칸수 : 5)
			for ( int i = 0 ; i < 5 ; i++) {
				arrFor[i] = i+1;
				}
				*/
				/*
				 * i == 0 > arrFor[0] = 0+1 = 1
				 * i == 1 > arrFor[1] = 1+1 = 2
				 * i == 2 > arrFor[2] = 2+1 = 3
				 * i == 3 > arrFor[3] = 3+1 = 4
				 * i == 4 > arrFor[4] = 4+1 = 5
				 * 
				 */
			
			/*
			// 방법 1. 크기를 따로 정해줄 필요 없음
			// 배열에 담을 데이터 값이 정해진 경우
			int[] arr = {1, 2, 3, 4, 5};
			
			// 방법 2.
			// 크기가 정해진 경우, 그리고 초기값이 일련의 과정을 통해서 대입되는 경우
			int[] arr2 = new int[5];
			
			// 방법 3. 초기값이 있으면서 크기 입력을 생략하는 경우
			int[] arr3 = new int[] {1, 2, 3, 4, 5};
			*/
		
		System.out.println("======================================");
		
		// Q. 아래의 변수들을 students 라는 이름의 배열로 바꾸세요.
		int v = 0;
		int[] students = new int[5];
		for(int i = 90 ; i >= 0 ; i-=10) {
			students[v] = i;
			System.out.println( "student" + (v+1) + "의 행렬 값은 " + students[v]);
			if (i <= 50) break;
			v++;
		}
		
		System.out.println("======================================");
		// 값의 활용
		// 1. students 배열의 값의 합계를 반복문을 사용하여 출력하세요.
		
		// 값의 출력
		int w = 0;
		for(int i = 0 ; i < students.length ; i++) {
			students[i] = 100 - ((i+1)*10);
			w += students[i];
		}System.out.println( "students 행렬의 총 합은 " + w);
		
		System.out.println("======================================");
		
		// Q. Scanner : 사용자의 입력값을 받아오는 라이브러리
		// scanner를 이용해서 크기가 10개인 배열을 만들고 순차적으로 입력하고, 배열을 출력하세요.
		// 배열을 이름은 inputArray
		
		
		Scanner s = new Scanner(System.in);
		
		/*
		System.out.println(" 숫자 10개를 입력하세요 : ");
		
		int[] inputArray = new int[10];
		int k = 0;
		while(true) {
			int val = s.nextInt();
			inputArray[k] = val;
			System.out.println("입력된 행렬 값은 " + inputArray[k]);
			k++;
			if (k > inputArray.length) break;
		}
		*/
		System.out.println("======================================");
		/*
		System.out.println("입력받을 숫자의 갯수(1~10) : ");
		int size = s.nextInt();
		int[] inputArray = new int[size];
		
		System.out.println(size + "개의 숫자 입력 : ");
		for(int i = 0 ; i < inputArray.length ; i++) {
			inputArray[i] = s.nextInt();
		}
		for(int i = size-1 ; i >= 0 ; i--) {
			System.out.println(inputArray[i]);
		}
		*/
		
		// Q. 각 과목 별 합계와 평균을 구하세요.
		
		int[][] scores = new int[][]{
			// 국어, 영어, 수학
			{ 90, 80, 90 },
			{ 70, 55, 65 },
			{ 80, 88, 95 }
		};
		int sum01 = 0, sum02 = 0, sum03 = 0;
		double avg01 = 0, avg02 = 0, avg03 = 0; 
		for(int[] row : scores ) {
			sum01 += row[0];
			sum02 += row[1];
			sum03 += row[2];
		}
		avg01 = sum01/scores.length;
		avg02 = sum02/scores.length;
		avg03 = sum03/scores.length;
		System.out.println("국어 성적의 합계 : " + sum01);
		System.out.println("국어 성적의 평균 : " + avg01);
		System.out.println("수학 성적의 합계 : " + sum02);
		System.out.println("수학 성적의 평균 : " + avg02);
		System.out.println("영어 성적의 합계 : " + sum03);
		System.out.println("영어 성적의 평균 : " + avg03);
		
		/*
		// Q. 국어, 영어, 수학 각 과목별 합계와 평균을 출력하세요.
				int[][] scores = new int[][]{
							  		{ 90, 80, 90 },	// 국어
							  		{ 70, 55, 65 },	// 영어
							  		{ 80, 88, 95 }	// 수학
								};
				// 0 : 국어 합계 / 1 : 영어 합계 / 2 : 수학 합계 -> 배열
				int[] sumSubject = new int[3];
				// 0 : 국어 평균 / 1 : 영어 평균 / 2 : 수학 평균 -> 배열
				double[] avgSubject = new double[3];
				a: for ( int i = 0 ; i < scores.length ; i++ ) {
					// a1v : a-for 반복문을 벗어나서 쓸 수 없는 지역변수
					int[] a1v = scores[i];
					b: for ( int j = 0 ; j < a1v.length ; j++ ) {
						// sumKorean : b-for 반복문을 벗어나서 쓸 수 없는 지역변수
						sumSubject[i] += a1v[j];
						
//						     i   /   j
//						    0:90 / 0:90
//						    0:170/ 1:80
//						    0:230/ 2:90
//						    1:70 / 0:70
//						    1:125/ 1:55
//						    1:190/ 2:65
//						    2:80 / 0:80
//						    2:168/ 1:88
//						    2:263/ 2:95
						 
						 
						// 평균
						// j : a1v 순번(index) (n-1)		: 2
						// a1v.length : a1v 배열의 크기(n)	: 3
						if ( j + 1 == a1v.length ) {
							// 평균값 = 구해진 합계 / 총 더하게된 과목 점수 개수
							avgSubject[i] = sumSubject[i] / a1v.length;
						}
					}
				}
				
				// 합계
				for ( int sumS : sumSubject ) {
					System.out.println( sumS );
				}
				// 평균
				for ( double avgS : avgSubject ) {
					System.out.println( avgS );
				}
				*/
		
		
	}
	
}
