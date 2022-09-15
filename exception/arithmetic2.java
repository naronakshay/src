package exception;
import java.math.BigDecimal;
public class arithmetic2 {

	public static void main(String[] args) {
		BigDecimal a=new BigDecimal(11);
		BigDecimal b=new BigDecimal(17);
		try {
			a=a.divide(b);
			System.out.println(""+a);
		}
		catch(ArithmeticException e)
		{
			System.out.println("arithmetic exception found");
		}
	}

}
