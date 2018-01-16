package mvcPattern;

public class EmployeeView {

	
	public void printEmployeeDetails(String empId,String empName,String contact) {
		
		System.out.println("Employee: ");
	      System.out.println("Name: " + empName);
	      System.out.println("empId : " + empId);
	      System.out.println("contact: " + contact);
	      
	}
}
