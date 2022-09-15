package exception;

public class trycatch {

	public static void main(String[] args) {
			try {
				int data = 100/0;
				
			}
			catch (ArithmeticException e) {
				System.out.println("REST OF THE CODE ");
			}
	}

}
