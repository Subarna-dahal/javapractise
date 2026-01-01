
class BankAccount {
    private long accountNumber;
    private double balance;

    BankAccount(long accountNumber, double balance) {
       if(accountNumber>0){
           this.accountNumber=accountNumber;
           return;
       }
       else{
           System.out.println("Invalid account number");
           this.accountNumber=1;
       }
       if(balance>0){
           this.balance=balance;
       }
       else{
           System.out.println("Invalid balance ");
           balance=0;
       }
    }


    public void setAccountNumber(long accountNumber) {
        if(accountNumber <= 0) {
            System.out.println("The account number should be more than zero");
            return;
        }
        this.accountNumber = accountNumber;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(double balance) {
        if(balance < 0) {
            System.out.println("Balance cannot be less than zero");
            return;
        }
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    void deposit(double amount) {
        if(amount <= 0) {
            System.out.println("Invalid deposit amount");
            return;
        }
        balance += amount;
        System.out.println("Deposited: $" + amount);
        System.out.println("New Balance: $" + balance);
    }

    void withdrawAmount(double amount) {
        if(amount <= 0) {
            System.out.println("Invalid withdrawal amount");
            return;
        }
        if(amount > balance) {
            System.out.println("Insufficient balance for withdrawal");
            return;
        }
        balance -= amount;
        System.out.println("Withdrawn: $" + amount);
        System.out.println("New Balance: $" + balance);
    }

    void display() {
        System.out.println("Account Number: " + accountNumber + " | Balance: $" + balance);
    }
}

public class Bank {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(11111111, -2000);
        b1.deposit(200);
        b1.withdrawAmount(100);
        b1.display();
    }
}