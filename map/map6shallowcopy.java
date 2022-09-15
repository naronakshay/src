package map;

import java.util.HashMap;

public class map6shallowcopy {

	public static void main(String[] args) {
		HashMap <Integer,String> hm = new HashMap <Integer,String>();
		hm.put(1,"AKSHAY");
		hm.put(2, "AKASH");
		System.out.println(hm);
		HashMap <Integer,String>  nhm = new HashMap <Integer,String>();
		
		nhm=(HashMap) hm.clone();
		System.out.println(nhm);
		
		
		

	}

}
