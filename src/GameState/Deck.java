package GameState;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;

import searchCardCriteria.Card;
import effects.Effect;

public class Deck{
	
	static LinkedList<Card> Deck = new LinkedList<Card>();
	
	Deck(){};
	
	public static Card draw() {
		return Deck.pop();
	}
	public static void putBack(Card c) {
		Deck.add(c);
	}
	public static void shuffle() {
		Collections.shuffle(Deck, new Random());
	}
	
}