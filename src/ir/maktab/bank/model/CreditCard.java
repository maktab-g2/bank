package ir.maktab.bank.model;

public class CreditCard {
    private int id;
    private String cardNumber;
    private double credit;

    CreditCard(int id, String cardNumber, double credit) {
        this.id = id;
        this.cardNumber = cardNumber;
        this.credit = credit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    @Override
    public String toString() {
        return cardNumber + ", " + credit;
    }
}
