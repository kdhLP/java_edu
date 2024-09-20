package ch07;

class ParentClass{
	public ParentClass() {
		System.out.println("부모 클래스의 생성자 실행");
	}
	void ParentMethod() {
		System.out.println("부모 클래스의 메소드 실행");
	}
}
class ChildClass extends ParentClass{
	public ChildClass() {
		//super();
		System.out.println("자식 클래스의 생성자 실행");
	}
	void childMethod() {
		System.out.println("자식 클래스의 메소드 실행");
	}
}

// 업캐스팅 : 자식클래스 -> 부모클래스의 타입을 따르는 것
// 다운캐스팅 : 부모클래스 -> 자식클래스의 타입을 따르는 것
//			- 가능한 경우 || 불가능한 경우
//			- 다운캐스팅은 되도록 사용하지 않도록 권유 : 필수적으로 다운 캐스팅을 사용하는 경우
// ...
public class Exam0201 {

	public static void main(String[] args) {
		
		// 1. 부모 타입의 자식 클래스를 생성 
		// (업캐스팅 : 자식클래스의 객체를 생성하지만, 변수의 참조하는 타입 : 부모클래스)
		ParentClass parent01 = new ChildClass();
		// 다운 캐스팅(명시적 형변환)
		//instanceof -> 타입 비교와 동시에 다운캐스팅을 한 변수를 선언 
		if(parent01 instanceof ChildClass child01) {
			System.out.println("ChildClass가 있습니다");
			// 다운 캐스팅
			//ChildClass child01 = (ChildClass) parent01;
			child01.childMethod();
		} else {
			System.out.println("ChildClass가 없습니다.");
		}
		
		System.out.println("+++++++++++++++++++");
		
		// 2. 부모타입의 부모클래스를 생성
		// 부모클래스의 정보만 메모리에 올라가 있는 상태
		// (상속) 객체가 생성할 때, 부모클래스의 정보가 있으면 모든 상위클래스의 정보를 메모리해 다 담고있음
		// -> 객체를 생성할 때, 자식클래스가 존재하더라도 자식클래스의 정보는 메모리에 들고가지 않음
		ParentClass parent02 = new ParentClass();
		// 다운캐스팅 : ClassCastException 발생
		// 메모리에 자식클래스의 정보가 없기 때문에 에러를 발생
		if (parent02 instanceof ChildClass) {
			System.out.println("parent02 객체에는 ChildClass의 정보가 있습니다.");
			ChildClass child02 = (ChildClass) parent02;
			child02.childMethod();
		}else {
				System.out.println("parent02 객체에는 ChildClass의 정보가 없습니다.");
			}
		
		// 코드를 작성할 때, 빨간색 줄 -> 컴파일(.java -> .class) 오류
		// .class 파일이 만들어지는 시점 : 파일을 작성, 수정, 등의 작업을 진행하고, 저장하는 순간
		// 실행이 되면서 오류(에러)가 발생되는 것 : 런타임 오류(에러)
		
		// 다운캐스팅은 잘못하면 심각한 런타임 오류(캐스팅을 할 수 없는)
		// instanceof 키워드 : 인스턴스의 타입을 확인
		// {참조 변수명} instanceof {확인할 객체 타입} - this:35
		
	}

}
