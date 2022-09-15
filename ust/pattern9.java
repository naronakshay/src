package ust;

public class pattern9 {

	public static void main(String[] args) {
		int i =1;
		while(i<10)
		{
			for(int j=1;j<=((2*i)-1);j++)
			{
				if(j%2 ==0)
					System.out.print("0");
				else 
					System.out.print("1");

			}
			System.out.println();
			i++;
			
	}

}}
