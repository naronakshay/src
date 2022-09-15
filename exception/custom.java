package exception;

class My extends  Exception{
	public My() {
	}
}
public class custom {

	public static void main(String[] args) {
		int age=14;
		try {
			if(age<18)
			{
				throw new My();
			}
			else
			{
				System.out.println("ELIGIBLE TO VOTE");
			}
		}
		catch (My e)
		{
			System.out.println("CUSTOM EXCEPTION CAUGHT : NOT ELIGIBLE TO VOTE");
		}

	}

}
