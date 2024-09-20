package ch06;

// static
// static 변수, 메소드 ...

/*  // static 일반적인 내용
 * 	1. 프로그램이 실행이 되면서 코드안에 static으로 선언된 모든 변수, 객체들을 미리 불러옵니다.
 * 		-> 객체의 생성없이 호출이 가능한 변수, 메소드, 클래스
 * 	2. 프로그램 상에 단 1개만 존재
 * 
 */
class Temp{
	public String className;
	public static int count = 0;
	Temp(String name){
		this.className = name;
		count++;
	}
}

class Counter {
	public int count = 0;
}

//객체를 생성할 때 마다 생성된 객체의 개수(int count)를 확인.
public class Exam0702 {
	public static void main(String[] args) {
	// 각 객체 안에서 따로 사용되던 count  -> 하나의 객체에서 제어하는 것.
	// ** 관계 없었던 클래스간의 관계가 생김
	// ** 생성자에 매개변수 추가 -> 복잡 / 생성자 호출 복잡
	Temp temp01 = new Temp("A");
	System.out.println("A count : " +temp01.count);
	Temp temp02 = new Temp("B");
	System.out.println("B count : " + temp02.count);
	Temp temp03 = new Temp("C");
	System.out.println("C count : " + temp03.count);
	
	}
}
