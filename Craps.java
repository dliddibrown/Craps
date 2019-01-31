/**
 * This is the craps program!
 *
 * @author Dash Liddi Brown
 * @version 1-18-19
 */

import java.util.Scanner;
public class Craps
{
    public static void main(String[] args)
    {
       Die d1 = new Die();
       Die d2 = new Die();
       Scanner in = new Scanner(System.in);
       while(true)
        {
            System.out.println("This is the craps game! ");
            System.out.println("Press the [Enter] key to roll! ");
            in.nextLine();
            int roll1 = d1.roll();
            int roll2 = d2.roll();
            int totalRoll = roll1 + roll2;
            System.out.println("Friend, you have rolled a " + roll1 + " and a " + roll2);
            System.out.println("Giving you a total of " + totalRoll);

            if (totalRoll == 7 || totalRoll == 11)
            {
                System.out.println("You won!");
            }
            else if (totalRoll == 2 || totalRoll == 3 || totalRoll == 12)
            {
                System.out.println("You lose!");
            }
            else
            {
                int point = totalRoll;
                boolean keepPlaying = true;
                while (keepPlaying)
                {
                    System.out.println("Press the [Enter] key in order to roll the dice!");
                    in.nextLine();
                    roll1 = d1.roll();
                    roll2 = d2.roll();
                    totalRoll = roll1 + roll2;
                    System.out.println("You have rolled a " + roll1 + " and a " + roll2);
                    System.out.println("Giving you a total of " + totalRoll);
                    if (totalRoll == point)
                    {
                        System.out.println("You have matched your point. You Win!");
                        keepPlaying = false;
                    }
                    else if (totalRoll == 7)
                    {
                        System.out.println("You rolled a 7. You lose!");
                        keepPlaying = false;
                    }
                }
                System.out.println("Good game!");
            }
            System.out.println("Want to play Craps again? (Y/n) ");
            String playAgain = in.nextLine();
            if (playAgain.equals(""))
            {
            }
            else if (playAgain.substring(0,1).equals("n"))
            {
                break;
            }
       }
       System.out.println("I hope you enjoyed this program!");
    }
}
