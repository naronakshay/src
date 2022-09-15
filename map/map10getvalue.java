package map;

import java.util.HashMap;
import java.util.*;
public class map10getvalue {

	public static void main(String[] args) {
		HashMap <Integer,String> hm = new HashMap <Integer,String>();
		hm.put(1,"AKSHAY");
		hm.put(2, "AKASH");
		System.out.println(hm);
		
		System.out.println("ENTER THE KEY :");
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		
		if(hm.containsKey(k))
		{
			String e=(String) hm.get(k);
			System.out.println("THE VALUE OF THE KEY "+k+"is "+e);
		}
		else
			System.out.println("DOESNT CONTAIN THE KEY");
		
	}

}
