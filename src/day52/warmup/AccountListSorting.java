package day52.warmup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AccountListSorting {
    public static void main(String[] args) {

        List<Account>accountList=new ArrayList<>();
        accountList.add(new Account("John Snow",10000));
        accountList.add(new Account("Vlad",11000));
        accountList.add(new Account("Svetlana",13000));
        accountList.add(new Account("Muhhammad",8000));
        accountList.add(new Account("Emme",17000));
        accountList.add(new Account("Ata",15000));

        System.out.println("accountList before = " + accountList);
        Collections.sort(accountList);

        System.out.println("accountList after = " + accountList);

        //create another account with your name. transfer everyone's money to your account
       // accountList.add(new Account("Galina",20000));

        Account myAccount= new Account("Galina",0);
        for (Account each: accountList){
            each.transferAll(myAccount);
        }
        System.out.println("myAccount = " + myAccount);

        System.out.println("accountList after = " + accountList);
    }
    //what can be the data type of a1
    //Account a1
    //Comparable
    //Transferable
//a1=new Account("Polymorphism",1000);

    Account a1 = new Account("Polymorphism ", 100000);
    Transferable t1=new Account("Polymorphism2 ", 100000);
    Object O1= new Account("Polymorphism3 ", 100000);
}
