
package searchCardCriteria;


public class TrapSearchCriteria{
	
	String nameContains = "";
	String nameExact 	= "";
	String trapType	= "";
	String textContains = "";
	
	TrapSearchCriteria(){};
	TrapSearchCriteria(String nameLike){nameContains = nameLike;};
	public TrapSearchCriteria(TrapSearchCriteria other){
		this.nameContains = other.nameContains;
		this.nameExact = other.nameExact;
		this.trapType = other.trapType;
		this.textContains =  other.textContains;
	};
	
	public void nameContains(String nameLike){
		nameContains = nameLike;
	}
	public void nameExact(String name){
		nameExact = name;
	}
	public void TrapType(String type){
		trapType = type;
	}
	public void textContains(String text){
		textContains = text;
	}
	
	
	
	
}