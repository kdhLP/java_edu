package ch08.test.payment;

public class TossPay implements Payment {
	@Override
	public boolean pay(int amount) {
		System.out.println("�佺 �ý��۰� �����մϴ�.");
		System.out.println(amount + "���� �����մϴ�.");
		return true;
	}
}
