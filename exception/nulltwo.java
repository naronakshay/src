package exception;
import java.io.*;
import java.lang.String;
public class nulltwo {

	public static void main(String[] args) {
		String s=null;
		try
		{
			System.out.println(s.length());
		}
		catch(NullPointerException e ){
			System.out.println("NULLL POINTER EXCEPTION FOUND");
		}
		
	}

}
