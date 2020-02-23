package day49;

public class Tesla extends Vehicle implements Autonomous {
    int horsePower;
    String model;

    public Tesla(int year, int horsePower, String model) {
        super(year);
        this.horsePower = horsePower;
        this.model = model;
    }

    @Override
    public void selfDrive() {
        System.out.println("tesla model "+model+" self driving");
    }

    @Override
    public void start() {
        System.out.println("tesla "+model+"starts with electricity");
    }

    @Override
    public String toString() {
        return "Tesla{" +
                "horsePower=" + horsePower +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
    //public default void charge(){
    //        System.out.println("default charge . you may do it on your own");
    //    }
}
