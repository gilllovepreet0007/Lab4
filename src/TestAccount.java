// QUESTION 1
public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc=new Account();
		
		//Getting random accountnumber in long format
		
		Double d= Math.random();             //Taking random number bet 0 and 1
		String str= d.toString();            //converting it to string
		String accnum=str.substring(3);      //Taking digits after decimal
		Long id= Long.parseLong(accnum);      // converting string to long
		acc.setAccNum(id);                  //ACC no set
		
		acc.setBalance(3000);
		
		Person p=new Person();         // Creating Person object for name and age
		p.setName("Cathy");
		p.setAge(32);
		
		acc.setAccHolder(p);          // Setting person p as Accountholder
		System.out.println(acc);       //Printing account details
		
		// FOR SMITH ACCOUNT CREATION
		Account acc1=new Account();
		Double d1= Math.random();             //Taking random number bet 0 and 1
		String str1= d1.toString();            //converting it to string
		String accnum1=str1.substring(3);      //Taking digits after decimal
		Long id1= Long.parseLong(accnum1);      // converting string to long
		acc1.setAccNum(id1);                  //ACC no set
		
		acc1.setBalance(2000);
		Person p1=new Person();
		p1.setName("Smith");
		p1.setAge(23);
		acc1.setAccHolder(p1);
		System.out.println(acc1);
		
		// DEPOSITING 2000 TO SMITH ACCOUNT
		acc1.deposit(2000);
		System.out.println("After 2000 deposited for Smith");
		System.out.println(acc1);
		
		acc.withdraw(2400);
		System.out.println("After Withdraw from Cathy ");
		System.out.println(acc);
		
		//  QUESTION 2 
		// PART 1 SAVING ACCOUNT CLASS CHILD OF ACCOUNT CLASS
		
		SavingAccount s=new SavingAccount();    // Creating object for saving account
		Double d2= Math.random();             //Taking random number bet 0 and 1
		String str2= d2.toString();            //converting it to string
		String accnum2=str2.substring(3);      //Taking digits after decimal
		Long id2= Long.parseLong(accnum2);      // converting string to long
		s.setAccNum(id2);                  //ACC no set
		
		s.setBalance(3000);
		Person p2=new Person();         // Creating Person object for name and age
		p2.setName("Lovepreet");
		p2.setAge(23);
		s.setAccHolder(p2);
		System.out.println(s);
		s.withdraw(2600);
		System.out.println("After Withdraw from Lovepreet ");
		System.out.println(s);
		
		// PART 2 CURRENT ACCOUNT CLASS CHILD OF ACCOUNT CLASS
		
		CurrentAccount c=new CurrentAccount();
		Double d3= Math.random();             //Taking random number bet 0 and 1
		String str3= d3.toString();            //converting it to string
		String accnum3=str3.substring(3);      //Taking digits after decimal
		Long id3= Long.parseLong(accnum3);      // converting string to long
		c.setAccNum(id3);  
		
		c.setBalance(5000);
		Person p3=new Person();         // Creating Person object for name and age
		p3.setName("Maninder");
		p3.setAge(23);
		c.setAccHolder(p3);
		System.out.println(c);
		
		c.withdraw(4900);
		System.out.println("After Withdraw from Maninder ");
		System.out.println(c);
	}

}
