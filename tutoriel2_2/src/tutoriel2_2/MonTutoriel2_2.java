package tutoriel2_2;

import tutoriels.tutoriel2_2.Tutoriel2_2;

public class MonTutoriel2_2 extends Tutoriel2_2 {

	public static void main(String[] args) {
		new MonTutoriel2_2().valider();
	}

	@Override
	public Object fournirAuto() {
		
		return new Auto();
	}

	@Override
	public Object fournirCamion() {
		
		return new Camion();
	}

	@Override
	public Object fournirFourgonnette() {
		
		return new Fourgonnette();
	}

	@Override
	public Object fournirMobilette() {
		
		return new Mobilette();
	}

	@Override
	public Object fournirMoto() {
		
		return new Moto();
	}

}
