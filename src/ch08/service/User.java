package ch08.service;

public abstract class User {
	
	public String name = "ȫ�浿";
	public int height = 0;
	
	public String getname() {
		return this.name;
	}
	
	public void printName() {
		System.out.println("User�� �̸� : " + this.name);
	}
}
