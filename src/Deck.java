import java.util.ArrayList;
import java.util.Random;


public class Deck {

	public ArrayList<Card> cards;
	
	public Deck(){
		cards = new ArrayList<Card>();
		for (Suit suit : Suit.values()){
			for (int i = 1; i <= 13; i++){
				Card card = new Card(i, suit);
				cards.add(card);
			}
		}
	}
	
	public ArrayList<Card> getCards(){
		return new ArrayList<Card>(cards);
	}
	
	public void shuffle(){
		ArrayList<Card> newCards = new ArrayList<Card>();
		Random rand = new Random();
		while(!cards.isEmpty()){
			int i = rand.nextInt(cards.size());
			Card card = cards.remove(i);
			newCards.add(card);
		}
		cards = newCards;
	}
	
}
