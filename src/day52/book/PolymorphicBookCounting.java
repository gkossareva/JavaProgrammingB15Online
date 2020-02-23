package day52.book;

import java.util.Arrays;
import java.util.List;

public class PolymorphicBookCounting {
    public static void main(String[] args) {
        //we can refere the paper book object using
        //its own type: PaperBook
        //or its Super type: Book, Readable, Knowledgeble, Object
        Book b1 = new PaperBook("Java", "Akbar", 3);
   ;
        Book b2 = new PaperBook("Selenium", "Vasyl", 2);

        Book b3 = new AudibleBook("Agile", "Guljannat", 1.8);

        List<Book> bookList= Arrays.asList(b1,b2,b3);

        //counting how many book we have
        int pCount =0;
        for (Book each:
            bookList ) {
            each.displayBookInfo();
            String className=each.getClass().getSimpleName();
            System.out.println(className);
            if (className.equals("PaperBook")){
                ++pCount;
            }
        }
        System.out.println("Paper Book Count = "+pCount);
        //we want to get the class type name using the object
        //obj.getClass().getSimpleName
    }
}