package collection;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class removelement {

	public static void main(String[] args) {
		LinkedList <Integer> l=new LinkedList <Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE ELEMENTS ");
		for(int i=0;i<6;i++)
		{
			int data = sc.nextInt();
			l.add(data);
			
		}
		
		System.out.println("ENTER THE ELEMENT TO BE DELETE");
		int d =sc.nextInt();
		
		l.remove(l.indexOf(d));
		
		ListIterator i= l.listIterator();
		System.out.println("LINKED LIST:");
		while(i.hasNext())
		{
			System.out.print(" "+i.next()+" ");
		}

	}

}
