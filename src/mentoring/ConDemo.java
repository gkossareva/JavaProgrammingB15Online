package mentoring;

public class ConDemo {
    String name;
    boolean onOf;
    int number;
    double balance;

  /*  public ConDemo(){
        name="null";
        onOf= false;
        number=0;
        balance=6.0;
    }*/
  public ConDemo(){
      this("default name",true,1,10.1);
  }

    public ConDemo(String name, boolean onOf, int number, double balance) {
        this.name = name;
        this.onOf = onOf;
        this.number = number;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "ConDemo{" +
                "name='" + name + '\'' +
                ", onOf=" + onOf +
                ", number=" + number +
                ", balance=" + balance +
                '}';
    }

}
