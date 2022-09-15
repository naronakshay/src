package ust;
import java.util.*;
public class grade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a ;
		System.out.println("Enter the grade :");
		a = sc.nextInt();
		
		if(a>=70)
			System.out.println("HONORS");
		else if (a>=60 && a<70)
			System.out.println("FIRST DIVISION");
		else if (a>=50 && a<60)
			System.out.println("SECOND DIVISION");
		else if(a>=40 && a<50)
			System.out.println("THIRD DIVISON");
		else if(a<40)
			System.out.println("FAIL");
		else
			System.out.println("ENTER A VALID GRADE");

	}

}
