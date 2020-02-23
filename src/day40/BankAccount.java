package day40;

public class BankAccount {
    String accountType;
    String accountHolder;
    long accountNumber;
   public double balance;
    //setAllTheValue
    public void setAllTheValue(String newAccountType, String newAccountHolder,long newAccountNumber,double newBalance ){

        accountType=newAccountType;
        accountHolder=newAccountHolder;
        accountNumber=newAccountNumber;
                balance=newBalance;
    }
    //showAccountBalance
 public void showAccountBalance(){
        System.out.println("current balance "+balance);
    }
    //showAccountHolderAccountType
    public double getBalance(){
        return balance;
    }
    //getBalance
    //deposite (ammount)

    public void deposite(double ammount){
        balance=balance+ammount;

}


    //withdraw (ammount)
    public void withdraw (double ammount) {
        balance = balance - ammount;
    }
        //withdraw100$Cash
public void withdraw100$Cash(){
        withdraw(100);
}
    //purchaseSmth(ProductPrice,count)
    public void purchaseSmth(double productPrice, int count){
double totalPrice=productPrice*count;
balance-=totalPrice;
    }


    public String toString() {
        return "BankAccount{" +
                "accountType='" + accountType + '\'' +
                ", accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
    //toString
}
