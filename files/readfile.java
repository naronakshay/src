package files;
import java.io.*;
import java.util.*;

public class readfile {

	public static void main(String[] args) {
		try {
			File f=new File("example.txt");
			Scanner s= new Scanner(f);
			
			while(s.hasNextLine())
			{
				String data = s.nextLine();
				System.out.println(data);
			}
		}
		catch(Exception e )
		{
			System.out.println(e);
		}
		
		
		
		
	}

}
