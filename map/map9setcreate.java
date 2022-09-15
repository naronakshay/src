package map;
import java.util.*;
import java.util.HashMap;

public class map9setcreate {

	public static void main(String[] args) {
		HashMap <Integer,String> hm = new HashMap <Integer,String>();
		hm.put(1,"AKSHAY");
		hm.put(2, "AKASH");
		System.out.println(hm);
		
		Set s= hm.entrySet();
		System.out.println(s);
		
		
	}

}
