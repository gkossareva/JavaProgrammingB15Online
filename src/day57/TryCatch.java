package day57;

public class TryCatch {
    public static void main(String[] args) {
        System.out.println("Before try catch");
try {
    int result = 10 / 0;

}catch(ArithmeticException e){
    System.out.println("Exception happened and was handled");
}
        System.out.println("After try catch");
    }
}
