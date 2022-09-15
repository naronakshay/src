package map;

import java.util.HashMap;

public class map5emptyornot {

	public static void main(String[] args) {
		HashMap <Integer,String> hm = new HashMap <Integer,String>();
		hm.put(1,"AKSHAY");
		hm.put(2, "AKASH");
		
		if(hm.isEmpty())
			System.out.println("EMPTY");
		else
			System.out.println("NOT EMPTY");

	}

}
