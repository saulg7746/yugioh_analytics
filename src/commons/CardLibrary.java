package commons;

import searchCardCriteria.Card;
import searchCardCriteria.MainDeckMonster;
import searchCardCriteria.MonsterSearchCriteria;
import searchCardCriteria.SpellSearchCriteria;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import Actions.Action;
import effects.Effect;
import effects.OptionalEffect;

public class CardLibrary{
	
	
	public static SpellSearchCriteria MaskChangeSearch = new SpellSearchCriteria("Mask Change");
	public static MonsterSearchCriteria HeroSearch = new MonsterSearchCriteria("HERO");

	// MainDeckMonsters
	public static MainDeckMonster ElementalHEROShadowMist = new MainDeckMonster("Elemental HERO Shadow Mist", 4, CardConstants.DARK, 1000, 1500,
			new HashSet<String>(Arrays.asList(CardConstants.WARRIOR)),
			new ArrayList<Effect>(Arrays.asList(
					new OptionalEffect(	new Action("sent", "this card", "Anywhere", "GY"), 
										new Action("Add", HeroSearch , "Deck", "Hand")))));
}