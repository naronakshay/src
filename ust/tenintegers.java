package ust;
import java.util.*;
public class tenintegers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int sum=0;
		System.out.println("ENTER THE TEN NUMBERS: ");
		for(int i=1;i<=10;i++)
		{
			 int a = sc.nextInt();
			 sum=sum+a;
			 
		}
		int avg=sum/2;
		
		System.out.println(avg);
	}

}
