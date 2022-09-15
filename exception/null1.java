package exception;

public class null1 {

	public static void main(String[] args) {
	
	try {
		 	String s= null;
		 	if(s.equals("aks"))
		 		System.out.println("SAME");
		 	else
		 		System.out.println("NOT SAME");
		}
	catch(NullPointerException e)
		{
			System.out.println("NULL POINTER EXCEPTION CAUGHT");
		}

	}

}
