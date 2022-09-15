package ust;

 class Member {
	 public String name,address,phone;
	public   int age,salary;
	
	 
	 public void prints() {
		 System.out.println("SALARY:"+ salary);
	 }
	 
	 
	
}
 
class Employee extends Member
{
	String specialization;
}

class Manager extends Member {
	String department;
	
}

public class memberinheritence {

	public static void main(String[] args) {
		Employee e= new Employee();
		Manager m = new Manager();
		m.name= "akshay";
		m.phone="8593882669";
		m.address="HILL VIEW , PO PERUNTHATTIL, THALASSERY , KANNUR";
		m.salary=22000;
		m.age = 22;
		
		e.name= "krishnapriya";
		e.phone="8138982783";
		e.address="KRISHNA NIVAS, PO ALUVA ,ERANAKULAM ";
		e.salary=10000;
		e.age=25;
		
		System.out.println("EMPLOYEE DETAILS :");
		System.out.println(e.name);
		System.out.println(e.age);
		System.out.println(e.phone);
		System.out.println(e.address);
		System.out.println(e.salary);
		
		
		System.out.println("MANAGER  DETAILS :");
		System.out.println(m.name);
		System.out.println(m.age);
		System.out.println(m.phone);
		System.out.println(m.address);
		System.out.println(m.salary);
		
		
		
		
	}

}
