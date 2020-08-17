package mano;

public class ObjReferences {

	
		int x;
		static int y;
		void disp()
		{
		System.out.println(x);
	    }
		
		
		static void mano()
		{
			int b=10; // local variable cannot be static it gives a error if we want to declare a static variable declare it only out of function in the start.
			System.out.println(y);
			System.out.println(b);
		}
		
		void just() 
		{
			disp();// i called disp directly bcoz this fun is also a non static function and this function is called below.
		}
		public static void main(String[] args) {
		
			ObjReferences m=new ObjReferences();
			ObjReferences l=new ObjReferences();// we created obj bcoz int x and void disp are non static functions
			m.disp();  // we called a non static function
			l.just(); // called just function
			mano(); //we  did created obj bcoz int y and void mano are static functions
	}
}
