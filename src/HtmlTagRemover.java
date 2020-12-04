import java.io.*;
import java.util.*;
public class HtmlTagRemover {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("C:\\Users\\WaljiA24\\IdeaProjects\\JAVA2020_2021\\src\\MyWebsite.html"));
        while (in.hasNextLine()) {
            Scanner line = new Scanner(in.nextLine());
            while (line.hasNext()) {
                String html = line.next();
                Scanner mini = new Scanner(html);
                if (html.contains("<")) {
                }
            }
        }
    }

    public static void stripHtmlTags(Scanner input) {
        while (input.hasNextLine()) {
            String line = input.nextLine();

            while (line.contains("<") || line.contains(">")) {
                int index1 = line.indexOf("<");
                int index2 = line.indexOf(">");
                if (index1 == 0) {
                    line = line.substring(index2 + 1);
                } else {
                    line = line.substring(0, index1) + line.substring(index2 + 1);
                }
            }
        }
    }
}
