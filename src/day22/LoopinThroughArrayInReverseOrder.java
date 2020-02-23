package day22;

public class LoopinThroughArrayInReverseOrder {
    public static void main(String[] args) {
        int[] score = new int[4];
//assigning value to each endex
        score[0] = 95;
        score[1] = 70;
        score[2] = 88;
        score[3] = 100;

        int elementCount = score.length;
        int lastItemIndex = elementCount - 1;


        for (int x = lastItemIndex; x >= 0; x--) {
            System.out.println(score[x]);
        }
    }
}