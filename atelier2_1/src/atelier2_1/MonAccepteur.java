package atelier2_1;

import tutoriels.atelier2_1.Accepteur;

public class MonAccepteur implements Accepteur {

	public static void main(String[] args) {
		
	}

	@Override
	public boolean accepter(String valeur) {
		boolean validation = true;
		char premiereLettre = valeur.charAt(0);
		
		for (int i = 1; i < valeur.length(); i++) {
			if (valeur.charAt(i) != premiereLettre) {
				validation = false;
				break;
			}
		}
		
		return validation;
	}

}
