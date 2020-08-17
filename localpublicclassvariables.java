package mano;
//local
/* public class localpublicclassvariables {

	public static void main(String[] args) {
		int x;   //it is a local variable.(1)A local variable declared inside a method.(2)It doesn't have any default value it should be declared.
        x=20;
        System.out.println(x);
        //local end 
	}

}*/
public class localpublicclassvariables {
	    static int z=9; // class variable bcoz of static
	    int y=20; //not a local variable instance variable bcoz declared outside a method (1)local (2)instance (3)class
		
		 void mano()
		 {
			 int x=10; //local variable
			 
			 System.out.println("mano function :"+x);//local variable cannot be used in disp function
		 }
		 void disp()
		 {
			 System.out.println("display function:"+y);
		 }

		public static void main(String[] args) 
		
		//before declaring we sholud see if a function is satic or non static function here by it is a non static function//
		// static void mano()--- static function   void mano()----non static function//
		{
		//classname object= new classname();--this is how we create a object of a function.	
			functionsinjava m= new functionsinjava();
			
		    
			
			m.mano();
			m.disp();
			System.out.println("the output is:"  +m.y);//you cannot call a instance variable directly into a static function(public static void main)
			System.out.println("the output is:"  +z);
    }
}
