# What will we need to handle? #

## What is a WOW cardset? ##

  * cardset id (ex: number or identifiant like HoA)
  * name (ex: Heroes of Azeroth)
  * cards count (ex: 350)
  * date (20070825) (useful to sort choice lists)

## What is a WOW card? ##

  * card id (ex: TDP-105 or 1105 ...)
  * card name (ex: Eye of Kilrogg)
  * race (ex: Human, Orc, ...)
  * class (ex: Warrior, Mage, ...)
  * talent (Feral, Fire, ...)
  * profession (Mining, Tailoring, ...)
  * faction (ex: Alliance, Horde, Neutral)
  * type (ex: Ability, Ally, Ally Token, Armor, Blood, Cube, Event, Hero, Item, Lair, Quest, Rune, Token, Weapon)
  * supertype (Instant, Two-Handed)
  * subtype (ex: Fire, Axe, Demon, Felguard, ...)
  * specialization (ex: Talent, Talent Curse, Demon Talent, ...)
  * keywords (ex: Protector, Elusive, Untargetable, Ferocity, Long-Range, Stealth)
  * rules text (ex: Look at target opponent's hand and choose a card. Remove that card from the game.)
  * flavor text (ex: Speaking never seemed like a luxury before...)
  * illustrator (ex: Ron Spencer)
  * cost (ex: 0, 1, 2, ...)
  * health (ex: 0, 1, 2, ...)
  * atk (ex: 0, 1, 2, ...)
  * atk type (melee, ranged, fire, frost, arcane, nature, holy, shadow)
  * strike cost (ex: 0, 1, 2, ...)
  * def (ex: 0, 1, 2, ...)
  * card rarity (ex: Common, Uncommon, Rare, Epic)
  * release
    * HfI : Hunt for Illidan
    * SoB : Servants of the Betrayer
    * ML : Magtheridon's Lair
    * FWV : Feast of Winter Veil 2007
    * MoL : March of the Legion
    * CRP : Crafting Redemption Program
    * FoO : Fires of Outland
    * MC : Molten Core
    * TDP : Through the Dark Portal
    * BCP : Burning Crusade Promos
    * OL : Onyxia's Lair
    * HoA : Heroes of Azeroth
Restrictions:
  * race (ex: Human, Orc, ...)
  * class (ex: Warrior, Mage, ...)
  * talent (Feral, Fire, ...)
  * profession (Mining, Tailoring, ...)
  * in-play type (ex: Pet, Melee, Aura, Unlimited, Unique, Shoulders, Wraist, Ring, AMulet...)

# XML model #

```
<cardset id="TDP">
  <name>Through the Dark Portal</name>
  <date>20070411</date>
  <cards>
  ...
    <card id="105">
      <name>Eye of Kilrogg</name>
      <rarity>Common</rarity>
      <cost>2</cost>
      <faction>Neutral</faction>
      <type>Ability</type>
      <subtype>Demonology</subtype>
      <rulesText>Look at target opponent's hand and choose a card. Remove that card from the game.</rulesText>
      <flavorText>The Eye was named in honor of Kilrogg Deadeye, chieftain of the Bleeding Hollow clan.</flavorText>
      <illustrator>Clint Langley</illustrator>
      <restrictions>
        <class>Warlock</class>
      </restrictions>
    </card>
    ...
  <cards>
<cardset>
```



---


  * id of the card:
    * example1:
```
<cardset name="Fires of Outland" id="OUTLAND">
    <card id="6" 
          health="28"
          ... > 
    </card>
</cardset>

image: FOO-6.jpg or outland-6.jpg
```
    * Example2: The id number will contain information concerning the card number, the extension (Azeroth, Dark Portal ...) AND will be the name of the associated .jpg:
```
<cardset name="Fires of Outland" id="OUTLAND">
    <card id="FOO-6" 
          health="28"
          ... > 
    </card>
</cardset>
image: FOO-6.jpg
```

For details on cardsets names and shortnames see this [googledocs spreadsheet](http://spreadsheets.google.com/ccc?key=pJfJ3W0ysXywzKuncj23XBg)