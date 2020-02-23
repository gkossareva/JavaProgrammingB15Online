package day60;

import java.io.FileNotFoundException;

public class DangerZoneAgain2 {
    public static void main(String[] args) throws InterruptedException {

            readMyFile();

        Thread.sleep(3000);
        System.out.println("The End");
    }
    // document this method to tell the caller , the file you are about to read might not exists
    // and handle the consequences yourself
    // the exception type already exists for this type of situation is called
    // FileNotFoundException from java.util package

    public static void readMyFile() {

        System.out.println("Reading the file in my computer");
try {

    throw new FileNotFoundException("Kaboon! File is not here");
}catch (FileNotFoundException e){
    System.out.println("AHA! CAUGHT YOU IN READMYFILE!!!");
}
    }


}
