#Description of the project

# Introduction #

UDE - wow - tcg
Codenamed "Eye of Kilrogg"


# Details #

Features:
  * **Manage whole cards** (search, filter, ...)
  * **Manage own collection** (cards owned, cards wanted, cards tradable...)
  * **Deck construction** (including restriction and exception)
  * **Trading mechanism** (Export, online capabilities ???)

Database creation:
  * Using several xml files, one per release (Crafted item or promotional cards tbd)
  * Squeleton of the xml file:
```
   <card id=""
        name=""
	faction=""
	type=""
	supertype=""
	subtype=""
	keywords=""
	race=""
	class=""
	allowedrace=""
	allowedtalent=""
	allowedprofession=""
	allowedclass=""
	talent=""
	professions=""
	cost=""
	atk=""
	atktype=""
	strike_cost=""
	def=""
	health=""
	rarity=""
	artistname="">
	<cardtext> </cardtext>
	<flavortext> </flavortext>
   </card>

```