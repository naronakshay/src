package ust;

class Shape{
	public void show() {
		System.out.println("THIS IS SHAPE");
	}
	
}

class Rectangle extends Shape{
	public void show() {
		System.out.println("THIS IS RECTANGLE");
	}
}

class Circle extends Shape{
	public void show() {
		System.out.println("THIS IS CIRCLE ");
	}
}
class Square extends Rectangle{
	public void show() {
		System.out.println("square is rectangle ");
	}
}


public class shapein {

	public static void main(String[] args) {
		Shape sh = new Square();
		Rectangle r= new Square();
		sh.show();
		r.show();
		
	}

}
