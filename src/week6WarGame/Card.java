package week6WarGame;

public class Card {
	 private int value;
	    private String name;

	    public Card(int value, String name) {
	    	//value is for the card ranking and the name is for the player. 
	        this.value = value;
	        this.name = name;
	    }

	    public int getValue() {
	        return value;
	    }

	    public String getName() {
	        return name;
	    }

	    public void describe() {
	        System.out.println(name);
	    }

}
