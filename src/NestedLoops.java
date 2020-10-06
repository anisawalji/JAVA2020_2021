/*
Anisa Walji
Learning Nested Loops
09/29/2020
 */
public class NestedLoops {
    public static final int SIZE=5;
    public static void main(String [] args){
        for(int line =1; line <=SIZE; line++){
            for(int dot=1; dot<=-line+SIZE; dot++){
                System.out.print(".");
            }
            System.out.print(line);
            for(int space= 1; space <2 * line -SIZE+3; space++){
                System.out.print(" ");
            }
            if (line !=1) {
                System.out.println(line);
            }
            else
                System.out.println();
        }



    }
}
