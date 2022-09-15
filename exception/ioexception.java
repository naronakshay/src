package exception;
import java.io.File;
import java.io.*;
import java.util.*;
public class ioexception {

	public static void main(String[] args) {
		File f=new File("exception.txt");
		try {
			Scanner sc= new Scanner(f);
			while(sc.hasNextLine()) {
				String data = sc.nextLine();
				System.out.println(data);
				
			
		}
			
	}
		catch(IOException e)
		{System.out.println("IO Exception occurs");}

}}
