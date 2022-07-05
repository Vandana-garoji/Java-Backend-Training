import java.util.ArrayList;

public interface Employeeservice {

	
	
	void Updateemployee(ArrayList<Employee> e ,int id,String newname) throws CustomException ;
	void Displayemployee(ArrayList<Employee> e);
	void Deleteemployee(ArrayList<Employee> e,int id) throws CustomException;
	void Addemployee(ArrayList<Employee> e) ;
	void serchemployeebyid(ArrayList<Employee> e,int empid) throws CustomException;
	
	
		
	
}
