package Actions;

import commons.CardConstants;
import searchCardCriteria.Card;
import searchCardCriteria.MonsterSearchCriteria;
import searchCardCriteria.SpellSearchCriteria;
import searchCardCriteria.TrapSearchCriteria;

/**
 *  Thinking if we need this class at all, There might be a library with all types of
 *  Resolutions, there might actually be a finite number. 
 * @author saulg
 *
 */
public class Resolution extends Action{
	
	int quantity = 0;

	public Resolution() {};
	public Resolution(String verb, Card c, String from, String to){
		super(verb, c, from, to);
	}
	public Resolution(String verb, SpellSearchCriteria c, String from, String to){
		super(verb, c, from, to);
	}
	public Resolution(String verb, MonsterSearchCriteria c, String from, String to){
		super(verb, c, from, to);	
	}
	public Resolution(int qty, String verb, SpellSearchCriteria c, String from, String to){
		super(verb, c, from, to);
		this.quantity = qty;
	}
	public Resolution(int qty, String verb, MonsterSearchCriteria c, String from, String to){
		super(verb, c, from, to);	
		this.quantity = qty;
	}
	public Resolution(String verb, String thisCard, String from, String to){
		super(verb, thisCard, from, to);
	}
	public Resolution(String verb, String from, String to){
		super(verb, from, to);
	}
	public Resolution(Action other) {
		super(other);
	}
	public Resolution(Resolution other) {
		super(other);
		this.quantity = other.quantity;
		
	}
	
	public String toString() {
		String ret = "";
		ret += "Resolution:";
		
		if(!verb.isEmpty())
			ret += " " + verb;
		
		if(quantity != 0)
			ret += " " + quantity;

		if(!super.thisCard.isEmpty())
			ret += " " + CardConstants.THIS_CARD;
		else if(monster != null)
			ret += " " + monster.toString();
		else if(spell != null) 
			ret += " " + spell.toString();
		else if(trap != null) 
			ret += " " + trap.toString();
		
		if(!locationFrom.isEmpty()) 
			ret += " from " + locationFrom ;
		if(!locationTo.isEmpty()) 
			ret += " to " + locationTo;
		
		return ret;
	}
	
}