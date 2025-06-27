public class BankAccount {
    public String userName;
    private double balance;
    private boolean active;

    BankAccount(String userName) {
        this.userName = userName;
        this.balance = 0;
    }

    public void activate() {
        active = true;
    }

    public void deactivate() {
        active = false;
    }

    public double getBalance() {
        return balance;
    }


    public double withDraw(double amount) {
        if (!active) {
            throw new IllegalStateException("Account is deactivated");
        }
        if (balance < amount) {
            throw new RuntimeException("Insufficient balance");
        }

        if (amount <= 0) {
            throw new IllegalArgumentException("Non-positive withdraw amount");
        }
        this.balance -= amount;
        return amount;
    }

    public void deposit(double amount) {
        if (!active) {
            throw new IllegalStateException("Account is deactivated");
        }

        if(amount <= 0){
            throw new IllegalArgumentException("Non-positive or  deposit amount");
        }
        balance += amount;
    }
}
