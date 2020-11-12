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
    public class line {
        private point p1;
        private point p2;
        public line(point p1, point p2){
            p1 = new point();
            p2 = new point();
        }
        public point getp1(){
            int x = getp1().getX();
            int y = getp1().getY();
            return new point(x,y);
        }
        public point getp2(){
            int x = getp2().getX();
            int y = getp2().getY();
            return new point(x,y);
        }
        public String toString(){
            String Line = "[" + getp1() + ", "+ getp2()+ "]";
            return Line;
        }
        public double getSlope(){
            double slope = (getp2().getY()-getp1().getY())/(getp2().getX()-getp1().getX());
            return slope;
        }
        public line(int x1, int y1, int x2, int y2){
            point p1 = new point(x1,y1);
            point p2 = new point(x2,y2);
        }
        public boolean isCollinear(point p){
            double slope1 = (getp2().getY()-getp1().getY())/(getp2().getX()-getp1().getX());
            return slope1 == getSlope();
        }
    }
    //10
//    public double getSlope() {
////       double slope =(getp2().getY()-getp1().getY());
////       return slope;
//    }
}
