package bankAccount;

public class SavingsAccount extends BankAccount {

    SavingsAccount(String accountNumber,Double Balance){
        super(accountNumber,Balance);
    }

    static Double InterestRate;

    double deposit(){
        return 0.00;
    }
    double withdraw(){
        return 0.00;
    }
    static double getInterestRate(){
        return InterestRate;
    }
    /*
    Our setInterestRate method is set to static,
    meaning it can be accessible by all instances of the class?
    You can't trigger instance methods inside a static method.
     */
    static double setInterestRate(double InterestRate){
        return InterestRate;
    }
    @Override
    public String toString(){
        return "Account Number- "+this.accountBalance;
    }


    public static void main(String[] args) {
        SavingsAccount S1=new SavingsAccount("105456", 89504.00);
        System.out.println(S1);

    }
}
