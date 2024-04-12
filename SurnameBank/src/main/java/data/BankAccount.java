package data;

import bank.Card;

import java.util.Scanner;

public class BankAccount {
    private double balance;
    private String personalAccount;
    private Client client;

    public BankAccount(Client client) {
        this.client = client;
        personalAccount = client.getCard().getCARD_NUMBER();
        balance = checkBalance();
    }
    private int checkBalance(){
        return Card.rnd(0, 100_000);
    }
    public double getBalance(){
        return balance;
    }

    public String getPersonalAccount() {

        return personalAccount;
    }

    public Client getClient() {

        return client;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
