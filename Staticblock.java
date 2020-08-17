package mano;

public class Staticblock {
	static void mano()
	{
		System.out.println("This is static block");
		
	}
	void hello()
	{
		System.out.println("this is a hello fun");
	}

	public static void main(String[] args) {
		mano();
		
		System.out.println("This is public static void main block ");
		Staticblock s=new Staticblock();
		Staticblock s1=new Staticblock();
	    s.hello();
		s1.hello();

	}

}
