package oop.ex;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();

        account.deposit(10_000);
        account.withdraw(9_000);
        account.withdraw(2_000);

        System.out.println(account.balance);
    }
}
