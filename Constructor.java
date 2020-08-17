package mano;

public class Constructor {
	int x;
	 Constructor()
	 { 
		x=10;
		
		 System.out.println("First function:");  // excutes first as it is a constrcutor.
	 }                                       //the moment we use create a obj a consyrctor is  called first
	 void just()
	 {
		 System.out.println("Second function "+x);
	 }

	public static void main(String[] args)
	{
		Constructor c=new Constructor();
	 c.just(); //Even though i called just function first as we created a constructor it excutes first
		

	}

}
