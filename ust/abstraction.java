package ust;

abstract class Mphone{
	public void call() {
		System.out.println("CALLLING");
	}
	public abstract void move();
	public abstract void dance();
	public abstract void cook();

}

abstract class Rphone extends Mphone{
	public void move() {
		System.out.println("MOVING ");
	}
}
class Sphone extends Rphone{
	public void dance() {
		System.out.println("dancing ");
	}
	public void cook() {
		System.out.println("cooking ");
	}
}


public class abstraction {

	public static void main(String[] args) {
	 Mphone m = new Sphone();
	 m.call();
	 m.cook();
	 m.move();
	 m.dance();
	}

}
