import java.util.*;

public class Calender {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("how many days are in the month? ");
        int days = scan.nextInt();
        System.out.println("date of first Sunday (1-7) ");
        int Sun = scan.nextInt();
        dayName();
        top();
        System.out.println();
        date(days, Sun);
        top();
    }
//       System.out.println();
//        for(int i=1; i <35; i++);
//        if(<Sun){
//            Sun-=1
//    }


    public static void dayName(){
        System.out.print(" Sun      Mon     Tue     Wed     Thu     Fri     Sat ");
        System.out.println();
    }
    public static void top(){
        for(int x = 1; x<=7; x++){
            System.out.print("+------");
        }
        System.out.print("+");
    }

    public static void date(int days, int Sun){
            for(int x = 1; x <=5; x++){
                for(int y= 1; y<= 7; y++){
                        System.out.print("|");
                        int num = y+(7*(x-1));
                        if (num <= days)
                            System.out.print(padded(num, 4));
                        System.out.print("  ");
                            if (num >= days+1)
                                System.out.print("    ");
                            if(num == days + 1)
                                num = 0;
                                System.out.print("");
                    }
                System.out.print("|");
                System.out.println();
                }
            }
        public static String padded(int n, int width){
            String s = " " + n;
            for (int i = s.length(); i < width; i++){
                s=" " + s;
            }
            return s;
        }




}

