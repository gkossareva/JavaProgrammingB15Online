package day50;

public class Substraction extends Question {
    public Substraction(int num1, int num2){
        super("substruction question","-");
        this.num1=num1;
        this.num2=num2;

        if (num1<num2){
            int temp=num1;
            num1=num2;
            num2=temp;
        }else{
            //after making sure num1> num2 then we set the field value
            this.num1=num1;
            this.num2=num2;
        }

    }
    @Override
    public void calculate(){
answer=num1-num2;
//calculated IS insrance to keep the truck of the Quartion
        //is calculated or not
calculated=true;
    }
    @Override
    public String toString(){
        if (calculated==true){
            return num1+operator+num2+" = "+answer;
        }else {
            return num1+operator+num2+" = ";
        }
    }
}
