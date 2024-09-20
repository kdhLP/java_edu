package ch13.example;

// 접근 제어자 : public > protected > default > private
public class Animal {
	
	private String name;
	private int height;
	private int weight;
	
	public Animal(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public String getName() {
		return this.name;
	}
	public int getHeight() {
		return this.height;
	}
	public int getWeight() {
		return this.weight;
	}
	
}
