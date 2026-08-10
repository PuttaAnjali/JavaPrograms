class Account{
	int accountNo;
	String accountType;
	int accountBalance;
	Account() { }
	Account(int accountNo, String accountType, int accountBalance) {
		this.accountNo=accountNo;
		this.accountType=accountType;
		this.accountBalance=accountBalance;
	}
	void withdraw(int amount) {
		if(accountBalance>amount)
		this.accountBalance-=amount;
		else
			System.out.println("Insuficient Balance!");
	}
	void deposit(int amount) {
		this.accountBalance+=amount;
	}
	void dispAccountDetails() {
		System.out.println("Account No: "+accountNo+" TYPE: "+accountType+" Balance: "+accountBalance);
	}
}
public class AccountDemo {
	public static void main(String[] args) {
		Account a1=new Account();
		a1.dispAccountDetails();
		
		Account a2=new Account(2126151724,"Savings",30000);
		a2.dispAccountDetails();
		
		a2.deposit(10000);
		a2.dispAccountDetails();
		

		a2.withdraw(2500);
		a2.dispAccountDetails();
		
		Account a3=new Account(1234567890,"Savings",30000);
		a3.dispAccountDetails();
		
		a3.deposit(5000);
		a3.dispAccountDetails();
		

		a3.withdraw(25000);
		a3.dispAccountDetails();
	}
}