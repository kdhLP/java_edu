package ch07;

public class Exam01Final {

	private static final int[] no = null;
	public static void main(String[] args) {
		
		// 변수
		/*
		 * 
		 * 기본형(Primitive Type) :: 하나의 값을 여러 변수에서 절대로 공유하지 않음
		 * 		- byte, short, int, long, char, boolean, float, double
		 * 		ex) int number = 10;
		 * 			int number02 = number;
		 * 참조형(Reference Type) :: 하나의 객체를 참조값을 통해 여러 변수에서 공유
		 * 		-배열, 클래스,... 등 객체(인스턴스)
		 * 		ex) String str = "Hello World!";
		 * 
		 *** null / "" >> 구분이 되어야 함
		 * java는 기본적으로 아무것도 없는 값을 가지는 변수를 사용할 수 없음.
		 * 	:: 아무런 값도 가지지 않는 변수를 사용하게 되면 오류가 나타남 (NullPointException)
		 * 
		 */
		// 상수 : final 키워드 - 마지막, 끝
		/*
		 * 1. final 키워드는 class, method를 포함한 여러곳에 붙일 수 있음.
		 * 2. 지역변수에 설정할 경우, 최초 한번만 가능함.
		 * 3. 매개변수에 final 키워드를 붙여 더는 값을 변경할 수 없는 상태로 만듬.
		 */
		// 변수에 final 키워드를 붙여 더는 값을 변경할 수 없는 상태로 만듬
		// 지역 변수
		final int number = 10;
		/*
		number = 20; 
		number = 100;
		number += 100;
		*/
		
		String printStr = "Hello World!";
		printStr = "Hello~ world~!";
		printData(printStr);
		
		System.out.println(no);
		System.out.println(OtherNameFinal00.no);
		
		changeReference();
		
	}
	// 메소드의 매개변수(파라미터/인자/인수)는 해당 메소드 안에서 사용이 가능한 지역 변수
	public static void printData(final String str) {
		// str 변경 불가
	}
	
	// 필드(맴버변수 - 클래스 변수/인스턴스 변수)
	// 필드에 값을 대입(초기화)하는 방법 01.
	static final int fieldNumber = 0;
	// 값이 정해지지 않은 final field(변수)인 경우, 생성자를 통해서 한번만 초기화 가능
	final int fieldNo;
	
	// 필드에 값을 대입(초기화)하는 방법 02. 생성자를 통해서
	public Exam01Final() {
		this.fieldNo = 10;
	}
	public Exam01Final(int fieldNo){
		this.fieldNo = fieldNo;
	}
	
	// Static final : 상수(Constant) - 변하지 않고 항상 일정한 값을 갖는 수
	/*	선언과 동시에 초기화를 반드시 필요로 함
	 * 	- 기능이 아니라 고정된 값 자체를 사용하는 것이 목적
	 * 	- 상수는 값을 변경할 수 없음. 필드에 직접 접근해도 데이터가 변하지 않음
	 * 	- 상수는 public 자주 사용 : 프로그램(서비스/어플리케이션) 전반적으로 사용되기 때문
	 * 	- 중앙에서 값을 하나로 관리 할 수 있음
	 * 	- 상수는 런타임(실행되고 있는 도중)에 값을 변경할 수 없음
	 * 	- 상수의 값을 변경하고자 한다면, 소스코드에서 값을 변경하고 프로그램을 재실행 
	 */
	// 자바에서는 보통 단 하나만 존재하는 변하지 않는 고정된 값
	// 낙타 표기법의 예외로 표기 : 전부 대문자에 띄어쓰기는 언더바(_)를 사용
	static final int FIEID_NUMBER = 0;
	
	public static final double PIE = 3.14;
	public static final int HOURS_IN_DAY = 24;
	public static final int MINUTES_IN_HOUR = 60;
	public static final int SECOUNDS_IN_MINUTE = 60;
	// 프로그램 상 필요한 상수
	public static final String THIS_PROJECT_NAME = "프로젝트 이름";
	
	// 참조형 변수 + final
	/*
	 * 1. 참조형 변수는 객체를 값으로 가지는게 아니라, 객체의 주소값을 값으로 가짐
	 * 2. 참조형 변수에 final 키워드를 사용하면, 참조하는 객체를 바꾸지 못한다는 의미를 가짐
	 * 2-1. 참조하는 객체를 변경하지 못한다는 의미일 뿐, 객체안의 값을 변경하지 못한다는 의미는 아님
	 * 2-2. final  참조형 변수는 객체를 바꾸지 못할 뿐, 객체 안의 값은 변경이 가능함.
	 */
	public static void changeReference() {
		final OtherNameFinal ref = new OtherNameFinal();
		// final 키워드를 사용한 ref 객체는 더이상 다른 객체로 변경할 수 없음
		// ref = new OtherNameFinal00();
		System.out.println(ref.localParam);
		ref.localParam = 100;
		System.out.println(ref.localParam);
	}
	
	// method. class - final
	// 더이상 상속을 시키지 않음
	// method - final : 더 이상 자식클래스가 상속받아 재정의(Overriding)를 하지 못하게 함.
	// class - fianl : 더이상 상속을 시키지 않겠다(부모 클래스가 될 수 없음/최하위 자식 클래스)
	
} // The end. Class

// 다른 클래스에서도 같은 이름의 final 변수를 사용 가능
// static final 변수는 단 하나만 존재
class OtherNameFinal{
	final int finalNumber = 0;
	static final int no = 0;
	public int localParam = 10;
}
// 클래스에서의 final : 더이상 상속시키지 않겠다 (현재 클래스가 최하위 자식클래스가 확정)
final class OtherNameFinal00{
	final int finalNumber = 0;
	static final int no = 1;
	// 자식 클래스에서 상속받아 재정의를 할 수 없는 메소드
	public final void finalMethod() {
		
	}
}
/*
// 상속받은 클래스 (자식클래스)
class OtherFinal extends OtherNameFinal00{
	
	@Override
	public void finalMethod() {	}
}
*/