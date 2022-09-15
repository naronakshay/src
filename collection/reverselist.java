package collection;
import java.util.*;
public class reverselist {

	public static void main(String[] args) {
		LinkedList <Integer> l=new LinkedList <Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE ELEMENTS ");
		for(int i=0;i<6;i++)
		{
			int data = sc.nextInt();
			l.add(data);
			
		}
		
		ListIterator i= l.listIterator();
		System.out.println("BEFORE REVERSING:");
		while(i.hasNext())
		{
			System.out.print(" "+i.next()+" ");
		}
		
		
		Collections.reverse(l);
		ListIterator i1= l.listIterator();
		System.out.println("AFTER REVERSING:");
		while(i1.hasNext())
		{
			System.out.print(" "+i1.next()+" ");
		}
		
	}

}
