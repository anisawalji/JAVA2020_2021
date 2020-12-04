//import java.util.*;
//public class Movie {
//    private String title;
//    private String studio;
//    private String rating;
//
//    public Movie(String t, String s, String r) {
//        title = t;
//        studio = s;
//        rating = r;
//    }
//
//    public Movie(String titleIn, String studioIn, String ratingIn, int lengthIn) {
//        title = titleIn;
//        studio = studioIn;
//        rating = ratingIn;
//    }
//    public static Movie[] getPG(Movie[] mov) {
//        Movie[] pgMov = new Movie[mov.length];
//    }
//
//    public Movie(String titleIn, String studioIn){
//        title = titleIn;
//        studio = studioIn;
//        rating = "PG";
//    }
//    //title
//    public String GetTitle (){
//        return title;
//    }
//    public String ChangeTitle (String in){
//        title = in;
//        return title;
//    }
//    //studio
//    public String GetStudio (){
//        return studio;
//    }
//    public String ChangeStudio (String in){
//        studio = in;
//        return studio;
//    }
//    //rating
//    public String GetRating (){
//        return rating;
//    }
//    public String ChangeRating (String in){
//        rating = in;
//        return rating;
//    }
//    //to string
//    public String toString(){
//        String string = "the title is: " + title + ":" + "the studio is:" + studio + "\nit was rated: " + rating;
//        return string;
//    }
//    public Movie(Movie Casino){
//        title = "Casino Royale";
//        studio = "Eon Productions";
//        rating = "PG-13";
//        Casino = new Movie(title,studio,rating);
//    }
//}
//
