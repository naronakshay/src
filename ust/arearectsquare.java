package ust;

class Area{
	public void printarea(int l, int b)
	{
		System.out.println("Area of rectangle is :"+ (l*b));
	}
	
	public void printarea(int l)
	{
		System.out.println("Area of rectangle is :"+ (l*l));
	}
	
}


public class arearectsquare {

	public static void main(String[] args) {
		Area obj= new Area();
		obj.printarea(10,20);
		obj.printarea(10);
		
	}

}
