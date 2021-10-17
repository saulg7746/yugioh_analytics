package effects;
import Actions.Action;
import Actions.ActivationReq;
import Actions.Cost;
import Actions.Resolution;
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
	};
	public OptionalEffect(Cost c,  Resolution r, ActivationReq a){
		super(c,r,a);
		super.spellSpeed = CardConstants.SPELL_SPEED_1;	
		super.effectType = CardConstants.TRIGGER_EFFECT;

		
	};
	public OptionalEffect(OptionalEffect other ){
		super(other);
	};
	
	
	public String toString() {
		
		String ret = super.getEffectType() + ": ";
		if(req != null)
			ret += " ( " + super.req.toString() + " ; " + super.res.toString() + " )";
		else if (cost != null)
			ret += " ( " + super.cost.toString() + " ; " + super.res.toString() + " )";

		
		return ret;
	}
	
	
}
