package set;
import java.util.*;
public class set4firstlast {

	public static void main(String[] args) {
		TreeSet <String>t = new TreeSet <String >();
		t.add("BLUE");
		t.add("ORANGE");
		t.add("BLACK");
		t.add("YELLOW");
		t.add("WHITE");
		
		
		System.out.println("FIRST ELEMENT:"+t.first());
		System.out.println("LAST ELEMENT:"+t.last());
		
	}

}
