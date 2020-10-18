import java.util.*;
/*
creat a game to guess a number
create a random number
ask user for a guess
compare the guess w the random number
allow the user to guess again!!
 */
public class PlayingWithRandom {
    public static void main(String [] args){
        //create the random object
        Random randy = new Random();
        int rand1= randy.nextInt(20)+1;// the limit is not included. adding the +1 will give you 1-10 cause it adds 1 to every number
        Scanner scan = new Scanner(System.in);
        System.out.println(" Please guess a number between 1 and 20 ");
        int userGuess = scan.nextInt();//getting user guess
        if(rand1 == userGuess){
            System.out.println("Yeah, you guessed right");// if it is true
        }
        else if(userGuess <rand1){
            System.out.println("Sorry, your guess is too low");
        }
            else{
            System.out.println("Sorry, your guess is too high"+ rand1 + "userGuess");
        }
//

//        while(guess1 !=20) {
//        System.out.println("My guess 1 is ="+ guess1);
//        guess1 = randy.nextInt(20)+1;
//    }
//       System.out.println(" My guess1 is" + guess1);
}
}

