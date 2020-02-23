package mentoring;

public class Gym {
    String pool;
    String leftEquipment;
    String sauna;


    public Gym(String leftEquipment){
        this.leftEquipment=leftEquipment;
    }
    public Gym (String leftEquipment,String pool){
        this.leftEquipment=leftEquipment;
        this.pool=pool;
    }
public Gym (String leftEquipment,String pool,String sauna){
    this.leftEquipment=leftEquipment;
    this.pool=pool;
    this.sauna=sauna;
}
    @Override
    public String toString() {
        return "Gym{" +
                "pool='" + pool + '\'' +
                ", leftEquipment='" + leftEquipment + '\'' +
                ", sauna='" + sauna + '\'' +
                '}';
    }
}
