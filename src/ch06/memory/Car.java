package ch06.memory;

public class Car {
	
	/*
	 * 필드(private)
	 * 	1. 자동차의 이름
	 * 	2. 구매된 자동차의 총 개수
	 * 
	 * 	+ getter / setter 메소드는 자유롭게
	 */
	
	private String name;
	private int totalCount;
	
	public Car(String name) {
		this.name = name;
		this.totalCount++;
		this.printTotalCount();
	}
	
	public void printTotalCount() {
		System.out.println(this.name + "차량 구매, 구매 총 대수 : " + this.totalCount);
	}
	
}
