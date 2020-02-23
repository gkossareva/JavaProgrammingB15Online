package day48;

public class HR_Action {
    public static void main(String[] args) {


        HourlyEmployee e1=new HourlyEmployee(55,2000,"Subi",101);
        e1.calculateAnualSalary();

        System.out.println("e1="+e1);
        HourlyEmployee e2=new HourlyEmployee(57,2080,"Roksana",102);
        e2.calculateAnualSalary();

        System.out.println("e2="+e2);

        FullTimeEmployee e3=new FullTimeEmployee("Ainura",103,10000);
        e3.calculateAnualSalary();
        System.out.println("e3="+e3);

        FullTimeEmployee e4=new FullTimeEmployee("Denis",104,13000);
        e4.calculateAnualSalary();
        System.out.println("e4="+e4);
    }
}
