package vandy;
public class Main {

	public static void main(String[] args) {
    	
      Student a[]=new Student[5];
    Student s1=new Student("rishi1",3, "java");
    Student s2=new Student("rishi2",9, "python");
    Student s3=new Student("rishi3", 8,"ruby");
    Student s4=new Student("rishi4",1, "scala");
    Student s5=new Student("rishi5",2 ,"cpp");

    a[0]=s5;
    a[1]=s4;
    a[2]=s3;
    a[3]=s2;
    a[4]=s1;
    System.out.println();
    for(int i=0;i< a.length-1; i++)
    {
    	for(int j=i+1;j< a.length;j++)
    	{
    		if(a[i].getAge() > a[j].getAge())
    		{
    			Student temp=  a[i];
    			a[i]=a[j];
    			a[j]=temp;
    			
    			
    		}
    		
    	}
    }
    for(int k=0;k<a.length; k++) {
    System.out.print(a[k].getName()+" ");
    System.out.print(a[k].getAge()+" ");
    System.out.print(a[k].getSubject()+" ");
    System.out.println();
    }
    
		
	}
}
