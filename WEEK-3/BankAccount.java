public class BankAccount { 
private double balance; 

public BankAccount (double initialBalance) { 
	if (initialBalance >= 0) { 
	balance initialBalance; 
} else { 
		balance = 0.0; 
System.out.println("Initial balance cannot be negative. Setting balance to 0."); 
    } 
} 
 
public void deposit (double amount) { 
	if (amount > 0) { 
	balance += amount; 
System.out.println("Deposited: " + amount); 
} else { 
System.out.println("Deposit amount must be positive."); 
     }
} 

public void withdrawal (double amount) { 
	if (amount > 0 && amount <= balance) { 
	balance amount; 

System.out.println("Withdrawn:" + amount); 
} else if (amount > balance) { 
System.out.println("Insufficient funds."); 
} else { 
System.out.println("Withdrawal amount must be positive."); 
      } 
}

public double getBalance() { 
	return balance; 
} 
public static void main(String[] args) { 

	BankAccount account = new BankAccount(1000.00); 
	account.deposit (500.00); 
	account.withdrawal (2000.00); 

System.out.println("Current Balance:" + account.getBalance()); 
System.out.println("Bhavagnya");
   } 
}