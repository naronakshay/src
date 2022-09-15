package files;
import java.io.*;
public class writefile {

	public static void main(String[] args) {
		try {
			FileWriter w = new FileWriter("example.txt");
			w.write("HELLO WORLD");
			w.write("\n WELCOM TO FILES");
			
			w.close();
	
					
		}
		catch(Exception e )
		{
			System.out.println(e);
		}
		
		
	}

}
