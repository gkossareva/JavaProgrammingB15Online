package day43;

import day42.Movie;

public class MovieActions {
    public static void main(String[] args) {
        Movie m1=new Movie("Joker", 2.5, "Drama");
        printMovieInformation (m1);

        Movie m2=new Movie("Cinderella", 1.5, "Family");
        printMovieInformation (m2);
        printShorterDurationMovieName(m1,m2);

       // Integer i1= Integer.valueOf(12);

        Movie result=getJokerMovieObj();
        System.out.println("name is "+result.getName());
    }

    public static Movie getJokerMovieObj(){
        Movie j= new Movie("Joker",2.5,"Drama");
        return j;
    }

    public static void printMovieInformation (Movie movieObj){
        System.out.println("This movie name "+movieObj.getName());
        System.out.println("is "+movieObj.getLength()+ " hour long ");
        System.out.println("and its gener "+ movieObj.getType());
    }
    public static void printShorterDurationMovieName(Movie movieObj1, Movie movieObj2){
        if (movieObj1.getLength()<movieObj2.getLength()){
            System.out.println(movieObj1.getName());
        }else{
            System.out.println(movieObj2.getName());
        }
    }
}
