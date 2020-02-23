package officeHour;

public class Practice_12_30 {
    public static void main(String[] args) {

        int a =10;
        Integer A=a;

        float f =0.5f;

        Double num1=0.5;
        Short num3=45;
        Integer num4=100;
        double num2=num4;
        System.out.println(num2);

       Long number1=100L;//AUTO-BOXING
        Float f1=100.0f;
        double d1=f1;//unboxing

        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        System.out.println(Integer.MAX_VALUE);

        String str="123";
        int result =Integer.parseInt(str);
        System.out.println(str+1);
        System.out.println(result+1);
String str2="true";
boolean r1= Boolean.parseBoolean(str2);
        System.out.println(r1==false);

        String str3 ="FaLsE";
       boolean r2= Boolean.parseBoolean(str);
        System.out.println(r2);

        String str4="Parvin";
        boolean r3= Boolean.parseBoolean(str4);
        System.out.println(r3);

        System.out.println( addNum(100.5,200.8));
    }

    public static int addNum(int a, int b){


        return a+b;
    }
    public static double addNum(double a, double b){
        return a+b;
    }

}
