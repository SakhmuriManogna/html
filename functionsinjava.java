package mano;

public class functionsinjava {
	 int y=20; //not a local variable instance variable (1)local (2)instance (3)class
	
	 void mano()
	 {
		 int x=10;
		 System.out.println("mano function :"+x);//local variable canoot be used in disp function
	 }
	 void disp()
	 {
		 System.out.println("display function:"+y);
	 }

	public static void main(String[] args) 
	//before declaring we sholud see if a function is satic or non static function hereb it is a non static function//
	// static void mano()--- static function   void mano()----non static function//
	{
	//classname object= new classname();--this is how we create a object of a function.	
		functionsinjava m= new functionsinjava();
		m.mano();
		m.disp();
		
	}

} 
