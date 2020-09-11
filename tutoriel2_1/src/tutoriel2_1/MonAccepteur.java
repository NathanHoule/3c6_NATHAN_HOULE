package tutoriel2_1;

import tutoriels.tutoriel2_1.Accepteur;

public class MonAccepteur implements Accepteur {

	public static void main(String[] args ) {
		
	}
	
	@Override
	public boolean accepter(int valeur) {
		return valeur >= 10 && valeur <= 99;
	}

}
