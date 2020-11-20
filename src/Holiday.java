import java.util.*;
public class Holiday {
    private String Name;
    private int Day;
    private String Month;
    public Holiday(){
        Name = "New Year";
        Day = 1;
        Month = "January";
    }
    public Holiday(String NameIn, int DayIn, String MonthIn){
        Name = NameIn;
        Day = DayIn;
        Month = MonthIn;
    }
    //Name
    public Holiday Independence(Holiday Independence){
        Independence = new Holiday("Independence Day", 4, "July");
        return Independence;
    }
    public String GetName(){
        return Name;
    }
    public String ChangeName(String change){
        Name = change;
        return Name;
    }
    //Day of holiday
    public int GetDay(){
        return Day;
    }
    public int ChangeDay(int change){
        Day = change;
        return Day;
    }
    //Month of holiday
    public String GetMonth(){
        return Month;
    }
    public String ChangeMonth(String change){
        Month = change;
        return Month;
    }
    //to string
    public String toString(){
        String string = Name + " is on "+ Month + " " + Day;
        return string;
    }
    public boolean inSameMonth(Holiday second){
        return second.Month == Month;
    }
    public double AvgDate(){
        int [] list = new int[5];
        list[0] = 25;
        list[1] = 26;
        list[2] = 31;
        list[3] = 7;
        list[4] = 21;
        double count = 0;
        for (int i = 0; i <= list.length-1; i++){
            count += list[i];
        }
        count = count/list.length;
        return count;
    }
    public double AvgMonth(){
        int [] list = new int[5];
        list[0] = 1;
        list[1] = 12;
        list[2] = 11;
        list[3] = 10;
        double count = 0;
        for (int i = 0; i <= list.length-1; i++){
            count += list[i];
        }
        count = count/list.length;
        return count;
    }







//    private String name;
//    private int day;
//    private String month;
//
//    public Holiday(String n, int d, String m) {
//        name = n;
//        day = d;
//        month = m;
//    }
//    public boolean inSameMonth(Holiday Holiday2){
//                if (month=Holiday2.month){
//                    else(return false){
//                    }
//                }
//    }
//    //c
//    public static double avgDate(Holiday[] hol) {
//        int sum = 0;
//        for(int i = 0; i < hol.length; i++) {
//            sum = sum + hol[i].day;
//        }
//        return ((double) sum)/hol.length;
//    }
//
}
