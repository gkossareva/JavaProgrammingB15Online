package day52.warmup;

public class Account implements Transferable, Comparable<Account>{

    protected String name;
    private int balance;

    public Account(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }
    @Override

    public void transferAll(Account otherAccount){
        //get the balance of current account

        otherAccount.balance+=this.balance;
        //deposite to the other account
        this.balance=0;
        //set currnt account balance to 0
//
//        otherAccount.deposit(this.balance);
//        this.withdraw(this.balance);
  }
    public int getBalance(){
        return balance;
    }
    public void deposit(int amount){
        balance=balance+amount;
    }
    public void withdraw(int amount){
        balance=balance-amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    //add a method called isPalindrom
    // and return  true if the name is palindrome

    public boolean isPalindrom(){
        //first strore into a temp
        //and replace all the space and make it lowercase
//we do not want to change the name of the accountant, ie we worked with the copty
        String nameCopy=this.name.toLowerCase().replace(" ","");
        //we need to reverse the value and check wether they are still same String or not
        String reverseResult="";
        for (int x = 0; x >nameCopy.length()-1 ; x--) {
            reverseResult=reverseResult+nameCopy.charAt(x);

        }
        return nameCopy.equals(reverseResult);
    }
///add logic to compare with by balance
    @Override
    public int compareTo(Account otherAccount) {
        if (this.balance>otherAccount.balance){
            return 1;
        }else if (this.balance<otherAccount.balance){
            return -1;
        }else{
        return 0;
    }}
}
//* Warm up Task
//*
//* Create a class called Account
//* it has 2 fields
//*     name as String (protected) , balance as int (private)
//*
//*   -- add constructor to set name and balance
//*   -- add getters to the balance field
//*   -- add deposit method that accept 1 int arugument
//*          -- it will change the balance
//*   -- add withdraw method that accept 1 int arugument
//*          -- reduce the balance
//*   -- add toString method for nice output
//*  Create an interface called Transferable
//*  it has single abstract method
//*      - transferAll accept another Account object as parameter
//*      - void transferAll(Account otherAccount)
//*
//*  Account implements Transferable interface
//*      logic inside transferAll implementation
//*          it should take all the balance from current account to other Account
//*
//*   Create a class called   Account Action with main method
//*      Test your code by creating few Account objects
//*
//*
//*
//*   Optionally : let Account implements Comparable<Account>
//*          Create List<Account> and sort them using Collecions.sort(..)
//*
//*   to honor Palindrome day ,
//*   add a method inside Account class called
//*          isPalindrome return true if account name is palidrome (case and space should not matter)
//*
//*/