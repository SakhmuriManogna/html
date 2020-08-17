package mano;

public class Symbolsusage {
	
	static int x=10;
	static int y=25;

	public static void main(String[] args) {
		
		int z=50; //int z;
		//z+=x;// shows a error bcoz local variables should have a defenite value
		z+=x;
		y+=x; // this meaning: y=y+x;
		System.out.println("ans:"  +y);
		System.out.println("ans:"  +z);//ctrl+space

	}

}
