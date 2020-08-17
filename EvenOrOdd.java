package mano;

public class EvenOrOdd {

	public static void main(String[] args) {
        
        int p;
        int j;
        {
			p=(Integer.parseInt(args[0])%2);
			 j=p%2;
			 if(j==0)
			 {
				 System.out.println("It is a Even number");
			 }
		
		else if(j%2==1)      //% sym is for remainder
		{
			System.out.println("It is a Odd number");
		
		}
		
		
		else
		{
		
			System.out.println("invalid option selected");
		}
	}
		

	}

}
