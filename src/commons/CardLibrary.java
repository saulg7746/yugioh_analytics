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
					new OptionalEffect(	null, 
										new Resolution(1, CardConstants.ADD, HeroSearch , CardConstants.DECK, CardConstants.HAND), 
										new ActivationReq(CardConstants.IF, CardConstants.SENT, CardConstants.THIS_CARD, "", CardConstants.GY)),
					new OptionalEffect(	null, 
										new Resolution(1, CardConstants.ADD, MaskChangeSearch , CardConstants.DECK, CardConstants.HAND),
										new ActivationReq(CardConstants.IF, CardConstants.SPECIAL_SUMMONED, CardConstants.THIS_CARD, "", "")))), false, true);

	public static final MainDeckMonster VisionHEROFaris = new MainDeckMonster("Vision HERO Faris", 5, CardConstants.DARK, 1600, 1800,
			new HashSet<String>(Arrays.asList(CardConstants.WARRIOR)),
			new ArrayList<Effect>(Arrays.asList(
					new IgnitionEffect(	new Cost(CardConstants.DISCARD, 1, HeroSearch, CardConstants.HAND, "", CardConstants.EXC), 
										new Resolution(CardConstants.SPECIAL_SUMMON, CardConstants.THIS_CARD , CardConstants.HAND, CardConstants.FIELD),
										null),
					new OptionalEffect(	null, 
										new Resolution(1, CardConstants.PLACE, VisionHeroSearch , CardConstants.DECK, CardConstants.FIELD),
										new ActivationReq(CardConstants.IF, CardConstants.SPECIAL_SUMMONED, CardConstants.THIS_CARD, "", "")))), false, true);

}