package day33;

public class MethodWithReturnPractice {

        public static void main(String[] args) {
            //TODO 1, Call your method here to test
            System.out.println(getDaysOfTheWeekFromNumber(6));
            System.out.println(getDaysOfTheWeekFromNumber(16));

            //TODO 2, OPTIONALLY , Create an int Array that has 5 numbers, test your code with those
int[] allCode={5,3,11,4,33};


            for (int x = 0; x < allCode.length; x++) {
                String day=getDaysOfTheWeekFromNumber(allCode[x]);
                System.out.println("day = " + day);

            }
        }

        /**
         * getDaysOfTheWeekFromNumber
         * This method can take one number preferably (1-7)
         * and convert that to actual day in word
         *
         * @param dayCode as int  to represent day in number
         * @return the day in word in English as String if the number is valid
         * if the number is not within 1-7 return FUNDAY!
         */
        public static String getDaysOfTheWeekFromNumber(int dayCode) {

            //String dayName = "" ;
            switch (dayCode) {

                case 1:
                    return "Monday";
//                dayName = "Monday";
//                break ;
                case 2:
                    return "Tuesday";
//                dayName = "Tuesday";
//                break ;
                case 3:
                    return "Wednesday";
//                dayName = "Wednesday";
//                break ;
                case 4:
                    return "Thursday";
//                dayName = "Thursday";
//                break ;
                case 5:
                    return "Friday";
//                dayName = "Friday";
//                break ;
                case 6:
                    return "Saturday";
//                dayName = "Saturday";
//                break ;
                case 7:
                    return "Sunday";
//                dayName = "Sunday";
//                break ;
                default:
                    return "FUNDAY!!";
//                dayName = "FUNDAY!!";
            }

//        return dayName;
        }
// public static String getDaysOftheWeek(int daycode){
//        String [] daysArray={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
//        String day="";
//        if(daycode>0 && daycode<=7 ){
//            day=daysArray[daycode-1];
//        }else{
//            day="FUNDAY";
//        }
//​
//        return day;
//    }
//}


    }