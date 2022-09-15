package set;
import java.util.*;
public class set2iteration {

	public static void main(String[] args) {
		TreeSet <String>t = new TreeSet <String >();
		t.add("BLUE");
		t.add("ORANGE");
		t.add("BLACK");
		t.add("WHITE");
		
		Iterator i = t.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}

}
