package ust;

class Print{
	public void printn(int n , char c)
	{
		System.out.println(" "+n+c);
	}
	
	public void printn( char c,int n)
	{
		System.out.println(" "+c+n);
	}
	
}
public class printintchar {

	public static void main(String[] args) {
		Print obj=new Print();
		obj.printn(1,'a');
		obj.printn('b',2);
	}

}
