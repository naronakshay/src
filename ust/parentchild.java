package ust;

class Parent{
	public void show() {
		System.out.println("This is parent class");
		
	}
}

class Child extends Parent{
	public void show() {
		System.out.println("This is child class");
	}
}
	



public class parentchild {

	public static void main(String[] args) {
		Parent p= new Parent();
		Child c=new Child();
		p.show();
		c.show();
		Parent n=new Child();
		n.show();
		
	}

}
