package day52.book;

public class PaperBook extends Book implements Readable {
    int weight;
    public PaperBook(String name, String author, int weight) {
        super(name, author);
        this.weight=weight;
    }

    @Override
    public void displayBookInfo() {
        System.out.println("Paper's book's name is "+name+ " the author is: "+author+"and it weighs "+weight +" pound");
    }

    @Override
    public void takeNotes() {
        System.out.println("Bookmark and Taking notes from "+name);
    }

    @Override
    public void read() {
        System.out.println("Reading "+name);
    }

    @Override
    public String toString() {
        return "PaperBook{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
