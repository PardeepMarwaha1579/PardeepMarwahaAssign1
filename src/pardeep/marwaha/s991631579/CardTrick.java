package pardeep.marwaha.s991631579;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author Pardeep Marwaha
 * @date 4 June 2021
 */
import java.util.Scanner;
public class CardTrick {

    public static void main(String[] args) {
        
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
             c.setValue(c.randomValue);
             c.setSuit(Card.SUITS[c.randomSuit]);
             
       magicHand[i]=c;
        }
       for(Card newHand:magicHand){
           System.out.println(newHand.getSuit()+" "+newHand.getValue());
       }
       Scanner scan=new Scanner(System.in);
       System.out.println("Please Select your card suit:");
       System.out.println("Please chose:"+"\n"+"Type 0 for Hearts"+"\n"+"Type 1 for Diamonds"+"\n"+"Type 2 for Spades"+"\n"+"Type 3 for Clubs");
       int suitValue=scan.nextInt();
       
       System.out.println("Type the Card Value from 1 to 13"+"\n"+"i.e Ace = 1, Jack =11, Queen =12, King = 13");
       int cardNumber=scan.nextInt();
       System.out.println("Your Card is:"+Card.SUITS[suitValue]+" "+cardNumber); 
       
            
       
        }

        
    }
        
