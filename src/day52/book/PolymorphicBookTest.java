package day52.book;

public class PolymorphicBookTest {
    public static void main(String[] args) {
        //we can refere the paper book object using
        //its own type: PaperBook
        //or its Super type: Book, Readable, Knowledgeble, Object
        Book b1 = new PaperBook("Java", "Akbar", 3);
        b1.displayBookInfo();
        KnowledgeBank kb=b1;
        kb.takeNotes();
        kb.showTableOfContent();
        Book b2 = new PaperBook("Selenium", "Vasyl", 2);

        System.out.println(" ======================== " );
        Book b3 = new AudibleBook("Agile", "Guljannat", 1.8);
        b3.showTableOfContent();
        b3.displayBookInfo();
        System.out.println("b3 = " + b3);

    }
}