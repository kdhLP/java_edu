package ch06;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.random.*;

// default class 선언
class Lotto {
	// 필드
	int[] lotto = new int[6];

	// 생성자
	public Lotto() {

	}

	// method
	public void lottoPlay(int i) {

		 //Scanner sc = new Scanner(System.in);

		// System.out.println( (i+1) + "번째 번호를 입력하세요. " );
		// int result = sc.nextInt();
		
		double ramdom = Math.random();
		int result = (int) (ramdom * 45) + 1;

		if (result < 1 || result > 45) {
			System.out.println("입력할 수 없는 숫자입니다. 1~45의 숫자를 입력해주세요.");
			lottoPlay(i);
		} else if (rewrite(result, i)) {
			// System.out.println(result + "(은)는 중복된 숫자입니다. 숫자를 다시 입력해주세요.");
			lottoPlay(i);
		} else {
			lotto[i] = result;
		}
	}

	public void printResult() {
		Arrays.sort(lotto); // 배열을 오름차순으로 정렬
		System.out.println("입력한 로또 번호 : " + Arrays.toString(lotto));
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
