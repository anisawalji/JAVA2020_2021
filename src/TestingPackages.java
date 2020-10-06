import java.text.NumberFormat;//specific import
import java.util.*; //import all the classes of the package
public class TestingPackages {
    public static void main(String [] args){
        String s1 = new String("Hello ");
        String s2 = "there"; //String does not require "new" to create
        String s3 = s1 + s2; // "+" means concatenation
        System.out.println(s3);
        s3 +="!";
        System.out.println(s3);
        int len = s3.length();
        System.out.println("the len = "+ len);
       int indexNum = s3.indexOf(' ');
        System.out.println(indexNum);
        String lastWord = s3.substring(indexNum+1);
        System.out.println(lastWord); //from the number to the end
        lastWord =s3. substring(indexNum+1, len-1); //beginning is included, the end is excluded
        System.out.println(lastWord);

    }
}
