package ch06;

public class Book {

	String title;
	String author;
	int price;
	int pages;

	public Book() {
		
	}
	
	public Book(String title, String author, int price, int pages) {

		this.title = title;
		this.author = author;
		this.price = price;
		this.pages = pages;

	}

	public void printAttribute() {
		System.out.println("å �̸� : " + this.title);
		System.out.println("�۰� �� : " + this.author);
		System.out.println("å ���� : " + this.price + "��");
		System.out.println("������ �� : " + this.pages + "p");
		
	}

}