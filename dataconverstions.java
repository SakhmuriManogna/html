package mano;

public class dataconverstions {
	public static void main(String[] args) {
		
		String h="456";
		int x=Integer.parseInt(h); //unboxing
		
		System.out.println( "here we are converting (string)class datatype into premitive data type(int): "   +x);
		//we use wrapper classes as a medium of converstions. //
		/* BOXING - conversion of premitive to class
                    UNBoxing -- converting class to premitive
--------------------  ----------WRAPPER CLASSES--------------
                         byte   -- Byte
                          short --Short
                           int  --- Integer
                            long --Long
                             float  -Float
                               double -Double
                                char  --- Character
                                  boolean -Boolean  
		----------------------------------------------------------------------*/
int aa=185;
Integer cc=aa;
String bb=cc.toString();
System.out.println( "here we are converting (int)premitive datatype into class data type(string): "   +bb);

/*String m="g";
char j=Character.parsechar(m);

//unboxing
System.out.println( "here we are converting (string)class datatype into premitive data type(int): "   +j);
	gives a error bcoz a char can only save 1 character.*/
	}
	
	

}
