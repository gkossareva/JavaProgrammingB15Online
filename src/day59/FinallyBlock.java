package day59;

public class FinallyBlock {
    public static void main(String[] args) {

        int [] num={1,4,5};

        try {
            System.out.println("num[0] = " + num[0]);
        }catch (Exception e){
            System.out.println("Exception caught \n"+ e.getMessage());
    }finally{
        System.out.println("will always run no matter whe have exception or not");
        }
        System.out.println("The end");
        }
}
// INTERVIEW :final and finally keyword ?
//finally only show up in try catch block
//final keyword : can be use on class level, method level, variable level
//final class : no child can not extend
//final method : no overriding in the sub
//final variable you can not reassign
//(constant)