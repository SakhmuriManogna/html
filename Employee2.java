package mano;

class Employyee{
int empId;
String empName;

void init(int empId,String empName){
this.empId=empId;
this.empName=empName;
}

/*
void init(int eid,String ename){
empId=eid;
empName=ename;
}
*/
void disp() {
System.out.println(empId + " "+empName);
}

}


public class Employee2 {

public static void main(String[] args) {

Employyee employee1=new Employyee();
employee1.init(1,"RAJ");

Employyee employee2=new Employyee();
employee2.init(2,"RAJA");

Employyee employee3=new Employyee();
employee3.init(3,"RAJU");

Employyee employee4=new Employyee();
employee4.init(4,"RAJESH");


employee1.disp();
employee2.disp();
employee3.disp();
employee4.disp();


}

}