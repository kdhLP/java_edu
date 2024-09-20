package ch13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/*
 * Collection Framework - List
 * 
 * �����͸� ����, �����ϱ� ���ؼ� ���Ǵ� ���
 * 	 ����(�⺻��+������)	- ���� �������� ������ �� ����
 * 	 > �迭			- ���� Ÿ���� ���� ���� / ������ ��, ũ�Ⱑ ������
 * 	 > Ŭ����(������)	- Ÿ�Ծ�����(�ٿ�ĳ������ ����_ / ����ȯ(�ٿ�ĳ����)
 * 	 > ���׸�(Generic)
 * 	 > Collection Framework
 * 
 * * Array
 * 	 - ���� �⺻���� �ڷᱸ��
 * 	 - ������ �ְ� �ߺ��� ���, ũ�Ⱑ ������
 * 	 - �ַ� �ε���(����, ����)�� ����� ��, �ְ��� ȿ���� ���̴� �ڷᱸ��
 * 	 - ���� : �迭�� ����(����)�ϴ� ������ �迭�� ũ�⸦ �̸� ���ؾ� �� 
 * 			/ ���� �ڷ����� ��ƾ� �Ѵ�.
 * 
 * * List
 * 	 - (interface) Collection - (interface) List
 * 	 	 > ArrayList / Vector // LinkedList
 * 	 - ���� (�Էµ�) ������ �ְ�, (����) �ߺ��� ����ϴ� �ڷᱸ��
 * 
 * * ArrayList
 * 	 - �迭�� ����� ����Ʈ
 * 		: ������ �ְ� �ߺ��� ���, ũ�Ⱑ ����
 * 	 - �⺻���� ũ�� : 10
 * 		> �������� ��, ũ�Ⱑ ���� > 50% ����
 * 		ex) 10 > 15 > 22 > 33 > 49 > ...
 * 	 - Ȱ�� 
 * 		: �����Ͱ� ������� �Է� / ������� ��µǴ� ���(Queue)
 * 		: �Ϲ������� ���� ���� ����ϴ� Collection
 * 	 - ó�� Ȥ�� ������ �����͸� �߰�, �����Ҷ��� �ӵ��� ����
 * 		/ �߰��� �����͸� �߰�, ����, ������ ���� �ӵ��� ��������� ����
 * 		// �ڼ��� ���� : �˰��� <�ð����⵵> - ���ǥ���
 * 	 [] [] [] [] [] [] [] []
 * 
 * * LinkedList <> ArrayList
 * 	 - �߰��� �����͸� �߰�, ����, ������ ����
 * 	 - ArrayList�� ������ ������ ������ ����Ʈ
 * 	 - ArrayList�� �ϳ��� �ٱ��Ͽ� ���������� �������̶� ������ ���ڸ�
 * 		LinkedList�� ���׸��� �ٱ��ϴ� �������� �������̶� ����
 * 	 - ArrayList���� ���̴� : �޸� �Ҵ緮�� ����.
 * 	 - �⺻ũ�� : ??
 * 
 * * Vector
 * 	 - ArrayList�� ���, ������ ���� ����
 * 	 - Thread�� ����ȭ ����� �߰� (ch12.Thread)
 * 	 - �ʱ⿡�� ������ ��� (�����̶� ǥ���ص� �� ��ŭ ���� ���)
 * 	 - ���� Thread ȯ�濡���� ���ʿ��� ����ȭ �߻�
 * 		> ��������, ���ʿ��� �޸𸮿� ���� �Ҵ�
 * 		> ���� ����� ���ϰ� ��
 * 		> ����� ���� ȣȯ���� ���ؼ� ���ܳ���
 * 	 - Thread ����ȭ�� ���� ����� ���� ����
 * 
 */

public class Exam02 {
	
	public static void main(String[] args) {
		
		// �迭 ������ ����
		int[] intArray = new int[5];
		int[] intArray02 = {1, 2, 3, 4, 5};
		// 1, 2, 3, ... ������� �Է�, for ��� 1, 2, 3, ...
		
		// ArrayList
		// Ÿ���߷� : ��ü ����(������)�� <> ����ϰ� �ȿ� Ÿ���� �������� �ʾҴ���
		//			�º��� ������ �����ϴ� ��ġ�� Ÿ���� ����Ǿ� ������
		//			�ڹٰ� �˾Ƽ� Ÿ���� ������.
		ArrayList<String> list = new ArrayList<>();
		// ���ο� �����͸� �߰�.add(Object obj)
		// list ������ ���, list ũ�� : 10 (index : 0~9)
		// ������ ����
		list.add("�質��"); 		// index 0
		list.add("�赵��");		// index 1
		list.add("�ڼ���");		// index 2
		list.add("�質��"); 		// index 3, ���� �ߺ� ���
		// ...
		list.add("�̻���");		// list ũ�� : 15 > index 10
		list.add("������"); 		// index 11
		list.add("������");		// index 12
		// ���ο� �����͸� �߰� .add(int index, Object obj)
		list.add(3, "��â��");	// index 3, ���� �߰�
		// ������ �����͸� ���� .set(int index, Object obj)
		list.set(3,  "����");
		// ������ �����͸� ���� .remove(int index)
		list.remove(3);
		// �����͸� Ȯ��
		System.out.println(list);
		// for-each �� : ���
		for(String name : list) {
			System.out.println(name);
		}
		
		// �����͸� �Է� : for-each�� ���� for�� ȿ��
		// ArrayList ũ�⸦ Ȯ���ϴ� �޼ҵ� .size
		// cf. Array.length / String.length()
		/*
		int size = list.size();
		for (int i = 0 ; i < size ; i++) {
			// ������ �߰�
			list.add("���ο� ������");
			// ������ ����
			if (i == 3) {
				list.set(i,  "����");
			}
			// if ���ǹ��� ������� �ʴ´ٸ� list.size()��ŭ �Ʒ� �ҽ��ڵ带 ����
			// list.set(3, "����");
			// ������ ����
			if(i == 0 || i == 4 ) {
				list.remove(i);
			}
		}
		*/
		
		// �����͸� ��ȸ .get(int index)
		System.out.println("4��° �� : " + list.get(3));
		
		// Iterator
		Iterator<String> e00 = list.iterator();
		while (e00.hasNext()) {
			// Iterator : get(), set() ����
			System.out.println(e00.next());
		}
		
		ListIterator<String> e01 = list.listIterator();
		while (e01.hasNext()) {
			e01.set(e01.next() + " �߰����ڿ�");
		}
		System.out.println(list);
		
		
		
	}
}
