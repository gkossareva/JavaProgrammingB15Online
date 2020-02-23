package day58;

public class CheckedExeptionDemo {
    public static void main(String[] args) {
        System.out.println("Checked exeption in next line");
try {
    Thread.sleep(5000);
}catch(Exception e){
    System.out.println("Exception was caught");
}
        System.out.println("After thread asleep");
    }
}
