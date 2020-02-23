package mentoring;

public class Patient {
    private String name;//instance variables/fields
    private int age;//instance variables/fields
   private int numberOfVisits;//instance variables/fields


    //access modifier+ data type +get+variable(empty){
    //return + variable}

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getNumberOfVisits(){
        return numberOfVisits;
    }
    //access modifier +void+ set+variables(data type +new variables){
    //instance variables = new variables}

    public void setName(String n){
        name = n;
    }
    public void setAge(int a){
        if(a>=1&&a<=130){
        age=a;
    }else{
            System.out.println("");
        }
    }
    public void setNumberOfVisits(int NOV){
        numberOfVisits=NOV;
    }
}

