package Repl;

public class ParkingMeter {
    int timeLeft =0;
    int maxTime;

    public ParkingMeter(int maxTime){
        this.maxTime=maxTime;
    }
    public boolean add(int parameter){
        boolean result=true;
        if (parameter==25&&timeLeft<maxTime){
            timeLeft=timeLeft+30;
            result= true;
        }else{
            timeLeft=timeLeft;
            result= false;
        }
        return result;
    }
    public boolean tick (){
        if (timeLeft>0){
            timeLeft=timeLeft-1;
        }
        return true;
    }

    public boolean isExpired(){
        if (timeLeft==0){
            return true;
        }else{
            return false;
        }
    }
}
