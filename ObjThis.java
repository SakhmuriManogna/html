package mano;

public class ObjThis {
	int x;
	ObjThis()
	{
		 x=9;
		System.out.println("this is construtor:--  "+x);
	}
	
	void mano()
	{
		int x=7;
		
		System.out.println(x);
	}
	
	void mano1()
	{
		
		System.out.println(x); 
	}
	public static void main(String[] args) {
		ObjThis n=new ObjThis();
		n.mano();
		n.mano1();
		System.out.println("-------------------------------------------------------------");
		new ObjThis().mano();
		new ObjThis().mano1();
		

	}

}
