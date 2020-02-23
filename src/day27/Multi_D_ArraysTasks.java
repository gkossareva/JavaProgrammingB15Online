package day27;



public class Multi_D_ArraysTasks {
    public static void main(String[] args) {

        int [] [] numbers = {  {12,11,10,19},{19,20,15}, {100,90,89,7888}};
                               //0               1             2
        int max = numbers[0][0];// assume that first element is the max
        for (int i = 0; i <numbers.length;i++ ) {
          for (int j=0; j <numbers[i].length;j++){

              if (max <numbers[i][j]){
                  max = numbers[i][j];
              }
          }
        }
        System.out.println("max = " + max);

        //solution 2
        int max2 = numbers[0][0];
        for (  int [] each1Darray  :  numbers   ){
            for (int eachInt : each1Darray){
                if (max2<eachInt){
max2=eachInt;
                }
            }
        }
        System.out.println("max2 = " + max2);

        //finding the minimum number

        int min = numbers[0][0];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j <numbers[i].length ; j++) {
                if (min>numbers[i][j]){
                    min=numbers[i][j];
                }

            }
        }
        System.out.println("min = " + min);

        System.out.println("==================================");

        String[]developersTeam ={"Vladislav","Hasan","Tolkun","Abide"};
        String [] testersTeam={"Zhibekchach","Mohammed Sohrabi","Nursultan"};
        String[] businesAnalystsTeam={"Lisa","Ershad","Naila"};
        String[][] scrumTeam={developersTeam,testersTeam,businesAnalystsTeam};
        String longgestString="";
        int maxLength=scrumTeam[0][0].length();
        for(String[] each1DArray: scrumTeam){
            for (String eachElement: each1DArray){
                if (maxLength<eachElement.length()){
                    longgestString=eachElement;
                }

            }
        }
        System.out.println(maxLength);
        System.out.println(longgestString);



    }


}
