package ch06.access.b;

import java.util.Arrays;

import ch06.access.a.AccessData;

public class AccessOuter {

	public static void main(String[] args) {
		
		// 패키지의 위치(경로)를 확인(***)
		// 다른 패키지 내 클래스를 호출
		AccessData data = new AccessData();
		
		// public 호출 가능
		data.publicField = 1;
		data.publicMethod();
		
		// 같은 패키지 protected 호출
		// is not visble - error : 접근불가
		//data.protectedField = 2;
		//data.protectedMethod();
		
		// 같은 패키지 default 호출
		// is not visble - error : 접근불가
		//data.defaultField = 3;
		//data.defaultMethod();
		
		// private 호출
		// is not visible - error : 접근불가
		//data.privateField = 4;
		//data.privateMethod();
		
		// innerAccess() : public
		data.innerAcces();
		
		// Arrays 기본(표준)라이브러리
		// 배열과 관련된 기능을 제공해주는 유틸리티
		int[] arr = {5, 6, 1, 10 , 0};
		System.out.println(arr);
		
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		

	}

}
