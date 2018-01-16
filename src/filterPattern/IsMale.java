package filterPattern;

import java.util.ArrayList;
import java.util.List;

public class IsMale implements Filter{

	@Override
	public List<Employee> applyFilter(List<Employee> employees) {
		// TODO Auto-generated method stub
		
		List<Employee> maleList=new ArrayList<Employee>();
		for(Employee emp : employees) {
			if(emp.getGender().equalsIgnoreCase("Male")) {
				maleList.add(emp);
			}
			
		}
		return maleList;
	}

}
