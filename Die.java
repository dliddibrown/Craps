
/**
 * This is the die class for the game Craps
 *
 * @author Dash Liddi Brown
 * @version 1-18-19
 */
public class Die
{
    private int roll;
    
    public Die()
    {
        roll = roll();
    }
    
    public int roll()
    {
        roll = (int) (Math.random() * 6 + 1);
        return roll;
    }
}
