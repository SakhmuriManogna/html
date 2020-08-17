package mano;

public class noofzeros {
	public static void main(String[] args)
	 {
		int count=0;
		 
        int[] b = {1,2,7,0,4,5,0,0,0};
         

   for(int i = 0; i < b.length; i++)  //for(int i = 0; i < arr.length; i++) 
   {
   
	if (b[i] == 0) 
      count++;
    
	}
    	
    
	System.out.println("the no of zeros are:"+count);
	}
	}

