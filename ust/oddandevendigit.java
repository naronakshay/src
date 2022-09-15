package ust;
import java.util.*;
public class oddandevendigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER  :");
		int n = sc.nextInt();
		int osum=0,esum=0;
		while(n>0)
		{
			int digit= n%10;
			if(digit%2 == 0)
				esum=esum+digit;
			else 
				osum= osum+digit;
			
			n=n/10;
			
			
		}
		
		System.out.println("ODD SUM = "+ osum);
		System.out.println("EVEN SUM = "+ esum);

		
		
		
	}

}
