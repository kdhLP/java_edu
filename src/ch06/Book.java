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
		System.out.println("책 이름 : " + this.title);
		System.out.println("작가 명 : " + this.author);
		System.out.println("책 가격 : " + this.price + "원");
		System.out.println("페이지 수 : " + this.pages + "p");
		
	}

}