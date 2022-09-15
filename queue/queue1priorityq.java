package queue;
import java.util.*;
public class queue1priorityq {

	public static void main(String[] args) {
		PriorityQueue <String> q= new PriorityQueue <String>();
		String [] s={"red","blue","green","black"};
		q.addAll(Arrays.asList(s));
		
		System.out.println(q);
		
	}

}
