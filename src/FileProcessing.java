import java.io.*;
import java.util.*;
public class FileProcessing {
    public static void main (String [] args) throws FileNotFoundException
    {
        File filename= new File("src/FinalProject/test2.txt");
        Scanner input = new Scanner(filename);

        while(input.hasNextLine()){
            Scanner line = new Scanner (input.nextLine());
            while (line.hasNext()){
                if (line.hasNextDouble()){
                    System.out.println(line.nextDouble());
                }
                else{
                    line.next();
                }
            }
            System.out.println(input.nextLine());
        }
    }
}
