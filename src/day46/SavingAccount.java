package day46;

public class SavingAccount extends BankAccount {
    //String accountHolder;
    //    long accountNum;
    //    double balance;
    double interestRate;

    public SavingAccount(String accountHolder, long accountNum, double balance, double interestRate){
        super(accountHolder,accountNum,balance);
        this.interestRate=interestRate;
    }
//bad idea, just doing it anyway
    public static void main(String[] args) {
        SavingAccount s1=new SavingAccount("Mohammed",12345,500,4.2);
        System.out.println("s1 = " + s1.toString());

        s1.withdraw(100);
        System.out.println("s1 = " + s1);
        s1.deposit(1000);
        System.out.println("s1 = " + s1);
        // System.out.println("s1 = " + s1); if we have overiding we can do this way

    }

    @Override
    public void deposit(int amount){
        //balance+=amount+amount*interestRate;
        //calculating the interest rate casting to int variable
        //because deposit method accept ind data type not double!!!
        int actualAmount=(int)(amount+amount*interestRate);
        super.deposit(actualAmount);
    }


    //in our SavingAccount if we withdraw amount
    //you 30$ penalty
    //so we will overide the withdraw method to reflect this requirmat

    @Override

    public void withdraw(int amount){

        //balance-=(amount+30);
     //   balance=balance-amount-30;
        super.withdraw(amount);
        super.withdraw(30);
    }




    @Override//its optional, once being used it will enforce overiding rule
    //if any rule does not match iy will not even compile
    //so its always good to use it to prevent accidental errors
    public String toString() {
        return "SavingAccount{" +
                "interestRate=" + interestRate +
                ", accountHolder='" + accountHolder + '\'' +
                ", accountNum=" + accountNum +
                ", balance=" + balance +
                '}';
    }
}
