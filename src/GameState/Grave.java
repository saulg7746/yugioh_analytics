package GameState;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import searchCardCriteria.Card;
import effects.Effect;

public class Grave{
	
	static LinkedList<Card> GY = new LinkedList<Card>();
	
	static Map<Card, Effect> iginitionEffects = new HashMap<Card,Effect>();
	
	Grave(){};
	
	public static void sendToGrave(Card c) {
		GY.add(c);
	}
	
	
	
	
	
	
}
