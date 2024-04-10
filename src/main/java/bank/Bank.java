package bank;

import data.BankAccount;
import data.BankDate;
import data.Client;
import java.util.ArrayList;
import java.util.List;


public class Bank {
    private static List<BankAccount> accounts;


    private static final String ADMIN_LOGIN = "admin";
    private static final String ADMIN_PASSWORD = "0000";


   private void createBankAccount(BankAccount newAccount) {
       BankDate.getAccounts().add(newAccount);
   }

   public BankAccount addNewData() {
       System.out.println("Введите логин администратора:");
       checkAdminLogin();
       System.out.println("Введите пароль администратора:");
       checkAdminPassword();
       System.out.println("Введите новые данные банковского аккаунта: имя клиента, фамилия клиента");
       return new BankAccount(new Client("",""));
   }

    private void checkAdminPassword() {
    }

    private void checkAdminLogin() {
    }

    public static List<BankAccount> getAccounts() {

        return accounts;
    }
}
