package ir.maktab.bank;

import ir.maktab.bank.model.*;

import java.util.ArrayList;
import java.util.Scanner;

    public class Main {
        static final long MAX_CARD = 9999999999999999L;
        static final long MIN_CARD = 1111111111111111L;
        static final long MAX_ACCOUNT = 9999999999L;
        static final long MIN_ACCOUNT = 1111111111L;
        static final int MIN_DEGREE = 1;
        static final int MAX_DEGREE = 4;


        static boolean flag = true;
        static ArrayList<Customer> customers = new ArrayList<>();
        public static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            while (flag) {
                menu();
            }
        }

        public static void menu() {
            CreditCard creditCard = new CreditCard();
            Account account = new CurrentAccount();
            Branch branch = new Branch();
            System.out.println("hello choose to continue: \n 1:create account in bank \n 2:check your credit " +
                    "\n 3:finish terminal");
            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    Customer customer = new Customer();
                    System.out.println("enter your city:");
                    branch.setCity(scanner.next());
                    System.out.println("enter the branch code you want have account it must be");
                    branch.setId(scanner.nextInt());
                    System.out.println("your branch degree is:");
                    branch.setQuality((int) ((Math.random() * (MAX_DEGREE - MIN_DEGREE)) + MIN_DEGREE));
                    System.out.println(branch.getQuality());
                    account.setBranch(branch);
                    System.out.println("enter your name:");
                    customer.setName(scanner.next());
                    String name = customer.getName();
                    System.out.println("how much money you want store:");
                    creditCard.setCredit(scanner.nextDouble());
                    long randomCard = MIN_CARD + (long) (Math.random() * (MAX_CARD - MIN_CARD));
                    creditCard.setCardNumber(String.valueOf(randomCard));
                    System.out.println("Chose the type of Account: \n 1. Current \n 2. Loan \n 3. LongTerm \n 4. ShortTerm");
                    switch (scanner.nextInt())
                    {
                        case 1:
                            System.out.println("do you want check?");
                        case 2:
                            System.out.println("thank you for open this account!");
                        case 3:
                            System.out.println("you can get your 20% profit after one year!");
                        case 4:
                            System.out.println("you can get your 20% profit after 3 month!");
                    }
                    System.out.println("your registering finished.");
                    System.out.println("your credit card number is :" + creditCard.getCardNumber());
                    long randomAccount = MIN_ACCOUNT + (long) (Math.random() * (MAX_ACCOUNT - MIN_ACCOUNT));
                    account.setAccountNumber(String.valueOf(randomAccount));
                    System.out.println("your account number is :" + account.getAccountNumber());
                    account.setCreditCard(creditCard);
                    customer.setAccount(account);
                    customers.add(customer);
                    break;
                case 2:
                    System.out.println("enter your account number:");
                    String search = scanner.next();
                    boolean notFound = true;
                    for (Customer customer1 : customers) {
                        if (customer1.getAccount().getAccountNumber().equals(search)) {
                            customer1.calCustomerBalance();
                            notFound = false;
                            break;
                        }
                    }
                    if (notFound) System.out.println("the account isn not exist");
                    break;
                case 3:
                    flag = false;
            }
        }
    }

