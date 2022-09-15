package ust;

import java.util.Scanner;

public class array3 {

	public static void main(String[] args) {
		int a[]= new int[5];
		Scanner sc= new Scanner(System.in);

		for(int i=0;i<5;i++)
		{
			System.out.println("ENTER THE NUMBER");
			a[i]=sc.nextInt();
	}
		int sum=0,p=1;
		for(int i=0;i<5;i++)
			sum=sum+a[i];
		for(int i=0;i<5;i++)
			p=p*a[i];
		System.out.println("THE SUM IS :"+sum);
		System.out.println("THE PRODUCT IS :"+p);
		
		
		

	}

}
