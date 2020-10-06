public class ForLoopPractice {
    public static final int SIZE=3;
    public static void main(String [] args){
        System.out.println("+----+");
//        final int size= 3;
//        public static final int SIZE=3
//        //for ( declare and initialize a counter var; check counter value; increment counter)
//        for(int dash=10; dash<=20; dash+=+2) { //counter =+1)System.out.println(counter);
//            System.out.print("-");
        for (int i = 3; i <= SIZE; i++) {
            PrintingStuff();
        }
        System.out.println("+----+");
    }

    //Make a method to print the lines
    public static void PrintingStuff() {
        System.out.println("\\    /");
        System.out.println("/    \\");
    }
}
