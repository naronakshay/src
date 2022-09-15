package ust;

public class pattern {

	public static void main(String[] args) {
		
		int ctr=1;
		for(int i=1;i<=5;i++)
		{
			
			
			
				for(int j=1;j<3;j++)
				{
		
				System.out.print(ctr++);
				
				}
				ctr--;
				if(ctr==4)
				{
					System.out.println();
					System.out.print(ctr);
					System.out.print(ctr);
					ctr++;
				}
				
			System.out.println();
		}

	}

}
