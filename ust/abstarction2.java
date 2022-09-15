package ust;

abstract class Animals{
	public abstract void cats();
	public  abstract void dogs();
	
}

class Cats extends Animals{
	public void cats() {
		System.out.println("CAT MEOWS");
	}
	public void dogs()
	{}
}

class Dogs extends Cats{
	public void dogs() {
		System.out.println("DOG BARKS");
	}
	public void cats() {}
}

public class abstarction2 {

	public static void main(String[] args) {
		Dogs a = new Dogs();
		a.dogs();
		Cats b=new Cats();
		b.cats();
		

	}

}
