package ir.maktab.bank.service;

import ir.maktab.bank.model.Account;
import ir.maktab.bank.model.Customer;

public abstract class AccountService {
    private double inventory = 10e+3;

    void withdrawn(Customer customer, int withdrawal) {
        inventory = customer.getAccount().getCreditCard().getCredit();
        if (inventory >= withdrawal) {
            System.out.println(customer.getName() + " withdrawn " + withdrawal);
            customer.getAccount().getCreditCard().setCredit(inventory - withdrawal);
            System.out.println("Balance after withdrawal: " + customer.getAccount().getCreditCard().getCredit());
        } else {
            System.out.println(customer.getName()
                    + " you can not withdraw " + withdrawal);
            System.out.println("your balance is: " + inventory);
        }
    }

    void deposit(Customer customer, int deposit) {
        System.out.println(customer.getName() + " deposited " + deposit);
        inventory = customer.getAccount().getCreditCard().getCredit() + deposit;
        System.out.println("Balance after deposit: " + inventory);
    }
}
