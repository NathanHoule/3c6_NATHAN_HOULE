package tutoriel2_5;

import tutoriels.tutoriel2_5.Tutoriel2_5;

public class MonTutoriel2_5 extends Tutoriel2_5 {

	public static void main(String[] args) {
		new MonTutoriel2_5().valider();
	}
	
	@Override
	public Object fournirAuto() {
		// TODO Auto-generated method stub
		return new Auto();
	}

	@Override
	public Object fournirCamion() {
		// TODO Auto-generated method stub
		return new Camion();
	}

	@Override
	public Object fournirMobilette() {
		// TODO Auto-generated method stub
		return new Mobilette();
	}

	@Override
	public Object fournirMoto() {
		// TODO Auto-generated method stub
		return new Moto();
	}

}
