package acessmodifiers;
class Aakshay {
	private int n=4;
	private void msg() {
		System.out.println("THIS IS PRIVATE");
	}
}

public class Orgprivate {

	public static void main(String[] args) {
		Akshay a = new Akshay();
		System.out.println(a.n);
		a.msg();

	}

}
