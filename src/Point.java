//An object class
//It has no main method
//it is used only to identify the object or create the object and its beha
//public class point {
//  //arrays w objects
//  Point[] puntos;
//  puntos=new Point[3];
//  puntos[0]=new Point();
//  puntos[1]=new Point(2,5);
//  puntos[2]=new Point(5,3);
//
//  double avergae=Point.xAvg(puntos);
//
//  //this would be in client
//    public static void xAvg(Point[] other){
//        double avg=0;
//        for (int i =0; i< other.length; i++){
//            avg +=other[i].GetX();
//        }
//        avg=avg/other.lenth;
//
//    }
//  System.out.printf("The avergae is %.2f", average);
//
//
//
//
//
//
//
//
//    public int x;
//    public int y;
//    // constructs a new point at the origin, (0, 0)
//    private String name;
//    public point() {
//        x=0;
//        y=0;
//        name = "this is the x" + x + "this is the y" + y;
//    }
//    public point(int x1, int y1) {
//        if (x1 < 0 || y1 < 0){
//            throw new IllegalArgumentException("can be less that zero");
//        }
//        else{
//            x=x1;
//            y=y1;
//            name = "this is the x" + x + "this is the y" + y;
//        }
//        setLocation(x1, y1);
//    }
//    public double distanceFromOrigin() {
//        return Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
//    }
//    public int getX() {
//        return x;
//    }
//    public int getY() {
//        return y;
//    }
//    public void setLocation(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
//    public String toString() {
//        return "(" + x + ", " + y + ")";
//    }
//    public void translate(int x2, int y2) {
//        setLocation(x + x2, y + y2);
//    }
//    //hw
//    public int manhattanDistance(point other){
//        int xDis = Math.abs(other.x-x);
//        int yDis = Math.abs(other.y-y);
//        return xDis+yDis;
//    }
//    public boolean isVertical(point other){
//        return other.x == x;
//    }
//    public double slope(point other){
//        if (other.x == x) {
//            int agrs = 0;
//            throw new IllegalArgumentException("the second x var cannot be the same as the first x var");
//        }
//        double slope = (other.y - y) / (other.x / x);
//        return slope;
//    }
//    public boolean isCollinear(point other){
//        float slope1 = (other.y-y)/(other.x/x);
//        float slope2 = (y-other.y)/(y-other.x);
//        return slope1 == slope2;
//    }
//
//    //rectangle
//
//    public int getheight() {
//        return getheight();
//    }
//    public int getwidth() {
//        return getwidth();
//    }
//}
//    public point() {
//        this(0, 0); // calls Point(int, int) constructor
//        x = 0;
//        y = 0;
//        name = "this is the x" + x + "this is the y" + y;
//    }
//
//    // constructs a new point with the given (x, y) location
//    public point(int x, int y) {
//        setLocation(x, y);
//    public point( int x1, int y1){
//            if (x1 < 0 || y1 < 0) {
//                throw new IllegalArgumentException("can be less that zero");
//            } else {
//                x = x1;
//                y = y1;
//                name = "this is the x" + x + "this is the y" + y;
//            }
//            setLocation(x1, y1);
//        }
//// returns the distance between this Point and (0, 0)
//        public double distanceFromOrigin () {
//            return Math.sqrt(x * x + y * y);
//            return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
//        }
//        // returns the x-coordinate of this point
//        public int getX () {
//            return x;
//        }
//        // returns the y-coordinate of this point
//        public int getY () {
//            return y;
//        }
//        // sets this point's (x, y) location to the given values
//        public void setLocation ( int x, int y){
//            this.x = x;
//            this.y = y;
//        }
//        // returns a String representation of this point
//        public String toString () {
//            return "(" + x + ", " + y + ")";
//        }
//        // shifts this point's location by the given amount
//        public void translate ( int dx, int dy){
//            setLocation(x + dx, y + dy);
//            public void translate ( int x2, int y2){
//                setLocation(x + x2, y + y2);
//            }
//public class Point {
//    //fields
//    private int x;
//    private int y;
//    private String name; //we dont define value, by default it is null
////
////    public Point() {
////
////    }
//
//    //4
//    public boolean isCollinear(Point p1, Point p2) {
//        if ((this.x == p1.x && this.x == p2.x) || (this.y == p1.y && this.y == p2.y)) {
//            return true;
//        } else {
//            double slope1 = (double) (this.y - p1.y) / (double) (this.x - p1.x);
//            double slope2 = (double) (this.y - p2.y) / (double) (this.x - p2.x);
//            return slope1 == slope2;
//        }
//    }
//
//    //Create constructors
//    public Point() {
//        x = 0;
//        y = 0;
//        name = "This is the x " + x + " this is the y " + y;
//    }
//
//    public Point(int x1, int y1) {
//        if (x1 < 0 || y1 < 0) {
//            throw new IllegalArgumentException();
//        } else {
//            x = x1;
//            y = y1;
//            name = "this is point" + x + " +" + y;
//        }
//
//        //non static methods changing the field values Mutator methods
//    public void SetX(int x1) {
//        x = x1;
//    }
//
//    public void SetY(int y1) {
//        y = y1;
//    }
//
//    //non static method object reference, return values Assesor Methods
//    public int GetX() {
//        return x;
//    }
//
//    public int GetY() {
//        return y;
//    }
////
//    public void setLocation(int x1, int y1) {
//        x = x1;
//        y = y1;
//        name = "this is point" + x + " +" + y;
//    }
//
//    public void translate(int dx, int dy) {
//        x += dx;
//        y += dy;
//        name = "this is point" + x + " +" + y;
//    }
//
//    public String toString() {
//        return name;
//    }
////1
//    public int manhattanDistance(Point other) {
//        int xDistance = Math.abs(other.x-x);
//        int YDistance = Math.abs(other.y-y);
//
//        return xDistance + YDistance;
//    }
//    //2
//    public boolean isVertical(Point other) {
//        return this.x == other.x;
//    }
//    //3
//    public double slope(Point other) {
//        if(this.x == other.x)
//            throw new IllegalArgumentException();
//
//        return ((double) (this.y - other.y)) / (this.x - other.x);
//    }
//    //5
//    public void add(TimeSpan span) {
////        add(span.hours, span.minutes);
//    }
//    //6
////    public class TimeSpan {
////        private int hours;
////        private int minutes;
////
////        public void add(int hours, int minutes)
////        public int getHours()
////        public int getMinutes()
////        public String toString()
////
////        public void subtract(TimeSpan span) {
////            int min1 = hours * 60 + minutes;
////            int min2 = span.hours * 60 + span.minutes;
////            int diff = min1 - min2;
////            hours = diff / 60;
////            minutes = diff % 60;
////        }
////    }
//
//
