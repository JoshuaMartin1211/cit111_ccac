/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalProject;

import java.util.Scanner;
/**
 *
 * @author joshm
 */
public class ElectronicsLand {
    public static void main(String[] args){

        TVs firstTv = new TVs();
        firstTv.setTvName("Toshiba");
        firstTv.setTvSize(50);
        firstTv.setPrice(399);

        TVs secondTv = new TVs();
        secondTv.setTvName("SAMSUNG SMART");
        secondTv.setTvSize(65);
        secondTv.setPrice(599);

        TVs thirdTv = new TVs();
        thirdTv.setTvName("APPLE");
        thirdTv.setTvSize(55);
        thirdTv.setPrice(599);

        TVs fourthTv = new TVs();
        fourthTv.setTvName("SONY");
        fourthTv.setTvSize(48);
        fourthTv.setPrice(399);

        TVs fifthTv = new TVs();
        fifthTv.setTvName("LG Nano Cell");
        fifthTv.setTvSize(45);
        fifthTv.setPrice(399);



        TVs[] TV = new TVs[5];

        TV[0] = firstTv;
        TV[1] = secondTv;
        TV[2] = thirdTv;
        TV[3] = fourthTv;
        TV[4] = fifthTv;

        System.out.println("You want to buy a TV for your friend's christmas gift. Here are your options");
          for (int i = 0; i <= 4; i = i+1){
            TVs accessedTv = TV[i];
            System.out.println("Brand: " + accessedTv.getTvName());
            System.out.println("Size: " + accessedTv.getTvSize());
            System.out.println("Price: " + accessedTv.getPrice());
            
            
          }
          userTvSelection(TV);
          

        }
       //System.out.println("")
        public static int userTvSelection(TVs[] TV){
          Scanner userInputScanner = new Scanner(System.in);

          System.out.println("From 1-5 which TV would you like to buy?");
          int userSelection = userInputScanner.nextInt();

          int chosenTV = userSelection - 1;
          System.out.println("You have chosen: " + TV[chosenTV]);
          System.out.println("Great choice! They'll love it!");

          return chosenTV;
    }

}
