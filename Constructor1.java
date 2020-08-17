package mano;

public class Constructor1 {
	String name;
	Constructor1()   //same as class name 
	{
	name="mano";	
	}
	//Constructor1()// error bcoz only 1 constructor can be passed
	Constructor1(int x)    // it is a another contsructor--not a error bcoz diff parameters passed
	{
		name="Sakhamuri";
	}
	
	Constructor1(int x,float y)    // it is a another contsructor--not a error bcoz diff parameters passed
	{
		name="Sakham";
	}
void disp()
{
	System.out.println(name);
}
	public static void main(String[] args) {
		Constructor1 c=new Constructor1();  //obj
		c.disp(); // prints mano bcoz above obj have 0 args
		
		//Constructor1 c1=new Constructor1(10);  //obj  //if ur subborn to use float value then;
		//c1.disp(); // prints sakhamuri bcoz above obj have 1 args ie int 10. and ie float 10.5
		
		
		Constructor1 c2=new Constructor1((int)10.5f);  //obj
		c2.disp(); // prints sakhamuri bcoz above obj have 1 args ie int 10 . we converted explict int to float
		
		
		Constructor1 c3=new Constructor1(10,10.5f);  //obj
		c3.disp(); 

	}

}
