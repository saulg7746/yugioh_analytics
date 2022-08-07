package searchCardCriteria;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Set;

import effects.Effect;




public class MainDeckMonster extends Monster{
	
	
	
	public MainDeckMonster(String name, int lvl, String attr, int atk, int def, Set<String> type, ArrayList<Effect> effs,String rstr) {
		super(name,lvl,attr,atk,def,type,effs,rstr);
	}
	
	public MainDeckMonster(MainDeckMonster m)
	{
		super(m);
	}
	
	public String getLocation() {
		return this.location;
	}
	public void setLocation(String newLocation) {
		this.location = newLocation;
	}
	public String getQueuedLocation() {
		return this.queuedLocation;
	}
	public void setQueuedLocation(String newQueuedLocation) {
		this.queuedLocation = newQueuedLocation;
	}
	
	public String toString() {
		String ret = "";
		
		ret += name + " Effects: " + effects.toString();
		
		return ret;
	}
	

}
