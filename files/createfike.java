package files;
import java.io.File;
import java.io.IOException;

public class createfike {

	public static void main(String[] args) throws IOException {
		
		File f1=new File("example.txt");
		try {
			boolean b=f1.createNewFile();
			if(b)
				System.out.println("FILE CREATED");
			else 
				System.out.println("FILE ALREADY EXIST");
		}
		catch(Exception e )
		{
			System.out.println(e);
		}
		
		
	}

}
