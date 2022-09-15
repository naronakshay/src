package set;
import java.util.*;
public class set5numberelss7 {

	public static void main(String[] args) {
		TreeSet <Integer> t = new TreeSet <Integer>();
		t.add(2);
		t.add(4);
		t.add(6);
		t.add(8);
		t.add(9);
		
		for(int e:t)
		{
			if(e<7)
			{
				System.out.println(e);
			}
		}

	}

}
