package ch13.example;

public class AnimalMain {
	
	/*
	 * 1. 상속관계에 있는 매개타입(제한)
	 * 2. Interface를 사용하는 GenericAnimal 클래스를 작성
	 */
	
	public static void main(String[] args) {
		
		Animal animal = new Animal("기린", 850, 150);
		Dog dog = new Dog("뽀삐", 45, 12);
		Cat cat = new Cat("나비", 50, 15);
		// 객체를 담을 수 있는 제네릭 클래스
		AnimalCage<Animal> animalCage = new AnimalCage<Animal>();
		
		AnimalCage<Dog> dogCage = new AnimalCage<Dog>();
		dogCage.set(dog);
		Dog outDog = dogCage.get();
		System.out.println("findDog = " + dogCage);
		
		AnimalCage<Cat> catCage = new AnimalCage<Cat>();
		
		// 제네릭 타입에 내가 작성중인 코드 이외에 다른 몯ㄴ 타입이 설정이 가능
		// 제네릭 타입 매개변수의 제한 : 동물
		/*
		AnimalCage<Integer> numberCage = new AnimalCage<Integer>();
		AnimalCage<String> strCage = new AnimalCage<String>();
		AnimalCage<ch11.exam01> classsCage = new AnimalCage<ch11.exam01>();
		*/
	}

}
