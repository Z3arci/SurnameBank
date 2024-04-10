package bank;

import data.BankAccount;
import data.BankDate;

import java.util.Scanner;

public class ATM {
    public void start() {
        showStartATMInfo();
        checkUserChoice();
    }

    private void checkUserChoice() {
        String choice = getScannerData();

        switch (choice) {
            case "1" -> askCardData();
            case "2" -> askAdminData();
            default -> showChoiceError();
        }
    }

    private void askCardData() {
        System.out.println(" Вставьте карту.");
        String cardNumber = getScannerData();
        checkPinCode(cardNumber);
    }

    private void checkPinCode(String cardNumber) {
        for (int i = 0; i < Bank.getAccounts().size(); i++) {
            if (cardNumber.equals(Bank
                    .getAccounts()
                    .get(i)
                    .getClient()
                    .getCard()
                    .getCARD_NUMBER())) {
                System.out.println("Введите пин-код:");
                String pinCode = getScannerData();
                if (pinCode.equals(Bank
                        .getAccounts()
                        .get(i)
                        .getClient()
                        .getCard()
                        .getPinCode())) {
                    System.out.println("Добро пожаловать в банкомат!");
                    showATMFunctionality();
                }
                else {
                    System.out.println("Неверно, повторите попытку!");
                    checkPinCode(cardNumber);
                }
            }
        }
    }

    private void askAdminData() {
        System.out.println("Ваш индификационный номер счёта:");
        System.out.println(Bank.getAccounts().get(0).getPersonalAccount());
        checkUserChoice();
    }

    private void showATMFunctionality() {
        System.out.println("1 - Посмотреть баланс:");
        System.out.println("2 - Пополнить баланс:");
        System.out.println("3 - Выйти и Забрать карту:");
        checkATMMenu();
    }
    private void checkATMMenu() {
        String menu = getScannerData();

        switch (menu) {
            case "1" -> showBalance();
            case "2" -> getBalance();
            case "3" -> ExitBank();
            default -> showChoiceError();
        }
    }
    private void showBalance() {
        System.out.println(BankDate.getAccounts().get(0).getBalance());
        showATMFunctionality();
    }
    private void getBalance(){
        System.out.println(BankDate.getAccounts().get(0).getBalance());
        System.out.println("Введите сумму:");
        int money = Integer.parseInt(getScannerData());
        int newBalance = BankDate.getAccounts().get(0).getBalance() + money;
        System.out.println("Ваш баланс: " + newBalance);
        showATMFunctionality();
    }
    private void ExitBank(){
        System.out.println("Заберите карту.");
    }

    private void showChoiceError() {
        System.out.println("Неверно выбрано действие");
        checkUserChoice();
    }

    private String getScannerData() {
        return new Scanner(System.in).nextLine();
    }

    private void showStartATMInfo() {
        System.out.println("Добро пожаловать! Выберети действие:");
        System.out.println("1 - Вставить карту:");
        System.out.println("2 - Cоздать лицевой счёт:");
    }
}
