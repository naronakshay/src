package queue;

import java.util.Arrays;
import java.util.PriorityQueue;

public class queue3noofelements {

	public static void main(String[] args) {
		PriorityQueue <String> q= new PriorityQueue <String>();
		String [] s={"red","blue","green","black"};
		q.addAll(Arrays.asList(s));
		
		System.out.println(q);
		System.out.println("SIZE:"+q.size());
		
		

	}

}
