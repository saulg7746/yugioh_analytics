package searchCardCriteria;
import java.util.ArrayList;
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
}