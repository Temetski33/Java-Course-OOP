public class BankAccount {
    // Your variable declarations and code here
    private static int totalAccounts = 0;
    private int balance;
    private int accountNumber;

    public BankAccount(int balance) {
        totalAccounts++;
        this.balance = balance;
        this.accountNumber = totalAccounts;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int depositAmount) {
        balance =  balance - depositAmount;
    }

    public void withdraw(int withdrawAmount) {
        balance = balance - withdrawAmount;
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000);
        BankAccount account2 = new BankAccount(2000);

        account1.deposit(500);
        account2.withdraw(800);

        System.out.println("Account " + account1.getAccountNumber() + " balance: " + account1.getBalance());
        System.out.println("Account " + account2.getAccountNumber() + " balance: " + account2.getBalance());

        System.out.println("Total number of accounts: " + BankAccount.getTotalAccounts());
    }
}