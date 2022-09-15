package collection;
import java.util.*;
public class stack {

	public static void main(String[] args) {
		Stack <Integer> s= new Stack<Integer>();
		s.push(1);
		s.push(22);
		s.push(23);
		System.out.println(s);
		
		s.pop();
		System.out.println(s);
		
		s.push(33);
		s.push(55);
		
		Iterator i =s.iterator();
		
		while(i.hasNext())
			System.out.println(i.next());
	}

}
