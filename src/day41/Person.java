package day41;

public class Person {
   //private make it only cceddible within the same...
    private String name;
   private int age;
    private long ssn;

    public  int getAge(){
        return age;
    }
    public void setAge(int newAge){
        age=newAge;
    }
    public  long getSsn(){
        return ssn;
    }
    public void setSsn(long newSsn){
       ssn=newSsn;
    }
    //write a method to give value to the field
    public  String getName(){
        return name;
    }
    public void setName(String newName){
        name=newName;
    }

    public void setAll(String newName,int newAge, long newSsn){
        name=newName;
        age=newAge;
        ssn=newSsn;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ssn=" + ssn +
                '}';
    }
}
