package day22;

public class LoopArray {
    public static void main(String[] args) {
        int[] score = new int[4];
//assigning value to each endex
        score[0] = 95;
        score[1] = 70;
        score[2] = 88;
        score[3] = 100;

        int itemCount = score.length;
        //for (int x = 0; x <=itemCount-1 ; x++) {
        for (int x = 0; x < itemCount ; x++) {
            System.out.println(score[x]);
        }
        //CHARCOUNT OF sTRING
        //  String name="Jon Snow";
        //int charCount=name.length();

        int lastItemIndex = itemCount - 1;
        for (int x = lastItemIndex; x >= 0; x--) {
            System.out.println(score[x]);
        }
    }
}