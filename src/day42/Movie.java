package day42;

public class Movie {
    String name;
    double length;
    String type;

    public Movie() {
        System.out.println("EMPTY MOVIE");
    }

    // default constructor :
    // a constructor that give by compiler
    // only if you don't have any constructor in your class
    // it's invisible
    // and it has no parameter
    // it has no code inside

    // write a constructor to set all the fields value
    public Movie(String name, double length, String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public double getLength() {
        return length;
    }

    public String getType() {
        return type;
    }

    // toString method so we can directly print out
    }