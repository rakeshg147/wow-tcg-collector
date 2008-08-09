package common;

import java.io.File;

public class Card {
	private String set = null;
	private String id = null;
	private String name = null;
	private String faction = null;
	private String type = null;
	private String supertype = null;
	private String subtype = null;
	private String keywords = null;
	private String race = null;
	private String cclass = null;
	private String allowedrace = null;
	private String allowedtalent = null;
	private String allowedprofession = null;
	private String allowedclass = null;
	private String talent = null;
	private String professions = null;
	private String cost = null;
	private String atk = null;
	private String atktype = null;
	private String strike_cost = null;
	private String def = null;
	private String health = null;
	private String rarity = null;
	private String artistname = null;
	private String cardtext = null;
	private String flavortext = null;
	private String imagePath = null;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFaction() {
		return faction;
	}
	public void setFaction(String faction) {
		this.faction = faction;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSupertype() {
		return supertype;
	}
	public void setSupertype(String supertype) {
		this.supertype = supertype;
	}
	public String getSubtype() {
		return subtype;
	}
	public void setSubtype(String subtype) {
		this.subtype = subtype;
	}
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public String getCclass() {
		return cclass;
	}
	public void setCclass(String cclass) {
		this.cclass = cclass;
	}
	public String getAllowedrace() {
		return allowedrace;
	}
	public void setAllowedrace(String allowedrace) {
		this.allowedrace = allowedrace;
	}
	public String getAllowedtalent() {
		return allowedtalent;
	}
	public void setAllowedtalent(String allowedtalent) {
		this.allowedtalent = allowedtalent;
	}
	public String getAllowedprofession() {
		return allowedprofession;
	}
	public void setAllowedprofession(String allowedprofession) {
		this.allowedprofession = allowedprofession;
	}
	public String getAllowedclass() {
		return allowedclass;
	}
	public void setAllowedclass(String allowedclass) {
		this.allowedclass = allowedclass;
	}
	public String getTalent() {
		return talent;
	}
	public void setTalent(String talent) {
		this.talent = talent;
	}
	public String getProfessions() {
		return professions;
	}
	public void setProfessions(String professions) {
		this.professions = professions;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	public String getAtk() {
		return atk;
	}
	public void setAtk(String atk) {
		this.atk = atk;
	}
	public String getAtktype() {
		return atktype;
	}
	public void setAtktype(String atktype) {
		this.atktype = atktype;
	}
	public String getStrike_cost() {
		return strike_cost;
	}
	public void setStrike_cost(String strike_cost) {
		this.strike_cost = strike_cost;
	}
	public String getDef() {
		return def;
	}
	public void setDef(String def) {
		this.def = def;
	}
	public String getHealth() {
		return health;
	}
	public void setHealth(String health) {
		this.health = health;
	}
	public String getRarity() {
		return rarity;
	}
	public void setRarity(String rarity) {
		this.rarity = rarity;
	}
	public String getArtistname() {
		return artistname;
	}
	public void setArtistname(String artistname) {
		this.artistname = artistname;
	}
	public String getCardtext() {
		return cardtext;
	}
	public void setCardtext(String cardtext) {
		this.cardtext = cardtext;
	}
	public String getFlavortext() {
		return flavortext;
	}
	public void setFlavortext(String flavortext) {
		this.flavortext = flavortext;
	}

	public String getImagePath() {
		if (imagePath == null) {
			// build image path
			String tmpPath = "img/" + set + "/" + id + ".jpg";         //"img/MoL/Mol-129.jpg"
			File imageFile = new File(tmpPath);
			if (imageFile.isFile()){
				imagePath = tmpPath;
			}
			else {
				imagePath = Const.backImage;
				Logs.logger.info("Image not existing: " + tmpPath);
			}
		}
		return imagePath;
	}
	public String getSet() {
		return set;
	}
	public void setSet(String set) {
		this.set = set;
	}
}
