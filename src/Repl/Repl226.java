package Repl;

public class Repl226 {
    public double width,length,unitPrice,totalPrice;
    public boolean isPersian;
    public Repl226() {
        this.width = 300.0;
        this.length = 300.0;
        this.unitPrice = 0.0;
        this.totalPrice = 200.0;
        this.isPersian=false;

    }

    public Repl226(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
       // this.totalPrice = totalPrice;
        this.isPersian = isPersian;
        if( isPersian = false){
            totalPrice=(width + length)*unitPrice;
            //Set totalPrice as the width + length multiplied by the unitPrice.
            //
            //if its a Persian carpet add 200 to totalPrice.
        }else{
            totalPrice=(width + length)*unitPrice+200;
        }
    }}
// Size is 300 x 300 and totalPrice for that is 200. And also it is not a Persian carpet. unitPrice is set as 0.
