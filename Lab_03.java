package lab003;

import java.util.Scanner;

public class Lab_03 {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        //Ask user to enter a number 
        System.out.print("Enter the Card Number (1-52): ");
        int number = scannerObject.nextInt();
        //Make sure it's within available range 
        if (number >= 1 && number <= 52) {
        	//Calculate suit and rank 
            int suit = (number - 1) / 13;
            int rank = (number - 1) % 13;
            //Print card you picked 
            System.out.print("The card you picked is ");
            //Use switch statements for card rank
            switch (rank + 1) // Get rank
            {
	            case 1:// Case 1 represents Ace
	                System.out.print("Ace");
	                break;
	            case 11: // Case 11 represents Jack
	                System.out.print("Jack");
	                break;
	            case 12: // Case 12 represents Queen
	                System.out.print("Queen");
	                break;
	            case 13: // Case 13 represents King
	                System.out.print("King");
	                break;
	            default:
	                System.out.print(rank + 1);
	        }
	
	        System.out.print(" of ");
	        //Use switch statement for card suit
	        switch (suit + 1) // Get suit
	        {
	            case 1: // Case 1 represents Clubs
	                System.out.print("Clubs");
	                break;
	            case 2: // Case 2 represents Diamonds
	                System.out.print("Diamonds");
	                break;
	            case 3: // Case 3 represents Hearts
	                System.out.print("Hearts");
	                break;
	            case 4: // Case 4 represents Spades
	                System.out.print("Spades");
	                break;
	        }
        } else {
        	//If number is not within range, print error
            System.out.print("Invalid Enter a number between 1 and 52.");
        }

        scannerObject.close();
    }
}