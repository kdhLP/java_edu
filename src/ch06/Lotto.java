package ch06;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.random.*;

// default class ����
class Lotto {
	// �ʵ�
	int[] lotto = new int[6];

	// ������
	public Lotto() {

	}

	// method
	public void lottoPlay(int i) {

		 //Scanner sc = new Scanner(System.in);

		// System.out.println( (i+1) + "��° ��ȣ�� �Է��ϼ���. " );
		// int result = sc.nextInt();
		
		double ramdom = Math.random();
		int result = (int) (ramdom * 45) + 1;

		if (result < 1 || result > 45) {
			System.out.println("�Է��� �� ���� �����Դϴ�. 1~45�� ���ڸ� �Է����ּ���.");
			lottoPlay(i);
		} else if (rewrite(result, i)) {
			// System.out.println(result + "(��)�� �ߺ��� �����Դϴ�. ���ڸ� �ٽ� �Է����ּ���.");
			lottoPlay(i);
		} else {
			lotto[i] = result;
		}
	}

	public void printResult() {
		Arrays.sort(lotto); // �迭�� ������������ ����
		System.out.println("�Է��� �ζ� ��ȣ : " + Arrays.toString(lotto));
	}

	private boolean rewrite(int res, int check) {
		for (int i = 0; i < check; i++) {
			if (this.lotto[i] == res) {
				return true;
			}
		}
		return false;
	}

}
