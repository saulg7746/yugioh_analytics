package searchCardCriteria;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Set;

import effects.Effect;




public class MainDeckMonster extends Monster{
	
	
	
	public MainDeckMonster(String name, int lvl, String attr, int atk, int def, Set<String> type, ArrayList<Effect> effs) {
		this.name = name;
		this.level = lvl;
		this.rank = -1;
		this.attribute = attr;
		this.attack = atk;
		this.defense = def;
		this.type = new HashSet<String>(type);
		this.effects = new ArrayList<Effect>(effs);
	}
	
	public MainDeckMonster(MainDeckMonster m)
	{
		this.name = m.name;
		this.level = m.level;
		this.rank = m.rank;
		this.attribute = m.attribute;
		this.attack = m.attack;
		this.defense = m.defense;
		this.type = new HashSet<String>(m.type);	
		this.extraDeckMonster = false;
		this.canBeNormalSummoned = false;
		this.effects = new ArrayList<Effect>(m.effects); // String[] will be the effect plus any condition
	}
	
	public String toString() {
		String ret = "";
		
		ret += name + " Effects: " + effects.toString();
		
		return ret;
	}
	

}
