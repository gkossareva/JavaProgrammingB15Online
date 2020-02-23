package day46;

public class JavaProgrammer extends Programmer {


@Override


    void code (){
    super.code();
    System.out.println("I code java");
}
@Override
void test () {
    super.test();
    System.out.println("We do test in JUnit");
}

    public void drinkCoffe(){
        System.out.println("Java programmers frink coffee");
}
}