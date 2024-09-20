package ch07.test;

import ch07.test.animal.*;

// 동물의 소리를 나타내는 상속 + 다형성 관계의 클래스를 만들어봅시다.
/* 결과
 * 
 * 강아지 울음소리
 * 멍멍
 * 
 * 고양이 울음소리
 * 야옹
 * 
 * 소 울음소리
 * 음메
 * 
 */
public class Test02 {
	
	public static void printSound(String animal, String sound) {
		System.out.println(animal + " 울음소리");
		System.out.println(sound);
	}
	
	public static void main(String[] args) {
		/*
		 * 출력되는 메소드로 만드는 과정 1
		printSound("강아지", "멍멍");
		printSound("고양이", "야옹");
		printSound("소", "음메");
		nina.barkStrangePeople();
		navi.bakeBread();
		nurungee.makeMilk();
		*/
		
		// 울음소리를 출력하는 메소드 이외에
		// 다른 기능, 데이터(속성)들을 추가할 수 있도록 객체로 만듬
		// 변수명은 동적으로 생성할 수 없음 -> 아직까지는 배열(같은 타입만 저장)
		Dog nina = new Dog("니나 터커");
		nina.printSound();
		Cat navi = new Cat("나비");
		navi.printSound();
		Cow nurungee = new Cow("누렁이");
		nurungee.printSound();
		
		//다형성 : 업캐스팅
		Animal[] animals = { (Animal)new Dog("니나 터커"), new Cat("나비"), new Cow("누렁이") };
		for(Animal animal : animals) {
			animal.printSound();
		}
		
		
		
		
		// 동물 -> 강아지-다형성 : 다운 캐스팅
		if(animals[0] instanceof Dog dog) {
			dog.barkStrangePeople();
		}
		if(animals[1] instanceof Cat cat) {
		cat.bakeBread();
		}
		((Cow)animals[2]).makeMilk();
		
	}
	
}






