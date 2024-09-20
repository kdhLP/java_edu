package ch07.test.animal;

public class Animal {
	protected String category;
	protected String name;
	protected String sound;
	
	public Animal(String category, String sound ){
		this.category = category;
		this.sound = sound;
	}
	
	public void printSound() {
		System.out.println(this.category + "["+ this.name +"]의 울음소리");
		System.out.println(this.sound);
	}

	// 자식클래스에서 상속받아 재정의가 반드시 필요한 메소드입니다.
	public void setSound() {}
	
}
