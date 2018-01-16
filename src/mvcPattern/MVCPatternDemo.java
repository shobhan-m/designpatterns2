package mvcPattern;

public class MVCPatternDemo {
   public static void main(String[] args) {

      //fetch student record based on his roll no from the database
      Employee model  = retriveStudentFromDatabase();

      //Create a view : to write student details on console
      EmployeeView view = new EmployeeView();

      EmployeeController controller = new EmployeeController(model, view);

      controller.updateView();

      //update model data
      controller.setEmployeeName("John");

      controller.updateView();
   }

   private static Employee retriveStudentFromDatabase(){
      Employee employee = new Employee();
      employee.setEmpId("122");
      employee.setEmpName("ram");
      employee.setContactNumber("56666");
      return employee;
   }
}