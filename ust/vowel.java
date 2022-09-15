package ust;
import java.util.*;
public class vowel {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		System.out.println("ENTER THE CHARACTER:");
		char a = sc.next().charAt(0);
		
		if(a == 'a'|| a =='e'||a=='i'||a=='o'||a=='u')
			System.out.println("IS VOWEL ");
		else 
			System.out.println("not a vowel");
	}

}
