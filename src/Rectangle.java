//public class Rectangle {
//    private int x;
//    private  int y;
//    private int width;
//    private int height;
//    private point secondpoint;
//
//    public Rectangle(){
//       x=0;
//       y=0;
//       width=0;
//       height=0;
//       point secondpoint=new point((x+width), (y-height));
//    }
//    public Rectangle(int x1, int y1, int width1, int heigh1){
//        x=x1;
//        y=y1;
//        width=width1;
//        height=height;
//        point secondpoint = new point((x + width), (y - height));
//        Rectangle rec1 = new Rectangle(x, y, width, height);
//    }
//    public int getheight(){
//        return height;
//    }
//    public int getwidth(){
//        return width;
//    }
//    public int getX(){
//        return x;
//    }
//    public int getY(){
//        return y;
//    }
//    public String toString() {
//        return "Rectangle = [x=" + x + ", y=" + y + ", width=" + width + ", height=" + height + "]";
//    }
//    public Rectangle(point p, int width1, int height1) {
//        Rectangle rec2 = new Rectangle(p.x, p.y, width1, height1);
//    }
//
//    public boolean contains(int pointx, int pointy) {
//        return pointx > x || pointx < secondpoint.x || pointy > y || pointy < secondpoint.y;
//    }
//
//    public boolean contains(point p) {
//        return p.x > x || p.x < secondpoint.x || p.y > y || p.y > secondpoint.y;
//    }
//
//    public Rectangle union(Rectangle rect) {
//        int x1 = 0;
//        int y1 = 0;
//        int width1 = 0;
//        int height1 = 0;
//        if (x >= rect.x) {
//            x1 = x;
//        } else if (rect.x > x) {
//            x1 = rect.x;
//        }
//        if (y > +rect.y) {
//            y1 = y;
//        } else if (rect.y > y) {
//            y1 = rect.y;
//        }
//        if (width > +rect.width) {
//            width1 = width;
//        } else if (rect.width > width) {
//            width1 = rect.width;
//        }
//        if (height > +rect.height) {
//            height1 = height;
//        } else if (rect.height > height) {
//            height1 = rect.height;
//        }
//        Rectangle union = new Rectangle(x1, y1, width1, height1);
//        return union;
//    }
//}
//
