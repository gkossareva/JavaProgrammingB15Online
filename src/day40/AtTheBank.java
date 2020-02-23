package day40;

public class AtTheBank {
    public static void main(String[] args) {
        BankAccount b1=new BankAccount();
        b1.setAllTheValue("Saving","Hassan",123456789,10000);
  b1.showAccountBalance();

  b1.deposite(3000);
        System.out.println("b1 = " + b1);

        b1.withdraw100$Cash();
        System.out.println("b1 = " + b1);
        
        b1.withdraw(1200);
        System.out.println("b1 = " + b1);
        
        b1.purchaseSmth(120,3);
        System.out.println("b1 = " + b1);
    }
}
