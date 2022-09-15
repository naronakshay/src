package set;

import java.util.Iterator;
import java.util.TreeSet;

public class set3reverse {

	public static void main(String[] args) {
		TreeSet <String>t = new TreeSet <String >();
		t.add("BLUE");
		t.add("ORANGE");
		t.add("BLACK");
		t.add("WHITE");
		
		System.out.println("IN ORIGINAL ORDER:");
		Iterator i = t.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		System.out.println("IN REVERSE ORDER:");
		Iterator i2 = t.descendingIterator();
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		
		
		
		
		

	}

}
