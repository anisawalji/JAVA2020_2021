public class chapter3Exercises2 {
    //question 13
    public static void main(String[] args) {
        printReverse("hello there!");
    }

    public static void printReverse(String str)
    {
        for(int i = str.length() - 1; i >= 0; i--)
        {
            System.out.print(str.charAt(i));
        }

        //
    }
}
