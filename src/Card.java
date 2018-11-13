
public class Card {

	private int number;
	private Suit suit;
	
	public Card(){
	}
	
	public Card(int number, Suit suit){
		this.number = number;
		this.suit = suit;
	}

	public int getNumber() {
		return number;
	}

	public Suit getSuit() {
		return suit;
	}
	
	public String toString(){
		return suit.getName() + String.valueOf(number);
	}
	
}
