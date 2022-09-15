package exception;
import java.text.*;
public class mutliplecath {

	public static void main(String[] args) {
			int an;
			try {
				int a[]=new int[5];
				a[6]=8;
			 an = 10/0;
						
			}
			catch(ArithmeticException e){
				System.out.println("ARITHMETIC EXCEPTION OCCURS");
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("ARRAY INDEX OUT OF BOUND EXCEPTION OCCURS");
			}
			System.out.println("REST OF THE CODE ");
			
	}

}
