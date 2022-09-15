package map;

import java.util.HashMap;
import java.util.Map;

public class map3copy {

	public static void main(String[] args) {
		HashMap <Integer,String> hm = new HashMap <Integer,String>();
		hm.put(1,"AKSHAY");
		hm.put(2, "AKASH");
		System.out.println("ORIGINAL "+hm);
		
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		HashMap <Integer,String> nhm = new HashMap <Integer,String>();
		
		nhm.putAll(hm);
		
		System.out.println("COPIED"+nhm);
		
		for(Map.Entry m:nhm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}

}
