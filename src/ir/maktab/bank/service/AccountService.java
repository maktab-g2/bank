package ir.maktab.bank.service;

public abstract class AccountService {
    private double total = 10e+3;

    void withdrawn(String name, int withdrawal) {
        if (total >= withdrawal) {
            System.out.println(name + " withdrawn " + withdrawal);
            total = total - withdrawal;
            System.out.println("Balance after withdrawal: " + total);
        } else {
            System.out.println(name
                    + " you can not withdraw " + withdrawal);
            System.out.println("your balance is: " + total);
        }
    }

    void deposit(String name, int deposit) {
        System.out.println(name + " deposited " + deposit);
        total = total + deposit;
        System.out.println("Balance after deposit: " + total);
    }
}
