package ust;
import java.util.*;
public class primefactor {
	public static boolean prime (int n)
	{
			int flag=0;
			for(int j=2;j<n;j++)
			{
				if(n%j==0)
				{
					flag++;
					break;
				}
				
					
			}
			if(flag==0) {
				
				return true;}
			return false;
			
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER :");
		
		int a= sc.nextInt();
		
		for(int i=2;i<=(a/2);i++)
		{
			if(a%i == 0)
			{
				if(prime(i))
				{
				System.out.println(i);
			}
			
				
		}
		
	}
	}
}
