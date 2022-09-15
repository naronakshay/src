package ust;
import java.util.*;
public class unary {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		String a ;
	    
	    	
			System.out.println("enter the character :");
		     a = sc.nextLine();
		     System.out.println("ENTER THE NUMBER ");
			int n= sc.nextInt();
		    switch (a)
		    {
		    case "-" :  
					System.out.println(-n);
					break;
					
		    case "++" : 
					System.out.println("PREFIX = "+ ++n);
					System.out.println("POSTFIX = "+ n++);
					break ;
		    case "--" :
					System.out.println("PREFIX = "+ --n);
					System.out.println("POSTFIX = "+ n--);
					break ;
		    case "!"  :
					System.out.println("ENTER THE NUMBER ");
					int n2= sc.nextInt();
					System.out.println(!(n>n2));
					break;
		    case "~" :
					System.out.println("THE BITWISE  COMPLEMENT IS : "+ ~n);
					break;
		    default:
					System.out.println("");
						
		    }
	  
	
	}

}

