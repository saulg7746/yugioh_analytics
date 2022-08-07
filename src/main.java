import java.util.*;

import searchCardCriteria.MainDeckMonster;
import searchCardCriteria.MonsterSearchCriteria;
import commons.CardLibrary;


public class main {

	
	public static void main(String args[]) {
		System.out.println("Hello World!");
		
		MonsterSearchCriteria mon = new MonsterSearchCriteria("Stratos");
		mon.nameExact("Elemental HERO Stratos");
		MonsterSearchCriteria mon1 = new MonsterSearchCriteria(mon);
		System.out.println(mon1.getNameContains() + " " + mon1.getNameExact());
//		mon1.setAttribute("light");
//		mon.setAttribute("DARK");
//
//		System.out.println(mon.getNameContains() + " " + mon.getNameExact() + " " + mon.getAttribute());
//		System.out.println(mon1.getNameContains() + " " + mon1.getNameExact() + " " + mon1.getAttribute());
		
		MainDeckMonster mist = new MainDeckMonster(CardLibrary.ElementalHEROShadowMist);
		MainDeckMonster faris = new MainDeckMonster(CardLibrary.VisionHEROFaris);
		
		System.out.println(mist.toString());
		System.out.println(faris.toString());
		
	}	
}
