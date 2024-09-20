package ch06;

public class Test03 {

	public static void main(String[] args) {
		
		System.out.println("평균값 : " + average( 1, 2, 3));
		printAverage( 10, 20, 30);
		
		// Q2. 메세지를 n번 출력하는 소스코드를 작성
		String msg = "Hello~ World!!";
		printMessage(msg,1);
		
		msg = "Hello~ Java";
		printMessage(msg,2);
		
		printMessage("Hello~ Database",3);
		
		
		// Q3. 
		int[] score = {70, 80, 190, 120, 10};
		
		System.out.println("최고 점수 : " + max(score));
        System.out.println("최소 점수 : " + min(score));
		
			// ... score 배열 안의 최댓값과 최솟값을 각각 max, min에 대입하여 출력하는 코드를 작성
			// 그 코드를 메소드를 통해 구현하세요.
		
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
		
		System.out.println( "평균값 : " + ((x+y+z)/3.0) );
	}
	
	public static void printMessage( String msg, int count) {
		
		for (int i = 0; i < count ; i++) {
			System.out.println(msg);
		}
	}
	
	
}
