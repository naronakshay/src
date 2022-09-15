
package ust;
import java.util.*;

public class vote {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the age:");
		int a = sc.nextInt();
		if(a>=18)
		{
			System.out.println("elegible for voting");
		}
		else 
		{
			System.out.println("not elegible for voting");
		}
		

	}

}
