package ch06;

public class Test05 {

	public static void main(String[] args) {

		// Q. ���� 6���� �迭�� �Է¹޽��ϴ�.
		/*
		 * (����) �Է¹��� ���ڴ� 1~45���� �Դϴ�. �Է¹��� ���� �ߺ��� �Ǽ� �ȵ˴ϴ�. (�Է¹��� ��, ���� �ߺ����� �ʴ��� ����) 6��
		 * ���ڸ� �Է¹ް� ���� ������������ �����մϴ�.
		 * 
		 * ���� 6�� ������ݴϴ�.
		 * 
		 * �Ʒ��� ���� ���·� �ڵ尡 �ۼ��Ǿ�� �մϴ�. Lotto lotto = new Lotto();
		 *
		 * while(...) { // method�� ȣ�� lotto.scan(); } �޼ҵ��� ���� lotto.print();
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
