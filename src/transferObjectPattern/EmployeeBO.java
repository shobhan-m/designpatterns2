package transferObjectPattern;

import java.util.ArrayList;
import java.util.List;

public class EmployeeBO {
	
   //list is working as a database
   List<EmployeeVO> employees;

   public EmployeeBO(){
	   employees = new ArrayList<EmployeeVO>();
      EmployeeVO employee1 = new EmployeeVO(0,"raj","9948689567");
      EmployeeVO employee2 = new EmployeeVO(1,"shyam","45556");
      EmployeeVO employee3 = new EmployeeVO(2,"mahi","4578");
      employees.add(employee1);
      employees.add(employee2);	
      employees.add(employee3);
      
   }
   public void deleteEmployee(EmployeeVO Employee) {
	   employees.remove(Employee.getEmpId());
      System.out.println("Employee: Id  " + Employee.getEmpId() + ", deleted from database");
   }

   //retrive list of Employees from the database
   public List<EmployeeVO> getAllEmployees() {
      return employees;
   }

   public EmployeeVO getEmployee(int empId) {
      return employees.get(empId);
   }

   public void updateEmployee(EmployeeVO employee) {
	   employees.get(employee.getEmpId()).setEmpName(employee.getEmpName());
      System.out.println("Employee: Id No " + employee.getEmpId() +", updated in the database");
   }
}