package ch08;

import ch07.test.animal.Animal;
import ch08.animal.AbstractAnimal;
import ch08.animal.Dog;

// 추상클래스
/*
 * 객체(Object) : 실제로 구현(생성)할 수 있는 클래스
 * 		-> 실제로 구현(생성)을 할 수 없는 클래스가 존재 : 추상클래스
 * //추상클래스
 * 	 - 추상적인 개념을 제공하는 클래스
 * 	 - 실체인 인스턴스가 존재하지 않음 (객체생성이 되지 않음)
 * 	 - 상속을 목적으로 사용(부모클래스의 역할)
 * 
 * 추상적인 개념의 특징
 * 	1. 개념(정의) 존재 -> 형태 없음
 * 
 * 추상화 keyword : abstract / interface
 * 	 - abstract는 실무에서 자주 사용하지 않음 / 90% - interface를 사용함
 * 
 */
public class Exam01 {

	public static void main(String[] args) {
		
		// 동물(추싱적인 개념) -> 생성(인스턴스)가 되면 안됨
		//Animal animal = new Animal("고양이", "야옹");
		// 추상클래스 : 객체의 생성이 되지 않음
		// 컴파일 에러 : 추상클래스는 인스턴스(객체생성)가 되지 않습니다.
		//AbstractAnimal animal = new AbstractAnimal();
		
		Dog bbobbi = new Dog();
		bbobbi.move();
		bbobbi.eat("사료");
		bbobbi.sound();
		
	}

}
