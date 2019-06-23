package ch06pc17;
import java.util.Random;

/**
 *
 * @author Frank
 * date 11/8/2017
 * 
 */
public class Coin {
    //fields
    private String sideUp;
    
    //constructors
    public Coin()
    {
        sideUp = randomToss();
       
    }
    
    //Methods
    public void toss()
    {
        sideUp = randomToss();
    }
    
    public String getSideUp ()
    {
        return sideUp;
    }
    
    private String randomToss()
    {
        //variables
        int rand; 
        
        //create Random object
        Random randomNumber = new Random();
        rand = randomNumber.nextInt(2);
        
        switch (rand)
        {
            case 0:
                sideUp = "Heads";
                break;
            case 1:
                sideUp = "Tails";
                break;
            default:
                break;
        }
        return sideUp;
    }
}
