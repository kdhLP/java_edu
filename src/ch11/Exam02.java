package ch11;

import java.util.Arrays;

// String Class
// 자바에서 다루는 대표적인 2자지 티입 : char, String
/*
 * char = '{홑 따옴표: 문자}'
 * String = " {쌍따옴표:문자열} " 
 */

public class Exam02 {
	public static void main(String[] args) {
		char[] charArr = new char[] { 'h', 'e', 'l', 'l', 'o'};
		// 사용방법 1
		String str = "hello";
		// 사용방법 2. String pool
		String str2 = new String( "hello" );
		
		System.out.println(charArr);
		System.out.println(str);
		System.out.println(str2);
		
		// 1. 비교 : == (같다)가 아닌 equals() 사용
		/*
		 * ==		/ 동일성(Identity) - 완전히 일치하는지(값, 타입...)
		 * equals()	/ 동등성(Equality) - 논리적으로 일치하는지
		 * 
		 * 해당 변수가 가지는 값은 주소를 가지고 있기 때문에 ==을 사용하게 되면 false 반환
		 */
		String str01 = new String("hello");
		// str011 변수에 str01이 가지고 있는 값을 복사 : 주소값을 복사
		String str011 = str01;
		String str02 = new String("hello");
		System.out.println("객체생성을 통한 값을 비교 =: " + (str01 == str02) );
		System.out.println("객체생성을 통한 값을 비교 equals(): " + (str01.equals(str02)) );
		System.out.println("========================================");
		
		// 문자열 리터럴을 사용하면 문자열 풀(String pool)에 저장
		// 문자열 풀에 이미 저장이 된 문자열인 경우, 해당주소를 반환
		/*
		 * 문자열 풀(String pool)
		 * 	- pool : 지원이 모여 있는 곳, 공용자원을 모아둔 곳(메모리-Heap 메모리)
		 * 	- 같은 문자를 사용하는 경우, 메모리 사용을 줄이고, 문자를 만드는 시간도 줄임
		 * 	- 성능 최적화, 높은 효울을 기대할 수 있음
		 */
		String str03 = "hello";		
		String str04 = "hello";		
		System.out.println("리터럴 비교 = : " + (str03 == str04) );
		System.out.println("리터럴 비교 equals(): " + (str03.equals(str04)) );
		System.out.println("========================================");
		
		// 없다면 새로운 주소에 저장을 하고 그 주소를 반환
		str04 = "Hello";
		System.out.println("리터럴 비교 = : " + (str03 == str04) );
		System.out.println("리터럴 비교 equals(): " + (str03.equals(str04)) );
		System.out.println("========================================");
		
		/*
		 * 주요 메소드
		 * 1. 문자열 정보 조회
		 * 	 - length()	 : 문자열의 길이를 반환
		 * 	 - isEmpty() : 문자열이 비어있는지 호가인(길이가 0)
		 * 	 - isBlank() : 문자열이 비어있는지 확인 (길이:0 / whitespace)
		 * 	 - charAt(int index) :순번(index) 위치에 있는 문자(char) 반환  
		 */
		
		String str05 = "Hello~ World";
		System.out.println("문자열의 길이 : " + str05.length());
		System.out.println("문자열의 빈값 : " + str05.isEmpty());
		System.out.println("문자열의 빈값 : " + str05.isBlank());
		System.out.println("문자열의 빈값 : " + "  ".isBlank());
		System.out.println("n번째 자리의 문자 : " + str05.charAt(4));
		System.out.println("========================================");
		
		/*
		 * 2. 문자열 비교
		 * 	 - equals()
		 * 	 - equalsIgnoreCase(String str) : 대소문자를 구분하지않고 문자열을 비교
		 * 	 - startWith(String prefix) : 문자열이 접두사로 시작하는지 확인
		 * 	 - endWith(String suffix) : 문자열이 접미사로 끝나는지 확인
		 */
		String str06 = " Hello, World ";
		System.out.println(str06.equals(str05));
		System.out.println(str06.equalsIgnoreCase(str05));
		System.out.println(str06.startsWith("Hello"));
		System.out.println(str06.endsWith("world"));
		System.out.println("========================================");
		
		/*
		 * 3. 문자열 검색
		 * 	 - contains(CharSequence s) : 특정 문자열을 포함하고 있는지 확인
		 * 	 - indexOf(String sch)
		 * 		/ indexOf(String sch, int formIndex)
		 * 			: 문자열이 처음 등장하는 위치(숫자)를 반환
		 * 	 - lastIndexOf(String sch) : 문자열이 마지막으로 등장하는 위치를 반환
		 * 
		 */
		String str07 = "Hello~ world!!!";
		System.out.println("문자열 검색 : " +str07.contains("Hello"));
		System.out.println("문자열 검색 : " + str07.contains("Hello,"));
		System.out.println("문자열 첫 자리수 검색 : " + str07.indexOf("world"));
		System.out.println("문자열 첫 자리수 검색 : " + str07.indexOf("world", 9));
		System.out.println("문자열 마지막 자리수 : " + str07.lastIndexOf("!!!"));
		System.out.println("========================================");
		
		/*
		 * 문자열 치환(조작 및 변환)
		 * 	 - substring(int beginIndex)
		 * 		/ substring(int beginIndex, int endIndex)
		 * 			: beginIndex부터 (endIndex 까지) 문자열 자르기
		 * 	 - concat(String str) : 문자열 합치기
		 * 	 - replace(CharSequence regex, String replacement)
		 * 		: (처음 검색되는 단어 하나만 치환)
		 * 		  regex(검색어, 정규식)를 replacement(바꿀단어)로 치환
		 * 	 - replaceAll(CharSeqeuence regex, String replacement)
		 * 		: regex(검색어, 정규식)를 replacement(바꿀단어)로 치환
		 * 	 - trim() : 문자열 앞뒤의 빈 공백을 지웁니다.
		 * 	 - toLowerCase() / toUpperCase()
		 * 			: 문자열을 소문자 / 대문자로 치환
		 */
		
		String str08 = "Hello, World! Welcome to Java!";
		System.out.println(" 문자열 자르기 : " + str08.substring(7));
		System.out.println(" 문자열 자르기 : " + str08.substring(7, 12));
		System.out.println(" 문자열 합치기 : " + str08.concat("!!!!"));
		System.out.println(" 문자열 치환(대체) : " + str08.replace("Java", "Programming"));
		System.out.println(" 문자열 전체 치환 : " + str08.replaceAll("!", "~"));
		System.out.println(" 앞뒤 공백 제거 : " + ("  "+ str08 + "  ").trim());
		System.out.println(" 소문자 치환 : " + str08.toLowerCase());
		System.out.println(" 대문자 치환 : " + str08.toUpperCase());
		
		System.out.println(" 전체 공백 제거 : " + str08.replaceAll(" ", ""));
		System.out.println("========================================");
		
		/*
		 * 5. 문자열 분할 및 조합
		 * 	 - split(String regex) : 문자열을 기준 문자열(패턴)으로 분할, 배열의 형태로 반환
		 * 	 - join(CharSequence delimiter, CharSequence...elements)
		 * 		: 구분자(delimiter)로 여러 문자열을 결합
		 * 		// 가변 인자(인수) - 매개변수를 표시하는 소괄호() 안에 ... 
		 * 			: 개수를 정하지 않은 n개의 파라미터를 선언 가능, 동적으로 매개변수를 선언 가능
		 */
		String str09 = " Apple, Banana, Cherry, Dragon Fruit, Grape, Lemon, Melon, Pear ";
		
		String[] str09Arr = str09.split(",");
		System.out.println("문자열 분할 : " + Arrays.toString(str09Arr));
		System.out.println("문자열 비교 : " + str09Arr[0].trim().equals("Apple"));
		
		
		String str10 = String.join(" , ", "A", "B","C","D","E","F","G");
		System.out.println("합친문자열 : " + str10);
		System.out.println("========================================");
		
		/*
		 * 6. 기타
		 * 	 - valueOf(Object obj) : 다양한 타입을 문자열로 변경
		 * 	 - toCharArray() : 문자열을 배열로 변경
		 * 	 - format(String format, Object... args)
		 * 		: 형식 문자열과 인자를 사용하여 새로운 문자열을 생성
		 * 	 - matches(String regex) : 문자열이 주어진 정규식과 일치하는 확인
		 */
		
		String str11 = "Hello, World!!!";
		int num01 = 100;
		double num02 = 3.14;
		boolean flag = false;
		
		System.out.println(" 정수 > 문자열 : " + String.valueOf(num01));
		System.out.println(" 실수 > 문자열 : " + String.valueOf(num02));
		System.out.println(" 논리 > 문자열 : " + String.valueOf(flag));
		
		char[] str11Arr = str11.toCharArray();
		System.out.println(Arrays.toString(str11Arr));
		System.out.println("========================================");
		
		/* %s : String (문자열)
		 * %c : char (문자)
		 * %d : decimal (정수형)
		 * %b : boolean (참/거짓, 논리형)
		 * %f : float (실수형-소수형)
		 * 
		 * .format()
		 * cf) System.out.printf
		 */
		String str12 = String.format("안내문구 : %s / 참석최대인원 : %d명" ,str11, num01);
		System.out.println(str12);
		
		// DB에서 조회하여 가지고 온 데이터
		String[][] arrData = {
				{ "STU202407220001", "김나연", "여", "010-1111-1111" },
				{ "STU202407220002", "김도형", "남", "010-2222-2222" },
				{ "STU202407220003", "박세혁", "남", "010-3333-3333" },
				{ "STU202407220004", "양주영", "남", "010-4444-s123" },
		};
		String information = "안녕하세요. %s 훈련생 \n"
				+ "저희 학원을 방문해주셔서 감사합니다. \n"
				+ "%s 훈련생님의 남겨주신 연락처는 %s로 확인되어 연락드립니다. \n";
		for( String[] row : arrData ) {
			System.out.println(String.format(information, row[1], row[1], row[3]));
		}
		System.out.println("========================================");
		
		// 날짜
		String todayDate = "2024-08-29";
		String[] todayDateArr = todayDate.split("-");
		System.out.println(String.format("오늘의 날짜 : %d년 %d월 %d일"
									, Integer.parseInt(todayDateArr[0])
									, Integer.parseInt(todayDateArr[1])
									, Integer.parseInt(todayDateArr[2])));
		
		int[] nowDate = { 2024, 8, 29 };
		System.out.println(String.format("오늘의 날짜 : %d년 %d월 %d일"
							, nowDate[0], nowDate[1], nowDate[2]));
		System.out.println("========================================");
		
		
		// 정규식 패턴에 맞는지 matches()
		String ptrn01 = "Hello, (Java|World|Android|Apple)!!!";
		String str13 = "hello, PHP!!!";
		System.out.println("패턴 확인 : " + str11.matches(ptrn01));
		System.out.println("패턴 확인 : " + str13.matches(ptrn01));
		System.out.println("========================================");
		
		// 정규식 패턴에 맞는지 확인 > 회원정보 입력(DB 저장)
		// 휴대전화 번호 패턴
		String ptrn02 = "^01([0|1|6|7|8|9]?)-?([0-9]{3,4})-?([0-9]{4})$";
		for ( String[] row : arrData) {
			System.out.println(row[1] + " 훈련생의 연락처 : " + row[3]);
			if( !row[3].matches(ptrn02)) {
				System.out.println(" - 위 학생의 연락처가 휴대전화 번호 패턴에 맞지 않습니다.");
			}
		}
		System.out.println("========================================");
		
		/*
		 * StringBuilder / StringBuffer
		 * 	 - 동일한 기능
		 * 	 - 과정상의 차이
		 * 		StringBuilder - Multi-Thread에서 안전하지 않음 / 속도는 빠름
		 * 		StringBuffer - Multi-Thread에서 안전 / 동기화 오버헤드 / 속도 느림
		 * 
		 * StringBuilder : 가변 String : 문자열을 변경 가능
		 * 	 cf) String : 불변 String : 문자열 값을 한번 정해주면 더이상 변경 불가능
		 * 
		 */
		
		String str14 = new String("hello");
		System.out.println(str14);
		
		// String을 이용하게 되면 문자열의 크기가 클수록, 문자열을 자주 변경할수록
		// 시스템의 자원을 많이 사용(소모)
		str14 = str14 + ", world";
		System.out.println(str14);
		System.out.println("========================================");
		
		StringBuilder strb = new StringBuilder();
		System.out.println("스트링 빌더의 값 : " + strb);
		// 문자열 추가
		strb.append("A");		// INDEX : 0
		strb.append("B");		// INDEX : 1
		strb.append("C");		// INDEX : 2
		strb.append("D");		// INDEX : 3
		strb.append("E");		// INDEX : 4
		System.out.println("스트링 빌더의 값 : " + strb);
		strb.append("FGHIJ");	// INDEX : 5, 6, 7, 8, 9
		// 문자열 추가
		strb.insert(2, "abcde");
		System.out.println("스트링 빌더의 값 : " + strb);
		strb.insert(strb.length()%4, str11);
		System.out.println("스트링 빌더의 값 : " + strb);
		
		// ... strb > 다른 클래스에서 replaceAll("a", "") 
		
		// 문자열의 삭제
		// strb.delete(2, 22);
		int startIndex = strb.indexOf("a");
		strb.delete(strb.indexOf("a"), strb.lastIndexOf("e")+1);
		System.out.println("스트링 빌더의 값 : " + strb);
		
		// 문자열의 정렬 - 역순
		strb.reverse();
		System.out.println("스트링 빌더의 값 : " + strb);
		
		//StringBuilder(가변) > String(불변)
		// ** 사이드 이펙트 (Side Effect / 부작용)
		// : 의도치않은 결과를 만들어내는 효과(반작용)
		String str16 = strb.toString();
		System.out.println("스트링 빌더의 값 : " + str16 );
		System.out.println("========================================");
		
		// String 최적화 : (자바버전이 오르면서) 자바에서 자동으로 최적화
		String str17 = "A" + "B" + "C";
		
		char[] chars = new char[26];
		StringBuilder sb = new StringBuilder();
		String strFor = "";
		for( int i = 0 ; i < chars.length ; i++) {
			chars[i] = (char)(i+65);
			sb.append((char)(i+65));
			strFor += (char)(i+65);
			
		}
		System.out.println(Arrays.toString(chars));
		System.out.println(sb);
		System.out.println(strFor);
		
		/*
		 * StringBuilde(StringBuffer)를 직접 사용하는것이 더 좋은 경우
		 * 	- 반복문에서 반복해서 문자를 연결
		 * 	- 조건문을 통해 동적으로 문자열을 조합
		 * 	- 복잡한 문자열의 특정부분을 변경하는 경우
		 * 	- 매우 긴 대용량 문자열을 다루는 경우
		 */
		
		// 메소드 체이닝(Method Chaining)
		// 개발자가 고생한 만큼 사용자는 편해지고, 개발자가 편한만큼 사용자는 불편해짐
		StringBuilder strb02 = new StringBuilder();
		strb02.append("A").append("B").append("C").append("D");
		((strb02.append("A")).append("B")).append("C");
		System.out.println(strb02);
		
		
		
		
		
		
	}
	
	
}
