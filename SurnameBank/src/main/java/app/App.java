package app;

import bank.Bank;

public class App {
    public static void main(String[] args) {
        System.out.println(Bank.getAccounts().get(0).getPersonalAccount());
        System.out.println(Bank.getAccounts().get(0).getClient().getCard().getPinCode());
        Bank bank = new Bank();
        bank.showInterface();
    }
}