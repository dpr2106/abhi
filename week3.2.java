public class week3.2 {
    // M2. Encapsulated Mess-Card Wallet
// Concepts: Encapsulation, private fields, validation inside methods, controlled read-only access

class MessWallet {
    // Private field - cannot be modified directly from outside
    private double balance;

    // Public constructor with negative balance check
    public MessWallet(double openingBalance) {
        if (openingBalance < 0) {
            System.out.println("Warning: Negative opening balance given. Setting balance to 0.0");
            this.balance = 0.0;
        } else {
            this.balance = openingBalance;
        }
    }

    // Top-up method to add funds safely
    public void topUp(double amount) {
        if (amount <= 0) {
            System.out.println("Top-up rejected: Amount must be greater than zero.");
        } else {
            this.balance = this.balance + amount;
        }
    }

    // Deduct method preventing balance from going negative
    public void deduct(double amount) {
        if (amount > this.balance) {
            System.out.println("Deduct rejected: insufficient balance");
        } else if (amount <= 0) {
            System.out.println("Deduct rejected: Amount must be greater than zero.");
        } else {
            this.balance = this.balance - amount;
        }
    }

    // Read-only getter for balance
    public double getBalance() {
        return this.balance;
    }
}

public class M2_MessWalletDemo {

    public static void main(String[] args) {
        // Initial opening balance of 500
        MessWallet wallet = new MessWallet(500);

        // Top up 200
        wallet.topUp(200);
        System.out.println("Balance after top-up: " + wallet.getBalance());

        // Attempt to deduct 1000 (exceeds balance)
        wallet.deduct(1000);

        // Print final balance
        System.out.println("Final balance: " + wallet.getBalance());
    }
}

}
