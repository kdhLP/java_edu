package ch11;

import java.util.Arrays;

// String Class
// �ڹٿ��� �ٷ�� ��ǥ���� 2���� Ƽ�� : char, String
/*
 * char = '{Ȭ ����ǥ: ����}'
 * String = " {�ֵ���ǥ:���ڿ�} " 
 */

public class Exam02 {
	public static void main(String[] args) {
		char[] charArr = new char[] { 'h', 'e', 'l', 'l', 'o'};
		// ����� 1
		String str = "hello";
		// ����� 2. String pool
		String str2 = new String( "hello" );
		
		System.out.println(charArr);
		System.out.println(str);
		System.out.println(str2);
		
		// 1. �� : == (����)�� �ƴ� equals() ���
		/*
		 * ==		/ ���ϼ�(Identity) - ������ ��ġ�ϴ���(��, Ÿ��...)
		 * equals()	/ ���(Equality) - �������� ��ġ�ϴ���
		 * 
		 * �ش� ������ ������ ���� �ּҸ� ������ �ֱ� ������ ==�� ����ϰ� �Ǹ� false ��ȯ
		 */
		String str01 = new String("hello");
		// str011 ������ str01�� ������ �ִ� ���� ���� : �ּҰ��� ����
		String str011 = str01;
		String str02 = new String("hello");
		System.out.println("��ü������ ���� ���� �� =: " + (str01 == str02) );
		System.out.println("��ü������ ���� ���� �� equals(): " + (str01.equals(str02)) );
		System.out.println("========================================");
		
		// ���ڿ� ���ͷ��� ����ϸ� ���ڿ� Ǯ(String pool)�� ����
		// ���ڿ� Ǯ�� �̹� ������ �� ���ڿ��� ���, �ش��ּҸ� ��ȯ
		/*
		 * ���ڿ� Ǯ(String pool)
		 * 	- pool : ������ �� �ִ� ��, �����ڿ��� ��Ƶ� ��(�޸�-Heap �޸�)
		 * 	- ���� ���ڸ� ����ϴ� ���, �޸� ����� ���̰�, ���ڸ� ����� �ð��� ����
		 * 	- ���� ����ȭ, ���� ȿ���� ����� �� ����
		 */
		String str03 = "hello";		
		String str04 = "hello";		
		System.out.println("���ͷ� �� = : " + (str03 == str04) );
		System.out.println("���ͷ� �� equals(): " + (str03.equals(str04)) );
		System.out.println("========================================");
		
		// ���ٸ� ���ο� �ּҿ� ������ �ϰ� �� �ּҸ� ��ȯ
		str04 = "Hello";
		System.out.println("���ͷ� �� = : " + (str03 == str04) );
		System.out.println("���ͷ� �� equals(): " + (str03.equals(str04)) );
		System.out.println("========================================");
		
		/*
		 * �ֿ� �޼ҵ�
		 * 1. ���ڿ� ���� ��ȸ
		 * 	 - length()	 : ���ڿ��� ���̸� ��ȯ
		 * 	 - isEmpty() : ���ڿ��� ����ִ��� ȣ����(���̰� 0)
		 * 	 - isBlank() : ���ڿ��� ����ִ��� Ȯ�� (����:0 / whitespace)
		 * 	 - charAt(int index) :����(index) ��ġ�� �ִ� ����(char) ��ȯ  
		 */
		
		String str05 = "Hello~ World";
		System.out.println("���ڿ��� ���� : " + str05.length());
		System.out.println("���ڿ��� �� : " + str05.isEmpty());
		System.out.println("���ڿ��� �� : " + str05.isBlank());
		System.out.println("���ڿ��� �� : " + "  ".isBlank());
		System.out.println("n��° �ڸ��� ���� : " + str05.charAt(4));
		System.out.println("========================================");
		
		/*
		 * 2. ���ڿ� ��
		 * 	 - equals()
		 * 	 - equalsIgnoreCase(String str) : ��ҹ��ڸ� ���������ʰ� ���ڿ��� ��
		 * 	 - startWith(String prefix) : ���ڿ��� ���λ�� �����ϴ��� Ȯ��
		 * 	 - endWith(String suffix) : ���ڿ��� ���̻�� �������� Ȯ��
		 */
		String str06 = " Hello, World ";
		System.out.println(str06.equals(str05));
		System.out.println(str06.equalsIgnoreCase(str05));
		System.out.println(str06.startsWith("Hello"));
		System.out.println(str06.endsWith("world"));
		System.out.println("========================================");
		
		/*
		 * 3. ���ڿ� �˻�
		 * 	 - contains(CharSequence s) : Ư�� ���ڿ��� �����ϰ� �ִ��� Ȯ��
		 * 	 - indexOf(String sch)
		 * 		/ indexOf(String sch, int formIndex)
		 * 			: ���ڿ��� ó�� �����ϴ� ��ġ(����)�� ��ȯ
		 * 	 - lastIndexOf(String sch) : ���ڿ��� ���������� �����ϴ� ��ġ�� ��ȯ
		 * 
		 */
		String str07 = "Hello~ world!!!";
		System.out.println("���ڿ� �˻� : " +str07.contains("Hello"));
		System.out.println("���ڿ� �˻� : " + str07.contains("Hello,"));
		System.out.println("���ڿ� ù �ڸ��� �˻� : " + str07.indexOf("world"));
		System.out.println("���ڿ� ù �ڸ��� �˻� : " + str07.indexOf("world", 9));
		System.out.println("���ڿ� ������ �ڸ��� : " + str07.lastIndexOf("!!!"));
		System.out.println("========================================");
		
		/*
		 * ���ڿ� ġȯ(���� �� ��ȯ)
		 * 	 - substring(int beginIndex)
		 * 		/ substring(int beginIndex, int endIndex)
		 * 			: beginIndex���� (endIndex ����) ���ڿ� �ڸ���
		 * 	 - concat(String str) : ���ڿ� ��ġ��
		 * 	 - replace(CharSequence regex, String replacement)
		 * 		: (ó�� �˻��Ǵ� �ܾ� �ϳ��� ġȯ)
		 * 		  regex(�˻���, ���Խ�)�� replacement(�ٲܴܾ�)�� ġȯ
		 * 	 - replaceAll(CharSeqeuence regex, String replacement)
		 * 		: regex(�˻���, ���Խ�)�� replacement(�ٲܴܾ�)�� ġȯ
		 * 	 - trim() : ���ڿ� �յ��� �� ������ ����ϴ�.
		 * 	 - toLowerCase() / toUpperCase()
		 * 			: ���ڿ��� �ҹ��� / �빮�ڷ� ġȯ
		 */
		
		String str08 = "Hello, World! Welcome to Java!";
		System.out.println(" ���ڿ� �ڸ��� : " + str08.substring(7));
		System.out.println(" ���ڿ� �ڸ��� : " + str08.substring(7, 12));
		System.out.println(" ���ڿ� ��ġ�� : " + str08.concat("!!!!"));
		System.out.println(" ���ڿ� ġȯ(��ü) : " + str08.replace("Java", "Programming"));
		System.out.println(" ���ڿ� ��ü ġȯ : " + str08.replaceAll("!", "~"));
		System.out.println(" �յ� ���� ���� : " + ("  "+ str08 + "  ").trim());
		System.out.println(" �ҹ��� ġȯ : " + str08.toLowerCase());
		System.out.println(" �빮�� ġȯ : " + str08.toUpperCase());
		
		System.out.println(" ��ü ���� ���� : " + str08.replaceAll(" ", ""));
		System.out.println("========================================");
		
		/*
		 * 5. ���ڿ� ���� �� ����
		 * 	 - split(String regex) : ���ڿ��� ���� ���ڿ�(����)���� ����, �迭�� ���·� ��ȯ
		 * 	 - join(CharSequence delimiter, CharSequence...elements)
		 * 		: ������(delimiter)�� ���� ���ڿ��� ����
		 * 		// ���� ����(�μ�) - �Ű������� ǥ���ϴ� �Ұ�ȣ() �ȿ� ... 
		 * 			: ������ ������ ���� n���� �Ķ���͸� ���� ����, �������� �Ű������� ���� ����
		 */
		String str09 = " Apple, Banana, Cherry, Dragon Fruit, Grape, Lemon, Melon, Pear ";
		
		String[] str09Arr = str09.split(",");
		System.out.println("���ڿ� ���� : " + Arrays.toString(str09Arr));
		System.out.println("���ڿ� �� : " + str09Arr[0].trim().equals("Apple"));
		
		
		String str10 = String.join(" , ", "A", "B","C","D","E","F","G");
		System.out.println("��ģ���ڿ� : " + str10);
		System.out.println("========================================");
		
		/*
		 * 6. ��Ÿ
		 * 	 - valueOf(Object obj) : �پ��� Ÿ���� ���ڿ��� ����
		 * 	 - toCharArray() : ���ڿ��� �迭�� ����
		 * 	 - format(String format, Object... args)
		 * 		: ���� ���ڿ��� ���ڸ� ����Ͽ� ���ο� ���ڿ��� ����
		 * 	 - matches(String regex) : ���ڿ��� �־��� ���Խİ� ��ġ�ϴ� Ȯ��
		 */
		
		String str11 = "Hello, World!!!";
		int num01 = 100;
		double num02 = 3.14;
		boolean flag = false;
		
		System.out.println(" ���� > ���ڿ� : " + String.valueOf(num01));
		System.out.println(" �Ǽ� > ���ڿ� : " + String.valueOf(num02));
		System.out.println(" �� > ���ڿ� : " + String.valueOf(flag));
		
		char[] str11Arr = str11.toCharArray();
		System.out.println(Arrays.toString(str11Arr));
		System.out.println("========================================");
		
		/* %s : String (���ڿ�)
		 * %c : char (����)
		 * %d : decimal (������)
		 * %b : boolean (��/����, ����)
		 * %f : float (�Ǽ���-�Ҽ���)
		 * 
		 * .format()
		 * cf) System.out.printf
		 */
		String str12 = String.format("�ȳ����� : %s / �����ִ��ο� : %d��" ,str11, num01);
		System.out.println(str12);
		
		// DB���� ��ȸ�Ͽ� ������ �� ������
		String[][] arrData = {
				{ "STU202407220001", "�質��", "��", "010-1111-1111" },
				{ "STU202407220002", "�赵��", "��", "010-2222-2222" },
				{ "STU202407220003", "�ڼ���", "��", "010-3333-3333" },
				{ "STU202407220004", "���ֿ�", "��", "010-4444-s123" },
		};
		String information = "�ȳ��ϼ���. %s �Ʒû� \n"
				+ "���� �п��� �湮���ּż� �����մϴ�. \n"
				+ "%s �Ʒû����� �����ֽ� ����ó�� %s�� Ȯ�εǾ� �����帳�ϴ�. \n";
		for( String[] row : arrData ) {
			System.out.println(String.format(information, row[1], row[1], row[3]));
		}
		System.out.println("========================================");
		
		// ��¥
		String todayDate = "2024-08-29";
		String[] todayDateArr = todayDate.split("-");
		System.out.println(String.format("������ ��¥ : %d�� %d�� %d��"
									, Integer.parseInt(todayDateArr[0])
									, Integer.parseInt(todayDateArr[1])
									, Integer.parseInt(todayDateArr[2])));
		
		int[] nowDate = { 2024, 8, 29 };
		System.out.println(String.format("������ ��¥ : %d�� %d�� %d��"
							, nowDate[0], nowDate[1], nowDate[2]));
		System.out.println("========================================");
		
		
		// ���Խ� ���Ͽ� �´��� matches()
		String ptrn01 = "Hello, (Java|World|Android|Apple)!!!";
		String str13 = "hello, PHP!!!";
		System.out.println("���� Ȯ�� : " + str11.matches(ptrn01));
		System.out.println("���� Ȯ�� : " + str13.matches(ptrn01));
		System.out.println("========================================");
		
		// ���Խ� ���Ͽ� �´��� Ȯ�� > ȸ������ �Է�(DB ����)
		// �޴���ȭ ��ȣ ����
		String ptrn02 = "^01([0|1|6|7|8|9]?)-?([0-9]{3,4})-?([0-9]{4})$";
		for ( String[] row : arrData) {
			System.out.println(row[1] + " �Ʒû��� ����ó : " + row[3]);
			if( !row[3].matches(ptrn02)) {
				System.out.println(" - �� �л��� ����ó�� �޴���ȭ ��ȣ ���Ͽ� ���� �ʽ��ϴ�.");
			}
		}
		System.out.println("========================================");
		
		/*
		 * StringBuilder / StringBuffer
		 * 	 - ������ ���
		 * 	 - �������� ����
		 * 		StringBuilder - Multi-Thread���� �������� ���� / �ӵ��� ����
		 * 		StringBuffer - Multi-Thread���� ���� / ����ȭ ������� / �ӵ� ����
		 * 
		 * StringBuilder : ���� String : ���ڿ��� ���� ����
		 * 	 cf) String : �Һ� String : ���ڿ� ���� �ѹ� �����ָ� ���̻� ���� �Ұ���
		 * 
		 */
		
		String str14 = new String("hello");
		System.out.println(str14);
		
		// String�� �̿��ϰ� �Ǹ� ���ڿ��� ũ�Ⱑ Ŭ����, ���ڿ��� ���� �����Ҽ���
		// �ý����� �ڿ��� ���� ���(�Ҹ�)
		str14 = str14 + ", world";
		System.out.println(str14);
		System.out.println("========================================");
		
		StringBuilder strb = new StringBuilder();
		System.out.println("��Ʈ�� ������ �� : " + strb);
		// ���ڿ� �߰�
		strb.append("A");		// INDEX : 0
		strb.append("B");		// INDEX : 1
		strb.append("C");		// INDEX : 2
		strb.append("D");		// INDEX : 3
		strb.append("E");		// INDEX : 4
		System.out.println("��Ʈ�� ������ �� : " + strb);
		strb.append("FGHIJ");	// INDEX : 5, 6, 7, 8, 9
		// ���ڿ� �߰�
		strb.insert(2, "abcde");
		System.out.println("��Ʈ�� ������ �� : " + strb);
		strb.insert(strb.length()%4, str11);
		System.out.println("��Ʈ�� ������ �� : " + strb);
		
		// ... strb > �ٸ� Ŭ�������� replaceAll("a", "") 
		
		// ���ڿ��� ����
		// strb.delete(2, 22);
		int startIndex = strb.indexOf("a");
		strb.delete(strb.indexOf("a"), strb.lastIndexOf("e")+1);
		System.out.println("��Ʈ�� ������ �� : " + strb);
		
		// ���ڿ��� ���� - ����
		strb.reverse();
		System.out.println("��Ʈ�� ������ �� : " + strb);
		
		//StringBuilder(����) > String(�Һ�)
		// ** ���̵� ����Ʈ (Side Effect / ���ۿ�)
		// : �ǵ�ġ���� ����� ������ ȿ��(���ۿ�)
		String str16 = strb.toString();
		System.out.println("��Ʈ�� ������ �� : " + str16 );
		System.out.println("========================================");
		
		// String ����ȭ : (�ڹٹ����� �����鼭) �ڹٿ��� �ڵ����� ����ȭ
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
		 * StringBuilde(StringBuffer)�� ���� ����ϴ°��� �� ���� ���
		 * 	- �ݺ������� �ݺ��ؼ� ���ڸ� ����
		 * 	- ���ǹ��� ���� �������� ���ڿ��� ����
		 * 	- ������ ���ڿ��� Ư���κ��� �����ϴ� ���
		 * 	- �ſ� �� ��뷮 ���ڿ��� �ٷ�� ���
		 */
		
		// �޼ҵ� ü�̴�(Method Chaining)
		// �����ڰ� ����� ��ŭ ����ڴ� ��������, �����ڰ� ���Ѹ�ŭ ����ڴ� ��������
		StringBuilder strb02 = new StringBuilder();
		strb02.append("A").append("B").append("C").append("D");
		((strb02.append("A")).append("B")).append("C");
		System.out.println(strb02);
		
		
		
		
		
		
	}
	
	
}
