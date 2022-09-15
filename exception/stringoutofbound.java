package exception;

public class stringoutofbound {

	public static void main(String[] args) {
		String a = "NARON AKSHAY";
		try {
			System.out.println(a.charAt(15));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("STRING INDEX OUT OF BOUND ERROR OCCURED");
		}

	}

}
