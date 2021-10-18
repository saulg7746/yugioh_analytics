package commons;

import searchCardCriteria.MainDeckMonster;
import searchCardCriteria.MonsterSearchCriteria;
import searchCardCriteria.SpellSearchCriteria;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import Actions.ActivationReq;
import Actions.Cost;
import Actions.Resolution;
import effects.Effect;
import effects.IgnitionEffect;
import effects.OptionalEffect;

public class CardLibrary{
	
	
	public static SpellSearchCriteria MaskChangeSearch = new SpellSearchCriteria("Change", CardConstants.QUICK_PLAY);
	public static MonsterSearchCriteria HeroSearch = new MonsterSearchCriteria("HERO");
	public static MonsterSearchCriteria VisionHeroSearch = new MonsterSearchCriteria("Vision HERO");


	// MainDeckMonsters
	public static final MainDeckMonster ElementalHEROShadowMist = new MainDeckMonster("Elemental HERO Shadow Mist", 4, CardConstants.DARK, 1000, 1500,
			new HashSet<String>(Arrays.asList(CardConstants.WARRIOR)),
			new ArrayList<Effect>(Arrays.asList(
					new OptionalEffect(	new ActivationReq(CardConstants.IF, CardConstants.SENT, CardConstants.THIS_CARD, null,null,null,"", CardConstants.GY),
										null, 
										new Resolution(1, CardConstants.ADD, "", HeroSearch,null,null, CardConstants.DECK, CardConstants.HAND)),
					new OptionalEffect(	new ActivationReq(CardConstants.IF, CardConstants.SPECIAL_SUMMONED, CardConstants.THIS_CARD, null,null,null,"", ""),
										null, 
										new Resolution(1, CardConstants.ADD, "", null, MaskChangeSearch,null, CardConstants.DECK, CardConstants.HAND)))), false, true);

	public static final MainDeckMonster VisionHEROFaris = new MainDeckMonster("Vision HERO Faris", 5, CardConstants.DARK, 1600, 1800,
			new HashSet<String>(Arrays.asList(CardConstants.WARRIOR)),
			new ArrayList<Effect>(Arrays.asList(
					new IgnitionEffect(	null, 
										new Cost(1,CardConstants.EXC, CardConstants.DISCARD, "", HeroSearch, null,null, CardConstants.HAND, ""),
										new Resolution(0,CardConstants.SPECIAL_SUMMON, CardConstants.THIS_CARD , null,null,null, CardConstants.HAND, CardConstants.FIELD)),
					new OptionalEffect(	new ActivationReq(CardConstants.IF, CardConstants.SPECIAL_SUMMONED, CardConstants.THIS_CARD, null,null,null,"", ""), 
										null,
										new Resolution(1, CardConstants.PLACE, "", VisionHeroSearch,null,null, CardConstants.DECK, CardConstants.FIELD)))), false, true);

}