package ir.maktab.bank.model;

public abstract class Account {
    private int id;
    private String accountNumber;
    private CreditCard creditCard;
    private Branch branch;

    Account(int id, String accountNumber, CreditCard creditCard, Branch branch) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.creditCard = creditCard;
        this.branch = branch;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return accountNumber + ", " + creditCard;
    }
}
