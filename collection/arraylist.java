package collection;
import java.util.*;

public class arraylist {

	public static void main(String[] args) {
		ArrayList <String> l= new ArrayList<String>();
		l.add("MANGO");
		l.add("APPLE");
		l.add("BANANA");
		
		System.out.println(l);
		
		Iterator i = l.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		for(String f:l)
		{
			System.out.println(f);
		}
		
		System.out.println(l.get(1));
		
		l.set(1, "NO FRUIT");
		System.out.println(l);
	}

}
