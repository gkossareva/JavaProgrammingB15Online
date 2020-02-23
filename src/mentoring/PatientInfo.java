package mentoring;

public class PatientInfo {
    public static void main(String[] args) {

    Patient p1=new Patient();//THIS IS OBJECT
    /*    System.out.println("p1.name = " + p1.name);
        System.out.println("p1.age = " + p1.age);
        System.out.println("p1.numberOfVisits = " + p1.numberOfVisits);

        //assigning values
        p1.name="Akbar";
        p1.age=29;
        p1.numberOfVisits=5;

        System.out.println("p1.name = " + p1.name);
        System.out.println("p1.age = " + p1.age);
        System.out.println("p1.numberOfVisits = " + p1.numberOfVisits);*/
        System.out.println("values before setting arguments");
        System.out.println("p1.getName() = " + p1.getName());
        System.out.println("p1.getAge() = " + p1.getAge());
        System.out.println("p1.getNumberOfVisits() = " + p1.getNumberOfVisits());

        //in order to get the value
        //object (p1)+ dot operator (.)+get+variables = p1.getName()

        //in order to set the value
        //object+dot operator (.)+set+variable(arg) =p1.setName(arg)
        p1.setName("Akbar");
        p1.setAge(33);
        p1.setNumberOfVisits(5);

        System.out.println("values after we set the values");
        System.out.println("p1.getName() = " + p1.getName());
        System.out.println("p1.getAge() = " + p1.getAge());
        System.out.println("p1.getNumberOfVisits() = " + p1.getNumberOfVisits());

    }
}