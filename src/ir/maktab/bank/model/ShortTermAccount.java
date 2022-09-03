package ir.maktab.bank.model;

public class ShortTermAccount extends Account{

    public double profit(Account account){
        double profit = 0;
        profit = account.getCreditCard().getCredit() * 0.08;
        return profit;
    }

}
