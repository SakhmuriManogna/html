package mano;
import java.util.Scanner;
public class Customer {
	
		 int id;
		String name;
		 int Phno;
		 static String desg;
		float salary;
	    static int block;
	    
	    static{
	    	desg="APSE";
	    	block=1;
	    	//System.out.println("static 1");
	    	
	    }
	   /* Customer(  int id,String name,int Phno,float salary){
	    	this.id=id;
	    	this.name=name;
	    	this.Phno=Phno;
	    	this.salary=salary;
	    	
	    } */
	    
	    void create () {
	    	Scanner sc = new Scanner(System.in);
	    	
	    	System.out.println("Give name of Customer"  );
	    	name=sc.nextLine();
	    	System.out.println("Give Phno of Customer"  );
	    	Phno=sc.nextInt();
	    	System.out.println("Give designation of Customer"  );
	    	desg=sc.next();
	    	System.out.println("Give salary of Customer" );
	    	salary=sc.nextFloat();
	    	
	    	
	    }
	    
	    void disp() {
	    	System.out.println("The name of Customer"  +name);
	    	System.out.println("The Phno of Customer"  +Phno);
	    	System.out.println("The designation  of Customer"  +desg);
	    	System.out.println("The salary of Customer"  +salary);
	    	System.out.println("The block of Customer" +block);
	    	System.out.println("The Id of Customer" +id);
	    	
	    	
	    }

		public static void main(String[] args) {
			
			Customer e=new Customer();
			//Customer e1=new Customer(2,"mahesh",987997,25000.0f);
			//Customer e2=new Customer(3,"vishnu",9880657,25000.0f);
			
		e.create();
		e.disp();
		//.disp();
		//e2.disp();

		}

	}

