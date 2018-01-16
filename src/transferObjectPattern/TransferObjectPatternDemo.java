package transferObjectPattern;

public class TransferObjectPatternDemo {
   public static void main(String[] args) {
      EmployeeBO EmployeeBusinessObject = new EmployeeBO();

     // print all Employees
     for (EmployeeVO employee : EmployeeBusinessObject.getAllEmployees()) {
        System.out.println("Employee: [Id : " + employee.getEmpId() + ", Name : " + employee.getEmpName() + " ]");
    }

     //update Employee
     EmployeeVO employee = EmployeeBusinessObject.getAllEmployees().get(1);
     employee.setEmpName("Hari");
     EmployeeBusinessObject.updateEmployee(employee);

      //get themployee
    EmployeeVO   employee1 = EmployeeBusinessObject.getEmployee(1);
   System.out.println("Employee: [Id : " + employee1.getEmpId() + ", Name : " + employee1.getEmpName() + " ]");
   }
}