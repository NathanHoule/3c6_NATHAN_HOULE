package atelier2_1;

import tutoriels.atelier2_1.Formateur;

public class MonFormateur implements Formateur {

	public static void main(String[] args) {
		
	}

	@Override
	public String formater(String valeur) {
		
		return valeur.charAt(0) + "" + valeur.length();
	}

}
