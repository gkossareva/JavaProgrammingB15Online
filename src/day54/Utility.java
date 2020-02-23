package day54;

public class Utility {

    public static void main(String[] args) {
        Wearable w1 =new Clothes();
        wearMyWearable(w1);

        Wearable w2=new Watch();
        wearMyWearable(w2);

        Wearable w3=new Perfume();
        wearMyWearable(w3);

        Wearable w4=new Makeups();
        wearMyWearable(w4);

        //directly passing object without storing into a variable
        wearMyWearable(new Watch());
       // wearMyWearable(new String());String is not a Wearable


    }

    public static Wearable getMyWearableObject(){

     //   Wearable result=g
        //return new Clothes();
        //return new Watch();
        //return new Perfume();
        return new Makeups();
    }
    public static void wearMyWearable(Wearable any){
any.wear();
    }

}
