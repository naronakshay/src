package exception;

public class numberformat22 {

	public static void main(String[] args) {
		try {
			int a = Integer.parseInt("123456789075432");
			System.out.println(a);
		}
		catch(NumberFormatException e)
		{
			System.out.println("NUMBER FORMAT EXCEPTION FOUND");
		}

	}

}
