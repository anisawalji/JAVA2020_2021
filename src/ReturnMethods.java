import java.util.*;
/*
we are going to learn about return methods
ask user for two points
calculate the distance d= sqrt((x2-x1)^2 + (y2-y1)^2) in method
distance is back print it
 */
public class ReturnMethods {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Give me your first point x, and y");
        int x1= scan.nextInt();
        int y1= scan.nextInt();
        System.out.print("Give me your second point x, and y");
        int x2= scan.nextInt();
        int y2= scan.nextInt();
        double dist= distanceMethod(x1,x2,y1,y2);//my method has to be of type double
        System.out.printf("The double distance is %.2f \n", dist);
    }
    //this is a retun method
    public static double distanceMethod(int X1, int X2, int Y1, int Y2){
        double distance=Math.sqrt((X2-X1)*(X2-X1)+Math.pow((Y2-Y1)*(Y2-Y1),2));
        return distance; //to return value to main. You can only return one value
    }
}
