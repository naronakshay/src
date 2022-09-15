package map;

import java.util.HashMap;

public class map12valuecollection {

	public static void main(String[] args) {
		HashMap <Integer,String> hm = new HashMap <Integer,String>();
		hm.put(1,"AKSHAY");
		hm.put(2, "AKASH");
		System.out.println(hm);
		System.out.println("THE COLLECTION VIEW OF VALUES");
		System.out.println(hm.values());

	}

}
