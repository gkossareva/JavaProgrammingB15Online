package day46;

public class AtTheBankClass {

    public static void main(String[] args) {

        CheckingAccount acc1=new CheckingAccount("Zehra",54321,10000);
    acc1.deposit(100);
        System.out.println("acc1 = " + acc1);
        acc1.deposit(5000);//it gives us additional200 requirment
        System.out.println("acc1 = " + acc1);
        acc1.withdraw(5300);//withdraw takes the same amount of money
        System.out.println("acc1 = " + acc1);
    }
}
