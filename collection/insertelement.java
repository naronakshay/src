package collection;
import java.util.*;
public class insertelement {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		LinkedList <Integer> l = new LinkedList <Integer> ();
		System.out.println("ENTER THE ELEMENTS ");
		for(int i=0;i<6;i++)
		{
			int data = sc.nextInt();
			l.add(data);
			
		}
		ListIterator i= l.listIterator();
		System.out.println("LIST");
		while(i.hasNext())
		{
			System.out.print(" "+i.next()+" ");
		}
		System.out.println();
		System.out.println("ENTER THE POSITION TO BE ENTERED: ");
		int pos = sc.nextInt();
		System.out.println("ENTER THE ELEMENT: ");
		int e = sc.nextInt();
		if(pos == 1 )
			l.addFirst(e);
		else if(pos-1>l.indexOf(l.getLast()))
		{
			l.addLast(e);
		}
		else
			l.add(pos-1, e);
		
		
		ListIterator it= l.listIterator();
		System.out.println("LIST AFTER ADDING");
		while(it.hasNext())
		{
			System.out.print(" "+it.next()+" ");
		}
		System.out.println();

	}

}
