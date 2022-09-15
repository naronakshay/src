package map;
import java.util.*;
import java.util.HashMap;

public class map11keyset {

	public static void main(String[] args) {
		HashMap <Integer,String> hm = new HashMap <Integer,String>();
		hm.put(1,"AKSHAY");
		hm.put(2, "AKASH");
		System.out.println(hm);
		
		Set k=hm.keySet();
		System.out.println("THE KEY SET IS :"+k);

	}

}
