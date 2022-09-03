package ir.maktab.bank.model;

public class CurrentAccount extends Account {

    private boolean check;

    public void generateCheck(Account account) {
        if (account instanceof CurrentAccount && account.getCreditCard().getCredit()>=10e+6) {
            this.check = true;
        }


    }

    public CurrentAccount() {
    }

    public CurrentAccount(int id, String accountNumber, CreditCard creditCard, Branch branch, boolean check) {
        super(id, accountNumber, creditCard, branch);
        this.check = check;
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }
}
