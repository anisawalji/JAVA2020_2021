package FinalProject;
//This file is for a user who is the patient. They can see if they think they have COVID, and find more info about COVID and find test centers near them. THey can also fine out if they are high risk
import FinalProject.CovidTestObjectObject;

import java.io.*;
import java.util.*;
public class CovidTestClientClient {
    public static Scanner input = new Scanner(System.in);
    public CovidTestObjectObject patient = new CovidTestObjectObject();
    public static CovidTestObjectObject [] Patient = new CovidTestObjectObject[20];
    public static int count;

    public static void main(String[] args) {

        menu();
    }

    public static void menu() { //prints the menu for Patient so they can decide what they want ti do
        Scanner scan = new Scanner(System.in);
        int answer;
        do {
            System.out.println();
            System.out.println("******************************************");
            System.out.println("*              Menu                      *");
            System.out.println("*                                        *");
            System.out.println("* 1. Answer questions and complete quiz  *");
            System.out.println("* 2. Find tests center near you          *");
            System.out.println("* 3. Find out if you are high risk       *");
            System.out.println("* 4. COVID information                   *");
            System.out.println("* 5. Goodbye                             *");
            System.out.println("******************************************");
            answer = scan.nextInt();
            switch (answer) {
                case 1:
                    try {
                        askinfo();
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                    questions();
                    age();
                    location();
                    break;
                case 2:
                    location();
                    break;
                case 3:
                    age();
                    break;
                case 4:
                    stayhealthy();
                    break;
                case 5:
                    goodbye();
                    System.out.println ("Exiting the program... thank you");
                    try {
                        writeOnFile();
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                    System.exit(0);	// Exits the program

                    break;
                default:
                    System.out.print("This is not a valid Menu Option! Please Select Another.");
            }
        }while(answer < 7);
    }

    private static void Patient() {
    }

    public static void askinfo () throws FileNotFoundException { //enter all info, all the info that will go to file
//        System.out.println("here");
//        File file = new File("C:\\Users\\WaljiA24\\IdeaProjects\\JAVA2020_2021\\src\\FinalProject\\infoData.txt");
//        Scanner scan = new Scanner(file);
//        Patient(scan);


//        System.out.println("this is in the askInfo "+ count);
        System.out.print("Please enter your first name: ");
        String firstname = input.nextLine();
        System.out.print("Please enter your last name: ");
        String lastname = input.nextLine();
        System.out.print("What is your phone number: ");
        String phone = input.nextLine();
        System.out.print("What is your zipcode?:");
        String zipcode = input.nextLine();
        System.out.print("How old are you?:");
        int age = input.nextInt();
        System.out.print("Welcome, " + firstname + "! Do you think you may have COVID 19? ");
        String think = input.next();
        Patient[count+1]=new CovidTestObjectObject(firstname, lastname, phone, zipcode, age);
        System.out.println(Patient[count+1].toString());

    }

    public static void questions () { // symptom quiz
        System.out.print("Please answer the following questions. All questions should be answered with 'Yes' or 'No'");
        String a = input.next();

        if (a.equalsIgnoreCase("yes")) {
            System.out.println("continue");
        } else if (a.equalsIgnoreCase("no")) {
            System.out.println("continue");
        } else {
            System.out.println("wrong, You typed " + a + " this is incorrect, please type 'Yes' or 'No'");
        }

        Scanner scan = new Scanner(System.in);
        System.out.print("Do you have a cough?:");
        String input = scan.nextLine();
        System.out.print("Do you have a Fever or chills?:");
        String fever = scan.nextLine();
        System.out.print("Do you have shortness of breath or difficulty breathing?: ");
        String breath = scan.nextLine();
        System.out.print("Are you experiencing  fatigue?:");
        String fatigue = scan.nextLine();
        System.out.print("Do you have a headache?:");
        String headache = scan.nextLine();
        System.out.print("Do you have any muscle or body aches?:");
        String aches = scan.nextLine();
        System.out.print("have you lost your taste or smell?:");
        String taste = scan.nextLine();
        System.out.print("Do you have a sore throat?:");
        String throat = scan.nextLine();
        System.out.print("Do you have a runny nose?:");
        String nose = scan.nextLine();
        System.out.print("are you experiencing nausea or vomiting?:");
        String nausea = scan.nextLine();
        System.out.print("Have you had any diarrhea?:");
        String poop = scan.nextLine();
    }
    public static void age () { //find out if you are high risk based on age, not health issues
        int age= Patient[count+1].getAge();

        if (age <= 45) {
            System.out.println("If you do not have any health issues, you are not high risk");
        } else if (age < 58 && age > 45) {
            System.out.println("If you do not have any health issues, you are not high risk, but please be safe and careful!");
        } else if (age >= 59) ;
        System.out.println("You are high risk, especially if you have any health issues, please be safe and careful");
    }

    public static void location () { //location to find test centers near you
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to get tested for Covid?");
        String input = scan.nextLine();
        if (input.equalsIgnoreCase("yes")) {
            System.out.println("What is your zipcode?");
            String zipcode = scan.nextLine();
            System.out.print("Here is a link to find testing centers near you: http://google.com/maps/search/test+center+near+" + zipcode + " ");
        }
    }

    public static void stayhealthy(){
        System.out.print("https://health.mil/News/Articles/2020/05/22/COVID-19-lifestyle-tips-to-stay-healthy-during-the-pandemic");
    }

    public static void Patient(Scanner scan) throws FileNotFoundException { //reads the file
        count = 0;
        while (scan.hasNextLine()) {

            String line = scan.nextLine();

            Scanner mini = new Scanner(line);
            while (mini.hasNext()) {
                String firstname = mini.next();
                String lastname = mini.next();
                String number = mini.next();
                int age = mini.nextInt();
                String zipcode = mini.next();
                System.out.println(count);
                Patient[count] = new CovidTestObjectObject(firstname, lastname,zipcode , number,age);
            }
            count++;
            System.out.println("This is in Patient method "+count);
            System.out.println(Patient[count-1].toString());
            writeOnFile();
        }
    }
    public static void writeOnFile()throws FileNotFoundException{ //inputs info into the file
        PrintStream fileOut = new PrintStream(new File("CC:\\Users\\WaljiA24\\IdeaProjects\\JAVA2020_2021\\src\\FinalProject\\infoData.txt"));
        for(int count=0; count<20; count++){
            String line = Patient[count].toString();
            System.out.println(line);
            fileOut.append(line);
        }
    }


    //here add something to add all info to the file
    public static void goodbye () { //goodbye methods. I have the exit part in the menu
        Scanner scan = new Scanner(System.in);
        System.out.println("Thank you for taking the quiz. Remember to stay social distanced, wear your mask, and wash your hands! Have an amazing day! Goodbye!");
    }
}