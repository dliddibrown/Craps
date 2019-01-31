/**
 * This class creates a die!
 *
 * @author Dash Liddi Brown
 * @version 1-18-19
 */
public class Die
{
    private int roll;

    /**
     * Constructor for objects of class Die
     */
    public Die()
    {
        roll = roll();
    }
    /**
     * The roll method rolls the die
     *
     * @return the value of the die roll between the numbers
     * of 1 to 6
     */
    public int roll()
    {
        roll = (int) (Math.random() * 6) + 1;
        return roll;
    }
}
