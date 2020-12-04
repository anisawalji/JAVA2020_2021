import java.io.*;
import java.util.*;
public class ChapterSixExercise {
    //11
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("C:\\Users\\WaljiA24\\IdeaProjects\\JAVA2020_2021\\src\\ChapterSixExercise.java"));
        while (input.hasNextLine());
            System.out.println(input.hasNextLine());
    }

    //12
    public static void printEntireFile() throws FileNotFoundException {
        Scanner console = new Scanner(System.in);
        System.out.print("Type a file name: ");
        String filename = console.nextLine();
        Scanner input = new Scanner(new File(filename));
        while (input.hasNextLine()) {
            System.out.println(input.nextLine());
        }
    }
}
