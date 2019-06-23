package ch06pc17;

/**
 *
 * @author Frank
 * date 11/12/2017
 * purpose: to toss 3 coins and determine the value, if the end value is equal to 1 you win
 */
public class Ch06pc17 {

    public static void main(String[] args) {
        // variables
        String quarterSide, nickelSide, dimeSide;
        double balance = 0.0;
        int round = 0;
        
        //display initial balance to user:
        System.out.printf("The balance is: $%.2f\n", balance);
        
        // instantiate Coin class
        Coin quarter = new Coin();
        Coin nickel = new Coin();
        Coin dime = new Coin();

        // begin tossing
        while (balance < 1)
        {
            //round increment
            round++;
            
            //toss coins
            quarter.toss();
            nickel.toss();
            dime.toss();
            
            //get value of toss
            quarterSide = quarter.getSideUp();
            nickelSide = nickel.getSideUp();
            dimeSide = dime.getSideUp();
            
            System.out.println("Quarter " + quarterSide);
            System.out.println("Nickel " + nickelSide);
            System.out.println("Dime " + dimeSide);
            
            //determine balance
            if (quarterSide.equals("Heads"))
                balance += .25;
            if (nickelSide.equals("Heads"))
                balance += .05;
            if (dimeSide.equals("Heads"))
                balance += .10;
            
            //Display results to user
            System.out.printf("Round %d balance is: $%.2f. \n", round, balance);
        }
        
        if (balance > 1)
            System.out.printf("The balance is $%.2f, you lose.", balance);
        else if (balance == 1)
            System.out.printf("The balance is $%.2f, you win", balance);
            
    }
    
    
    
}
