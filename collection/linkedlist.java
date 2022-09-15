package collection;
import java.util.*;

public class linkedlist {

	public static void main(String[] args) {
		LinkedList <Integer> list1 = new LinkedList <Integer> ();
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER THE FIRST 3 ELEMENT");
		for(int i =0;i<4;i++)
		{
			int data =sc.nextInt();
			list1.add(data);
		}
		System.out.println("THE LINKED LIST IT ");
		Iterator it= list1.iterator();
		
		while(it.hasNext())
		{
			System.out.print(" "+it.next()+"->");
		}
		System.out.println("null");
		System.out.println("ENTER THE LAST ELEMENT :");
		Scanner s= new Scanner(System.in);
		int d=s.nextInt();
		list1.addLast(d);
		
	Iterator i= list1.iterator();
		
		while(i.hasNext())
		{
			System.out.print(" "+i.next()+"->");
		}
		
		System.out.println("null");

		
	}

}
