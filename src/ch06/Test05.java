package ch06;

public class Test05 {

	public static void main(String[] args) {

		// Q. 숫자 6개를 배열에 입력받습니다.
		/*
		 * (조건) 입력받을 숫자는 1~45까지 입니다. 입력받은 값이 중복이 되선 안됩니다. (입력받을 때, 값이 중복되지 않는지 점검) 6개
		 * 숫자를 입력받고 나서 오름차순으로 정력합니다.
		 * 
		 * 숫자 6개 출력해줍니다.
		 * 
		 * 아래와 같은 형태로 코드가 작성되어야 합니다. Lotto lotto = new Lotto();
		 *
		 * while(...) { // method의 호출 lotto.scan(); } 메소드의 실행 lotto.print();
		 */

		Lotto lotto = new Lotto();

		int i = 0;
		while (i < lotto.lotto.length) {
			lotto.lottoPlay(i);

			i++;
		}
		lotto.printResult();
	}

}
