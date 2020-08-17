package mano;

public class Employee {
	int rollno;
	String name;
	int phonenumber;
	float cgpa;
	int age;
	
	void init()
	{
		rollno=1;
		name="ramu";
		phonenumber=963872188;
		cgpa=7.8f;
		age=21;
		
		
	}
	void init1()
	{
		rollno=14;
		name="harish";
		phonenumber=89635788;
		cgpa=6.78f;
		age=20;
	}
	  void displayEmploye()
	  {
		 
		  System.out.println(rollno);
		  System.out.println(name);
		  System.out.println(phonenumber);
		  System.out.println(cgpa);
		  System.out.println(age);
		
	  }

	public static void main(String[] args) 
	{
    
     Employee m=new Employee();
     m.init();
     m.displayEmploye();
     m.init1();
     m.displayEmploye();
	}

}
