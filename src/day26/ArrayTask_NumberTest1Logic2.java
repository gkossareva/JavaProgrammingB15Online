package day26;

public class ArrayTask_NumberTest1Logic2 {
    public static void main(String[] args) {

            int[] scores = {156, 101, 76, 187, 87, 110};
            int size = scores.length;
        String finalResult = "";
        int cntMoreThan100 = 0;
        for (int eachNum : scores) {
            if (eachNum<=100){
                finalResult = "NO";
                break;
            }
        }
        System.out.println("finalResult = " + finalResult);
        }
}
