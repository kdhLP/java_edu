//주석 : 컴퓨터가 번역하지 않는 소스 (개발자간 의사소통을 위한 문구)
//writer : 
//작성자 : 
//Hello World 문자열 출력 기능
//한 줄 주석
/* 전체 
       주석 */
//패키지(Package) : 클래스의 집합 - 특정한 기능/구조/주제 
//패키지 대소문자를 구분하진 않지만, 소문자로 이름을 짓는 것을 추천
package ch00;

//클래스(Class)
// - 구조상 필드(Field)와 메소드(Method)로 이루어진 설계도(틀)
// - 건축 현장에서 만들고 있는 건축물(인스턴스)
// - 건축물을 만들기 위해 기초가 되는 설계도(클래스)
// * 명명 규칙 : 첫글자는 대문자(필수사항), 두 단어 이상 합쳐진 경우 _(언더바)로 표시하거나,
//					혹은 두 번째 단어의 첫글자를 대문자로 표시.

/*자바에서 (일반적인 관습에 따라) 이름을 만들 때, CamelCase(낙타표기법)을 따름.
 * 		-패키지 : 전부 소문자로 표시 (낙타 표기법을 따르지 않음)
 * 		-상수 : 모두가 대문자로 표시 (낙타 표기법을 따르지 않음 / _(언더바) 사용)
 * 				ex) final double PIE_RATE = 314.1592;
 * 		-클래스 : 첫 단어의 첫 글자를 대문자로 표시 
 * 		-나머지 경우(변수, 메서드) : 낙타 표기법을 따름 / 소문자로 시작
 * */
public class HelloWorld {
	//필드(Field) : 클래스의 속성
	//변수(Field) 선언 및 초기화
	
	int a = 10;
	int c = 10;
	
	//메소드(Method) : 클래스의 기능
	//main method : 해당 프로젝트의 시작함수 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//변수(Field) 선언 및 초기화
		int b = 10;
		int d = 10;
		
		//Console에 데이터를 출력한 뒤, 줄바꿈까지 처리하는 method
		System.out.println( " Hello, World! " );
		
		//데이터를 출력하는 method.02
		/* %s : String (문자열)
		 * %c : char (문자형)
		 * %d : decimal (정수형)
		 * %b : boolean (참/거짓, 논리형)
		 * %f : float (실수형 - 소수형)
		 */
		System.out.printf(" Hello, %s ", "World!");
		System.out.println();
		System.out.printf(" Hello, %c ", 'a');
		System.out.println();
		System.out.printf(" Hello, %d ", 123);
		System.out.println();
		System.out.printf(" Hello, %f ", 123.4f);
		System.out.println();
		System.out.printf(" Hello, %b ", true);
		System.out.println();
		
		
	}
	
	//method 2개 이상 선언 가능
	public int generalMethod() {
		return 10;
	}

}
