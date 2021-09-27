package effects;
import Actions.Action;
import commons.CardConstants;

/* Trigger Effects ALWAYS have an activation requirement. Something has to happen for them to activate
 * Yu-Gi-Oh Wikia article:  https://yugioh.fandom.com/wiki/Trigger_Effect
 * 
 * 
 * 
 * 
 */
public class IgnitionEffect extends Effect {
	
	
	Action cost = null;
	
	IgnitionEffect(){
		super.spellSpeed = CardConstants.SPELL_SPEED_1;	
		super.effectType = CardConstants.IGNITION_EFFECT;
		super.effect = null;
		cost = null;
	};
	public IgnitionEffect(Action c, Action e){
		super.spellSpeed = CardConstants.SPELL_SPEED_1;	
		super.effectType = CardConstants.IGNITION_EFFECT;
		super.effect = new Action(e);
		cost = new Action(c);
	};
	
	public IgnitionEffect(boolean noCost, Action e){
		super.spellSpeed = CardConstants.SPELL_SPEED_1;	
		super.effectType = CardConstants.IGNITION_EFFECT;
		super.effect = new Action(e);
		if(noCost = true)
		{
			cost = null;
		}
	};
	
	IgnitionEffect(IgnitionEffect other){
		super.spellSpeed = CardConstants.SPELL_SPEED_1;	
		super.effectType = CardConstants.IGNITION_EFFECT;
		super.effect = new Action(other.effect);
		cost = new Action(other.cost);
	};
	
	
	public String toString() {
			
			String ret = "";
			if(cost != null) {
				ret += " ( Cost: " + cost.toString() + " ; Effect: " + super.effect.toString() + " )";
			}else {
				ret += " ( Cost: no cost ; Effect: " + super.effect.toString() + " )";
			}
			
			return ret;
		}
		
	
}
