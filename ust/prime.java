package ust;
import java.util.*;
public class prime {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER THE RANGE");
		int a =sc.nextInt();
		for(int i=2;i<=a;i++)
		{
			int flag=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag++;
					break;
				}
				
					
			}
			if(flag==0)
				System.out.println(i);
			
		}

	}

}
