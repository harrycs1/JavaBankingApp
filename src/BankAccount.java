import java.util.ArrayList;

public class BankAccount {
    private int balance;
    private String customerId;
    private ArrayList<Integer> previousTransactions;

    // constructor function
    public BankAccount(String customerId) {
        this.balance = 0;
        this.customerId = customerId;
        this.previousTransactions = new ArrayList<>();
    }

    // methods:
    public int getBalance() {
        return this.balance;
    }

    public void printPreviousTransactions() {
        if (previousTransactions.size() == 0) {
            System.out.println("No transactional history.");
        }
        for (int transaction: previousTransactions) {
            System.out.println(transaction);
        }
    }

    public void deposit(int amount) {
        if (amount > 0) {
            this.balance += amount;
            this.previousTransactions.add(amount);
            System.out.println(amount + " deposited!");
        } else {
            System.out.println("Amount must be greater than 0.");
        }
    }

    public void withdraw(int amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
            this.previousTransactions.add(amount * -1);
            System.out.println(amount + " withdrawn!");
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}
