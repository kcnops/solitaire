import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Game {
	
	private Deck deck;
	private Window window;
	
	private HashMap<CardPlace,ArrayList<Card>> cards;
	
	public Game(){
		window = new Window(this);
	}
	
	public void newGame(){
		deck = new Deck();
		deck.shuffle();
		deal();
	}
	
	private void deal(){
		cards = new HashMap<CardPlace,ArrayList<Card>>();
		ArrayList<CardPlace> stacks = new ArrayList<CardPlace>();
		stacks.add(CardPlace.stack1);stacks.add(CardPlace.stack2);stacks.add(CardPlace.stack3);stacks.add(CardPlace.stack4);
		stacks.add(CardPlace.stack5);stacks.add(CardPlace.stack6);stacks.add(CardPlace.stack7);
		for(int i = 0; i < 7; i++){
			ArrayList<Card> stack = new ArrayList<Card>();
			for(int j = 0; j <= i; j++){
				Card card = deck.cards.remove(0);
				stack.add(card);
			}
			cards.put(stacks.get(i), stack);
		}
		cards.put(CardPlace.set1, new ArrayList<Card>());
		cards.put(CardPlace.set2, new ArrayList<Card>());
		cards.put(CardPlace.set3, new ArrayList<Card>());
		cards.put(CardPlace.set4, new ArrayList<Card>());
		cards.put(CardPlace.pickupCards, new ArrayList<Card>());
		cards.put(CardPlace.pickupPile, new ArrayList<Card>(deck.cards));
	}
	
}
