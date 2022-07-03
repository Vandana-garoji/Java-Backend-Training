package vandy;

public class Student {
	
	
	
	private String name;
	private int age ;
    private String subject;
    public String getName() 
    {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setBatch(String subject) {
		this.subject = subject;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	

    

    public Student(String n,int b, String s) {
        this.name = n;
        this.age = b;
        this.subject = s;
        
    }

}