package ch07.test;

// ����� �̿��Ͽ� ���θ��� ��ǰ �����͸� ���
/*
 * 1. �Ʒ��� �ش��ϴ� Ŭ������ ���弼��
 * 		Book
 * 		Album
 * 		Movie
 * 	 - Book book01 = new Book("ȥ�� �����ϴ� �ڹ�", 32000, "�ſ��");
 * 	 - Album album01 = new Album("BTS �̴� 1��", 50000, "BTS");
 * 	 - Movie movie01 = new Movie("�Ĺ�", 45000, "������", "�ֹν�, ������");
 * 
 * 	�θ� Ŭ���� �̸� : Item -> �������� �ʵ�(�Ӽ�), �޼ҵ�(���)
 * 
 * 2. ��ü�� ������ ��, �ʵ尪�� ����ϴ� �޼ҵ带 �����, �����͸� ���
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
		System.out.println("���� : " + title);
		System.out.println("���� : " + price);
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
		System.out.println("���� : " + artist);
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
		System.out.println("�ۻ� : " + artist);
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
		System.out.println("���� : " + artist);
		System.out.println("��� : " + this.actor);
	}
}

public class Test01 {

	public static void main(String[] args) {
		Book book01 = new Book("ȥ�� �����ϴ� �ڹ�", 32000, "�ſ��");
		Album album01 = new Album("BTS �̴� 1��", 50000, "BTS");
		Movie movie01 = new Movie("�Ĺ�", 45000, "������", "�ֹν�, ������");
		
		
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
 * public void PrintBook() { System.out.println("å ���� : " + getTitle());
 * System.out.println("å ���� : " + getPrice()); System.out.println("å ���� : " +
 * getArtist()); }
 * 
 * 
 * }
 * 
 * class Album extends Item{
 * 
 * public Album(String aTitle, int aPrice, String aArtist) {
 * super.setTitle(aTitle); super.setPrice(aPrice); super.setArtist(aArtist); }
 * public void PrintAlbum() { System.out.println("�ٹ� ���� : " + getTitle());
 * System.out.println("�ٹ� ���� : " + getPrice()); System.out.println("�ٹ� ���� : " +
 * getArtist()); } }
 * 
 * class Movie extends Item{ private String actor;
 * 
 * 
 * public Movie(String mTitle, int mPrice, String mArtist, String mActor) {
 * super.setTitle(mTitle); super.setPrice(mPrice); super.setArtist(mArtist);
 * this.actor = mActor; } public void PrintMovie() {
 * System.out.println("��ȭ ���� : " + getTitle()); System.out.println("��ȭ ���� : " +
 * getPrice()); System.out.println("��ȭ ���� : " + getArtist());
 * System.out.println("��ȭ ��� : " + this.actor); } }
 * 
 * public class Test01 {
 * 
 * public static void main(String[] args) { Book book01 = new Book("ȥ�� �����ϴ� �ڹ�",
 * 32000, "�ſ��"); Album album01 = new Album("BTS �̴� 1��", 50000, "BTS"); Movie
 * movie01 = new Movie("�Ĺ�", 45000, "������", "�ֹν�, ������" );
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
