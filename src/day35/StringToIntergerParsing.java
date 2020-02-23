package day35;

public class StringToIntergerParsing {
    public static void main(String[] args) {
        //i have employer id "FB-457"
        //GIVE EMPLOYER NUMBER AND SOTRE IN NUM

        String strNum="100";
        int num=Integer.parseInt(strNum);
        System.out.println("num = " + num);

        String emID="FB-457";
      //  int id=Integer.parseInt(emID.split("-")[1]);
       String [] empIDsplit=emID.split("-");
       String  idStr = empIDsplit[1];
       int id =Integer.parseInt(idStr);
        System.out.println("id = " + id);
        
        //i have a String called twoNumbers
        //String twoNumbers="100,600";
        String num1="100";
        String num2="600";
        //i want yuo to add them and give tje result
        int numb1=Integer.parseInt(num1);
        int numb2=Integer.parseInt(num2);
        int result=numb1+numb2;
        System.out.println("result = " + result);
    }
}
