package ch06;

class Heap {
	private int number;
	Heap(){
		
	}
	
	Heap(int number){
		this.number = number;
	}
	
	public int getNumber() {
		return this.number;
	}
}

// Memory : stack + heap
public class Exam0701 {
	
	public static void main(String[] args) {
		
		System.out.println("main start");
		method01();
		System.out.println("main end");
	}
	
	public static void method01() {
		System.out.println("method01 start");
		Heap mmr = new Heap(10);
		// mmr ��ü�� �Ķ���ͷ� �ѱ�� ���� �ƴ�, mmr�� ��� �ּҰ��� �Ķ����(�Ű�����)�� �ѱ�
		method02(mmr);
		System.out.println("method01 end");
	}
	
	public static void method02(Heap memory) {
		System.out.println("method02 start");
		System.out.println("Heap ��ü�� number �ʵ� �� : " + memory.getNumber());
		System.out.println("method02 end");
	}
	
}
