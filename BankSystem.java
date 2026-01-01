class Account {
    private String accountNumber;
    private double balance;

    public void setAccountNumber(String acc) {
        if (acc == null || acc.trim().isEmpty()) {
            System.out.println("Account Number Cannot Be Empty");
            this.accountNumber = "DefaultAccount";
        } else {
            this.accountNumber = acc.trim();
        }
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount");
            return;
        }
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient Balance");
            return;
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    public double getBalance() {
        return balance;
    }
}
