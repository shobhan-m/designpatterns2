package filterPattern;

import java.util.ArrayList;
import java.util.List;

public class IsFemale implements Filter{

	@Override
	public List<Employee> applyFilter(List<Employee> employees) {
		// TODO Auto-generated method stub
		
		List<Employee> femaleList=new ArrayList<Employee>();
		for(Employee emp : employees) {
			if(emp.getGender().equalsIgnoreCase("Female")) {
				femaleList.add(emp);
			}
			
		}
		return femaleList;
	}

}
