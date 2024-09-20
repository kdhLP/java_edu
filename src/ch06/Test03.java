package ch06;

public class Test03 {

	public static void main(String[] args) {
		
		System.out.println("��հ� : " + average( 1, 2, 3));
		printAverage( 10, 20, 30);
		
		// Q2. �޼����� n�� ����ϴ� �ҽ��ڵ带 �ۼ�
		String msg = "Hello~ World!!";
		printMessage(msg,1);
		
		msg = "Hello~ Java";
		printMessage(msg,2);
		
		printMessage("Hello~ Database",3);
		
		
		// Q3. 
		int[] score = {70, 80, 190, 120, 10};
		
		System.out.println("�ְ� ���� : " + max(score));
        System.out.println("�ּ� ���� : " + min(score));
		
			// ... score �迭 ���� �ִ񰪰� �ּڰ��� ���� max, min�� �����Ͽ� ����ϴ� �ڵ带 �ۼ�
			// �� �ڵ带 �޼ҵ带 ���� �����ϼ���.
		
	}
	
	public static int max(int[] x) {
        int max = x[0];
        for (int i = 1; i < x.length; i++) {
            if (x[i] > max) {
                max = x[i];
            }
        }
        return max;
    }
	
	public static int min(int[] x) {
		int min = x[0];
		for (int i = 1; i < x.length; i++) {
			if (x[i] < min) {
                min = x[i];
			}
		}
		return min;
	}
	
	
	public static double average( int x, int y, int z ) {
		
		return ((x+y+z)/3.0);
	}
	
	public static void printAverage( int x, int y, int z ) {
		
		System.out.println( "��հ� : " + ((x+y+z)/3.0) );
	}
	
	public static void printMessage( String msg, int count) {
		
		for (int i = 0; i < count ; i++) {
			System.out.println(msg);
		}
	}
	
	
}
