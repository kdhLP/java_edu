package ch13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

// Collection - Set
/*
 * (interface) Collection - (interface) Set - HashSet
 * 											- LinkedHashSet
 * 											- TreeSet
 * 
 * Set
 * 	 - Hash �ڷᱸ���� ����ؼ� ��Ҹ� ����
 * 	 	* Hash
 * 			(index ����) 0:[1] 1:[2] 2:[5] 3:[8] 4:[10]
 * 			(index ������) [1] [2] [5] [8] [10]
 * 	 	> 0:[] 1:[1] 2:[2] 3:[] 4:[] 5:[5] 6:[] 7:[] 8:[8] 9:[] 10:[10] 
 * 	 	> �������� �ڼ����ִ� �����͸� �ҷ��� ��, ���� ����ó�� ���
 * 	 - Ư���� ���� ���� ����(�߰��� ������ �������� ����)
 * 	 - Ȱ��	: �������� ���ϼ��� �߿� 
 * 			> �ߺ��� ������� �ʴ´�
 * 			> �Ϲ������� �ߺ� �����͸� ������ �� ���
 * 
 * * HashSet
 * 
 * * TreeSet
 * 	 - ���� Ž��Ʈ���� ������ ����-��Ʈ�� �˰����� ���
 * 	 - ��ҵ��� ���ĵ� ������ ���� (�Էµ� ������ �ƴ�)
 * 	 - Ȱ�� : ���� �˻�, ���ĵ� �����Ͱ� �ʿ��� ���
 * 		ex) �׺���̼�, ��ã�� ���α׷�
 * 
 */
public class Exam03 {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();
		// ������ �߰� .add()
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("E");

		// �����͸� ����, ��ȸ ���� (���� ���� Ȯ��)
		// set.get();
		// set.set();
		// �ڷ��� ũ�� .size()
		System.out.println("ũ�� : " + set.size());
		// ����
		set.remove("E");

		System.out.println("Set ������ : " + set);
		// ������ �ߺ����Ÿ� ���ؼ� Set
		// > �����ִ� �����͸� Ȱ���ϱ� ���ؼ� ArrayList ��ȯ

		/*
		 * Iterator : �ݺ���
		 * 	 - Conrainer, Ư�� List�� ��ȸ�� �� �ְ� ���ִ� ��ü
		 * 	 -ArrayList, HashSet... Collection�� �ݺ��ϴµ� ��밡��
		 * 	 - ** Collection���� ��Ҹ� �����ϴ� ���
		 * 	 - next() / previous() �޼ҵ带 ����Ͽ� ��ҵ� ���� �̵� ����
		 * 	 - hasNext()�� ���ؼ� �� ���� ��Ұ� �ִ����� Ȯ�� ����
		 */
		/*
		 * Set : index�� ����
		 * 	 - for���� ����� �� ����
		 * 	 - for-each�� ��� ����
		 * 
		 */

		for (int i = 0; i < set.size(); i++) {
			// Set : index�� ������ get() �޼ҵ嵵 ����
			// String alpha = set.get(i);
		}
		int i = 0;
		for (String alpha : set) {
			i++;
			if (i == 2) {
				alpha = "Z";
			}
			System.out.println(alpha);
		}
		System.out.println(set);

		Iterator e = set.iterator();
		while (e.hasNext()) {
			System.out.println(e.next());
		}
		
		// �������� : Set
		ArrayList<String> list = new ArrayList<String>();
		for(String str : set ) {
			list.add(str);
		}
		System.out.println("�� ��ȸ : " + list.get(2));
		list.set(2,  "Z");
		System.out.println("�� Ȯ�� : " + list.get(2));
		
		/*
		 * Java-Program : DB ��û
		 * > result = select * from table where ...;
		 * > (�ߺ������� ����) Set set = result;
		 * > (Ȱ�� ����) Set > ArrayList ��ȯ
		 * 
		 * > result = select 	DISTINCT * from table where ... group by
		 * > ArrayList = result
		 */
		
		// ��������
		// ���� �迭�� �ߺ������϶�
		int[] inputArr = {30, 20, 20, 10, 10, 5, 2, 30};
		
		HashSet<Integer> setArr = new HashSet<Integer>();
		
		for(int j = 0 ; j < inputArr.length ; j++) {
			setArr.add(inputArr[j]);
		}
		System.out.println(setArr);
		

	}
}
