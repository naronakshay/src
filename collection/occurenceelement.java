package collection;

import java.util.LinkedList;
import java.util.Scanner;

public class occurenceelement {

	public static void main(String[] args) {
		LinkedList <Integer> l=new LinkedList <Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE ELEMENTS ");
		for(int i=0;i<6;i++)
		{
			int data = sc.nextInt();
			l.add(data);
			
		}
		
		System.out.println("ENETR THE ELEMENT TO BE FOUND:");
		int  n= sc.nextInt();
		
		System.out.println(l.indexOf(n));
		System.out.println(l.lastIndexOf(n));
		

	}

}
