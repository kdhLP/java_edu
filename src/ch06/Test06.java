package ch06;

public class Test06 {

	public static void main(String[] args) {
		
		// Q. ���θ� Ŭ���� : �Ǹ����� �������� �����̸�, ������ å��, ������ Ȯ��.
		
		
		// �����ڸ� ���� �ν��Ͻ� ����
		Item item1 = new Item("�̰��� Mysql�̴�.", 28000, 15);
		Item item2= new Item("ȥ�� �����ϴ� �ڹ�", 32000, 10);
		
		// �ν��Ͻ��� �޼ҵ带 ���ؼ� �ʵ带 ����
		Cart cart = new Cart();
		cart.addItem( item1 );
		cart.addItem( item2 );
		
		// �߰��� �����͸� ��� ����ϴ� �޼ҵ�
		cart.printItems();
		cart.getItemTotalCount();
		
	}

}
