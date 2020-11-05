
public class CurrentAccount extends Account {
	public double overdraftlimit;
	public void withdraw(double d) {
		overdraftlimit=500;
		if (getBalance()-d > overdraftlimit)
		{
			System.out.println("TRUE");
			setBalance(getBalance()-d);
		}
		else
		{
			System.out.println("FALSE");
		}
		
	}

}
