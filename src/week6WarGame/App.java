package week6WarGame;

public class App {

	  public static void main(String[] args) {
	        Deck deck = new Deck();
	        Player player1 = new Player("Player 1");
	        Player player2 = new Player("Player 2");

	        deck.shuffle();

	        for (int i = 0; i < 52; i++) { //this loop evenly deals the deck between the two players. 
	            if (i % 2 == 0) {
	                player1.draw(deck);
	            } else {
	                player2.draw(deck);
	            }
	        }
	        /**
	         * The loop below and the coding afterwards are set up so each player shows a card and a winner is determined. 
	         * When the winner is determined, 1 point will be added to that player's score. 
	         * This cycle repeats until the players are out of cards.
	         * The program then determines which player has the highest total points and declares a final winner. 
	         */
	        for (int i = 0; i < 26; i++) {
	            Card card1 = player1.flip();
	            Card card2 = player2.flip();

	            System.out.println("Round " + (i + 1) + ":");
	            System.out.print(player1.getName() + " plays: ");
	            card1.describe();
	            System.out.print(player2.getName() + " plays: ");
	            card2.describe();

	            if (card1.getValue() > card2.getValue()) {
	                player1.incrementScore();
	                System.out.println(player1.getName() + " wins this round!");
	            } else if (card2.getValue() > card1.getValue()) {
	                player2.incrementScore();
	                System.out.println(player2.getName() + " wins this round!");
	            } else {
	                System.out.println("It's a tie! No point awarded.");
	            }

	            System.out.println("Current scores - " + player1.getName() + ": " + player1.getScore() + ", " + player2.getName() + ": " + player2.getScore());
	            System.out.println();
	        }

	        System.out.println("Game Over!");
	        System.out.println("Final scores:");
	        System.out.println(player1.getName() + ": " + player1.getScore());
	        System.out.println(player2.getName() + ": " + player2.getScore());

	        if (player1.getScore() > player2.getScore()) {
	            System.out.println("Player 1 wins!");
	        } else if (player2.getScore() > player1.getScore()) {
	            System.out.println("Player 2 wins!");
	        } else {
	            System.out.println("It's a draw!");
	        }
	    }

}
