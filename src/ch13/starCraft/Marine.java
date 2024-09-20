package ch13.starCraft;

public class Marine extends TerranUnit{
	// 상속 - 자식클래스는 부모클래스의 생성자를 받아와야 함
	public Marine(String name, int hp) {
		// 부모클래스는 가리키고 있음 : 부모클래스의 생성자
		super(name, hp);
	}
}
