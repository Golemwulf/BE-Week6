package week6WarGame;

import java.util.ArrayList;
import java.util.List;

public class Player {
	  private List<Card> hand; //brought in the list of cards as a list and turned into the individual player's had. 
	    private int score; //refers total points the player has earned. 
	    private String name; //refers to the name of the player, ie "Player 1" or "Player 2"

	    public Player(String name) { 
	        this.name = name;
	        hand = new ArrayList<>();
	        score = 0;
	    }

	    public void describe() { 
	        System.out.println(name + " has the following cards:"); 
	        for (Card card : hand) {
	            card.describe();
	        }
	    }

	    public Card flip() { //plays the next card in the hand
	        if (hand.isEmpty()) {
	            return null;
	        }
	        return hand.remove(0);
	    }

	    public void draw(Deck deck) { //continually draws another card until the hand is empty. 
	        Card card = deck.draw();
	        if (card != null) {
	            hand.add(card);
	        }
	    }

	    public void incrementScore() {
	        score++;
	    }

	    public int getScore() {
	        return score;
	    }

	    public String getName() {
	        return name;
	    }
}
