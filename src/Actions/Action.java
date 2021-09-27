package Actions;
import commons.CardConstants;
import searchCardCriteria.Card;
import searchCardCriteria.MainDeckMonster;
import searchCardCriteria.Monster;
import searchCardCriteria.MonsterSearchCriteria;
import searchCardCriteria.SpellSearchCriteria;
import searchCardCriteria.TrapSearchCriteria;

/* An Action can be something like a Discard, Special Summon, Normal Summon, or anything that 
 * would change the GameState
 * 
 * 
 * 
 */
public class Action {
	
	String 	verb 			= ""; 	// Example Discard
	String 	locationFrom 	= "";	// Example Hand
	String 	LocationTo 		= "";	// Example GY (Or anywhere its marked to go , more details on this later)
	
	Card 	card 						= null;	// Example "Elemental HERO Shadow Mist"
	SpellSearchCriteria 	spell 		= null;
	MonsterSearchCriteria	monster 	= null;
	String 					thisCard 	= "";
	TrapSearchCriteria		trap 		= null;

	
	Action(){};
	// This will have to do for now, I would rather have like a copy constructor and no like pointer to c
	Action(String verb, Card c, String from, String to){
		this.verb = verb;
		card = c;
	}
	public Action(String verb, SpellSearchCriteria c, String from, String to){
		this.verb = verb;
		this.spell = new SpellSearchCriteria(c);
		this.locationFrom = from;
		this.LocationTo = to;
	}
	public Action(String verb, MonsterSearchCriteria c, String from, String to){
		this.verb = verb;
		this.monster = new MonsterSearchCriteria(c);
		this.locationFrom = from;
		this.LocationTo = to;
	}
	public Action(String verb, String thisCard, String from, String to){
		this.verb = verb;
		this.thisCard  = thisCard;
		this.locationFrom = from;
		this.LocationTo = to;
	}
	public Action(String verb, String from, String to){
		this.verb = verb;
		card = null;
		this.locationFrom = from;
		this.LocationTo = to;
	}
	
	public Action(Action other){
		this.verb = other.verb;
		this.locationFrom = other.locationFrom;
		this.LocationTo = other.LocationTo;
		this.thisCard = other.thisCard;
		if(other.spell != null) {
			this.spell = new SpellSearchCriteria(other.spell);
		}else if(other.monster != null) {
			this.monster = new MonsterSearchCriteria(other.monster);
		}
		
	}

	// Will try to return -----> "Discard 'Elemental Hero Shadow Mist' from Hand to GY"
	public String getAction() {
		String ret = "";
		ret += verb + " ";
		//ret += Card.name;
		ret += " from " + locationFrom + " to " + LocationTo;
		
		return ret;
	}
	
	public String toString() {
		String ret = "";
		ret += verb + " ";
		
		if(locationFrom != "" && locationFrom == CardConstants.ANYWHERE) {
			return "If " + thisCard + " is "+ verb + " to the " + LocationTo;
		}else if(verb == CardConstants.SPECIAL_SUMMONED && thisCard == CardConstants.THIS_CARD){
			return "If " + thisCard + " is " + verb; 
		}else if (LocationTo == "" && monster != null){
			return verb + " 1 " + monster.toString() + " monster from " + locationFrom;
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
