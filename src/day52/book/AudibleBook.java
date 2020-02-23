package day52.book;

public class AudibleBook extends Book {
    public AudibleBook(String name, String author, double duration) {
        super(name, author);

    }
    public void listen(){
        System.out.println("listening "+name+" by "+author);
    }

    @Override
    public String toString() {
        return "AudibleBook{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    //implementation from Book class
    @Override
    public void displayBookInfo() {

    }
//implementation fron KnowledgeBank interface
    @Override
    public void takeNotes() {
        System.out.println("Taking notes from the difgital book "+name+" writing the provided digital table");
    }
    //implementation fron KnowledgeBank interface
    @Override
    public void showTableOfContent() {
        System.out.println(" If you want to see the table of content the press here");
    }
}
