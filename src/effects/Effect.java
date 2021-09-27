package effects;

import Actions.Action;
import commons.CardConstants;

public abstract class Effect {

	int spellSpeed = -1;
	String effectType = "";
	
	Action effect = null;
	
	
	Effect(){};
	Effect(Effect other){
		
		this.spellSpeed = other.spellSpeed;
		this.effectType = other.effectType;
		this.effect = new Action (other.effect);
	};
	
	

}
