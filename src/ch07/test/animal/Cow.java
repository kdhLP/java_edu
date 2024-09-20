package ch07.test.animal;

public class Cow extends Animal{
	/*
	private String category = "소";
	private String name;
	private String sound = "음메";
	*/
	public Cow(String name) {
		super("소", "음메");
		this.name = name;
	}
	
	
	public void makeMilk() {
		
	}
	public void makeBeef() {
		
	}
}
