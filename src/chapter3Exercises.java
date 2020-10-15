public class chapter3Exercises {
    public static void main(String[] args) {
        printNumbers(15);
        printNumbers(4);
        //q 2
//        printPowersOf2(3);
//        printPowersOf2(10);
        //q 3
//        printPowersOfN(4, 3);
//        printPowersOfN(5, 6);
//        printPowersOfN(-2, 8);
//q4
//        printSquare(3, 7);

//q 1
    }
    public static void printNumbers (int maximum){
        for(int i = 1; i <= maximum; i++){
            System.out.print("[");
            System.out.print(i);
            System.out.print("] ");
        }
        System.out.println();

    }
    //q 2

    //    public static void printPowersOf2(int maximum){
//
//        for(int i = 0; i <= maximum; i++){
//            System.out.print((int) Math.pow(2, i) + " ");
//        }
//        System.out.println();
//
//    }
    //q 3
//    public static void printPowersOfN(int base, int maximum) {
//        int result = 1;
//        System.out.print(result + " ");
//
//        for (int i = 1; i <= maximum; i++) {
//            result *= base;
//            System.out.print(result + " ");
//        }
//        System.out.println();
//
//    }

    //q 4
//    public static void printSquare(int min, int max){
//        for (int i = min; i <= max; i++);{
//
//            for (int j =i; j <=max; j++){
//                System.out.print(j);
//            }
//            for (int j = min; j < i; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//    }
//    //q 5
////    public static void printGrid(int row, int column)
//    {
//        for (int i = 1 ; i<=row ; i++)
//        {
//            System.out.print(i);
//
//        }
//        {
//            for(int j = 1; j <=column ;j++)
//                System.out.print(row*j-3);
//        }
//        System.out.println();
//    }



}


















