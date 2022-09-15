package files;
import java.io.*;

public class filedelete {

	public static void main(String[] args) {
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
		
		try {
			if(f1.delete())
			{
				System.out.println("FILE DELETED");
			}
			else
				System.out.println("FILE CANNOT BE DELETED ");
		}
		catch(Exception e )
		{
			System.out.println(e);
		}
	}

}
