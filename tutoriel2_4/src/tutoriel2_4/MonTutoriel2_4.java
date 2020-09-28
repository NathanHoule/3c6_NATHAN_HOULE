package tutoriel2_4;

import tutoriels.tutoriel2_4.Rouleur;
import tutoriels.tutoriel2_4.Tutoriel2_4;

public class MonTutoriel2_4 extends Tutoriel2_4 {

	public static void main(String[] args) {
		new MonTutoriel2_4().valider();
	}

	@Override
	public Rouleur creerAuto() {
		
		return new Auto();
	}

	@Override
	public Rouleur creerCamion() {
		
		return new Camion();
	}

	@Override
	public Rouleur creerMobilette() {
		
		return new Mobilette();
	}

	@Override
	public Rouleur creerMoto() {
		
		return new Moto();
	}

}
