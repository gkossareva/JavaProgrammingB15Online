package Repl;

public class Value {

int val;
boolean isModified=false;
    public Value (int parameter){
this.val=parameter;
    }
    public Value (){

    }
    public void setVal(int parameter2){
this.val=parameter2;
isModified=true;
    }
    public boolean wasModified(){
        return isModified;
    }
    public int getVal(){
return val;
}
}

    //a method 'getVal' that returns an integer value as follows: if setVal has ever been called,
// it getVal returns the last value passed to setVal. Otherwise if the "single int parameter" constructor was used to create the object,
// getVal returns the value passed to that  constructor. Otherwise getVal returns 0.