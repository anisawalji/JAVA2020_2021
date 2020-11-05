import java.util.*;
public class WeatherAverage30Days {
    /*create a menu
   *************************************
   *   Temp Average Menu
   *
   *   1. input 30 days temps
   *   2. calculate average
   *   3. how many days above average
   *   4. how many days below average
   *   5. input a new date
   *   6. exit
   * ***********************************
method for the menu
method to input temps
method to calculate average
method to find above average
method to find below average
method to input new temp
 */

    public static int days = 5;
    public static int temp[] = new int[days];
    public static double average = 0;

    public static void main(String[] args) {
        //create scanner and array
        menu();
    }

    public static void menu() {
        System.out.println("****************************************"); //print it out, scan is what they put
        System.out.println("*           Temp Average Menu          *");
        System.out.println("*    1. input 30 days of temps         *");
        System.out.println("*    2. calculate average              *");
        System.out.println("*    3. amount of days above average   *");
        System.out.println("*    4. amount of days below average   *");
        System.out.println("*    5. input a new day                *");
        System.out.println("*    6. exit                           *");
        System.out.println("****************************************");
        Scanner input = new Scanner(System.in);
        int days = 30;
        int temp[] = new int[days];

        //getting inputs of temps and adding them in var sum
        int answer = input.nextInt();
        switch (answer) {
            case 1:
                inputTemps(input);
                break;
            case 2:
                calculateAverage();
                break;
            case 3:
                aboveAverage();
                break;
                case 4:
                    belowAverage();
                    break;
                case 5:
                    newInput(input);
                    break;
                case 6:
                    thanks();
        }
//
    }

    public static void inputTemps(Scanner input) { //for loop
        int sum = 0;
        for (int i = 0; i < temp.length; i++) {
            System.out.print("Day " + (i + 1) + "'s high temp: ");
            temp[i] = input.nextInt();
            sum += temp[i];
        }
        System.out.println();

        //calculating average
        double average = (double) sum / temp.length;
        menu();
    }

    public static void calculateAverage() { // i is number of numbers
        int sum = 0;
        for (int i = 0; i < temp.length; i++) {
            sum += temp[i];
        }
        double average = (double) sum / days;
        System.out.print("The average temp is ");
        System.out.printf("%.2f", average);

        //how many days below the average
        System.out.println();
        menu();
    }

    public static void aboveAverage() {
        int sum = 0;
        for (int i = 0; i < temp.length; i++) {
            sum += temp[i];
        }
        double average = (double) sum / days;
        int count = 0;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] < average) {
                if (temp[i] > average) {
                    count++;
                }
            }
            System.out.println();
            System.out.println(count + " days were below average");

            //ask user if they want to add new temp
                System.out.println();
                System.out.print("Would you like to add a new temp? ");
                String repeat = input.next();
                repeat = repeat.toLowerCase();
                if(repeat.contains("y")){
                    //transfer values into smaller array without first element
                    int size = temp.length-1;
                    int smallerTemp[] = new int[size];
                    System.arraycopy(temp,1,smallerTemp,0,size);

                    //new array to add new temp
                    int newTemp[] = new int[days];
                    for(int i = 0; i < days-1; i++){
                        newTemp[i] = smallerTemp[i];
                    }
                    System.out.print("Day "+(days)+"'s high temp: ");
                    newTemp[days-1] = input.nextInt();

                    newCalculations(temp,newTemp,days,sum,input);
                }
                System.out.println(count+" days were above average");
                menu();
            }
            public static void newCalculations(int temp[],int newTemp[],int days,int sum,Scanner input){
                //adding new temp onto sum
                sum -= temp[0];
                sum += newTemp[days - 1];

                //calculating average
                double average = (double) sum / newTemp.length;
                System.out.print("new average temp ");
                System.out.printf("%.2f", average);

                //how many days below the average
                public static void belowAverage(); {
                    int sum = 0;
                    for (int i = 0; i < temp.length; i++) {
                        sum += temp[i];
                    }
                    double average = (double) sum / days;
                    int count = 0;
                    for (int i = 0; i < newTemp.length; i++) {
                        if (newTemp[i] < average) {
                            for (int i = 0; i < temp.length; i++) {
                                if (temp[i] < average) {
                                    count++;
                                }
                            }
                            System.out.println();
                            System.out.println(count + " days below average");
                            menu();
                        }
                        public static void newInput (Scanner input){
                            for (int i = 0; i < temp.length - 1; i++) {
                                temp[i] = temp[i + 1];
                            }
                            System.out.print("Day " + (days) + "'s high temp: ");
                            temp[temp.length - 1] = input.nextInt();
                            menu();
                        }
                        public static void thanks(){
                            System.out.println("Thank you for participating!");
                        }
                    }
                }
        }
    }
}



//
