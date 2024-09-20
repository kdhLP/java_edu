package ch06;

public class Test04 {

	public static void main(String[] args) {

		/*
		 * 1. Book Ŭ������ ���弼��
		 * 
		 * 2. �ɹ� ������ ���弼�� 
		 * 		2-1. ���ڿ� Ÿ���� title	(å ����) 
		 * 		2-2. ���ڿ� Ÿ���� author	(å ����/������) 
		 * 		2-3.���� Ÿ���� price 		(å ����) 
		 * 		2-4. ���� Ÿ���� page 		(å ������ ��)
		 * 
		 * 3. Method�� 1�� ���弼�� : Ŭ������ ��� �ɹ� ������ ���� ����ϴ� �޼ҵ�
		 * 
		 * 4. �����ڸ� ���ؼ� �ɹ������� ���� ������ �� �ִ� ��ü�� 3�� ���弼��. 
		 * 		4-1. �ظ����� / J.K.�Ѹ� / 15000 / 300
		 * 		4-2. ȥ�� �����ϴ� �ڹ� / �ſ�� / 28000 / 725 
		 * 		4-3. �̰��� Mysql�̴� / ���糲 / 32000 / 685
		 * 
		 * 5. ������ ��ü�� ������ ����ϴ� method�� ȣ�� �ϼ���.
		 */

		Book book1 = new Book("�ظ�����", "J.K.�Ѹ�", 15000, 300);
		Book book2 = new Book("ȥ�� �����ϴ� �ڹ�", "�ſ��", 28000, 725);
		Book book3 = new Book("�̰��� Mysql�̴�", "���糲", 32000, 685);

		System.out.println("======book1======");
		book1.printAttribute();
		System.out.println("======book2======");
		book2.printAttribute();
		System.out.println("======book3======");
		book3.printAttribute();
		
		/*
		 * 1. employees  Ŭ������ ����ϴ�.
		 * 
		 * 2. �ɹ������� �����մϴ�.
		 * 	2-1. employeeName		: ȫ�浿
		 * 	2-2. employeeId			: BTC202407220001
		 * 	2-3. employeeDepart		: IT�μ�
		 * 	2-4. employeeSalary		: 5600000
		 * 
		 * 3. ���������� ����ϴ� �޼ҵ带 ����ϴ�.
		 * 	public void printEmployeeInfo(){
		 * 		// ...
		 * 	}
		 * 
		 * 4. ���������� �ʱ�ȭ �� �� �ֵ��� �����ڸ� ���ؼ� Employees ��ü 4���� ����ϴ�.
		 * 	4-1. ȫ�浿 / BTC202407220001 / �濵������ / 12000000
		 *  4-2. �Ѹ� / BTC202407230002 / �濵������ / 32000000
		 *  4-3. ��ġ / BTC202407230001 / ������ / 28000000
		 *  4-4. ���� / BTC202408230011 / ���߷��� / 2500000
		 *  ** �����ڷ� �ѱ�� �Ķ���ʹ� ���� 4���� �ƴ϶� �迭�� ��Ƽ� ȣ���� �� �ֵ��� ����ϴ�.
		 *  	new Employees( ***[] information );
		 *  
		 *  5. �޼ҵ带 Ȱ���Ͽ� ��ü�� ������ ���.
		 */
		
		
		
		String[][] emp = {
				{"ȫ�浿" , "BTC202407220001" , "�濵������" , "12,000,000"},
				{"�Ѹ�" , "BTC202407230002" , "�濵������" , "32,000,000"},
				{"��ġ" , "BTC202407230001" , "������" , "28,000,000"},
				{"����" , "BTC202408230011" , "���߷���" , "2,500,000"}
		};
		
		//Employees empInfo = new Employees(emp[4]);
		
		
		Employees[] empInfo = new Employees[emp.length];
		
		for(int i = 0 ; i < empInfo.length ; i++) {
			//empInfo[i]= new Employees(emp[i][0], emp[i][1], emp[i][2], emp[i][3]);
			empInfo[i]= new Employees(emp[i]);
			
			System.out.println("======����"+ (i+1) +"======");
			empInfo[i].printEmployeeInfo();
		}
		
	}
	
	

}
