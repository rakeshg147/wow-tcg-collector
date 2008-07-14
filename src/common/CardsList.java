package common;

import java.util.ArrayList;

public class CardsList {
	private static ArrayList<Card> cards=new ArrayList<Card>();
	private static Object[][] noDatas={{"No Card found"}};

	public static ArrayList<Card> getCards() {
		return cards;
	}
	
	public static Card getCardbyId(String id) {
		if (cards==null) {return null;}
		if (cards.size()==0) {return null;}
		
		for (int i=0 ; i < cards.size(); i++){
			if (cards.get(i).getId().equals(id)) {
				return cards.get(i);}
		}
		return null;
	}

	public static int length(){
		if (cards==null){return 0;}
		
		return cards.size();
	}
	

	
	public static void add(Card card) {
		cards.add(card);
		
	}

	public static Card getCardByOrder(int index) {
		return cards.get(index);
	}
}
