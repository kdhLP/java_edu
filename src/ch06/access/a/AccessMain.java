package ch06.access.a;

public class AccessMain {

	public static void main(String[] args) {
		
		AccessData data = new AccessData();
		// public 호출 가능
		data.publicField = 1;
		data.publicMethod();
		
		// 같은 패키지 protected 호출
		data.protectedField = 2;
		data.protectedMethod();
		
		// 같은 패키지 default 호출
		data.defaultField = 3;
		data.defaultMethod();
		
		// private 호출
		// is not visible - error : 접근불가
		//data.privateField = 4;
		//data.privateMethod();
		
		// innerAccess() : public
		data.innerAcces();
		
		

	}

}
