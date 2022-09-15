package set;
import java.util.*;
public class set5hashsetend {

	public static void main(String[] args) {
		HashSet <Integer> hs=new HashSet<Integer>();
		hs.add(2);
		hs.add(33);
		hs.add(44);
		hs.add(55);
		hs.add(66);
		hs.add(77);
		
		System.out.println("ENTER THE ELEMENT TO BE ADDED ");
		Scanner sc= new Scanner(System.in);
		int d = sc.nextInt();
		hs.add(d);
		System.out.println(hs);

	}

}
