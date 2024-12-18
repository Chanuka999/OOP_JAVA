class Bank{
    private ArrayList<Account> accounts = new ArrayList<Account>();

    void add_account(){
        accounts.add(account);
    }

    void remove_account(){
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