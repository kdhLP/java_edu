package practice;

import java.util.Scanner;

public class Test05 {
	
	public static void main(String[] args) {
		
		/*
		// ���� (����, ����)
		// ���ѻ��� : ���� �ڷ��� ���� �ϳ��� �迭�� ���� �� ����.
		// ����
		int number = 10;
		// �迭 : ������ ������ Ÿ�� - new ��ü�� ���� ����.
		// ������� 1
		int[] numbers = { 1, 2, 3, 4, 5 };
		// ������� 2. new {�ڷ���}[�迭ũ��];
		String[] strs = new String[5];
		// �迭�� ������ 0���� ���� -> ������ ĭ�� ��� ��ȣ�� n-1(4)
		strs[0] = "�ڹ�";
		strs[1] = "�ڹ� ��ũ��Ʈ";
		strs[2] = "����Ŭ";
		// ������ ũ�⸦ ����� ����(index)�� ����� �� �����ϴ�.
		//strs[10] = "��������"; //Error.ArrayIndexOutofBounds
		
		//�迭 ��� : [Ljava.lang.String;@36baf30c
		//�޸� �ּҰ��� ���
		System.out.println(strs);
		//(Array).length : (return int type) �迭�� ũ�⸦ �ҷ����� �Ӽ���
		for (int i = 0 ; i <= strs.length - 1 ; i++) {
			System.out.println("�迭�� "+ i +" ��° ĭ�� ���� :: " + strs[i] + "�Դϴ�");
		}
		
		// ������� 3.
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
		 * �迭�� �̸� : nums
		 */
		
		int[] nums = new int[6];
		// �迭�� ������ 0���� ���� -> ������ ĭ�� ��� ��ȣ�� n-1(4)
		nums[0] = 100;
		nums[1] = 200;
		nums[2] = 300;
		nums[3] = 400;
		nums[4] = 500;
		nums[5] = 600;
		for (int i = 0 ; i <= nums.length - 1 ; i++) {
			System.out.println("nums "+ (i+1) +" ��° ĭ�� ���� :: " + nums[i] + "�Դϴ�");
		}
		
		// �迭 ���� �迭 ���
		// 2�� �迭
		// ���� ��� 1.
		int[][] numbers2 = {
				{ 1, 2, 3,4, 5 },
				{ 6, 7, 8, 9, 10 },
				{ 11, 12 }
		};
		// ��� 2. new Ű���� ������ ���ȣ �ȿ��� �迭�� ũ�⸦ �Է�.
		// new {�ڷ���}[{row(recode) ũ��}][{column ũ��}]
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
		
		// Q. ��� 2. �����ִ� ���� �����ϴ� ���� �ݺ����� ����Ͽ� ���� �����ϼ���.
		int n = 1;
		A: for(int i = 0 ; i < numbers2_1.length ; i++) {
			B: for(int j = 0 ; j < numbers2_1[i].length ; j++) {
				numbers2_1 [i][j] = n;
				System.out.println(i + " , " + j + "�� ��� ���� " + n);
				n++;
				if(n > 12) break A;
			}
		}
		System.out.println("======================================");
		/*
		System.out.println( numbers2_1[2][1]); // 12
		// ��� 3.
		int[][] numbers2_2 = new int[][] {
			{ 1, 2, 3,4, 5 },
			{ 6, 7, 8, 9, 10 },
			{ 11, 12 }
		};
		*/
		System.out.println("======================================");
		/*
		// Q. 10 �̻� 30�̸� ¦������ �ݺ����� �̿��Ͽ� �迭�� �����ϼ���.
		// { 10, 12, 14, 16, 18, 20, ..., 28 }
		// �迭�� �̸��� evenArray
		
		int[] evenArray = new int[15];
		int idx = 0;
		for(int i = 10 ; i < 30 ; i+=2) {
			evenArray [idx] = i;
			System.out.println(idx + "�� ��� ���� " + i);
			idx++;
			}
		*/
		System.out.println("======================================");
		/*
		int[] evenArray01 = new int[10];
		for(int i = 0 ; i < evenArray01.length ; i++) {
			evenArray[i] = (i*2)+10;
			System.out.println( i + "�� ��� ���� " + evenArray[i]);
			
		}
		*/
		System.out.println("======================================");
		/*
		// Q. �Ǻ���ġ ���� - �ݺ����� ����Ͽ� �Ǻ���ġ ������ 1�� �迭�� �����ϼ���.
		int a0 = 0;
		int a1 = 1;
		
		int[] fibonacci = new int[50];
		for(int i = 0 ; i < fibonacci.length ; i++) {
			fibonacci[i] = a0 + a1;
			System.out.println( i + "�� ��� ���� " + fibonacci[i]);
			a0 = a1;
			a1 = fibonacci[i];
			if((a0 + a1) > 50) break;
		}
		*/
		System.out.println("======================================");
		
		// Q. �Ǻ���ġ ���� - �ݺ����� ����Ͽ� �Ǻ���ġ ������ 1�� �迭�� �����ϼ���.
		
		int[] fibonacci02 = new int[50];
		fibonacci02[0] = 0;
		fibonacci02[1] = 1;
		for(int i = 2 ; i < fibonacci02.length ; i++) {
			int inpval = fibonacci02[i-1] + fibonacci02[i-2];
			if( inpval >= 50 ) break;
			System.out.println( (i-2) + "�� ��� ���� " + inpval);
			fibonacci02[i] = inpval;	
		}
		
		// ���� (for each ��)
		/*
		 * for({�ڷ���}{������ x} : {�迭 �� �����ڷ���}){
		 * 		// �ݺ� �� ����
		 * }
		 * ������ x : �迭 �� �����ڷ��� ó�� ĭ ���� �����͸� ���������� �ҷ��ɴϴ�.
		 * �迭���� �������� ������ �ִ� ũ��(�ڵ� ���)��ŭ �ݺ��մϴ�.
		 */
		
		/*
		for( int even : evenArray ) {
			// evenArray ��� �迭 ���� ���� even �̶�� ������ ����� �� �ֵ��� ����� �ݺ���.
			System.out.println(even);
		}
		*/
		
			/* even ������ ������ ��
			 * 
			 * 1��° ����� �ݺ��� even = 10;
			 * 2��° ����� �ݺ��� even = 12;
			 * 3��° ����� �ݺ��� even = 14;
			 * ...
			 * n��° ����� �ݺ��� even = 10+n*2;
			 */
			/*
			 * int[] arr = { 1, 2, 3, 4, 5 };
			 * 
			 */
		/*
			// ���� ���� ���α׷��� ��������
			//java ������ ���� ������ ������ ����.
			int a = 1;
			int b = 2;
			int c = 3;
			int d = 4;
			int e = 5;
			
			int[] arrFor = new int[5];
			// i : arrFor �迭�� ���� index(����)
			// 5 : �迭�� ����� �� ������ ��ȣ +1 (��ȣ : 4 / ĭ�� : 5)
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
			// ��� 1. ũ�⸦ ���� ������ �ʿ� ����
			// �迭�� ���� ������ ���� ������ ���
			int[] arr = {1, 2, 3, 4, 5};
			
			// ��� 2.
			// ũ�Ⱑ ������ ���, �׸��� �ʱⰪ�� �Ϸ��� ������ ���ؼ� ���ԵǴ� ���
			int[] arr2 = new int[5];
			
			// ��� 3. �ʱⰪ�� �����鼭 ũ�� �Է��� �����ϴ� ���
			int[] arr3 = new int[] {1, 2, 3, 4, 5};
			*/
		
		System.out.println("======================================");
		
		// Q. �Ʒ��� �������� students ��� �̸��� �迭�� �ٲټ���.
		int v = 0;
		int[] students = new int[5];
		for(int i = 90 ; i >= 0 ; i-=10) {
			students[v] = i;
			System.out.println( "student" + (v+1) + "�� ��� ���� " + students[v]);
			if (i <= 50) break;
			v++;
		}
		
		System.out.println("======================================");
		// ���� Ȱ��
		// 1. students �迭�� ���� �հ踦 �ݺ����� ����Ͽ� ����ϼ���.
		
		// ���� ���
		int w = 0;
		for(int i = 0 ; i < students.length ; i++) {
			students[i] = 100 - ((i+1)*10);
			w += students[i];
		}System.out.println( "students ����� �� ���� " + w);
		
		System.out.println("======================================");
		
		// Q. Scanner : ������� �Է°��� �޾ƿ��� ���̺귯��
		// scanner�� �̿��ؼ� ũ�Ⱑ 10���� �迭�� ����� ���������� �Է��ϰ�, �迭�� ����ϼ���.
		// �迭�� �̸��� inputArray
		
		
		Scanner s = new Scanner(System.in);
		
		/*
		System.out.println(" ���� 10���� �Է��ϼ��� : ");
		
		int[] inputArray = new int[10];
		int k = 0;
		while(true) {
			int val = s.nextInt();
			inputArray[k] = val;
			System.out.println("�Էµ� ��� ���� " + inputArray[k]);
			k++;
			if (k > inputArray.length) break;
		}
		*/
		System.out.println("======================================");
		/*
		System.out.println("�Է¹��� ������ ����(1~10) : ");
		int size = s.nextInt();
		int[] inputArray = new int[size];
		
		System.out.println(size + "���� ���� �Է� : ");
		for(int i = 0 ; i < inputArray.length ; i++) {
			inputArray[i] = s.nextInt();
		}
		for(int i = size-1 ; i >= 0 ; i--) {
			System.out.println(inputArray[i]);
		}
		*/
		
		// Q. �� ���� �� �հ�� ����� ���ϼ���.
		
		int[][] scores = new int[][]{
			// ����, ����, ����
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
		System.out.println("���� ������ �հ� : " + sum01);
		System.out.println("���� ������ ��� : " + avg01);
		System.out.println("���� ������ �հ� : " + sum02);
		System.out.println("���� ������ ��� : " + avg02);
		System.out.println("���� ������ �հ� : " + sum03);
		System.out.println("���� ������ ��� : " + avg03);
		
		/*
		// Q. ����, ����, ���� �� ���� �հ�� ����� ����ϼ���.
				int[][] scores = new int[][]{
							  		{ 90, 80, 90 },	// ����
							  		{ 70, 55, 65 },	// ����
							  		{ 80, 88, 95 }	// ����
								};
				// 0 : ���� �հ� / 1 : ���� �հ� / 2 : ���� �հ� -> �迭
				int[] sumSubject = new int[3];
				// 0 : ���� ��� / 1 : ���� ��� / 2 : ���� ��� -> �迭
				double[] avgSubject = new double[3];
				a: for ( int i = 0 ; i < scores.length ; i++ ) {
					// a1v : a-for �ݺ����� ����� �� �� ���� ��������
					int[] a1v = scores[i];
					b: for ( int j = 0 ; j < a1v.length ; j++ ) {
						// sumKorean : b-for �ݺ����� ����� �� �� ���� ��������
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
						 
						 
						// ���
						// j : a1v ����(index) (n-1)		: 2
						// a1v.length : a1v �迭�� ũ��(n)	: 3
						if ( j + 1 == a1v.length ) {
							// ��հ� = ������ �հ� / �� ���ϰԵ� ���� ���� ����
							avgSubject[i] = sumSubject[i] / a1v.length;
						}
					}
				}
				
				// �հ�
				for ( int sumS : sumSubject ) {
					System.out.println( sumS );
				}
				// ���
				for ( double avgS : avgSubject ) {
					System.out.println( avgS );
				}
				*/
		
		
	}
	
}
