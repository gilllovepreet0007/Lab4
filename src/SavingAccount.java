
public class SavingAccount extends Account {
	public final double minbal=500;
	public void withdraw(double c) {
		
		if (getBalance()-c >minbal)
		{   
			System.out.println("Method Overriden");
			setBalance(getBalance()-c);
		}
		else
		{
			System.out.println("Overriden: Insufficient Balance to Withdraw. Rs. "+minbal +" require after withdraw");
		}
		
	}

}
