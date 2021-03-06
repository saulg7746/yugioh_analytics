package Actions;

import commons.CardConstants;
import searchCardCriteria.Card;
import searchCardCriteria.MonsterSearchCriteria;
import searchCardCriteria.SpellSearchCriteria;
import searchCardCriteria.TrapSearchCriteria;

/**
 *  Thinking if we need this class at all, There might be a library with all types of
 *  ActivationReqs, there might actually be a finite number. 
 * @author saulg
 *
 */
public class ActivationReq extends Action{
	
	String timing_clause = "";
	
	public ActivationReq() {};
	public ActivationReq(Action other) {
		super(other);
	}
	public ActivationReq(ActivationReq other) {
		super(other);
		this.timing_clause = other.timing_clause;
	}

	public ActivationReq(String timing, String verb, String thisCard,
			MonsterSearchCriteria m,
			SpellSearchCriteria s, 
			TrapSearchCriteria t,
			String from, String to){
		super(verb,thisCard,m,s,t,from,to);
		this.timing_clause = timing;
	}


	
	public String toString() {
		String ret = "";
		ret += "ActivationReq:";
		
		if(!timing_clause.isEmpty())
			ret += " " + timing_clause;
		

		if(!super.thisCard.isEmpty())
			ret += " " + CardConstants.THIS_CARD;
		else if(monster != null)
			ret += " " + monster.toString();
		else if(spell != null) 
			ret += " " + spell.toString();
		else if(trap != null) 
			ret += " " + trap.toString();
		
		if(!verb.isEmpty())
			ret +=  " is " + verb;
		if(!locationFrom.isEmpty()) 
			ret += " from " + locationFrom ;
		if(!locationTo.isEmpty()) 
			ret += " to " + locationTo ;
		
		
		return ret;
	}
	
}