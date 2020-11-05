//An object class
//It has no main method
//it is used only to identify the object or create the object and its behaivor

public class Point {
    //fields
   private int x;
   private int  y;
   //Create constructors
    public Point(){
        x=0;
        y=0;
    }
    public Point(int x1, int y1){

        x=Math.abs(x1);
        y=Math.abs(y1);
    }
    //non static methods chaging the field values Mutator methods
    public void SetX(int x1){
        x=x1;
    }
    public void SetY(int y1){
        y=y1;
    }
    //non static method object reference, return values Asseor Methods
    public int GetX(int x1){
        return x;
    }
    public int GetY(int y1){
        return y;
    }
}
