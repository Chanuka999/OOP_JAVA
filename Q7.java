import java.util.ArrayList;
class Bank{
    private ArrayList<Account> accounts;

    Bank(){
        accounts = new ArrayList<Account>();
    }

    void add_account(Account account){
        accounts.add(account);
    }

    void remove_account(Account account){
        accounts.remove(account);
    }
    void depositMoney(Account account, double amount){
        account.deposit(amount);
    }

    void withdrowMoney(Account account,double amount){
        account.withdrow(amount);
    }

    ArrayList<Account> getAccounts(){
        return accounts;
    }
}

class Account{
    String name;
    int accountNumber;
    double balance;
    
    Account(String name,int accountNumber,double balance){
        this.name=name;
        this.accountNumber=accountNumber;
        this.balance = balance;
    }

    String getName(){
        return name;
    }
    void setName(String name){
        this.name=name;
    }
    double balance(){
        return balance;
    }

    void balance(double balance){
        this.balance=balance;
    }
    void deposit(double amount){
        balance +=amount;
    }

    void withdrow(double amount){
        balance -=amount;
    }

   public String getAccountInfo(){
        return "Name: " + name + ", Account Number:" + accountNumber + ",Balance:" + balance;

    }
}
public class Q7{
    public static void main(String[] args){
        Bank bank = new Bank();
        Account account1 = new Account("chanuka",123456,670000);
         Account account2 = new Account("pawan",123434,450000);
          Account account3 = new Account("kamal",123478,870000);

        bank.add_account(account1);
        bank.add_account(account2);
        bank.add_account(account3);


        ArrayList<Account> accounts =bank.getAccounts();

        for(Account account: accounts){
            System.out.println(account.getAccountInfo());
        }
        bank.depositMoney(account1,1000);
         bank.depositMoney(account2,11000);
          bank.depositMoney(account3,41000);


      System.out.println("diposit in 1000 :");
        System.out.println(account1.getAccountInfo());

         System.out.println();
        System.out.println("diposit in 11000 :");
        System.out.println(account2.getAccountInfo());

        System.out.println();
        System.out.println("diposit in 41000 :");
        System.out.println(account3.getAccountInfo());
    }
}