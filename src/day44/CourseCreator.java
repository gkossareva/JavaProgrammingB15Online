package day44;

public class CourseCreator {
    public static void main(String[] args) {

        System.out.println(" Course.counter "+ Course.counter);
        Course c1=new Course("Java","foundation");
        System.out.println(" c1.counter "+ c1.counter);

        Course c2=new Course("Selenium","Automation");
        Course c3=new Course("SQL","Database");
        Course c4=new Course("API","wEBSERVICES");
        Course c5=new Course("Agile","Softskills");

        System.out.println(" Course.counter "+ Course.counter);
        System.out.println(" c5.counter "+ c5.counter);
    }
}
