package ust;
import java.util.*;
public class multiplicationnew {

	public static void main(String[] args) {
		int a ;
	
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER :");
		a = sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			int k=a*i;
			System.out.println( a + "x" + i + "="+k);
		}

	
	}

}
