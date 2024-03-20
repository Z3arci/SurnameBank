package data;

import bank.Card;

public class Client {
    private String name;
    private String surname;
    private boolean isClient;
    private long Card;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public boolean isClient() {
        return isClient;
    }

    public void setClient(boolean client) {
        isClient = client;
    }

    public long getCard() {
        return Card;
    }

    public void setCard(long card) {
        Card = card;
    }
}
