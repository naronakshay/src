package ust;

public class primeonetoten {

	public static void main(String[] args) {
		for(int i=2;i<=100;i++)
		{
			int flag=0;
			for(int j=2;j<(i/2);j++)
			{
				if(i%j==0)
				{
					flag++;
					break;
				}
				
					
			}
			if(flag==0)
				System.out.println(i);
			
		}
	}

}
