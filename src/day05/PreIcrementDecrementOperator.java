package day05;

import java.sql.SQLOutput;

public class PreIcrementDecrementOperator {
    public static void main(String[] args) {
        int offerCount=2;
     //   offerCount=offerCount+1;

        //offerCount+=1;
        ++offerCount;
        //++ AND - -IS EXCLUSEVELY for decreasing and increasing by 1 ONLY
        System.out.println("Offer now "+offerCount);

        --offerCount;
        System.out.println("Offer after "+offerCount);
    }
}
