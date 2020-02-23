package day52.book;

public interface KnowledgeBank {
    public abstract void takeNotes();

    public default void showTableOfContent(){
        System.out.println("Chapter1 till Chapter 10:");
    }
}
