package ust;
import java.util.*;
public class pattern10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		
		int c=a-1;
		for(int i=1;i<=a;i++)
		{
			
			for(int j=1;j<=c;j++)
			{
				System.out.print(" ");
			}
			c--;
			
			for(int k=1;k<=2*i-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		c=1;
		for(int i=1;i<=a-1;i++)
		{
			
			for(int j=1;j<=c;j++)
			{
				System.out.print(" ");
			}
			c++;
			
			for(int k=1;k<=2*(a-i)-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
