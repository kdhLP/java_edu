package ch06;

import java.util.Scanner;

public class practice01 {

	public static void main(String[] args) {
		
		
		// ��ȭ ���� �����ϱ�
		// 1. ��ȭ ���� �����͸� ������ �� �ִ� Ŭ����(MovieStar)�� ����
		// 1-1. �ش� �ʵ� 1) ��ȭ����(movieTitle) / 2) ����(starPoint)
		
		// 2. practice01.main() Ŭ������ ��ü(������ ���� / �迭�� ����)�� �����մϴ�.
		// * MovieStar Ŭ������ ��ü(�ν��Ͻ�) : 4��
		
		// 3. ������ ��ü�� ����ؼ� �Ʒ��� ��ȭ�� ���� ������ �Է��ϵ��� �մϴ�.
		
		/*
		 * 3-1. ��ȭ���� "��ٿ� Ÿ��" /���� 4.5
		 * 3-2. ��ȭ���� "����" /���� 4.8
		 * 3-3. ��ȭ���� "�μ���" /���� 4.9
		 * 3-4. ��ȭ���� "��İ��" /���� 3.5
		 */
		/*
		MovieStar[] movieStars = new MovieStar[4];
		movieStars[0] = new MovieStar();
		
		
		
		for(int i = 0 ; i > movieStars.length ; i++) {
		movieStars[i].movieTitle = "��ٿ�Ÿ��";
		movieStars[i].starPoint = 4.5;
		}
		
		*/
		
		/*
		MovieStar movieStars1 = new MovieStar();
		MovieStar movieStars2 = new MovieStar();
		MovieStar movieStars3 = new MovieStar();
		MovieStar movieStars4 = new MovieStar();
		
		movieStars1.movieTitle = "��ٿ� Ÿ��";
		movieStars1.starPoint = 4.5;
		
		movieStars2.movieTitle = "����";
		movieStars2.starPoint = 4.8;
		
		movieStars3.movieTitle = "�μ���";
		movieStars3.starPoint = 4.9;
		
		movieStars4.movieTitle = "��İ��";
		movieStars4.starPoint = 3.5;
		
		System.out.println( movieStars1.movieTitle + movieStars1.starPoint );
		System.out.println( movieStars2.movieTitle + movieStars2.starPoint );
		System.out.println( movieStars3.movieTitle + movieStars3.starPoint );
		System.out.println( movieStars4.movieTitle + movieStars4.starPoint );
	*/
		
		// Q. �ڵ��� ������ ���õ� Ŭ����(Car)�� ���弼�� v 
		/*
		 * �ʵ� ����
		 * 	1. �ڵ��� �̸�(name)
		 * 	2. ���� (color)
		 * 	3. ���� (category)
		 * 
		 */
		
		//�ڵ��� Ŭ������ �ν��Ͻ� 5���� �����ϼ���.
		
		//�Ʒ��� ���� ������ �ν��Ͻ��� �Ӽ��� �Է��ϼ���.
		/*
		 * 1. �̸� : �ҳ�Ÿ / ���� : white / ���� : ����
		 * 2. �̸� : ���Ϻ� / ���� : black / ���� : SUV
		 * 3. �̸� : ������ / ���� : red / ���� : ����ī
		 * 4. �̸� : ������� / ���� : silver&black / ���� : ����
		 * 5. �̸� : ��� / ���� : yellow / ���� : ����
		 * 
		 */
		
		//�Է��� �ν��Ͻ��� �Ӽ��� ����Ͽ� Ȯ���ϼ���.
		
		Car[] cars = new Car[5];
		
		/*
		String carChar[][] = {
				{"�ҳ�Ÿ", "���Ϻ�", "������", "���帶��", "���"},
				{"white", "black", "red", "silver&black", "yellow"},
				{"����", "SUV", "����ī", "����", "����"}
		};
		*/
		
		String carChar[][] = {
				{"�ҳ�Ÿ", "white", "����"},
				{"���Ϻ�", "black", "SUV"},
				{"������", "red",  "����ī"},
				{"���帶��",  "silver&black", "����"},
				{"���", "yellow", "����"}
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
