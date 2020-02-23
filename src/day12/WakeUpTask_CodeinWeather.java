package day12;

public class WakeUpTask_CodeinWeather {
    public static void main(String[] args) {
        //create a variable to store the weather of your city right now
        //and write a if else if else statement to do following
        //if weather Sunny------->Code in Sunny Weather
        //if weather Rainy------->Code in Rainy Weather
        //if weather Cloudy------->Code in Cloudy Weather
        //if weather Cloudy------->Code in Cloudy Weather
        //if weather Snowy------->Code in Snowy Weather
        //else----> rain or shine just keep coding anyway!!!

        String weatherOfYourCity="Hot";

        if (weatherOfYourCity.equals("Sunny")){
            System.out.println("Code in Sunny Weather!");
        }else if (weatherOfYourCity.equals("Rainy")){
            System.out.println("Code in Rainy Weather");
        }else if (weatherOfYourCity.equals("Cloudy")){
        System.out.println("Code in Cloudy Weather");
        }else if (weatherOfYourCity.equals("Snowy")){
            System.out.println("Code in Snowy Weather");
    }else
            System.out.println("rain or shine just keep coding anyway!!!");
    }
}
