import java.io.*;
import java.util.*;

public class LineCount {
    public static void main(String [] args) throws FileNotFoundException{
        Scanner input = new Scanner(new File("C:\\Users\\WaljiA24\\IdeaProjects\\JAVA2020_2021\\src\\readme.txt"));
        int count = 0;
        while (input.hasNextLine()) { //only checks if we have next line
            //Create a String object to get the line
            String line = input.nextLine();
            Scanner mini = new Scanner(line);
            count++;
            int wordCount = 0;
            while(mini.hasNext()){ //check if we have a word
                wordCount++;
                mini.next();
            }
            System.out.println("input: " + line + "\n it has " +wordCount+ " words"); //if it has a next line, that consumes the line
         }
        System.out.println(count + " total");
    }
}
