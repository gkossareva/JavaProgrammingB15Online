package SelfPractice;

public class StringTask5 {
    public static void main(String[] args) {
        //Task 5:
        //given a name with prefix, stored in a String variable called name
        //for example
        //    Dr. Dru , Mr. Robot , Ms. Lois , Mrs. Brown
        //-- in case insensitive condition ----
        //print as below
        //if the name Started with (Dr )-->> Doctor
        //if the name Started with (Mr )-->> Male
        //if the name Started with (Miss )-->> Single female
        //if the name Started with (Mrs )-->> Married female

        String name = "DR";//??If Iput name after the code is not working

    if (name.equalsIgnoreCase("Dr")){
            System.out.println("Doctor");
        }else if (name.equalsIgnoreCase("Mr")){
            System.out.println("Male");
        }else if(name.equalsIgnoreCase("Miss")){
            System.out.println("Single female");
        }else if (name.equalsIgnoreCase("Mrs")){
            System.out.println("Married female");
        }

    }
}