
public class Account {

	private long accNum;
	private double balance;
	private Person accHolder;
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	        // To deposit
	public void deposit(double a) {
		this.balance = balance + a;
	}
	       // To withdraw
	public void withdraw(double b) {
		if (this.balance-b >500)
		{
			this.balance=balance-b;
		}
		else
		{
			System.out.println("Insufficient Balance to Withdraw.");
		}
	}
	
	//IMPORTANT : When we call object of account class then it wont print hex code instead run this method.
	
	public String toString() {
		
		return (accHolder.getName()+"\t"+accHolder.getAge()+"\t"+ accNum +"\t"+ balance);
	}
}
