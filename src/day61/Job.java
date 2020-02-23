package day61;
//pojo =plain old java object usually used to represent data
//comparable is coming from JDK java.lang package
//in order to sort the type it must be comparable<Type>
public class Job implements Comparable<Job>{

    private String location;
    private int salary;
    private String companyName;

    public Job(String nh, int i, String carGurus) {
    }

//    public Job(String location, int salary, String companyName) {
//        this.location = location;
//        this.salary = salary;
//        this.companyName = companyName;
//    }
//    public String getLocation() {
//        return location;
//    }
//
//    public int getSalary() {
//        return salary;
//    }
//
//    public String getCompanyName() {
//        return companyName;
//    }
//
//    public void setLocation(String location) {
//        this.location = location;
//    }
//
//    public void setSalary(int salary) {
//        this.salary = salary;
//    }
//
//    public void setCompanyName(String companyName) {
//        this.companyName = companyName;
//    }
//


    @Override
    public String toString() {
        return "Job{" +
                "location='" + location + '\'' +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Job other) {
        if (this.salary>other.salary){
            return 1;
        }else if (this.salary<other.salary){
            return -1;
        }else{
            return 0;
        }

    }

}
