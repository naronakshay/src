package ust;
import java.util.*;
public class pattern7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		for(int i=1;i<a;i++)
		{
			int c=8;
			for(int j=1;j<=i;j++)
			{
				System.out.print(c);
				c--;
			}
			System.out.println();
		}
	}

}
