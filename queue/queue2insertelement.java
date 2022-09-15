package queue;
import java.util.*;
import java.util.Arrays;
import java.util.PriorityQueue;

public class queue2insertelement {

	public static void main(String[] args) {
		PriorityQueue <String> q= new PriorityQueue <String>();
		String [] s={"red","blue","green","black"};
		q.addAll(Arrays.asList(s));
		
		System.out.println(q);
		System.out.println("ENTER THE COLOUR TO BE INSERTED:");
		Scanner sc= new Scanner(System.in);
		String d=sc.next();
		
		q.offer(d);
		
		System.out.println(q);
		
	}

}
