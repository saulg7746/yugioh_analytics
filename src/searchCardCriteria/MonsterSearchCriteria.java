package searchCardCriteria;



public class MonsterSearchCriteria{
	
	String nameContains = ""; 	// Example: "Dragunity", "Drytron", "Shaddoll"
	String nameExact 	= "";	// Example: "Eva"
	String type 		= "";
	String attribute 	= "";
	
	boolean levelRestrictionEqualTo 		= false;
	boolean levelRestrictionLess			= false;
	boolean levelRestrictionGreater 		= false;
	boolean levelRestrictionEqualOrLower 	= false;
	boolean levelRestrictionEqualOrGreater 	= false;
	int lvl = -1;
	
	boolean tuner = false;
	
	public MonsterSearchCriteria(){};
	public MonsterSearchCriteria(String nameLike){ nameContains = nameLike;};
	public MonsterSearchCriteria(MonsterSearchCriteria other){
		this.nameContains = other.nameContains;
		this.nameExact 	= other.nameExact;	// Example: "Eva"
		this.type 		= other.type;
		this.attribute 	= other.attribute;
		
		this.levelRestrictionEqualTo 			= other.levelRestrictionEqualTo;
		this.levelRestrictionLess				= other.levelRestrictionLess;
		this.levelRestrictionGreater 			= other.levelRestrictionGreater;
		this.levelRestrictionEqualOrLower 		= other.levelRestrictionEqualOrLower;
		this.levelRestrictionEqualOrGreater 	= other.levelRestrictionEqualOrGreater;
		this.lvl = other.lvl;
		
		this.tuner = other.tuner;
	}

	
	public void nameContains(String name){
		nameContains = name;
	}
	public void nameExact(String name){
		nameExact = name;
	}
	public void setType(String type){
		this.type = type;
	}
	public void setAttribute(String att){
		attribute = att;
	}
	public void setLevelRestriction(String sign, int num){
		if(sign == "=")
			levelRestrictionEqualTo = true;
		else if (sign == "<")
			levelRestrictionLess = true;
		else if (sign == ">")
			levelRestrictionGreater = true;
		else if (sign == "<=")
			levelRestrictionEqualOrLower = true;
		else if (sign == ">=")
			levelRestrictionEqualOrGreater = true;
		
		lvl = num;
	}
	
	public String getNameContains(){
		return nameContains;
	}
	public String getNameExact(){
		return nameExact;
	}
	public String getType(){
		return type;
	}
	public String getAttribute(){
		return attribute;
	}
	
	public String toString(){
		return nameContains;
	}
	
	
	
	
}