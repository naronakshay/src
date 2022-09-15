package queue;

import java.util.Arrays;
import java.util.PriorityQueue;

public class queue4comparepq {

	public static void main(String[] args) {
		PriorityQueue <String> q= new PriorityQueue <String>();
		String [] s={"red","blue","green","black"};
		q.addAll(Arrays.asList(s));
		System.out.println(q);
		PriorityQueue <String> q2= new PriorityQueue <String>();
		String [] s2={"red","blue","green","black"};
		q2.addAll(Arrays.asList(s2));
		System.out.println(q2);
		
		if(q.size() == q2.size())
		{
			/*PriorityQueue <String> qc= new PriorityQueue <String>(q);
			qc.retainAll(q2);
			if(qc.size() == q.size())
				System.out.println("EQUAL");
			else
				System.out.println("DIFFERENT");*/
			int flag=0;
			for(String e:q)
			{
				for(String e2:q2)
				{
					if(e == e2)
						flag++;
				}
			}
			
			if(flag==q.size())
			{
				System.out.println("SAME");
			}
			else
				System.out.println("DIFFERENT");
			
			
		}
		else
			System.out.println("DIFFERENT");
		
	}

}
