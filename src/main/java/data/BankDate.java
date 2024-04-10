package data;

import java.util.ArrayList;
import java.util.List;

public class BankDate {
    private static List<BankAccount> accounts;


    public static List<BankAccount> getAccounts() {
        return accounts;
    }

    static {

        Client user = new Client("Alex", "Bybson");
        BankAccount account = new BankAccount(user);
        accounts = new ArrayList<>();
        accounts.add(account);
    }

}
