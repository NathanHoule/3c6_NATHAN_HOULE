package atelier2_3;

import tutoriels.atelier2_3.Accepteur;
import tutoriels.atelier2_3.animaux.Animal;
import tutoriels.atelier2_3.animaux.Chat;

public class MonAccepteur implements Accepteur {

	@Override
	public boolean accepterLesBonsChasseurs(Animal animal) {
		boolean verification;
		
		if (animal instanceof Chat) {
			if (((Chat)animal).getNombreOiseauxAttrapes() > 6) {
				verification = true;
			} else {
				verification = false;
			}
			
		} else {
			verification = false;
		}
		
		return verification;
	}

	@Override
	public boolean accepterLesChats(Animal animal) {
		
		return animal instanceof Chat;
	}

	@Override
	public boolean accepterLesJappeurs(Animal animal) {
		
		return animal.typeDeCri() == "jappement";
	}

}