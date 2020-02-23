package day58;

public class TryCatchFinally {
    public static void main(String[] args) {
        System.out.println("After try catch");
        try {

            System.out.println("Hello from try blco");
            String str=null;
            System.out.println(str.length());
        }catch (Exception e){
            System.out.println("Exception happened and caught");
        }finally {
            System.out.println("Finally block. Runs even if there is exception or no exception");
        }

    }
}
