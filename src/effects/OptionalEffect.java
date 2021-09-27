package effects;
import Actions.Action;
import commons.CardConstants;

/* 
 * 
 * 
 * 
 */
public class OptionalEffect extends TriggerEffect {

	public OptionalEffect(){
		super.spellSpeed = CardConstants.SPELL_SPEED_1;	
		super.effectType = CardConstants.TRIGGER_EFFECT;
		super.activation = null;
	};
	public OptionalEffect(Action a,  Action b){
		super.spellSpeed = CardConstants.SPELL_SPEED_1;	
		super.effectType = CardConstants.TRIGGER_EFFECT;
		super.activation = new Action(a);
		super.effect = new Action(b);

		
	};
	public OptionalEffect(OptionalEffect other ){
		super.spellSpeed = CardConstants.SPELL_SPEED_1;	
		super.effectType = CardConstants.TRIGGER_EFFECT;
		super.activation = new Action(other.activation);
		super.effect = new Action(other.effect);
	};
	
	
	public String toString() {
		
		String ret = "";
		
		ret += " ( Activation Req: " + super.activation.toString() + " ; Effect " + super.effect.toString() + " )";
		
		return ret;
	}
	
	
}
