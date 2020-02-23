package day20;

public class SumOfOdd {
    public static void main(String[] args) {
        int sum=0;
        for(int x=10; x<=100; x++){
            if(x%2==1)
                sum+=x;
        }
        System.out.println(sum);
    }
}


        //give methe sum of odd number from 10-100
