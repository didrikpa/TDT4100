package interfaces;

import java.util.Comparator;

public class NamedComparator implements Comparator<Named>{

	public int compare(Named named1, Named named2) {
		if(!(named1.getFamilyName().equals(named2.getFamilyName()))){
			int diff = named1.getFamilyName().compareTo(named2.getFamilyName());
			if(diff < 0){
				return -1;
			}else if(diff > 0){
				return 1;
			}
		}
		else if(named1.getFamilyName().equals(named2.getFamilyName())){
			if (!(named1.getGivenName().equals(named2.getGivenName()))){
				int diff = named1.getGivenName().compareTo(named2.getGivenName());
				if(diff < 0){
					return -1;
				}else if(diff > 0){
					return 1;
				}else{
				}
			}
		}
		return 0;
	}
}
