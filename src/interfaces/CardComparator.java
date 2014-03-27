package interfaces;

import java.util.Comparator;

public class CardComparator implements Comparator<Card> {
	
	private String fargeRekkefolge  = "CDHS";
	private boolean essHoyest;
	private char trumf;
	
	
	public CardComparator(boolean essHoyest, char trumf){
		this.essHoyest = essHoyest;
		this.trumf = trumf;
		
	}

	public int compare(Card card1, Card card2) {
		int farge1 = fargeRekkefolge.indexOf(card1.getSuit());
		int farge2 = fargeRekkefolge.indexOf(card2.getSuit());
		if(card1.getSuit() == trumf){
			farge1 = fargeRekkefolge.length();
		}
		if(card2.getSuit() == trumf){
			farge2 = fargeRekkefolge.length();
		}
		int diff = farge1 - farge2;
		if(diff == 0){
			int face1 = card1.getFace();
			int face2 = card2.getFace();
			if(essHoyest){
				if (face1 == 1){
					face1 = 14;
				}
				if(face2 == 1){
					face2 = 14;
				}
			}
			diff = face1 - face2;
		}
		return diff;
	}

}
