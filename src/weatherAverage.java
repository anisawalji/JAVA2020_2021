import java.util.*;
public class weatherAverage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("how many days ");
        int days = scan.nextInt();

        int[] temp = new int[days]; //array to keep the days temp
        int sum = 0;

        int[] newTemp = new int[days + 1];


        for (int i = 0; i < days; i++) { //read each days temp
            int x = i + 1;
            System.out.println("What is the temp on day " + x);
            temp[i] = scan.nextInt();
            sum += temp[i];
        }


        double average = (double) sum / temp.length; //see how many days are above average
        System.out.println(temp[temp.length - 1]);
        System.out.print(temp);
        int count = 0;
        for (int i = 0; i < days; i++) {
            if (temp[i] > average) {
                count++;
            }
        }
//        for(int i=0; i < days; i++){
//            int x=i+1;
//            temp [i] = temp[i + 1];
//
//            if (i == days-2){
//                System.out.println("What is the temp on day" + x+1);
//                temp [i]= scan.nextInt();
//            }5
//        }
        for (int i = 0; i < days - 1; i++) {
            newTemp[i] = temp[i + 1];

            if (i == days - 2) {
                System.out.println("What is the temp on day ");
                temp[i + 1] = scan.nextInt();
            }
        }
//say the results
        System.out.print(count);
        System.out.printf("Average temp %.1f\n", average);
        System.out.println(count + "days above average");

    }
}
