package ch05;

public class Test01 {

	public static void main(String[] args) {
		
		int[][] arrayName04 = new int[5][5];
		
		for (int i = 0 ; i < arrayName04.length ; i++ ) {
			// �迭�� �ι�° ���̰�(column ��)�� �ҷ��ɴϴ�. (arrays)[i].length
			for (int j = 0 ; j < arrayName04[i].length ; j++ ) {
				arrayName04[i][j] = i*5 + j + 1;
				System.out.print( (arrayName04[i][j]) + "	"  );
			}
			System.out.println("\n");
		}

	}

}
