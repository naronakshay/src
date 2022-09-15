package exception;

public class numberformat {

	public static void main(String[] args) {
		try {
			int a = Integer.parseInt("1a");
			System.out.println(a);
		}
		catch(NumberFormatException e)
		{
			System.out.println("NUMBER FORMAT EXCEPTION FOUND");
		}
	}

}
