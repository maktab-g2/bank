package ir.maktab.bank.service;

import ir.maktab.bank.model.Customer;
import java.time.LocalDate;

public class LongTermAccountService extends AccountService {
    private double inventory = 10e+3;
    @Override
    void deposit(Customer customer, int deposit) {
        String [] date = customer.getAccount().getCreateAccountDate().split("-");
        String end = String.valueOf(Integer.parseInt(date[0] ) + 365);
        end += "-" + date[1] + "-" + date[2];
        if (String.valueOf(LocalDate.now()).equals(end)) {
            System.out.println(customer.getName() + " deposited " + deposit);
            inventory = customer.getAccount().getCreditCard().getCredit() + deposit;
            System.out.println("Balance after deposit: " + inventory);
        }
        else
            System.out.println(customer.getName() + " can not get money before one year!");

    }
}
