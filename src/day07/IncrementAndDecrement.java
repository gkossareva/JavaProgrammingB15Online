package day07;

public class IncrementAndDecrement {

    public static void main(String[] args) {
        int apple = 10;
        //apple=apple+1;
        System.out.println("original apple " +apple);
        //apple+=1;
        ++apple;
        ++apple;
        System.out.println("used ++ twice then apple is "+apple);

        --apple;
        System.out.println("used --once then apple is "+apple);
       // System.out.println(++apple);

        System.out.println("used ++ to increment and concatenate "+ (++apple) );
    }
}
