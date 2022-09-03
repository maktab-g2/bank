package ir.maktab.bank.service;

public class LongTermAccountService extends AccountService {
    @Override
    void deposit(String name, int deposit) {
        System.out.println(name + " deposited " + deposit);
        total = total + deposit;
        System.out.println("Balance after deposit: " + total);
    }
}
