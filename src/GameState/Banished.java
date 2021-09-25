package GameState;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import effects.Effect;
import searchCardCriteria.Card;

public class Banished{
	static LinkedList<Card> Banished = new LinkedList<Card>();
	
	static Map<Card, Effect> iginitionEffects = new HashMap<Card,Effect>();
	
	Banished(){};
	
	public static void banish(Card c) {
		Banished.add(c);
	}
	
	

}