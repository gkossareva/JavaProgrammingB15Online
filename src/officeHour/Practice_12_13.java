package officeHour;

public class Practice_12_13 {
    public static void main(String[] args) {
       //
        String fruits[] = {"apple", "banana", "grape", "strawberry", "blueberry", "kiwi"};
        //index:            0          1      2         3          4           5
        //1.7 print out only those items end with letter e

        // fruits[3].endsWith("e");
    /*first solution
        for (int i = 0; i < fruits.length; i++) {
            String str = fruits[i];
            if(str.endsWith("e")){
                System.out.println( str);
            }
        }*/
        for (int i = 0; i < fruits.length; i++) {
            String str = fruits[i];
            if (!str.endsWith("e")) {
                continue;
            }
            System.out.println(str);
        }
        System.out.println("=========================");
        //for(variable: collection of data){
        //statementd;
        //}
        //variables must be representing each elements of the collection of data
        for (String eachFruit: fruits){
        char lastChar=    eachFruit.charAt(eachFruit.length()-1);
            System.out.println( lastChar);
            if (lastChar=='e'){
                System.out.println(eachFruit);

                //  1.8 print out only last 3 characters of all the items
                for (int i = 0; i < fruits.length; i++) {
                    String last3=fruits[i].substring(fruits[i].length()-3);
                    System.out.println(fruits[i]);//print all
                    System.out.println(last3);
                }

                for(String eachFruct: fruits){
                    String last3=eachFruct.substring(eachFruct.length()-3);
                }
            }
        }


    }


}