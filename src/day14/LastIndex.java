package day14;

public class LastIndex {
    public static void main(String[] args) {
        String name ="Game of Java";//length is 12, last char index is 11

        //find out last location the letter a shows up
        System.out.println("find out last location the letter a shows up");
        System.out.println(name.lastIndexOf("a"));

        //find out last location the chararacter space shows up
        System.out.println("find out last location the chararacter space shows up");
        System.out.println(name.lastIndexOf(" "));

        //find out last location the letterGa shows up
        System.out.println("find out last location the letterGa shows up");
        System.out.println(name.lastIndexOf("Ga"));

        //  //find out last location the letter Kawa shows up
        System.out.println("find out last location the letter Kawa shows up");
         System.out.println(name.lastIndexOf("Kawa"));

         //if i dnt use contains method, what would be my condition to check
        //wethe we have kawa in this String, either using indexOf or LastIndex

        if (name.indexOf("Kawa")>=-1){
            System.out.println("Kawa found");
        }else {
            System.out.println("No kawa-no pumpkin");
        }

    }
}
