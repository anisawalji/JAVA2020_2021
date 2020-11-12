public class Line {
    Point p1;
    Point p2;


    public Line(Point p1, Point p2) {
        p1 = p1;
        p2 = p2;
    }

    public Line(int x1, int y1, int x2, int y2) {
        p1 = new Point(x1, y1);
        p2 = new Point(x2, y2);
    }

    public Point getP1() {
        return p1;
    }

    public Point getp2() {
        return p2;
    }

    public String toString() {
        return "[" + p1.toString() + ", " + p2.toString() + "]";
    }

    //10
//    public double getSlope() {
////       double slope =(getp2().getY()-getp1().getY());
////       return slope;
//    }
}
