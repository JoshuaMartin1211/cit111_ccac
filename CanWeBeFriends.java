/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniProject;

import java.util.Scanner;//Import a scanner object
/**
 *Create a code that tests the compatibility of a user
 * with questions of different interests and test if they
 * match using a series of if/else statements
 * @author joshm
 */
public class CanWeBeFriends {
    public static void main(String args[]){
        //Initialize a string for the desired user input of "yes"
        final String compAnswer = "yes";
        //Declare three variables for the questions
        String questionOne;
        String questionTwo;
        String questionThree;
        //Inilitalize a compatibility score
        int compScore = 0;
        //Create a scanner object for user input
        Scanner userInputScanner = new Scanner(System.in);
        //Print out a statement to start the project
        System.out.println("Hey! I have some questions to see if we can be friends!");
        
        System.out.println("****************************************************");
        //Print out the first question and prompt user to enter either yes or no
        System.out.println("Question 1: Are you a Steelers fan? |||| Enter yes or no: ");
        //Set the input to the declared string variable
        questionOne = userInputScanner.next();
        //Ask if the user input is equal to the string "yes"
        if(questionOne.equals(compAnswer)){
            //If yes print a response and add 1 to the compatibility score
            System.out.println("Great me too! We should catch a game sometime!");
            
            compScore = compScore + 1;
            //If no print a response
        }else
            System.out.println("Welp not everyone can recognize greatness.");
        
        //On to the next question
        System.out.println("****************************************************");
        
        System.out.println("Question 2: Do you watch anime or read manga (either is fine) |||| Enter yes or no: ");
        //Set the input to the second question to the variable questionTwo
        questionTwo = userInputScanner.next();
        //Ask if the user input is equal to the string "yes"
        if(questionTwo.equals(compAnswer)){
            //If yes print a response and add 1 to the compatibility score
            System.out.println("Thats excellent. Seems we may have a compatible friendship. Only a few more questions!");
            
            compScore = compScore + 1;
            //If no print a response
        }else
            System.out.println("Anime is not for everyone, I guess.");
        
        //On to the next question
        System.out.println("****************************************************");
        
        System.out.println("Question 3: Do you like to excersize? |||| Enter yes or no: ");
        //Set the input to the third question to the variable questionThree
        questionThree = userInputScanner.next();
        //Ask if the user input is equal to the string "yes"
        if(questionThree.equals(compAnswer)){
            //If yes print a response and add 1 to the compatibility score
            System.out.println("Great! We should go to the gym some time I've been in need of a workout partner");
            
            compScore = compScore + 1;
            //If no print a response
        }else
            System.out.println("Thats a shame. You should definitley do a little every week.");
        
        //test the compatibility score
        System.out.println("****************************************************");
        
        //If the compatibility score is 2 or 3 there is compatible friendship
        if(compScore == 3){
            System.out.println("Nice! We seem to be a perfect match.");
   
        }else if(compScore == 2){
            System.out.println("You do not seem to like everything I do, but we can still be good friends");
        //Anything less than a compatibility score of 2 is in compatibile
        }else
            System.out.println("I do not think we have enough in common to be good friends.");
        }          
    }

