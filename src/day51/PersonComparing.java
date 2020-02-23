package day51;

public class PersonComparing {
    public static void main(String[] args) {


        Person p1 = new Person("Arafat", 34);

        Person p2 = new Person("Zhibekchach", 18);

        Person p3 = new Person("Asena", 18);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println(p1.compareTo(p2));
        System.out.println(p2.compareTo(p3));
        //ANYTHING WE SORT MUST BE COMPARABLE

//compare p1 and p2
       // if p1 is older print 1
        //if the are same age print 0
        //if p2 is older print -1

    /*    if (p1.age>p2.age){
            System.out.println(1);
        }else if(p1.age<p2.age){
            System.out.println(-1);
        }else{
            System.out.println(0);
        }
    }*/


}

}