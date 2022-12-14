package ir.maktab.bank.model;

public class LongTermAccount extends Account{

    LongTermAccount(int id, String accountNumber, CreditCard creditCard, Branch branch) {
        super(id, accountNumber, creditCard, branch);
    }

    public double profit(Account account){
        double profit = 0;
        profit = account.getCreditCard().getCredit() * 0.2;
        return profit;
    }
}
