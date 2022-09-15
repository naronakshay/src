package ust;

class A{
	static void print() {
		System.out.println("PARENT");
	}
}

class B extends A {
	static void print() {
		System.out.println("CHILD");
	}
}
public class staticparent {

	public static void main(String[] args) {
		A ob = new A();
		B ob1 = new B();
		A ob2 = new B();
		
		ob.print();
		ob1.print();
		ob2.print();
		
		
	}

}
