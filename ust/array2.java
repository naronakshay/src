package ust;

import java.util.Scanner;

public class array2 {

	public static void main(String[] args) {
		int a[]= new int[10];
		Scanner sc= new Scanner(System.in);

		for(int i=0;i<10;i++)
		{
			System.out.println("ENTER THE NUMBER");
			a[i]=sc.nextInt();
	}
		
		System.out.println("ENTER THE NUMBER TO BE SEARCHED ");
		int n = sc.nextInt();
		int flag=0;
		for(int i=0;i<10;i++)
		{
			if(a[i]== n)
			{
				flag++;
				break;
			}
			
		}
		if (flag>0)
			System.out.println("THE NUMBER IS  PRESENT");
		else
			System.out.println("THE NUMBER NOT PRESENT");
		
	}

}
