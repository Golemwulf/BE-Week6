package week6WarGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	 private List<Card> cards;

	    public Deck() {
	    	//combines the suits and ranks arrays to make a card. The loop is then used to build the deck.
	        cards = new ArrayList<>();
	        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
	        String[] ranks = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};

	        for (String suit : suits) {
	            for (int i = 0; i < ranks.length; i++) {
	                cards.add(new Card(i + 2, ranks[i] + " of " + suit));
	            }
	        }
	    }

	    public void shuffle() {
	    	//takes the cards created from the "deck" method and randomizes the cards using the shuffle method. 
	        Collections.shuffle(cards);
	    }

	    public Card draw() {
	    	//removes a card from the deck as it is dealt out to the players. 
	        if (cards.isEmpty()) {
	            return null;
	        }
	        return cards.remove(0);
	    }

}
