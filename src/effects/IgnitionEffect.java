package effects;
import Actions.Action;
import Actions.ActivationReq;
import Actions.Cost;
import Actions.Resolution;
import commons.CardConstants;

/* Trigger Effects ALWAYS have an activation requirement. Something has to happen for them to activate
 * Yu-Gi-Oh Wikia article:  https://yugioh.fandom.com/wiki/Trigger_Effect
 * 
 * 
 * 
 * 
 */
public class IgnitionEffect extends Effect {
	
	
	//Action cost = null;
	
	IgnitionEffect(){
		super.spellSpeed = CardConstants.SPELL_SPEED_1;	
		super.effectType = CardConstants.IGNITION_EFFECT;
		super.res = null;
		super.cost = null;
		super.req = null;
	};
	
	public IgnitionEffect(ActivationReq a, Cost c, Resolution r){
		super(a,c,r);
		super.spellSpeed = CardConstants.SPELL_SPEED_1;	
		super.effectType = CardConstants.IGNITION_EFFECT;
	};
	
	IgnitionEffect(IgnitionEffect other){
		super(other);
	};
	
	
	public String toString() {
			
			String ret = super.getEffectType() + ": ";
			if(cost != null) {
				ret += " ( " + cost.toString() + " ; " + super.res.toString() + " )";
			}else {
				ret += " ( Cost: no cost ; " + super.res.toString() + " )";
			}
			
			return ret;
		}
		
	
}
