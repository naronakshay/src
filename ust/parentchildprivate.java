package ust;

class Parentone{
	private void show() {
		System.out.println("This is parent class");
		
	}
}

class Childone extends Parentone{
	public void show() {
		System.out.println("This is child class");
	}
}
	


public class parentchildprivate {

	public static void main(String[] args) {
		Parentone p= new Parentone();
		//p.show();
		Childone c=new Childone();
		c.show();
		Parentone n=new Childone();
		//n.show();
		
	}

}
