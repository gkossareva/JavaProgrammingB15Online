package day51.polymorphim;

import org.w3c.dom.ls.LSOutput;

public abstract class Animal {
    public abstract void makeNoise();
  //      System.out.println("general animal  noise");
    //}
}

class Dog extends Animal{
  @Override
  public void makeNoise(){
      System.out.println("Dog says woof");

  }


        }


        class Horse extends Animal{
            @Override
            public void makeNoise(){
                System.out.println("horse says neigh neigh");
            }
        }