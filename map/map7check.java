package map;
import java.util.*;
import java.util.HashMap;

public class map7check {

	public static void main(String[] args) {
		HashMap <Integer,String> hm = new HashMap <Integer,String>();
		hm.put(1,"AKSHAY");
		hm.put(2, "AKASH");
		System.out.println(hm);
		System.out.println("ENTER THE KEY TO BE CHECKED :");
		Scanner sc= new Scanner(System.in);
		int k = sc.nextInt();
		
		if(hm.containsKey(k))
		{
			System.out.println("MAP CONTAINS THE KEY "+k );
		}
		else
			System.out.println("DO NOT CONTAIN THE KEY"+k);
		
		

	}

}
