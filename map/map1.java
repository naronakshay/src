package map;
import java.util.*;
public class map1 {

	public static void main(String[] args) {
		HashMap <Integer,String> hm = new HashMap <Integer,String>();
		hm.put(1,"AKSHAY");
		hm.put(2, "AKASH");
		System.out.println(hm);
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE KEY");
		int k=sc.nextInt();
		String v=sc.next();
		hm.put(k, v);
		for(Map.Entry m : hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		

	}

}
