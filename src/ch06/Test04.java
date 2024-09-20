package ch06;

public class Test04 {

	public static void main(String[] args) {

		/*
		 * 1. Book 클래스를 만드세요
		 * 
		 * 2. 맴버 변수를 만드세요 
		 * 		2-1. 문자열 타입의 title	(책 제목) 
		 * 		2-2. 문자열 타입의 author	(책 저자/지은이) 
		 * 		2-3.숫자 타입의 price 		(책 가격) 
		 * 		2-4. 숫자 타입의 page 		(책 페이지 수)
		 * 
		 * 3. Method를 1개 만드세요 : 클래스의 모든 맴버 변수의 값을 출력하는 메소드
		 * 
		 * 4. 생성자를 통해서 맴버변수의 값을 설정할 수 있는 객체를 3개 만드세요. 
		 * 		4-1. 해리포터 / J.K.롤링 / 15000 / 300
		 * 		4-2. 혼자 공부하는 자바 / 신용권 / 28000 / 725 
		 * 		4-3. 이것이 Mysql이다 / 우재남 / 32000 / 685
		 * 
		 * 5. 생성된 객체의 정보를 출력하는 method를 호출 하세요.
		 */

		Book book1 = new Book("해리포터", "J.K.롤링", 15000, 300);
		Book book2 = new Book("혼자 공부하는 자바", "신용권", 28000, 725);
		Book book3 = new Book("이것이 Mysql이다", "우재남", 32000, 685);

		System.out.println("======book1======");
		book1.printAttribute();
		System.out.println("======book2======");
		book2.printAttribute();
		System.out.println("======book3======");
		book3.printAttribute();
		
		/*
		 * 1. employees  클래스를 만듭니다.
		 * 
		 * 2. 맴버변수를 선언합니다.
		 * 	2-1. employeeName		: 홍길동
		 * 	2-2. employeeId			: BTC202407220001
		 * 	2-3. employeeDepart		: IT부서
		 * 	2-4. employeeSalary		: 5600000
		 * 
		 * 3. 직원정보를 출력하는 메소드를 만듭니다.
		 * 	public void printEmployeeInfo(){
		 * 		// ...
		 * 	}
		 * 
		 * 4. 직원정보를 초기화 할 수 있도록 생성자를 통해서 Employees 객체 4개를 만듭니다.
		 * 	4-1. 홍길동 / BTC202407220001 / 경영지원팀 / 12000000
		 *  4-2. 둘리 / BTC202407230002 / 경영지원팀 / 32000000
		 *  4-3. 또치 / BTC202407230001 / 영업팀 / 28000000
		 *  4-4. 박희동 / BTC202408230011 / 대기발령중 / 2500000
		 *  ** 생성자로 넘기는 파라미터는 변수 4개가 아니라 배열에 담아서 호출할 수 있도록 만듭니다.
		 *  	new Employees( ***[] information );
		 *  
		 *  5. 메소드를 활용하여 객체의 정보를 출력.
		 */
		
		
		
		String[][] emp = {
				{"홍길동" , "BTC202407220001" , "경영지원팀" , "12,000,000"},
				{"둘리" , "BTC202407230002" , "경영지원팀" , "32,000,000"},
				{"또치" , "BTC202407230001" , "영업팀" , "28,000,000"},
				{"박희동" , "BTC202408230011" , "대기발령중" , "2,500,000"}
		};
		
		//Employees empInfo = new Employees(emp[4]);
		
		
		Employees[] empInfo = new Employees[emp.length];
		
		for(int i = 0 ; i < empInfo.length ; i++) {
			//empInfo[i]= new Employees(emp[i][0], emp[i][1], emp[i][2], emp[i][3]);
			empInfo[i]= new Employees(emp[i]);
			
			System.out.println("======직원"+ (i+1) +"======");
			empInfo[i].printEmployeeInfo();
		}
		
	}
	
	

}
