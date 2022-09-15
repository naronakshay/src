package ust;

class Encap{
	private int rollno;
	private String name;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

public class encapsulation {

	public static void main(String[] args) {
		Encap e=new Encap();
		e.setName("Akshay");
		e.setRollno(20);
		System.out.println(e.getName());
		System.out.println(e.getRollno());
		
	}

}
