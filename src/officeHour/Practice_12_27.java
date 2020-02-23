package officeHour;



public class Practice_12_27 {
    public static void main(String[] args) {
        String a ="ABCDEFG";
        for (int i = a.length()-1; i >=0 ; i--) {
            System.out.print(a.substring(i,i+1));
        }
        String a1="Esra Fidan";
        System.out.println( );
        method2();
        method1();
        double number1= method3();
        System.out.println(eligible(45));
    }
    public static void method1(){
        System.out.println("Hello Batch 15");
      //  return 10;return type is voide, that means cannot return any value
    }
    public static void method2(){
        if (false){
            return;//exits the current method immidiately
        }
        System.out.println("Test completed");
    }

    public static double method3(){

        return 10.5;
    }
    public static boolean eligible(int age){
        if (age>35){
            return true;
        }
        return false;
    }


}
