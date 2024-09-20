package ch13;

// 제네릭 인터페이스
// 복수의 제네릭 타입을 사용
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
// 인터페이스를 상속받는 제네릭 클래스
class ExtendsGenericClass<K,V> implements GenericInterface<K,V>{
	// 필드
	// K : key라는 변수의 타입을 결정
	private K key;
	// V : value라는 변수의 타입을 결정
	private V value;
	//		>> 타입이 결정되는 시점 : 객체가 생성되는 시점으로 밀려날 뿐
	// 생성자
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
			= new ExtendsGenericClass<Integer, String>(1, "김나연");
		
		System.out.println(" Key : " + ex.getKey());
		System.out.println(" Value : " + ex.getValue());

	}

}
