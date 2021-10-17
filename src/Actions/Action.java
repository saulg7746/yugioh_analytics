package Actions;
import commons.CardConstants;
import searchCardCriteria.Card;
import searchCardCriteria.MainDeckMonster;
import searchCardCriteria.Monster;
import searchCardCriteria.MonsterSearchCriteria;
import searchCardCriteria.SpellSearchCriteria;
import searchCardCriteria.TrapSearchCriteria;

/* An Action will now be used as something that can advance the gamestate
 * For example:
 *  Discard Elemental HERO Shadow Mist
 *  Add Mask Change from Deck to Hand 
 * 
 * It will NOT BE:
 *  If this card is Special Summoned 		- typed of effects (Activation req)
 *  Discard 1 HERO monster from your Hand 	- type of effects (Cost) 
 *  
 *  
 *  Notice that the cost is more-so used for ignition effects and will be used to start off the BFS tree 
 * 
 * 
 */
public class Action {
	
	String 	verb 			= ""; 	// Example Discard
	String 	locationFrom 	= "";	// Example Hand
	String 	locationTo 		= "";	// Example GY (Or anywhere its marked to go , more details on this later)
	
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
		this.locationTo = to;
	}
	public Action(String verb, MonsterSearchCriteria c, String from, String to){
		this.verb = verb;
		this.monster = new MonsterSearchCriteria(c);
		this.locationFrom = from;
		this.locationTo = to;
	}
	public Action(String verb, String thisCard, String from, String to){
		this.verb = verb;
		this.thisCard  = thisCard;
		this.locationFrom = from;
		this.locationTo = to;
	}
	public Action(String verb, String from, String to){
		this.verb = verb;
		card = null;
		this.locationFrom = from;
		this.locationTo = to;
	}
	
	public Action(Action other){
		this.verb = other.verb;
		this.locationFrom = other.locationFrom;
		this.locationTo = other.locationTo;
		this.thisCard = other.thisCard;
		if(other.spell != null) {
			this.spell = new SpellSearchCriteria(other.spell);
		}else if(other.monster != null) {
			this.monster = new MonsterSearchCriteria(other.monster);
		}
		
	}
	
	public String toString() {
		String ret = "";
		if(!verb.isEmpty())
			ret += verb + " ";
		
		if(monster != null)
			ret += monster.toString();
		else if(spell != null) 
			ret += spell.toString();
		else if(trap != null) 
			ret += trap.toString();
		
		if(!locationFrom.isEmpty()) 
			ret += " from " + locationFrom ;
		if(!locationTo.isEmpty()) 
			ret += " to " + locationTo + " ";
		
		
		
		return ret;
	}

	
	
	
}
