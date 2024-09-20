package practice;

public class Test04 {

	public static void main(String[] args) {

		// �ݺ��Ǿ��� ������ ���� �ڵ��Ͽ� �Է��ϱ� ���� �ݺ����� ���ؼ� ������ �ݺ� ���� ����

		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);

		/*
		 * while - ���ǽ�/���� �ش� ������� ���ΰ��. while �ݺ����� ���� while(���ǽ�/��) { //... } for({���۰�} ;
		 * {���ᰪ} ; {������} ;) { //... }
		 */

		// while �ݺ���
		System.out.println("While");
		int i = 1;
		while (i <= 5) {
			System.out.println(i);
			i++;
		}
		// ���������� Ȯ������ �ʾҴ� = �ݺ�Ƚ���� �������� �ʾҴ�.
		i = 1;
		while (true) {
			System.out.println(i);
			i++;
			// continue; -> �ݺ����� �������� �ʰ� �ش� ������ �����ϸ� skip(�ǳʶٱ�)
			if (i == 2)
				continue;
			// �Ʒ��� break�� ������� ������ ���ѷ����� ����.
			if (i > 5)
				break;

		}

		// for �ݺ���
		System.out.println("For");
		for (int j = 1; j <= 5; j++) {
			// continue; -> �ݺ����� �������� �ʰ� �ش� ������ �����ϸ� skip(�ǳʶٱ�)
			if (i == 2)
				continue;
			System.out.println(j);
		}

		// Q. 2�� ~ 9�� �������� ����ϼ���.

		for (int x = 2; x < 10; x++) {
			System.out.println(x + "��");
			for (int y = 1; y < 10; y++) {
				System.out.println(x + " x " + y + " = " + x * y);
			}
		}

		// Q. �ݺ����� ����ؼ� 1 ~ 100 ���� ���� �� ¦���� ����ϼ���.

		for (int j = 2; j <= 100; j += 2) {
			System.out.println(j);
		}

		// Q. �հ� ���
		// 1~200 ������ �����߿��� Ȧ���� ���� �� �հ踦 ����ϼ���.
		int sum = 0;
		for (int f = 1; f <= 200; f += 2) {
			sum += f;
		}
		System.out.println(sum);

		// Q. �Ƕ�̵� ����
		/*
		 * for(int d = 1 ; d <= 5 ; d++) { for(int v = 1 ; v <= d ; v++) {
		 * System.out.print("*"); } System.out.println(); }
		 * 
		 * for(int d = 1 ; d <= 5 ; d++) { System.out.println("*".repeat(d)); }
		 * 
		 * String star = ""; for(int d = 1 ; d <= 5 ; d++) { star += "*";
		 * System.out.println(star); }
		 */

		// Q. �Ƕ�̵� ���� 2
		String blanck = "";
		String star = "";
		int s = 1;
		for (int b = 2; b >= 0; b -= 1) {
			blanck = " ".repeat(b);
			if (b == 0) {
				System.out.println(blanck + "*".repeat(5));
			} else if (b == 1) {
				System.out.println(blanck + "*".repeat(3));
			} else if (b == 2) {
				System.out.println(blanck + "*".repeat(1));
			}
		}
		
		System.out.println("============================");
		
		
		int w = 7;
			for (int j = 1 ; j < w ; j+=2 ) {
				int half = (w-j)/2;
				System.out.println(" ".repeat(half) + "*".repeat(j) );
			}
			for (int j = w ; j >= 0 ; j-=2 ) {
				int half = (w-j)/2;
				System.out.println(" ".repeat(half) + "*".repeat(j) );
			}
		
		
		
		
		
	}

}
