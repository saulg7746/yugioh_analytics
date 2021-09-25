package searchCardCriteria;
import java.util.ArrayList;
import java.util.Set;

import effects.Effect;

public abstract class Monster implements Card{
	
	
	// Card Statistics and information 
	String name = "";
	int level = 0;
	int rank = 0;
	int linkRating = 0;
	String attribute = "";
	int attack = 0;
	int defense = 0;
	Set<String> type = null;	
	boolean extraDeckMonster = false;
	boolean canBeNormalSummoned = false;
	ArrayList<Effect> effects = null; // String[] will be the effect plus any condition
	
}