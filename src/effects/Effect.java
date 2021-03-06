package effects;

import Actions.Action;
import Actions.ActivationReq;
import Actions.Cost;
import Actions.Resolution;
import commons.CardConstants;

public abstract class Effect {

	int spellSpeed = -1;
	String effectType = "";
	String OPT = "";
	Cost cost = null;
	ActivationReq req = null;
	Resolution res = null;
	Action effect = null;
	
	
	Effect(){};
	Effect(Effect other){
		this.spellSpeed = other.spellSpeed;
		this.effectType = other.effectType;
		this.effect = new Action (other.effect);
		if(other.req != null)
			res = new Resolution(other.req);
		if(other.cost != null)
			cost = new Cost(other.cost);
		if(other.req != null)
			req = new ActivationReq(other.req);

	};
	Effect(ActivationReq a, Cost c,  Resolution r, String OPT){
		if(r != null)
			res = new Resolution(r);
		if(c != null)
			cost = new Cost(c);
		if(a != null)
			req = new ActivationReq(a);
		
		this.OPT = OPT;
	};
	
	String getEffectType() {
		return effectType;
	}
	int getSpeedSpell() {
		return spellSpeed;
	}
	

}
