package FinalProject;
import java.io.PrintStream;
import java.util.*;
import java.util.Scanner;
public class CovidTestObjectObject {

    private String firstname;
    private String lastname;
    private String zipcode;
    private String number;
    private int age;

    public CovidTestObjectObject(String firstname1, String lastname1, String zipcode1, String number1, int age1) {
        firstname = firstname1;
        lastname = lastname1;
        zipcode = zipcode1;
        number = number1;
        age = age1;

    }

    public String getfirstname() {
        return firstname;
    }

    public String getLastnamename() {
        return lastname;
    }

    public String getzipcode() {
        return zipcode;
    }

    public String getnumber() {
        return number;
    }

    public int getAge() {
        return age;
    }


    public String toString() {
        return firstname + " " + lastname + " " + zipcode + " " + number + " " + age;
    }

    public CovidTestObjectObject() {

    }
}
