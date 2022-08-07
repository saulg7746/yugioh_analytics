package searchCardCriteria;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import commons.CardConstants;
import effects.Effect;

public abstract class Monster implements Card{
	
	
	// Card Statistics and information 
	String name = "";
	String attribute = "";
	int level = 0;
	int rank = 0;
	int linkRating = 0;
	int attack = 0;
	int defense = 0;
	Set<String> type = null;	
	String location = "";
	String queuedLocation = "";
	String tuner = CardConstants.NON_TUNER;
	ArrayList<Effect> effects = null; // String[] will be the effect plus any condition
	boolean extraDeckMonster = false;
	boolean canBeNormalSummoned = false;
	boolean SOPT = false;
	boolean HOPT = false;
	boolean used = false;
	String OPT = "";
	String effect_rstr = "";
	
	// Monster(String name, int lvl, String attr, int atk, int def, Set<String> type, ArrayList<Effect> effs, String rstr)
	public Monster(String name, int lvl, String attr, int atk, int def, Set<String> type, ArrayList<Effect> effs, String rstr) {
		this.name = name;
		this.level = lvl;
		this.rank = -1;
		this.attribute = attr;
		this.attack = atk;
		this.defense = def;
		this.type = new HashSet<String>(type);
		this.effects = new ArrayList<Effect>(effs);
		this.effect_rstr = rstr;
		if(lvl < 5 )
			this.canBeNormalSummoned = true;
	}
	public Monster(Monster m) {
		this.name = m.name;
		this.level = m.level;
		this.rank = m.rank;
		this.attribute = m.attribute;
		this.attack = m.attack;
		this.defense = m.defense;
		if(m.type != null)
			this.type = new HashSet<String>(m.type);
		if(m.effects != null)
			this.effects = new ArrayList<Effect>(m.effects);
		this.OPT = m.OPT;
		this.used = m.used; 
		this.canBeNormalSummoned = m.canBeNormalSummoned;
		
	}
}