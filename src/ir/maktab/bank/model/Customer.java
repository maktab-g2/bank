package ir.maktab.bank.model;

public class Customer {
    private int id;
    private String name;
    private Account account;

    Customer(int id, String name, Account account) {
        this.id = id;
        this.name = name;
        this.account = account;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return name + ", " + account;
    }

    public double calCustomerBalance() {
        return this.account.getCreditCard().getCredit();
    }
}
