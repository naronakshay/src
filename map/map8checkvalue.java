package map;

import java.util.HashMap;
import java.util.Scanner;

public class map8checkvalue {

	public static void main(String[] args) {
		HashMap <Integer,String> hm = new HashMap <Integer,String>();
		hm.put(1,"AKSHAY");
		hm.put(2, "AKASH");
		System.out.println(hm);
		System.out.println("ENTER THE VALUE TO BE CHECKED :");
		Scanner sc= new Scanner(System.in);
		String k = sc.next();
		
		if(hm.containsValue(k))
		{
			System.out.println("MAP CONTAINS THE VALUE "+k );
		}
		else
			System.out.println("DO NOT CONTAIN THE VALUE"+k);
		

	}

}
