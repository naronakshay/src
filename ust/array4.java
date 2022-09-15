package ust;

import java.util.Scanner;

public class array4 {

	public static void main(String[] args) {
		int a[]= new int[5];
		Scanner sc= new Scanner(System.in);

		for(int i=0;i<5;i++)
		{
			System.out.println("ENTER THE NUMBER");
			a[i]=sc.nextInt();
	}
		int s=a[0],l=a[0];
		for(int i=1;i<5;i++)
		{
			if(s>a[i])
			{
				s=a[i];
			}
			if(l<a[i])
				l=a[i];
		}
		System.out.println("LARGEST NUMBER IS:"+l);
		System.out.println("SMALLEST NUMBER IS:"+s);

	}
	

}
