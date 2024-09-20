package ch13;

// ���׸� �������̽�
// ������ ���׸� Ÿ���� ���
interface GenericInterface<K,V> {
	public K getKey();
	public V getValue();
}
/*
 * 	interface GenericInterface00 {
 *		public Integer getKey();
 *		public String getValue();
 *}
 *	interface GenericInterface01 {
 *		public Integer getKey();
 *		public String getValue();
 *}
 */
// �������̽��� ��ӹ޴� ���׸� Ŭ����
class ExtendsGenericClass<K,V> implements GenericInterface<K,V>{
	// �ʵ�
	// K : key��� ������ Ÿ���� ����
	private K key;
	// V : value��� ������ Ÿ���� ����
	private V value;
	//		>> Ÿ���� �����Ǵ� ���� : ��ü�� �����Ǵ� �������� �з��� ��
	// ������
	public ExtendsGenericClass(K key, V value) {
		this.key = key;
		this.value = value;
	}
	@Override
	public K getKey() {
		return this.key;
	}
	@Override
	public V getValue() {
		return this.value;
	}
}

public class Exam0101 {

	public static void main(String[] args) {
		
		ExtendsGenericClass<Integer, String> ex
			= new ExtendsGenericClass<Integer, String>(1, "�質��");
		
		System.out.println(" Key : " + ex.getKey());
		System.out.println(" Value : " + ex.getValue());

	}

}
