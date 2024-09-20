package ch08.service;

public abstract class User {
	
	public String name = "홍길동";
	public int height = 0;
	
	public String getname() {
		return this.name;
	}
	
	public void printName() {
		System.out.println("User의 이름 : " + this.name);
	}
}
