public class Classwork2 {
    public static final int SIZE=3;
    public static void main(String [] args){

        drawline();
        drawtop();
        drawtop();
    }
    public static void drawline(){
        System.out.print("+");
        for(int dash=1; dash<=SIZE*2; dash++){
            System.out.print("-");
        }
        System.out.println("+");

    }
    public static void drawtop(){
        for(int line=1;line <=SIZE; line++){
            System.out.print("|");
                Spaces(line);
                System.out.print("^");
                for(int space=1; space<=2*line-2; space++){
                    System.out.print(" ");
                }
                System.out.print("^");
                Spaces(line);
            System.out.println("|");

        }
    }
    public static void Spaces(int line){
        for(int dot=1; dot<=-line+SIZE; dot++) {
            System.out.print(" ");
        }
    }
}

