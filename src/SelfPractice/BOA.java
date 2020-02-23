package SelfPractice;

import day21.NameBreaker;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Arrays;

abstract class ScrumTeam{
  public   String Name,JobTitle;
   public double Salary;

   public abstract void dailyStandup();
    public abstract void demo();

public void getEmmployerInfo(){
    System.out.println("=====================");
    System.out.println("Employer name: "+Name);
    System.out.println("Job title: "+JobTitle);
    System.out.println("Salary: $"+Salary);
    System.out.println("=====================");
}
}

class Testers extends ScrumTeam{
    public Testers(String Name, String JobTitle, double Salary){
        this.Name=Name;
        this.JobTitle=JobTitle;
        this.Salary=Salary;

    }

    @Override
    public void dailyStandup(){
        System.out.println("Tester "+Name+ " is talking");
    }
    @Override
    public void demo(){
        System.out.println("Tester "+Name+ " is doing demo");
    }
}
class Developers extends ScrumTeam{
    public Developers(String Name, String JobTitle,double Salary){
        this.Name=Name;
        this.JobTitle=JobTitle;
        this.Salary=Salary;
    }
    public void dailyStandup(){

    }
    public void demo(){

    }

}
public class BOA {
    public static void main(String[] args) {
        ScrumTeam Madina= new Testers("Madina","SDET",130000.0);
        ScrumTeam Akerke= new Testers("Akerke","automation tester",100000.0);
        ScrumTeam Erhan= new Testers("Erhan","manual tester",90000.0);
        Madina.dailyStandup();
        Madina.demo();

        ScrumTeam[] testers={Madina,Akerke,Erhan};
//        for ( ScrumTeam each: testers){
//            each.getEmmployerInfo();
//        }
        Madina.getEmmployerInfo();

        ScrumTeam Nadire=new Developers ("Nadire","junior developer", 100000);
        ScrumTeam Mahir=new Developers ("Mahir","senior developer", 150000);
        ScrumTeam Parsa=new Developers ("Nadire"," developer", 200000);

        ScrumTeam [] dev={Nadire,Mahir,Parsa};
//        for (ScrumTeam each2:
//             dev) {
//            each2.getEmmployerInfo();
//        }

        ArrayList<ScrumTeam>scrum=new ArrayList<>();
        scrum.addAll(Arrays.asList(dev));
        scrum.addAll(Arrays.asList(testers));

        for ( ScrumTeam each:scrum
             ) {
            each.getEmmployerInfo();

        }

    }


}
