import java.util.*;


public class DistanceCalculatorTrial {
    public static final double Radius = 6372.795;

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.print("What is the name of the city? ");
        String city1 = scan.next();
        System.out.print("What is the longitude of the city? ");
        double long1 = scan.nextDouble();
        System.out.print("What is the latitude of the city?");
        double lat1 = scan.nextDouble();
        System.out.print("What is the name of the city? ");
        String city2 = scan.next();
        System.out.print("What is the longitude of the city? ");
        double long2 = scan.nextDouble();
        System.out.print("What is the latitude of the city?");
        double lat2 = scan.nextDouble();

        double rad = 3.14159;
        double deg = rad*180/Math.PI;


        double testt = Math.acos(Math.sin((lat1) * Math.sin(lat2))+ Math.cos( lat1)*Math.cos(lat2)*Math.cos(long2 - long1));
        System.out.println(testt);
        double earthradius = (Radius * testt);

        System.out.println("The distance between" + " " + city1 + " "+ "and"+ " " + city2 +"is"+ " " + earthradius);
        }




//        public static double distFrom(double lat1, double lng1, double lat2, double lng2);
    }

















