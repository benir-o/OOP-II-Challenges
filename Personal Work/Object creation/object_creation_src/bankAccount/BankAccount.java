package bankAccount;

abstract public class BankAccount {
    String accountNumber;
    Double accountBalance;

    public BankAccount(String accountNumber, Double accountBalance){
        this.accountNumber = accountNumber;
        this.accountBalance= accountBalance;
    }

}
