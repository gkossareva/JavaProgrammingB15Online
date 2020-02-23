package day23;

public class ForEachLoopPractice {
    public static void main(String[] args) {
        //create a long array of 5 items called salaries
        //put your salary ammount that ok for your offer
        //use for each loop to iterate over them
        //optionally:
        //print only the salary more than 100000
        long[] salaries = {89000, 120000, 110000, 150000, 200000};

        for (long eachSalary : salaries) {
            System.out.println("eachSalary = " + eachSalary);
           
        }
        for (long okSalary : salaries) {
          /*  if (okSalary > 100000) {
                System.out.println("okSalary"+okSalary);*/
          if(okSalary<=100000){
              continue;

            }
            System.out.println("okSalary = " + okSalary);
        }
    }
}