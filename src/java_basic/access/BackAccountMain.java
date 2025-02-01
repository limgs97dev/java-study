package java_basic.access;

public class BackAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(10_000);
        account.getBalance();
        account.withdraw(3_000);
        System.out.println(account.getBalance());
    }
}
