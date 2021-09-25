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
public abstract class TriggerEffect extends Effect {
	
	
	Action activation = null;
	Action effect = null;
	
	TriggerEffect(){
		super.spellSpeed = CardConstants.SPELL_SPEED_1;	
		super.effectType = CardConstants.TRIGGER_EFFECT;
		super.effect = null;
		System.out.println("Trigger(default) : I was invoked");

	};
	TriggerEffect(TriggerEffect other){
		super.spellSpeed = CardConstants.SPELL_SPEED_1;	
		super.effectType = CardConstants.TRIGGER_EFFECT;
		super.effect = new Action(other.effect);
		System.out.println("TriggerEffect(copy) : I was invoked");
	};
	
	
	
}
