package SelfPractice;

public class SelfArrayPractice {
    public static void main(String[] args) {
       int [] myList={1,2,4,6};
       int max=0;
        for (int i = 0; i <myList.length ; i++) {
           if (myList[i]>max){
               max=myList[i];
           }
        }
        System.out.println("max = " + max);

    int min=0;
        for (int j = 0; j < myList.length; j++) {
            if (myList[j]<min){
                min=myList[j];
            }
        }
        System.out.println(min);

    int x=30;
    int [] num = new int[x];
    x=60;
        //System.out.println("num = " + num);
        System.out.println(num.length);

}}