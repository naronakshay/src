package map;

import java.util.HashMap;

public class map4removemap {

	public static void main(String[] args) {
		HashMap <Integer,String> hm = new HashMap <Integer,String>();
		hm.put(1,"AKSHAY");
		hm.put(2, "AKASH");
		
		System.out.println(hm);
		hm.clear();
		System.out.println(hm);

	}

}
