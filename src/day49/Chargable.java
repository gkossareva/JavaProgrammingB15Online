package day49;

public interface Chargable {

    public default void charge(){
        System.out.println("default charge . you may do it on your own");
    }
}
