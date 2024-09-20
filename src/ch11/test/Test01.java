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
		//question07(test01data.poem, "�ƹ���");
		//question08(test01data.poem, "������", "***�ڽ�***");
		question09(test01data.email);

		
		
	}

	// Q1. url�� https:// ���ڿ��� �����ϴ��� Ȯ��
	public static void question01() {
		String url = "http://www.btc.ac.kr";
		System.out.println("���� Ȯ�� : " + url.contains("https://"));

	}

	// Q2. �迭���� ���ڿ����� �� ������ ���� ���ϱ�
	public static void question02() {
		String[] arr = { "apple", "android", "windows", "unix", "linux", "ibm" };
		String str = Arrays.toString(arr).replaceAll(", ", "");

		System.out.println(str.length());

	}

	// Q3. ���� ���ϸ��� Ȯ���ڴ� ���° �ڸ��� ��ġ�ϴ��� �ε��� ��ȣ�� ���
	public static void question03() {
		String file = "helloWorld.html";
		System.out.println(file.lastIndexOf(".") + 1);

	}

	// Q4. ���� ���ϸ��� ���� Ȯ���ڸ� ���� �����ؼ� ���
	public static void question04() {
		String file = "Example.01.2024.08.22.html";

		int num1 = file.lastIndexOf(".") + 1;
		int num2 = file.length();

		System.out.println(file.substring(num1, num2));

	}

	// Q5. �迭���� �� �� 'http:', 'https:'�� ����� �迭�� �ٽ� ����
	public static void question05(String[] urls) {

		for (int i = 0; i < urls.length; i++) {
			urls[i] = urls[i].replace("https://", "").replace("http://", "");
			System.out.println(urls[i]);
		}

	}

	// Q6. 5�� ���������� url ���� Ȯ���Ͽ� �����ϴ� �������� �� ���� �ִ��� ����
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
				System.out.println(ccTLD[i][0] + " ������ ������ �� : " + countryCounts[i]);
			}
		}
		System.out.println("���Ե��� �ʴ� ������ �� : " + (urls.length-etc));
		
	}

	// Q7. �Ʒ��� �ô� �ڸ�� ������ '����'�̶�� ���̴�. '�ƹ���'��� ������ ��� �������� ��� ���
	public static void question07(String poem, String str) {
		
		
		String[] poemArr = poem.split(" "); // poem.split("\r\n");
		int count = 0;
		for(int i = 0 ; i < poemArr.length ; i++) {
			
			if(poemArr[i].contains(str) == true) {
				count++;
			}
		}
		System.out.println("�� �ÿ� ���� '" + str +"'�� ���� : " + count + "�� �Դϴ�.");
		
	}
	
	

	// Q8. 7�� ������ �� �� '������'��� �ܾ �ڽ����� ġȯ�϶�
	public static void question08(String poem, String srch, String chan) {
		
		
		System.out.println(poem.replaceAll(srch, chan));
		
	}
	
	// Q9. �ùٸ� �̸����� �������� Ȯ���ϰ� �̸��� ���̵�� ������ �ּҸ� Ŭ������ ����
	public static void question09(String[] email) {
		String chek = "^[0-9a-zA-Z]([-_\\.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_\\.]?[0-9a-zA-Z])*\\.[a-zA-Z]{2,3}$";
		for ( int i = 0 ; i< email.length ; i++) {
			if(email[i].matches(chek) == true) {
				System.out.println("email ID : "+email[i].substring(0,email[i].indexOf("@") ));
				System.out.println("email adress : " + email[i]);
				
				
			}else {
				System.out.println("***[" + email[i]+ "]�� �ùٸ� ���� �ּҰ� �ƴմϴ�!***");
				
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
