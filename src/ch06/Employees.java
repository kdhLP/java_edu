package ch06;

public class Employees {
	
	String employeeName;
	String employeeId;
	String employeeDepart;
	String employeeSalary;
	
	public Employees() { }
	
	/*
	public Employees(String employeeName, String employeeId, String employeeDepart, String employeeSalary) {
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.employeeDepart = employeeDepart;
		this.employeeSalary = employeeSalary;
	}
	*/
	public Employees(String[] employeeInfo) {
		this.employeeName = employeeInfo[0];
		this.employeeId = employeeInfo[1];
		this.employeeDepart = employeeInfo[2];
		this.employeeSalary = employeeInfo[3];
	}
	
	
	public void printEmployeeInfo(){
		 
		System.out.println("���� �̸�	: " + this.employeeName);
		System.out.println("���� �ڵ�	: " + this.employeeId);
		System.out.println("���� �μ�	: " + this.employeeDepart);
		System.out.println("���� �޿�	: " + this.employeeSalary + "��");
		
	}
	
	
}
