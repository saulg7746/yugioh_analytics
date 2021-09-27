
package searchCardCriteria;


public class SpellSearchCriteria{
	
	String nameContains = "";
	String nameExact 	= "";
	String spellType	= "";
	String textContains = "";
	
	SpellSearchCriteria(){};
	public SpellSearchCriteria(String nameLike){nameContains = nameLike;};
	public SpellSearchCriteria(String nameLike, String type){nameContains = nameLike; spellType = type;};
	public SpellSearchCriteria(SpellSearchCriteria other){
		this.nameContains = other.nameContains;
		this.nameExact = other.nameExact;
		this.spellType = other.spellType;
		this.textContains =  other.textContains;
	};
	
	public void nameContains(String nameLike){
		nameContains = nameLike;
	}
	public void nameExact(String name){
		nameExact = name;
	}
	public void spellType(String type){
		spellType = type;
	}
	public void textContains(String text){
		textContains = text;
	}
	
	public String toString() {
		String ret = "";
		if(nameExact != "")
			return nameExact;
		
		ret += spellType + " \'" + nameContains + "\'";
		
		return ret;
	}
	
	
	
	
}