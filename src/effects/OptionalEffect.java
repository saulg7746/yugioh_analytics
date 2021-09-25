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
		System.out.println("OptionalEffect(a,b) : I was invoked");

		
	};
	public OptionalEffect(OptionalEffect other ){
		super.spellSpeed = CardConstants.SPELL_SPEED_1;	
		super.effectType = CardConstants.TRIGGER_EFFECT;
		super.activation = new Action(other.activation);
		super.effect = new Action(other.effect);
		System.out.println("OptionalEffect(copy) : I was invoked");
	};
	
	
	public String toString() {
		
		String ret = "";
		
		ret += " ( Activation Req: " + super.activation.toString() + " ; Effect " + super.effect.toString() + " )";
		
		return ret;
	}
	
	
}
