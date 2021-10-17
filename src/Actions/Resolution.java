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
	}
	
	public String toString() {
		String ret = "";
		ret += "Resolution: " + verb + " ";
		
		if(locationFrom != "" && locationFrom == CardConstants.ANYWHERE) {
			return "Resolution: If " + thisCard + " is "+ verb + " to the " + LocationTo;
		}else if(verb == CardConstants.SPECIAL_SUMMONED && thisCard == CardConstants.THIS_CARD){
			return "Resolution: If " + thisCard + " is " + verb; 
		}else if (LocationTo == "" && monster != null){
			return "Resolution: " + verb + " 1 " + monster.toString() + " monster from " + locationFrom;
		}
		
		if(this.spell != null) {
			ret +=  "1 " + spell.toString() + " spell";
		}else if(this.monster != null) {
			ret += "1 " + monster.toString() + " monster";
		}
		
		ret += thisCard + " from " + locationFrom + " to " + LocationTo;
		
		
		return ret;
	}
	
}