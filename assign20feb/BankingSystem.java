
import java.util.*;

public class BankingSystem {
    Map<String, Double> accounts = new HashMap<>();
    Map<Double, String> sortedAccounts = new TreeMap<>();
    Queue<Map.Entry<String, Double>> withdrawalQueue = new LinkedList<>();

    public void createAccount(String accountNumber, double balance) {
        accounts.put(accountNumber, balance);
        sortedAccounts.put(balance, accountNumber);
    }

    public void processWithdrawal(String accountNumber, double amount) {
        withdrawalQueue.add(new AbstractMap.SimpleEntry<>(accountNumber, amount));
    }

    public void executeWithdrawals(){
        while(!withdrawalQueue.isEmpty()){
            Map.Entry<String, Double> transaction = withdrawalQueue.poll();
            String account = transaction.getKey();
            double amount = transaction.getValue();
            if(accounts.containsKey(account) && accounts.get(account) >= amount) {
                accounts.put(account, accounts.get(account) - amount);
                System.out.println("Withdrawal of " + amount + " from " + account + " processed.");
            } else {
                System.out.println("Insufficient balance for " + account);
            }
        }
    }

    public static void main(String[] args){
        BankingSystem bank = new BankingSystem();
        bank.createAccount("A001", 5000);
        bank.createAccount("A002", 3000);

        bank.processWithdrawal("A001", 1000);
        bank.processWithdrawal("A002", 500);
        bank.executeWithdrawals();
    }
}

