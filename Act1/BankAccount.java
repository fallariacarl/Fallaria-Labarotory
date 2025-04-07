package Act1;


    // Base class: BankAccount
class BankAccount {
    private String accountHolderName;
    private double balance;    
 
    // Constructor
    public BankAccount(String accountHolderName, double initializeBalance) {
        this.accountHolderName = accountHolderName;
        this.balance = initializeBalance;
    }
 
    // Encapsulation: Getter and Setter methods
    public String getAccountHolderName() {
        return accountHolderName;
    }
 
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
 
    public double getBalance() {
        return balance;
    }
 
    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
 
    // Method for withdrawal of money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance");
        }
    }
 
    // Polymorphism: Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}
 
// Derived class: SavingsAccount
class SavingsAccount extends BankAccount {
    private final double interestRate;
 
    // Constructor
    public SavingsAccount(String accountHolderName, double initializeBalance, double interestRate) {
        super(accountHolderName, initializeBalance);
        this.interestRate = interestRate;
    }
 
    // Method to calculate interest
    public void calculateInterest() {
        double interest = getBalance() * interestRate / 100;
        System.out.println("Interest Earned: " + interest);
        deposit(interest);  // Adding interest to the balance
    }
 
    // Overriding withdraw method
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= getBalance()) {
            super.withdraw(amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance");
        }
    }
 
    // Overriding displayAccountDetails method
    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
 
// Derived class: CurrentAccount
class CurrentAccount extends BankAccount {
    private double overdraftLimit;
 
    // Constructor
    public CurrentAccount(String accountHolderName, double initializeBalance, double overdraftLimit) {
        super(accountHolderName, initializeBalance);
        this.overdraftLimit = overdraftLimit;
    }
 
    // Overriding withdraw method to include overdraft limit
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (getBalance() + overdraftLimit) >= amount) {
            double newBalance = getBalance() - amount;
            if (newBalance < 0) {
                overdraftLimit += newBalance; // Reduce overdraftLimit
            }
            super.withdraw(amount); // adjust balance
        } else {
            System.out.println("Invalid withdrawal amount or overdraft limit exceeded");
        }
    }
 
    // Overriding displayAccountDetails method
    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
}
 
// Main class
 class oop{
    public static void main(String[] args) {
        // Create a Savings Account
        SavingsAccount savings = new SavingsAccount("CARL", 2050, 5);
        savings.displayAccountDetails();
        savings.deposit(50);
        savings.calculateInterest();
        savings.withdraw(10);
        savings.displayAccountDetails();
 
        System.out.println();
 
        // Create a Current Account
        CurrentAccount current = new CurrentAccount("CARL ", 50100, 1000);
        current.displayAccountDetails();
        current.withdraw(50);
        current.withdraw(10);
        current.displayAccountDetails();
    }
}
 