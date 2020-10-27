import java.util.*;
public class TestingArrays {
    //type: int, float, double, char, long
    //is the type of data you put in your array
   public static void main(String [] args){
       int num=20;
       int [] numbers=new int[num/2];
       int sum=0;
       for(int i=0; i<numbers.length; i++){
           numbers[i]=i*2;
           System.out.print(" "+ numbers[i] + " ,");
           sum += numbers [i]; //s
       }
       System.out.println();
       double average = sum/numbers.length;
       System.out.println(average);
       int count=0;
       for(int i=0; i<numbers.length; i++){
           if (numbers [i] > average){
               count++;
           }
       }
       System.out.println(count);
   }
}
