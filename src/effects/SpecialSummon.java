package effects;

import searchCardCriteria.MonsterSearchCriteria;

public class SpecialSummon{
	int qty = 0;
	String from = ""; // Deck, GY, Hand, Extra Deck, Banish Pile
	MonsterSearchCriteria monster = null; 
	
	public SpecialSummon() {};
	public SpecialSummon(int qty, String location, MonsterSearchCriteria mon) {
		this.qty = qty;
		this.from = location;
		this.monster = new MonsterSearchCriteria(mon);
	};

	
}