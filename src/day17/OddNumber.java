package day17;

public class OddNumber {
    public static void main(String[] args) {
        //write a loop to print out odd number from 0 to 50
        int number = 1;
        while (number <= 50) {

            System.out.print(number + " ");
            number = number + 2;

        }
        System.out.println("---------------");
        int cnt=0;
        while(cnt<=50){
            if(cnt%2==0){
                System.out.println(cnt+" is even number");
            }else{
                System.out.println(cnt+"is odd number" );
            }
            ++cnt;
        }
    }
}