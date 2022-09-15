package set;
import java.util.*;
public class set7clonehas {

	public static void main(String[] args) {
		LinkedHashSet <Integer> hs=new LinkedHashSet<Integer>();
		hs.add(2);
		hs.add(33);
		hs.add(44);
		hs.add(55);
	
		System.out.println("Hash set elements:"+hs);
		LinkedHashSet <Integer> chs=new LinkedHashSet<Integer>();
		
		chs=(LinkedHashSet)hs.clone();
		System.out.println("ClonedHash set elements:"+chs);
		
		
	}

}
