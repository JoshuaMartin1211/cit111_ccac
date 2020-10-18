/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.Random;
        
/**
 *
 * @author joshm
 */
public class MysteryDoor {
    public static void main (String[] args){
        
        int yourWinnings = 10000;
        
        Scanner inputScanner = new Scanner(System.in);
        //declare an integer variable to store the inputed number
        int userSelection;
        //Prompt a game show where you choose behind 3 doors for cash prizes
        System.out.println("*******WELCOME TO THE GAME SHOW*******");
        System.out.println("Behind these doors are cash prizes.");
        
        System.out.println("Choose ONE of the 3 doors!");
        System.out.println("Enter 1, 2, or 3 and press enter: ");
        //Set the input to the created scanner object
        userSelection = inputScanner.nextInt();
        
         //create a switch method that calls 3 other methods
    switch(userSelection){
            case 1:
                doorOne();
                break;
            case 2:
                doorTwo();
                break;
            case 3:
                doorThree(yourWinnings);
                break;
            default:
                System.out.println("---Error invalid selection---");
        }//end swithc mechanism
    }//end main method
        
    //Door one method
    public static void doorOne(){
        //Door 1 intro
        System.out.println("So you have chosen door 1!");
        //Create a random object
        Random r = new Random();
        //Create a big integer object
        BigInteger bigInt = new BigInteger(100, r);
        //Print the the random big number as the cash prize
        System.out.println("You Win BIG! Behind this door is $" + bigInt+ " dollars");
    }
    //Door 2 method
    public static void doorTwo(){
        //Set the upper perameter for the random integer
        final int upper_Range = 1000;
        
        System.out.println("So you have chosen door 2!");
        //create a random object
        Random r = new Random();
        //Initialize the random generated number to a variable
        int randNum = r.nextInt(upper_Range);
        //Print the random number as the cash prize
        System.out.println("You win but not as big as you could have. Begind this door is $" + randNum+ " dollars");
    }
    //Door 3 method
    public static void doorThree(int win){
        System.out.println("So you have chosen door 3");
        //Create a variable that takes the perameter created and set it to that
        int winnings = win;
        //Print that out as the winnings behind door 3
        System.out.println("You winnings behind door three is $" +winnings+ " dollars");
         
        
    }
}
