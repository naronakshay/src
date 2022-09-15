package collection;
import java.util.*;
public class linkedlist2specified {

	public static void main(String[] args) {
		LinkedList <Integer> l1= new LinkedList <Integer>();
		
		Scanner sc= new Scanner(System.in);
		for(int i=1;i<5;i++)
		{
			int data =sc.nextInt();
			l1.add(data);
			
		}
		
		System.out.println("ENTER THE POSITION :");
		int pos = sc.nextInt();
		ListIterator i = l1.listIterator(pos);
		
		while(i.hasNext())
		{
			System.out.print(" "+i.next()+"->");
		}
		System.out.println("null");
		
		
		
	}

}
