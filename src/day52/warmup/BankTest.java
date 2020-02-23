package day52.warmup;

public class BankTest {
    public static void main(String[] args) {


        Account a1 = new Account("John Snow", 10000);
        Account a2 = new Account("Hannah", 17000);
        System.out.println("before a1 = " + a1);
        System.out.println("before a2 = " + a2);

        a1.transferAll(a2);
        System.out.println("after a1 = " + a1);
        System.out.println("afer a2 = " + a2);
a1.deposit(50000);
a1.withdraw(10000);

        a2.transferAll(a1);
        System.out.println("after 2nd transaction a1 = " + a1);
        System.out.println("afer 2nd transaction a2 = " + a2);

        System.out.println(a1.isPalindrom());
        System.out.println(a2.isPalindrom());

    }
}
