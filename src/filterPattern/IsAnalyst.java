package filterPattern;

import java.util.ArrayList;
import java.util.List;

public class IsAnalyst implements Filter{

	@Override
	public List<Employee> applyFilter(List<Employee> employees) {
		// TODO Auto-generated method stub
		
		List<Employee> analystList=new ArrayList<Employee>();
		for(Employee emp : employees) {
			if(emp.getJob().equalsIgnoreCase("Analyst")) {
				analystList.add(emp);
			}
			
		}
		return analystList;
	}

}
