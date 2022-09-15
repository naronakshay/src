package ust;

class PrintNumber{
	public void printn(int x)
	{
		System.out.println("Type int :"+x);
	}
	public void printn(float x)
	{
		System.out.println("Type float :"+x);
	}
	public void printn(double x)
	{
		System.out.println("Type double :"+x);
	}
	public void printn(long x)
	{
		System.out.println("Type long :"+x);
	}
	
}
public class datatypes {

	public static void main(String[] args) {
		PrintNumber n = new PrintNumber();
		n.printn(10);
		n.printn(10L);
		n.printn(10.3421f);
		n.printn(10.6382622);

	}

}
