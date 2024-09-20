package ch05;

public class Test01 {

	public static void main(String[] args) {
		
		int[][] arrayName04 = new int[5][5];
		
		for (int i = 0 ; i < arrayName04.length ; i++ ) {
			// 배열의 두번째 길이값(column 수)을 불러옵니다. (arrays)[i].length
			for (int j = 0 ; j < arrayName04[i].length ; j++ ) {
				arrayName04[i][j] = i*5 + j + 1;
				System.out.print( (arrayName04[i][j]) + "	"  );
			}
			System.out.println("\n");
		}

	}

}
