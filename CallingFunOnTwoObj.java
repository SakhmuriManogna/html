package mano;

public class CallingFunOnTwoObj {
	
	
		int x;
		void init(){
		x=50;
		}
		void disp(){
		System.out.println(x);
		x=60;
		}
		public static void main(String[] args) {
			CallingFunOnTwoObj d=new CallingFunOnTwoObj();//d.x=0
			CallingFunOnTwoObj d1=new CallingFunOnTwoObj();//d1.x=0
		d.init();// d.x=50 //
		d1.disp();// print d1.x= 0 && d1.x=60 // print is there only in disp func
		d1.init();// d1.x=50
		d.disp();// print d.x(50)  d.x=60

		


}
}
