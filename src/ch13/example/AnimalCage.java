package ch13.example;

// ���׸� Ÿ�� �Ű������� ����
// <T> Ÿ�� �Ű������� Animal Ÿ�Ը� ��� : extends Keyword ���
// �����ڰ� ���ϴ� Ÿ�Ը� ���׸� Ÿ������ ��������
public class AnimalCage<T extends Animal> {
	
	private T var;
	
	public void set(T var) {
		this.var = var;
	}
	public T get() {
		return this.var;
	}
}
