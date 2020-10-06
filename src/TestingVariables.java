public class TestingVariables {
    public static void main(String [] args){
        //Declare
        byte num;
        int intNum;
        //Declare and Initialize
        short numShort=4;
        long numLong=999999999;
        float numfloat= 3f;
        double numDouble = 7;
        char letter = 'd';
        //initialize
        num=1;
        intNum=1234;
//        System.out.println("These are my numbers my \nbyte Var = "+num+ " my\n int Var = " +intNum +"my\n my short Var = "+numShort);
//        System.out.println("my float var = "+numfloat);
//        System.out.println("my long var = "+numLong);
//        System.out.println("my doubble var = "+numDouble);
        int subtotal = 38+40+30;
        double tax = subtotal*0.08;
        float tips = subtotal*0.15f;
        System.out.printf("Subtotal: %8d \n",subtotal);
        System.out.printf("Tax: \t %8.2f \n", tax);
        System.out.printf("Tips: \t %8f \n", tips);
        System.out.print("Total:");
        System.out.println(subtotal+tips+tax);



    }

}
