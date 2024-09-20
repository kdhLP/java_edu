package ch11.test;

import java.util.Arrays;

public class Test01 {

	public static void main(String[] args) {
		
		
		
		//question01();
		//question02();
		//question03();
		//question04();
		//question05(test01data.urls);
		//question06(test01data.urls, test01data.ccTLD);
		//question07(test01data.poem, "아버지");
		//question08(test01data.poem, "강아지", "***자식***");
		question09(test01data.email);

		
		
	}

	// Q1. url에 https:// 문자열로 시작하는지 확인
	public static void question01() {
		String url = "http://www.btc.ac.kr";
		System.out.println("패턴 확인 : " + url.contains("https://"));

	}

	// Q2. 배열안의 문자열들의 총 길이의 합을 구하기
	public static void question02() {
		String[] arr = { "apple", "android", "windows", "unix", "linux", "ibm" };
		String str = Arrays.toString(arr).replaceAll(", ", "");

		System.out.println(str.length());

	}

	// Q3. 다음 파일명에서 확장자는 몇번째 자리에 위치하는지 인덱스 번호를 출력
	public static void question03() {
		String file = "helloWorld.html";
		System.out.println(file.lastIndexOf(".") + 1);

	}

	// Q4. 다음 파일명에서 파일 확장자만 따로 추출해서 출력
	public static void question04() {
		String file = "Example.01.2024.08.22.html";

		int num1 = file.lastIndexOf(".") + 1;
		int num2 = file.length();

		System.out.println(file.substring(num1, num2));

	}

	// Q5. 배열안의 값 중 'http:', 'https:'를 지우고 배열에 다시 저장
	public static void question05(String[] urls) {

		for (int i = 0; i < urls.length; i++) {
			urls[i] = urls[i].replace("https://", "").replace("http://", "");
			System.out.println(urls[i]);
		}

	}

	// Q6. 5번 문제에서의 url 값을 확인하여 서비스하는 국가별로 몇 개가 있는지 구분
	public static void question06(String[] urls, String[][] ccTLD) {
		
		

		int[] countryCounts = new int[ccTLD.length];
		int etc = 0;

		for (int i = 0; i < ccTLD.length; i++) {
			for (int j = 0; j < urls.length; j++) {

				if (urls[j].contains("."+ccTLD[i][1])) {
					countryCounts[i]++;
				}
			}
			etc += countryCounts[i];
		}

		for (int i = 0; i < ccTLD.length; i++) {
			if (countryCounts[i] > 0) {
				System.out.println(ccTLD[i][0] + " 국가의 도메인 수 : " + countryCounts[i]);
			}
		}
		System.out.println("포함되지 않는 도메인 수 : " + (urls.length-etc));
		
	}

	// Q7. 아래의 시는 박목월 시인의 '가정'이라는 시이다. '아버지'라는 문구는 몇번 나오는지 세어서 출력
	public static void question07(String poem, String str) {
		
		
		String[] poemArr = poem.split(" "); // poem.split("\r\n");
		int count = 0;
		for(int i = 0 ; i < poemArr.length ; i++) {
			
			if(poemArr[i].contains(str) == true) {
				count++;
			}
		}
		System.out.println("이 시에 적힌 '" + str +"'의 수는 : " + count + "개 입니다.");
		
	}
	
	

	// Q8. 7번 문제의 시 중 '강아지'라는 단어를 자식으로 치환하라
	public static void question08(String poem, String srch, String chan) {
		
		
		System.out.println(poem.replaceAll(srch, chan));
		
	}
	
	// Q9. 올바른 이메일의 형태인지 확인하고 이메일 아이디와 도메인 주소를 클래스에 저장
	public static void question09(String[] email) {
		String chek = "^[0-9a-zA-Z]([-_\\.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_\\.]?[0-9a-zA-Z])*\\.[a-zA-Z]{2,3}$";
		for ( int i = 0 ; i< email.length ; i++) {
			if(email[i].matches(chek) == true) {
				System.out.println("email ID : "+email[i].substring(0,email[i].indexOf("@") ));
				System.out.println("email adress : " + email[i]);
				
				
			}else {
				System.out.println("***[" + email[i]+ "]는 올바른 메일 주소가 아닙니다!***");
				
			}
		}
		
		}
	
	// Q10. 
	public static void question10() {
		
	}

}

class MailInfo {
	private String id;
	private String address;

	public MailInfo(String id, String address) {
		this.id = id;
		this.address = address;
	}
	
	
}
