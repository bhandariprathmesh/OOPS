abstract class BankAccount{
	public abstract void deposite();
	public abstract void withdrawl();
	public abstract void getBalance();
	public void getDetails(String n,String m){
		System.out.println("Name :" +n+ "Mobile"+m);
	}
}
class SavingAccount extends BankAccount{
	public void deposite(){
		System.out.println("10,000 Deposited");
	}
	public void withdrawl(){
		System.out.println("5,000 Withdrawl");
	}
	public void getBalance(){
		System.out.println("5,000 Balanced");
	}
}
class CurrentAccount extends BankAccount{
	public void deposite(){
		System.out.println("1,00,000 Deposited");
	}
	public void withdrawl(){
		System.out.println("50,000 Withdrawl");
	}
	public void getBalance(){
		System.out.println("50,000 Balanced");
	}
}
public class main{
	public static void main(String args[]){
		SavingAccount s = new SavingAccount();

		s.getDetails("Prathmesh","9564253875");
		s.deposite();
		s.withdrawl();
		s.getBalance();

		CurrentAccount a = new CurrentAccount();
		
		a.getDetails("Mrunmayi","9863547512");
		a.deposite();
		a.withdrawl();
		a.getBalance();
	}
}