package transferObjectPattern;

public class EmployeeVO {
	private int empId;
	private String empName;
	private String contactNumber;
	
	
	public EmployeeVO(int empId, String empName,String contactNumber) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.contactNumber = contactNumber;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	
	
	
	
}
