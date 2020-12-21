package FinalProject;
import java.io.PrintStream;
import java.util.*;
import java.util.Scanner;

public class CovidTestObject {

    private String firstname;
    private String lastname;
    private String zipcode;
    private String number;
    private int age;

    public CovidTestObject(String firstname1, String lastname1, String zipcode1, String number1, int age1) {
            firstname = firstname1;
            lastname = lastname1;
            zipcode = zipcode1;
            number=number1;
            age = age1;

    }
    public String getfirstname(){
        return firstname;
    }
    public String getLastnamename(){
        return lastname;
    }
    public String getzipcode(){
        return zipcode;
    }
    public String getnumber(){
        return number;
    }
    public int getAge(){
        return age;
    }




    public String toString(){
        return firstname + " " + lastname + " " + zipcode + " "+ number + " " + age;
    }
    public CovidTestObject() {

    }

//    public static void Patient(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        Patient[] people = new Patient[];
//        PrintStream myWriter = new PrintStream(C:\Users\WaljiA24\IdeaProjects\JAVA2020_2021\src\FinalProject\healthyinfo.txt);
//        CovidTestObject.java);
//        while (input.hasNextLine()) {
//            String line = input.nextLine();
//            Scanner mini = new Scanner(line);
//            count++;
//            while (mini.hasNext()) {
//                String firstName = mini.next();
//                String lastName = mini.next();
//                String number = mini.next();
//                String age = mini.next();
//                String zipcode = mini.next();
//
//                people[count] = new Patient(name, lastname, number, age, zipcode);
//            }


//

////
////        Scanner scan = new Scanner(System.in);
////        PrintStream myWriter = new PrintStream();
////        while (input.hasNextLine()) {
////            String line = input.nextLine();
////            Scanner mini = new Scanner(line);
////            count++;
////            while (mini.hasNext()) {
////                String name = mini.next();
////                String lastname = mini.next();
////                String number = mini.next();
////                String age = mini.next();
////                String zipcode = mini.next();
////
////                people[count] = new Patient(name, lastname, number, age, zipcode);
////            }
//////
////        }
////        //ask if they are high risk
//        //non static method
        }
