package ch07;


// 상속 - super
// super :: 부모클래스
// this :: 자식클래스(자신)
// super() 생성자 : 자식클래스의 생성자에서 부모 클래스의 생성자를 반드시 호출
//		-> 기본 생성자는 생략이 가능
public class Exam0101 extends ParentExam0101 {
	public Exam0101() {
		// 부모 클래스의 생성자 -> 기본 클래스가 아님 -> 반드시 호출
		super(10);
		System.out.println("콘크리트 클래스의 생성자");
	}
	public void setPrintNumber() {
		System.out.println("super.number = " + super.number);
		System.out.println("number = " + number);
		number = 100;
		System.out.println("number 값을 변환 :: number = 100;" );
		System.out.println("super.number = " + super.number);
		System.out.println("number = " + number);
	}
	public static void main(String[] args) {
		// 콘크리트 클래스(상속을 받는 마지막 클래스)의 객체생성
		Exam0101 superTest = new Exam0101();
		// number 필드의 값과 소유권을 확인하기 위해서
		superTest.setPrintNumber();
		
		Exam010102 superTestVS = new Exam010102();
		superTestVS.setPrintNumber();
		
		superTest.setPrintNumber();
	}
}
class Exam010102 extends ParentExam0101{
	public Exam010102() {
		super(50);
	}
	public void setPrintNumber() {
		System.out.println("super.number = " + super.number);
		System.out.println("number = " + number);
		number = 1000;
		System.out.println("number 값을 변환 :: number = 1000;" );
		System.out.println("super.number = " + super.number);
		System.out.println("number = " + number);
	}
}

class ParentExam0101 extends GrandParentExam0101 {
	public ParentExam0101(int a) {
		// 최상위 클래스의 생성자가 기본 생성자의 형태를 띠고 있기 때문에 생략 가능
		// super();
		System.out.println("두번째 부모 클래스의 생성자");
		System.out.println("생성자 파라미터 a의 값 " + a);
	}
}
class GrandParentExam0101{
	int number = 20;
	public GrandParentExam0101() {
		System.out.println("최상위 부모 클래스의 생성자");
	}
}


