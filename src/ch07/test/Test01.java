package ch07.test;

// 상속을 이용하여 쇼핑몰의 상품 데이터를 출력
/*
 * 1. 아래의 해당하는 클래스를 만드세요
 * 		Book
 * 		Album
 * 		Movie
 * 	 - Book book01 = new Book("혼자 공부하는 자바", 32000, "신용권");
 * 	 - Album album01 = new Album("BTS 미니 1집", 50000, "BTS");
 * 	 - Movie movie01 = new Movie("파묘", 45000, "장재현", "최민식, 유해진");
 * 
 * 	부모 클래스 이름 : Item -> 공통적인 필드(속성), 메소드(기능)
 * 
 * 2. 객체를 생성한 뒤, 필드값을 출력하는 메소드를 만들고, 데이터를 출력
 * 
 */

class Item {
	public String title;
	public int price;

	public Item(String title, int price) {
		this.title = title;
		this.price = price;
	}
		
	public void printData() {
		System.out.println("제목 : " + title);
		System.out.println("가격 : " + price);
	}

}

class Book extends Item {

	String artist;
	public Book(String bTitle, int bPrice, String bArtist) {
		super(bTitle, bPrice);
		this.artist = bArtist;
	}
	@Override
	public void printData() {
		super.printData();
		System.out.println("저자 : " + artist);
	}

}

class Album extends Item {
	String artist;
	public Album(String aTitle, int aPrice, String aArtist) {
		super(aTitle, aPrice);
		this.artist = aArtist;
	}

	@Override
	public void printData() {
		super.printData();
		System.out.println("작사 : " + artist);
	}
}

class Movie extends Item {
	public String artist;
	public String actor;

	public Movie(String mTitle, int mPrice, String mArtist, String mActor) {
		super(mTitle, mPrice);
		this.artist = mArtist;
		this.actor = mActor;
	}

	@Override
	public void printData() {
		super.printData();
		System.out.println("감독 : " + artist);
		System.out.println("배우 : " + this.actor);
	}
}

public class Test01 {

	public static void main(String[] args) {
		Book book01 = new Book("혼자 공부하는 자바", 32000, "신용권");
		Album album01 = new Album("BTS 미니 1집", 50000, "BTS");
		Movie movie01 = new Movie("파묘", 45000, "장재현", "최민식, 유해진");
		
		
		System.out.println("======================");
		book01.printData();
		System.out.println("======================");
		album01.printData();
		System.out.println("======================");
		movie01.printData();
		
	}
}

/*
 * class Item { private String title; private int price; private String artist;
 * 
 * public String getTitle() { return title; } public void setTitle(String title)
 * { this.title = title; } public int getPrice() { return price; } public void
 * setPrice(int price) { this.price = price; } public String getArtist() {
 * return artist; } public void setArtist(String artist) { this.artist = artist;
 * }
 * 
 * 
 * 
 * }
 * 
 * class Book extends Item {
 * 
 * public Book(String bTitle, int bPrice, String bArtist) {
 * super.setTitle(bTitle); super.setPrice(bPrice); super.setArtist(bArtist); }
 * 
 * public void PrintBook() { System.out.println("책 제목 : " + getTitle());
 * System.out.println("책 가격 : " + getPrice()); System.out.println("책 저자 : " +
 * getArtist()); }
 * 
 * 
 * }
 * 
 * class Album extends Item{
 * 
 * public Album(String aTitle, int aPrice, String aArtist) {
 * super.setTitle(aTitle); super.setPrice(aPrice); super.setArtist(aArtist); }
 * public void PrintAlbum() { System.out.println("앨범 제목 : " + getTitle());
 * System.out.println("앨범 가격 : " + getPrice()); System.out.println("앨범 저자 : " +
 * getArtist()); } }
 * 
 * class Movie extends Item{ private String actor;
 * 
 * 
 * public Movie(String mTitle, int mPrice, String mArtist, String mActor) {
 * super.setTitle(mTitle); super.setPrice(mPrice); super.setArtist(mArtist);
 * this.actor = mActor; } public void PrintMovie() {
 * System.out.println("영화 제목 : " + getTitle()); System.out.println("영화 가격 : " +
 * getPrice()); System.out.println("영화 감독 : " + getArtist());
 * System.out.println("영화 배우 : " + this.actor); } }
 * 
 * public class Test01 {
 * 
 * public static void main(String[] args) { Book book01 = new Book("혼자 공부하는 자바",
 * 32000, "신용권"); Album album01 = new Album("BTS 미니 1집", 50000, "BTS"); Movie
 * movie01 = new Movie("파묘", 45000, "장재현", "최민식, 유해진" );
 * 
 * book01.PrintBook(); System.out.println("=============================");
 * album01.PrintAlbum(); System.out.println("=============================");
 * movie01.PrintMovie();
 * 
 * }
 * 
 * 
 * 
 * }
 */
