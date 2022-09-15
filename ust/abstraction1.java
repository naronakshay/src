package ust;
abstract class ParentAbstract{
	public abstract void message();
}

class Child1 extends ParentAbstract{
	public void message() {
		System.out.println("THIS IS FIRST SUBCLASS");
	}
}

class Child2 extends ParentAbstract{
	public void message() {
		System.out.println("THIS IS SECOND SUBCLASS");
	}
}

public class abstraction1 {

	public static void main(String[] args) {
		Child1 n=new Child1();
		Child2 m =new Child2();
		m.message();
		n.message();
		
		
		
		

	}

}
