package nyc.c4q.Jvidals1;

import java.util.Scanner;

/**
 * Janneisy Vidal 3/13/14.
 * Accesscode 2.1
 * HW Text-based game
 */
public class FortuneGame1 {



    public static void main(String[] args) {


        Scanner keyboard = new Scanner(System.in);

        String[] destinyAnswer = new String[4];
        destinyAnswer[0] = "Not likely";
        destinyAnswer[1] = "Outlook good";
        destinyAnswer[2] = "Better not tell you now";
        destinyAnswer[3] = "Without a doubt";


        //Ask the user his/her name
        System.out.println("What is your name?");
        String name = keyboard.nextLine();

        //Print a welcome message
        System.out.println("Welcome " + name + "! Making decisions can be hard. Let's let fate choose your destiny!");

        //Ask the user to enter his/her question
        System.out.println("Enter your question here: ");
        String question = keyboard.nextLine();

        //Re ask the question to the user
        System.out.println("Your question is : " + question + ", right? Enter 'no' or 'yes'");
        String response = keyboard.nextLine();

        //Ask the user to enter yes or no

        while (response.equalsIgnoreCase("No")) {
            System.out.println("Please re-enter your question: ");
            response = keyboard.nextLine();

            System.out.println("Your question is : " + question + ", right? Enter 'no' or 'yes'");
            response = keyboard.nextLine();

            if (response.equalsIgnoreCase("quit")) {
                System.out.println("Goodbye! Come back again!");
                System.exit(0);

            }else if ((!response.equalsIgnoreCase("yes")) || (!response.equalsIgnoreCase("no"))) {
                System.out.println("Please enter yes or no. To quit, enter 'quit'");
                response = keyboard.nextLine();

            }else if (response.equalsIgnoreCase("yes")) {
                System.out.println("Ok! Let's see your if it's your destiny!");
            }
        }
        while (response.equalsIgnoreCase("yes")) {

            System.out.println("Enter your zodiac sign?");
            String zodiacSign = keyboard.nextLine();

            System.out.println("Enter your favorite color?:");
            String favColor = keyboard.nextLine();

            //formula for random answer
            int destinyNum = zodiacSign.length() + favColor.length();

            while (destinyNum >= destinyAnswer.length) {
                destinyNum -= destinyAnswer.length;

            } System.out.println("your answer to your fortune is :" + destinyAnswer[destinyNum]);
            System.out.println("Good Bye!");
            System.exit (0);
        }
        //else {
        //  System.out.println("Come back another day...too cloudy to tell your fortune");

    }
}


