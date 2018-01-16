package mvcPattern;
public class EmployeeController {
   private Employee model;
   private EmployeeView view;

   public EmployeeController(Employee model, EmployeeView view){
      this.model = model;
      this.view = view;
   }

   public void setEmployeeName(String name){
      model.setEmpName(name);		
   }

   public String getEmployeeName(){
      return model.getEmpName()	;	
   }

   public void setEmployeeId(String empId){
      model.setEmpId(empId);	
   }

   public String getEmployeeId(){
      return model.getEmpId()	;
   }

   public void updateView(){				
      view.printEmployeeDetails( model.getEmpId(),model.getEmpName(),model.getContactNumber());
   }	
}
