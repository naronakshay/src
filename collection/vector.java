package collection;
import java.util.*;
public class vector {

	public static void main(String[] args) {
		Vector <Integer> v = new Vector <Integer>();
		v.add(22);
		v.add(23);
		v.add(25);
		
		System.out.println(v);
		v.remove(0);
		System.out.println(v);
		
		System.out.println(v.get(1));

	}

}
