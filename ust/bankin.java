package ust;

class Bank {
	int balance;
	public void getBalance() {
		System.out.println(0);
		
	}
}

class BankA extends Bank{
	public void getBalance() {
		balance=1000;
		System.out.println("$"+balance);
		
	}
}

class BankB extends Bank{
	public void getBalance() {
		balance=1500;
		System.out.println("$"+balance);
		
	}
}

class BankC extends Bank{
	public void getBalance() {
		balance=2000;
		System.out.println("$"+balance);
		
	}
}

public class bankin {

	public static void main(String[] args) {
		BankA c= new BankA();
		BankB d= new BankB();
		BankC f= new BankC();
		
		c.getBalance();
		d.getBalance();
		f.getBalance();
		
		
		
	}

}
