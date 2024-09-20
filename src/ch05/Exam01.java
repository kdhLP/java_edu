package ch05;

import java.util.Scanner;

// �迭(Array)
public class Exam01 {

	public static void main(String[] args) {
		/*
		// �ڹٿ����� ���� �̸��� ����ϴ� ������ ������ �� �����ϴ�.
		// ���� ������ ������ �δ� ���� ������, ����, ��õ ���� ���� ������ ���� �������ٸ� �δ��� �ǹǷ� �迭�� ���� �����Ѵ�.
		int score01 = 100
				, score02 = 90
				, score03 = 80
				, score04 = 70
				, score05 = 0;
		
		
		// �迭 - ĭ���̷� ������ ���� �ٱ���. ( ù���� ĭ�� ������ 0���� �����մϴ�. )
		// ex. main( String[] args ) -> String[] : ���ڿ��� �����͸� ���� �迭
		// �迭�� ���� : ���� �ڷ������� ��� ���
		// [](���ȣ)�� ���ؼ� �迭���� ����
		// �迭�� ����(��) �ڷ��� - new ��� Ű���带 ���ؼ� ��ü�� ����
		// new Ű���� ���� �ش� �迭�� ũ�⸦ �����ݴϴ�.
		int[] scores = new int[5];
		// ���� ����
		scores[0] = 100;
		scores[1] = 90;
		scores[2] = 80;
		scores[3] = 70;
		scores[4] = 0;
		
		// (Array).length : �迭�� ������ �ִ� ũ��(����)
		// for �ݺ��� -> scores �迭�� ������ �ִ� ũ��(5)��ŭ �ݺ�
		// �迭�� ����� ��, index(����/����)�� �߿�������, ������(ũ��)�� �߿���
		for ( int i = 0 ; 1 < scores.length ; i++ ) {
			// �迭�� ���� ����
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
			System.out.println( (i+1) + "��° ������ �Է��ϼ���. " );
			// ����ڷκ��� ���� �Է°��� score ������ ����
			int score = sc.nextInt();
			// ������ ���� score ù��° ĭ���� ���ʷ� ä����.
			scores[i] = score;
			// scores[i] = sc.nextInt;	
			// ������ ���� Ȯ���ϱ� ���� �迭�� ����մϴ�.
			// result :: [ 100, 90, 80, 70, 0 ]
			
		} System.out.println( scores );
		//�迭�� ����� ��, �Ϲ������� String[]�� ���� ����Ѵ�.
		*/
		
		// �迭 �����丵
		// �����丵 : ����� �����ϸ�� ������ �����Ͽ��������� ���̰�,����������  �����ϰ� �ϴ� ����)(Ʃ�� / ���̱׷��̼�)
		
		//������ �и�
		int[] arrayName00;
		// �迭�� ũ�Ⱑ Ư���� ������ ���ؼ� �������� ���, �и��ؼ� ���� ����
		int arraySize = 20;
		arrayName00 = new int[arraySize];
		//�迭�� ���� 1
		int[] arrayName01 = new int[10];
		//�迭�� ���� 2
		int[] arrayName011 = { 1, 2, 3, 4, 5, 6, 7, 8 };
		//�迭 ����� �ʱ�ȭ(���� ����)
		int[] arrayName02 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		//�迭�� �� ���
		for ( int i = 0 ; i < arrayName02.length ; i++ ) {
			System.out.println( arrayName02[i] );
		}
		
		// 2�� �迭 : ����б� ����(�� �ȹ���µ�?) �� ��İ� ���
		int[][] arrayName03 = new int[2][2];
		int[][] arrayName031 = new int[20][20];
		int[][] arrayName032 = { 
				{1, 2, 3, 4, 5 }, 
				{6, 7, 8, 9, 10 } 
			};
		// ���� ���
		System.out.println( arrayName032[0][3] ); // result : 4
		System.out.println( arrayName032[1][0] ); // result : 6
		// System.out.println( arrayName032[1][5] ); // result : Error
		
		//��ø for ��
		int array04Width = 5, array04Height = 2;
		int[][] arrayName04 = new int[array04Height][array04Width];
		// �ݺ����� ���ؼ� �迭�� '100'�̶�� �ϴ� ���� �ϰ������� ����.
		// i�� �迭�� ��(row)�� �ǹ�.
		for (int i = 0 ; i < array04Height ; i++ ) {
			// j�� �迭�� ĭ(column)�� ���� �ǹ�.
			for ( int j = 0 ; j < array04Width ; j++) {
				arrayName04[i][j] = 100;
			}
			
		}
		// �迭�� ù��° ����(row ��) �� �� �ҷ��ɴϴ�. (arrays).length
		for (int i = 0 ; i < arrayName04.length ; i++ ) {
			// �迭�� �ι�° ���̰�(column ��)�� �ҷ��ɴϴ�. (arrays)[i].length
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
