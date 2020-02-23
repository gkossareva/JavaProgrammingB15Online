package Repl;

public class GasTank {
    //WRITE YOUR CODE HERE
    double amount = 0;
    double capacity;

    public GasTank(double capacity) {

        this.capacity = capacity;
    }
    public void addGas(double parameter1){
        amount=amount+parameter1;
        if (amount> capacity) {
            amount = capacity;
        }
    }

    public void useGas(double parameter2){
        amount=amount-parameter2;
        if( amount<0){
            amount=0;
        }
    }
    public boolean isEmpty(){
        return amount<0.1;
    }
    public boolean isFull(){
        return amount> capacity -0.1;
    }
    public double getGasLevel(){
        return amount;
    }

    public double fillUp(){

        double difference;
      //  difference = capacity -amount;
      //  amount= capacity;
        return capacity-amount;
    }
//A method named fillUp that accepts no parameters.
// fillUp increases amount to capacity and returns the difference between the value of capacity and the original value of amount
// (that is, the amount of gas that is needed to fill the tank to capacity).
}
