package mano;

public class owntry {
	int x=9;
	int y;
	
	void trye(int x, int y)
	{
		y=this.y;
		System.out.println(y);
		y=87;
		
		x=this.x;
		System.out.println(x);
		
	}

		
	public static void main(String[] args)
	{
	owntry d= new owntry();
	d.trye(d.x,d.y);

	}

}