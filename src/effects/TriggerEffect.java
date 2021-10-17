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
public abstract class TriggerEffect extends Effect {
	
	TriggerEffect(){
		super.spellSpeed = CardConstants.SPELL_SPEED_1;	
		super.effectType = CardConstants.TRIGGER_EFFECT;
		super.req = null;
		super.res = null;
		super.cost = null;
	};
	TriggerEffect(TriggerEffect other){
		super(other);
	};
	TriggerEffect(Cost c,  Resolution r, ActivationReq a){
		super(c,r,a);
	};
	
	
	
	
	
	
}
