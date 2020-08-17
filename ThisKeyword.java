package mano;

public class ThisKeyword {

	int x=100;   //instance variables
	void myMeth(){
	int x=50;
	System.out.println(x);//loc var
	System.out.println(this.x);//instance x .. this refers to current object i.e instace variables
	}

	public static void main(String[] args) {
		ThisKeyword d= new ThisKeyword();
	d.myMeth();
	//System.out.println(d.x);

	}

	}