//An object class
//It has no main method
//it is used only to identify the object or create the object and its behaivor

public class Point {
    //fields
    private int x;
    private int y;
    private String name; //we dont define value, by default it is null

    //4
    public boolean isCollinear(Point p1, Point p2) {
        if ((this.x == p1.x && this.x == p2.x) || (this.y == p1.y && this.y == p2.y)) {
            return true;
        } else {
            double slope1 = (double)(this.y - p1.y) / (double)(this.x - p1.x);
            double slope2 = (double)(this.y - p2.y) / (double)(this.x - p2.x);
            return slope1 == slope2;
        }
    }

    //Create constructors
    public Point() {
        x = 0;
        y = 0;
        name = "This is the x " + x + " this is the y " + y;
    }

    public Point(int x1, int y1) {

        x = x1;
        y = y1;
        name = "this is point" + x + " +" + y;
    }

    //non static methods changing the field values Mutator methods
    public void SetX(int x1) {
        x = x1;
    }

    public void SetY(int y1) {
        y = y1;
    }

    //non static method object reference, return values Assesor Methods
    public int GetX() {
        return x;
    }

    public int GetY() {
        return y;
    }

    public void setLocation(int x1, int y1) {
        x = x1;
        y = y1;
        name = "this is point" + x + " +" + y;
    }

    public void translate(int dx, int dy) {
        x += dx;
        y += dy;
        name = "this is point" + x + " +" + y;
    }

    public String toString() {
        return name;
    }
//1
    public int manhattanDistance(Point other) {
        int xDistance = Math.abs(other.x-x);
        int YDistance = Math.abs(other.y-y);

        return xDistance + YDistance;
    }
    //2
    public boolean isVertical(Point other) {
        return this.x == other.x;
    }
    //3
    public double slope(Point other) {
        if(this.x == other.x)
            throw new IllegalArgumentException();

        return ((double) (this.y - other.y)) / (this.x - other.x);
    }
    //5
    public void add(TimeSpan span) {
//        add(span.hours, span.minutes);
    }
    //6
//    public class TimeSpan {
//        private int hours;
//        private int minutes;
//
//        public void add(int hours, int minutes)
//        public int getHours()
//        public int getMinutes()
//        public String toString()
//
//        public void subtract(TimeSpan span) {
//            int min1 = hours * 60 + minutes;
//            int min2 = span.hours * 60 + span.minutes;
//            int diff = min1 - min2;
//            hours = diff / 60;
//            minutes = diff % 60;
//        }
//    }


}
