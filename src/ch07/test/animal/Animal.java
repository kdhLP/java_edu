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
		System.out.println(this.category + "["+ this.name +"]�� �����Ҹ�");
		System.out.println(this.sound);
	}

	// �ڽ�Ŭ�������� ��ӹ޾� �����ǰ� �ݵ�� �ʿ��� �޼ҵ��Դϴ�.
	public void setSound() {}
	
}
