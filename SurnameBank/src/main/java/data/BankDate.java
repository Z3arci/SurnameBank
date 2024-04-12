package data;

import java.util.ArrayList;
import java.util.List;

public class BankDate {
    private static List<BankAccount> accounts;
    private  static List<BankAccount> accountsList = new ArrayList<>();

    public static List<BankAccount> getAccounts() {
        return accounts;
    }

    static {

        Client user = new Client("Alex", "Bybson");
        BankAccount account = new BankAccount(user);
        accounts = new ArrayList<>();
        accounts.add(account);
    }
    public static List<BankAccount> getAccountsList(){
        return accountsList;
    }
}
