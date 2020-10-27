import java.util.*;
public class weatherAverage {
    public static void main(String [] args){
        Scanner scan= new Scanner (System.in);
        System.out.println("how many days ");
        int days = scan.nextInt();

        int [] temp = new int[days];
        int sum =0;

        for(int i=0; i < days; i++){
            int x=i+1;
            System.out.println("What is the temp on day " + x);
            temp [i]= scan.nextInt();
            sum += temp[i];
        }
        double average = (double) sum/temp.length;
        System.out.println(temp[temp.length-1]);
        System.out.println(temp);
        int count = 0;
        for (int i = 0; i < days; i++) {
            if (temp [i]> average) {
                count++;
            }
        }
       System.out.print(count);
        System.out.printf("Average temp %.1f\n", average );
        System.out.println(count + "days above average");
    }
}
