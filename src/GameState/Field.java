package GameState;

import commons.CardConstants;
import searchCardCriteria.MainDeckMonster;
import searchCardCriteria.Monster;

public class Field{
	
	
	Monster MonsterZone1 = null;
	Monster MonsterZone2 = null;
	Monster MonsterZone3 = null;
	Monster MonsterZone4 = null;
	Monster MonsterZone5 = null;
	Monster extraMonsterZone = null;
	
	
	String sentTo = CardConstants.GY;
	boolean normalSummoned = false;
	//Going to need a spot for field Spell
	
	Field(){};

	//TODO (normal summon a monster buy using the copy constructor to the specified zone)
	public static void normalSummon(Monster mon, int zone){
	
	}
	
	
	
	
	
}