class Bank {
    
    public static final double INTEREST_RATE = 0.05; 

    
    private static double totalBankBalance = 0.0;

    
    private double accountBalance;

    
    public Bank(double initialDeposit) {
        this.accountBalance = initialDeposit;
        totalBankBalance += initialDeposit; 
    }

    
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive!");
            return;
        }
        accountBalance += amount;
        totalBankBalance += amount;
    }

    
    public void withdraw(double amount) {
        if (amount <= accountBalance) {
            accountBalance -= amount;
            totalBankBalance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }


    public void applyInterest() {
        double interest = accountBalance * INTEREST_RATE;
        accountBalance += interest;
        totalBankBalance += interest;
    }

    
    public double getAccountBalance() {
        return accountBalance;
    }

    public static double getTotalBankBalance() {
        return totalBankBalance;
    }
}


public class BankDemo {
    public static void main(String[] args) {
        Bank customer1 = new Bank(1000);
        Bank customer2 = new Bank(2000);

        customer1.deposit(500);
        customer2.withdraw(300);

        customer1.applyInterest();
        customer2.applyInterest();

        System.out.println("Customer 1 Balance: " + customer1.getAccountBalance());
        System.out.println("Customer 2 Balance: " + customer2.getAccountBalance());
        System.out.println("Total Bank Balance: " + Bank.getTotalBankBalance());
        System.out.println("Fixed Interest Rate: " + Bank.INTEREST_RATE);
    }
}