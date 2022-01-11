import java.util.Scanner;

public class HighLowGame{
public static void main(String[] args) {
       int keep = 1;
       int wins = 0;
       int losses =0;
    while (keep==1)  {
        Deck deck = new Deck();
        Scanner scnr = new Scanner(System.in);
        Card card1 = deck.drawCard();
        System.out.println("The first card is " + card1.declareCard());
        System.out.println("Will the next card be higher or lower?");
        System.out.println("Enter 1 for lower, 2 for higher.");

        int choice = scnr.nextInt();

        Card card2 = deck.drawCard();
        System.out.println("The next card is the " + card2.declareCard());
        boolean higher = card2.getValue() > card1.getValue();
        if (card1.getValue() == card2.getValue()) {
            System.out.println("Card Values were the same, no winner or loser this round");
        }
        else if ((higher && choice ==2) || (!higher && choice == 1)) {
            System.out.println("Winner!");
            wins +=1;
        }
        else {
            System.out.println("Sorry, your guess was incorrect :(");
losses -=1;
        }
        System.out.println("Would You like to keep playing?");
        System.out.println("If yes, please type 1, if no please type 0");
        keep = scnr.nextInt();
    }

System.out.println("The total number of times you won: " + wins);
System.out.println("The total number of times you lost: " + losses);
System.out.println("Thank you for playing");

    }
}
