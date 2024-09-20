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
		 
		System.out.println("직원 이름	: " + this.employeeName);
		System.out.println("직원 코드	: " + this.employeeId);
		System.out.println("직원 부서	: " + this.employeeDepart);
		System.out.println("직원 급여	: " + this.employeeSalary + "원");
		
	}
	
	
}
