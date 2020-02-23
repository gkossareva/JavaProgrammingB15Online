package day51;
//PERSON IS A comparable
//yes because it implemens Comparable interface
//it is an inheentance |IS-A|Super-Sub relationship
public class Person implements Comparable<Person> {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //now it becomes a natural order for comparing Person Object
    @Override
public int compareTo(Person otherPerson){
//        if (this.age>otherPerson.age){
//            return 1;
//        }else if (this.age<otherPerson.age){
//            return -1;
//        }else {
//            return 0;
//        }

        if (this.name.charAt(name.length())>otherPerson.name.charAt(name.length())){
            return 1;
        }else if (this.name.charAt(name.length())<otherPerson.name.charAt(name.length())){
            return -1;
        }else {
            return 0;
        }

}


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}