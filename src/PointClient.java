/*
This is the Client class
You will create the object from here
this one will have the main method
 */
public class PointClient {
    public static void main(String[] ags) {
        Point p1 = new Point(); //new key word to create object
        Point p2 = new Point(3, 2);
        p2.SetY(5);
        System.out.println("The point is p1: (" +p1.GetX()+","+p1.GetY()+")" );
        System.out.println("The point is p1: (" +p2.GetX()+","+p2.GetY()+")" );
        p1.setLocation(-5, 6);
        System.out.println("The point is p1: (" +p1.GetX()+","+p1.GetY()+")" );
        System.out.println(p1);

    }
}