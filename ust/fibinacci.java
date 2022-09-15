package ust;
import java.util.*;
public class fibinacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER:");
		int a =sc.nextInt();
		int first =0, second =1,next;
		int i =0;
		while(i<a)
		{
			if(i<=1)
				next=i;
			else
			{
				next=first+second;
				first=second;
				second=next;

				
			}
			System.out.println(next);
			i++;
		}
		

	}

}
