package ir.maktab.bank.model;

public class LongTermAccount extends Account{

    LongTermAccount(int id, String accountNumber, CreditCard creditCard, Branch branch) {
        super(id, accountNumber, creditCard, branch);
    }
}
