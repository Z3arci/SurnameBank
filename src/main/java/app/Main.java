package app;

import bank.Card;

public class Main {
    public static void main(String[] args) {
        Card firstCard = new Card(444455556666L);
        System.out.println("Номер карты:" + firstCard.getCARD_NUMBER());
        System.out.println("Пин-код:" + firstCard.getPinCode());
    }
}