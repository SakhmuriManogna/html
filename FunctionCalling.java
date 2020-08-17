package mano;

public class FunctionCalling {

	
			int x;
			void init(){
			x=50;
			System.out.println(x);
			}
			void disp(){
			System.out.println(x);
			
			x=60;
			System.out.println(x);
			}
			 void mano()
			 { 
				 int z=10;
				 init();
				 System.out.println("the value of x" +z);
			 }
			public static void main(String[] args) {
			FunctionCalling d=new FunctionCalling();//x=0
			d.init(); //x=50
			d.disp();// print x(50) -> x=60
			d.disp();// print x(60) ->x=60
            d.mano();			



	}

}
