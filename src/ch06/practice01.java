package ch06;

import java.util.Scanner;

public class practice01 {

	public static void main(String[] args) {
		
		
		// 영화 별점 관리하기
		// 1. 영화 별점 데이터를 관리할 수 있는 클래스(MovieStar)를 만듬
		// 1-1. 해당 필드 1) 영화제목(movieTitle) / 2) 별점(starPoint)
		
		// 2. practice01.main() 클래스의 객체(변수로 선언 / 배열로 선언)를 생성합니다.
		// * MovieStar 클래스의 객체(인스턴스) : 4개
		
		// 3. 생성된 객체를 사용해서 아래의 영화에 대한 별점을 입력하도록 합니다.
		
		/*
		 * 3-1. 영화제목 "어바웃 타임" /별점 4.5
		 * 3-2. 영화제목 "광해" /별점 4.8
		 * 3-3. 영화제목 "인셉션" /별점 4.9
		 * 3-4. 영화제목 "투캅스" /별점 3.5
		 */
		/*
		MovieStar[] movieStars = new MovieStar[4];
		movieStars[0] = new MovieStar();
		
		
		
		for(int i = 0 ; i > movieStars.length ; i++) {
		movieStars[i].movieTitle = "어바웃타임";
		movieStars[i].starPoint = 4.5;
		}
		
		*/
		
		/*
		MovieStar movieStars1 = new MovieStar();
		MovieStar movieStars2 = new MovieStar();
		MovieStar movieStars3 = new MovieStar();
		MovieStar movieStars4 = new MovieStar();
		
		movieStars1.movieTitle = "어바웃 타임";
		movieStars1.starPoint = 4.5;
		
		movieStars2.movieTitle = "광해";
		movieStars2.starPoint = 4.8;
		
		movieStars3.movieTitle = "인셉션";
		movieStars3.starPoint = 4.9;
		
		movieStars4.movieTitle = "투캅스";
		movieStars4.starPoint = 3.5;
		
		System.out.println( movieStars1.movieTitle + movieStars1.starPoint );
		System.out.println( movieStars2.movieTitle + movieStars2.starPoint );
		System.out.println( movieStars3.movieTitle + movieStars3.starPoint );
		System.out.println( movieStars4.movieTitle + movieStars4.starPoint );
	*/
		
		// Q. 자동차 생성과 관련된 클래스(Car)를 만드세요 v 
		/*
		 * 필드 생성
		 * 	1. 자동차 이름(name)
		 * 	2. 색상 (color)
		 * 	3. 차종 (category)
		 * 
		 */
		
		//자동차 클래스의 인스턴스 5개를 생성하세요.
		
		//아래와 같이 생성된 인스턴스의 속성을 입력하세요.
		/*
		 * 1. 이름 : 소나타 / 색상 : white / 차종 : 세단
		 * 2. 이름 : 모하비 / 색상 : black / 차종 : SUV
		 * 3. 이름 : 포르쉐 / 색상 : red / 차종 : 슈퍼카
		 * 4. 이름 : 마흐바흐 / 색상 : silver&black / 차종 : 세단
		 * 5. 이름 : 모닝 / 색상 : yellow / 차종 : 경차
		 * 
		 */
		
		//입력한 인스턴스의 속성을 출력하여 확인하세요.
		
		Car[] cars = new Car[5];
		
		/*
		String carChar[][] = {
				{"소나타", "모하비", "포르쉐", "마흐마흐", "모닝"},
				{"white", "black", "red", "silver&black", "yellow"},
				{"세단", "SUV", "슈퍼카", "세단", "경차"}
		};
		*/
		
		String carChar[][] = {
				{"소나타", "white", "세단"},
				{"모하비", "black", "SUV"},
				{"포르쉐", "red",  "슈퍼카"},
				{"마흐마흐",  "silver&black", "세단"},
				{"모닝", "yellow", "경차"}
		};
		
		for(int i = 0 ; i < carChar.length ; i++) {
			cars[i] = new Car();
			for(int j = 0 ; j < carChar[i].length ; j++) {
				if ( j == 0 ) cars[i].name = carChar[i][j];
				if ( j == 1 ) cars[i].color = carChar[i][j];
				if ( j == 2 ) cars[i].category = carChar[i][j];
			}
		}
		for(int i = 0 ; i < cars.length ; i++) {
			
			System.out.println( cars[i].name + cars[i].color + cars[i].category); 
			
		}
		
		
		
	}

}
