package mano;

public class ifelse {

	public static void main(String[] args) {
		int x=10;
		if(x>=0 && x<=100)
		{
		if(x>=80 && x<=100)
			System.out.println("a");
		else if(x>=60 && x<=79)
			System.out.println("b");
		else if(x>=40 && x<=59)
			System.out.println("c"); 
		else if(x>=1 && x<=39)
			System.out.println("fail"); 
		}

		else
			System.out.println("Entery Wrong");
		
		
	}
}
