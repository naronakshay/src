package ust;

class Super {
	int i ;
	public void printNum() {
		System.out.println(i);
	}
}

class Sub extends Super {
	int j;
	public void printNum() {
		System.out.println(j);
	}
}

public class datamemberin {

	public static void main(String[] args) {
		Sub obj=new Sub();
		obj.i=5;
		obj.j=6;
		obj.printNum();
	}

}
