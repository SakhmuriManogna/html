package mano;

public class increments {

	public static void main(String[] args) {
		int x=10;
		int y=x++;
		System.out.println("post increment--");
		System.out.println("the value of x is:"+x);// the values of x and y:1)y=x   2)x=x+1  
		System.out.println("the value of y is:"+y);
		 int u=9;
		 int z=++u;
	     System.out.println("pre increment--");
			System.out.println("the value of x is:"+u);// the values of u and z:(1)u=u+1 (2)z=u     
			System.out.println("the value of y is:"+z);
		int m=1;
		int n=m++;
		int h=++m;
		System.out.println(n++);
		System.out.println(++h);
	     
	
	}
	

}
