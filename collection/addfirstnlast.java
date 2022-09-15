package collection;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class addfirstnlast {

	public static void main(String[] args) {
		LinkedList <Integer> l=new LinkedList <Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE ELEMENTS ");
		for(int i=0;i<6;i++)
		{
			int data = sc.nextInt();
			l.add(data);
			
		}
		
		
		
		System.out.println("ENTER THE FIRST ELEMENT");
		int f = sc.nextInt();
		l.offerFirst(f);
		System.out.println("ENTER THE LAST ELEMENT");
		int la = sc.nextInt();
		l.offerLast(la);
		
		ListIterator i= l.listIterator();
		System.out.println("LINKED LIST:");
		while(i.hasNext())
		{
			System.out.print(" "+i.next()+" ");
		}
		
		
		
		
		
	}

	

}
