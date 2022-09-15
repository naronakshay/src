package ust;

class Degree {
	public void degree() {
		System.out.println("I GIT A DEGREE");
	}
}

class Undergraduate extends Degree{
	public void degree() {
		System.out.println("I AM UNDERGRADUATE");
	}
}

class Postgraduate extends Degree{
	public void degree() {
		System.out.println("I AM POATGRADUATE");
	}
}
public class degreein {

	public static void main(String[] args) {
		Degree obj1=new Degree();
		Undergraduate obj2= new Undergraduate();
		Postgraduate obj3=new Postgraduate();
		
		obj1.degree();
		obj2.degree();

		obj3.degree();

		
		

	}

}
