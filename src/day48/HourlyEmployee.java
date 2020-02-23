package day48;

public class HourlyEmployee extends Employee{

        double hourlyWage;
        int numsOfHours;
        //String name;
        //double id;
        public HourlyEmployee(double hourlyWage, int numsOfHours, String name, int id) {
            super(name,id);
            this.hourlyWage = hourlyWage;
            this.numsOfHours = numsOfHours;

        }
        public void calculateAnualSalary() {
            System.out.println("Hourly Emplyee yearly: "+(hourlyWage*numsOfHours));
        }
        @Override
        public String toString() {
            return "HourlyEmployee{" +
                    "hourlyWage=" + hourlyWage +
                    ", numsOfHours=" + numsOfHours +
                    ", name='" + name + '\'' +
                    ", id=" + id +", yealarly salary = "+(hourlyWage*numsOfHours)+
                    '}';
        }
    }