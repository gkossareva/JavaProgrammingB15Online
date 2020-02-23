package Repl;

public abstract class Animal {

    String name;
    int age;

    Animal(String name,int age){
        this.name = name;
        this.age = age;
    }

    public abstract int getAgeInHumanYears();
}


