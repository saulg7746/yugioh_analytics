package Actions;

import commons.CardConstants;
import searchCardCriteria.Card;
import searchCardCriteria.MonsterSearchCriteria;
import searchCardCriteria.SpellSearchCriteria;
import searchCardCriteria.TrapSearchCriteria;

/**
 *  Ok, so this class will be necessary and we need to make sure that its handled correctly. 
 *  this class will probably need a quantity and such
 *  Examples of Cost;
 *  	Discard 1 other HERO monster from Hand
 *  	pay 1000 Life points
 *  	Tribute this card 
 *  	Discard 2 WATER Monsters
 *
 */
public class Cost extends Action{
	
	int 	quantity 	= 0; 	// To be used for Discarding, Tributing, etc "Discard 1 other HERO monster"
	boolean inclusive 	= true; // To be used if whatever cost can be used for this card itself. This will take care of the "other"
	
	public Cost() {};
		public Cost(Action other) {
		super(other);
	}
	public Cost(Cost other) {
		super(other);
		this.quantity = other.quantity;
		this.inclusive = other.inclusive;
	}
	public Cost(int qty, boolean inc, String verb, String thisCard,
			MonsterSearchCriteria m,
			SpellSearchCriteria s, 
			TrapSearchCriteria t,
			String from, String to){
		super(verb,thisCard,m,s,t,from,to);
		this.quantity = qty;
		this.inclusive = inc;
	}
	
	public String toString() {
		String ret = "";
		ret += "Cost:";
		
		if(!verb.isEmpty())
			ret += " " + verb ;
		
		if(quantity != 0)
			ret += " " + quantity ;
		if(!inclusive)
			ret += " " + CardConstants.OTHER;
		
		if(!super.thisCard.isEmpty())
			ret += " " +  CardConstants.THIS_CARD;
		else if(monster != null)
			ret += " " +  monster.toString();
		else if(spell != null) 
			ret += " " +  spell.toString();
		else if(trap != null) 
			ret += " " + trap.toString();
		
		if(!locationFrom.isEmpty()) 
			ret += " from " + locationFrom ;
		if(!locationTo.isEmpty()) 
			ret += " to " + locationTo + " ";
		
		return ret;
	}
	
}