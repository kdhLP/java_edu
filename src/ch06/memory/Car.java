package ch06.memory;

public class Car {
	
	/*
	 * �ʵ�(private)
	 * 	1. �ڵ����� �̸�
	 * 	2. ���ŵ� �ڵ����� �� ����
	 * 
	 * 	+ getter / setter �޼ҵ�� �����Ӱ�
	 */
	
	private String name;
	private int totalCount;
	
	public Car(String name) {
		this.name = name;
		this.totalCount++;
		this.printTotalCount();
	}
	
	public void printTotalCount() {
		System.out.println(this.name + "���� ����, ���� �� ��� : " + this.totalCount);
	}
	
}
