package files;
import java.io.*;

public class fileexist {

	public static void main(String[] args) {
		File f = new File("example.txt");
		if(f.exists())
		{
			System.out.println("Exists");
		}
		else
			System.out.println("DOESNOT EXISTS");
	}

}
