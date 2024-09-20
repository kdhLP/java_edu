package ch13.example;

public class AnimalMain {
	
	/*
	 * 1. ��Ӱ��迡 �ִ� �Ű�Ÿ��(����)
	 * 2. Interface�� ����ϴ� GenericAnimal Ŭ������ �ۼ�
	 */
	
	public static void main(String[] args) {
		
		Animal animal = new Animal("�⸰", 850, 150);
		Dog dog = new Dog("�ǻ�", 45, 12);
		Cat cat = new Cat("����", 50, 15);
		// ��ü�� ���� �� �ִ� ���׸� Ŭ����
		AnimalCage<Animal> animalCage = new AnimalCage<Animal>();
		
		AnimalCage<Dog> dogCage = new AnimalCage<Dog>();
		dogCage.set(dog);
		Dog outDog = dogCage.get();
		System.out.println("findDog = " + dogCage);
		
		AnimalCage<Cat> catCage = new AnimalCage<Cat>();
		
		// ���׸� Ÿ�Կ� ���� �ۼ����� �ڵ� �̿ܿ� �ٸ� ���� Ÿ���� ������ ����
		// ���׸� Ÿ�� �Ű������� ���� : ����
		/*
		AnimalCage<Integer> numberCage = new AnimalCage<Integer>();
		AnimalCage<String> strCage = new AnimalCage<String>();
		AnimalCage<ch11.exam01> classsCage = new AnimalCage<ch11.exam01>();
		*/
	}

}
