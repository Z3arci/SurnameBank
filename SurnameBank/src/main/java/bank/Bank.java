package bank;
import java.util.*;

import data.BankAccount;
import data.BankDate;
import data.Client;

import java.util.List;


public class Bank {
    private static List<BankAccount> accounts;
    private static final String ADMIN_LOGIN = "admin";
    private static final String ADMIN_PASSWORD = "0000";


    static {
        accounts = new ArrayList<>();

        Client client = new Client("Vasya", "Pupkin");
        BankAccount account = new BankAccount(client);
        accounts.add(account);
    }
    public void showInterface(){
        System.out.println("Выберите действие:");
        System.out.println("1 - Создать новый лицевой счёт");
        System.out.println("2 - Воспользоваться банкоматом");
        checkChoice();
    }
    private void checkChoice(){
        String choice = getScannerData();
        switch (choice) {
            case "1" -> addAdminData();
            case "2" -> ATM.start();
            default -> {
                System.out.println("Неверно введённый запрос. Попробуйте ещё раз.");
                showInterface();
            }
        }
    }
    private static String getScannerData() {
        return new Scanner(System.in).nextLine();
    }
   private void createBankAccount(BankAccount newAccount) {
       BankDate.getAccounts().add(newAccount);
   }

   public void addAdminData() {
       System.out.println("Введите логин администратора:");
       checkAdminLogin();
       System.out.println("Введите пароль администратора:");
       checkAdminPassword();
       System.out.println("Введите новые данные банковского аккаунта: имя клиента, фамилия клиента");
       new BankAccount(new Client("", ""));
   }

    private void checkAdminPassword() {
        Scanner passwordAdmin = new Scanner(System.in);
        String password = String.valueOf(passwordAdmin.nextInt());
        if (Objects.equals(password, ADMIN_PASSWORD)){
            checkAdminPassword();
        }
    }

    private void checkAdminLogin() {
        Scanner passwordAdmin = new Scanner(System.in);
        String password = String.valueOf(passwordAdmin.nextInt());
        if (Objects.equals(password, ADMIN_LOGIN)){
            checkAdminPassword();
        }
    }

    public static List<BankAccount> getAccounts() {

        return accounts;
    }
}
