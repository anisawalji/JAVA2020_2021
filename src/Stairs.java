public class Stairs {
//    public static final int LENGTH=5;
//
//    public static void main(String [] args){
//        printStairs ();
//    }
//    public static void printStairs(){
//        for(int allStairs=1; allStairs<=15; allStairs++){
//            for (int spaces=1; spaces<=(-5*allStairs+30));spaces++){
//                 System.out.print(" ");
//            }
//            for (int stair = 1; stair <= 5; stair++){
//                System.out.println(" o *******");
//            }
//        }
//    }
public static void main(String[] args) {
    int steps = 7;
    for (int x = 0; x < steps; x++) {
        System.out.format(((steps == (x + 1)) ? "" : ("%"
                + ((steps - x - 1) * 5) + "s"))
                + "  o  ******"
                + ((x == 0) ? "" : ("%" + (x * 5) + "s"))
                + "*\n", " ", " ");
        System.out.format(((steps == (x + 1)) ? "" : ("%"
                + ((steps - x - 1) * 5) + "s"))
                + " /|\\ *     "
                + ((x == 0) ? "" : ("%" + (x * 5) + "s"))
                + "*\n", " ", " ");
        System.out.format(((steps == (x + 1)) ? "" : ("%"
                + ((steps - x - 1) * 5) + "s"))
                + " / \\ *     "
                + ((x == 0) ? "" : ("%" + (x * 5) + "s"))
                + "*\n", " ", " ");
    }
    for (int i = 0; i < (steps + 1) * 5 + 2; i++) {
        System.out.print("*");
    }
}
}
