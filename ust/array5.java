package ust;

import java.util.Scanner;

public class array5 {

	public static void main(String[] args) {
		int[][] a= new int [4][4];
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.println("ENTER THE NUMBER");
				a[i][j]= sc.nextInt();
			}
		}
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
