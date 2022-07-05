import java.io.Serializable;

public class Employee implements Serializable{

	int id;
	String name;
	Long salary;
	String designation;
	
	
	
	public int getId() {
	    return id;
	}

	public void setId(int id) {
	    this.id = id;
	}

	public String getName() {
	    return name;
	}

	public void setName(String name) {
	    this.name = name;
	}

	public float getSalary() {
	    return salary;
	}

	public void setSalary(Long salary) {
	    this.salary = salary;
	}

	public String getDesignation() {
	    return designation;
	}

	public void setDesignation(String designation) {
	    this.designation = designation;
	}

	public Employee(int id, String name, Long salary, String designation)
	{
	    this.id = id;
	    this.name = name;
	    this.salary = salary;
	    this.designation = designation;
	}

	public String toString()
	{
	    return "\nEmployee Details :" + "\nID: " + this.id + "\nName: " + this.name + "\nSalary: " +this.salary + "\nDesignation: " + this.designation;
	}
}
