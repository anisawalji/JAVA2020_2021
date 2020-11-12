/*
This is the Client class
You will create the object from here
this one will have the main method
 */
public class PointClient {
        public static void main(String[] args) {
            // create two Point objects
            point p1 = new point(7, 2);
            point p2 = new point(4, 3);
            // print each point and its distance from the origin
            System.out.println("p1 is " + p1);
            System.out.println("distance from origin = " +
                    p1.distanceFromOrigin());
            System.out.println("p2 is " + p2);
            System.out.println("distance from origin = " +
                    p2.distanceFromOrigin());
            // translate each point to a new location
            p1.translate(11, 6);
            p2.translate(1, 7);
            // print the points again
            System.out.println("p1 is " + p1);
            System.out.println("p2 is " + p2);
        }
    }
