package tutoriel2_4;

import tutoriels.tutoriel2_4.Formateur;
import tutoriels.tutoriel2_4.Rouleur;

public class Vehicule implements Rouleur, Formateur {

	private double totalKilometres = 0;
	
	protected double consomationLitresParKilometre() {
		return 0.0;
	}
	
	protected String nomVehicule() {
		return "";
	}
	
	protected boolean siNomFeminin() {
		return false;
	}
	
	private double litresEssenceConsomes() {
		return totalKilometres * consomationLitresParKilometre();
	}
	
	@Override
	public String formater() {
		StringBuilder builder = new StringBuilder();
		
		if(siNomFeminin()) {
			builder.append("Ma ");
		} else {
			builder.append("Mon ");
		}
		builder.append(nomVehicule());
		builder.append(" a roul� ");
		builder.append(totalKilometres);
		builder.append(" kilom�tres et consom� ");
		builder.append(litresEssenceConsomes());
		builder.append(" litres d'essence.");
		
		return builder.toString();
	}

	@Override
	public void rouler(double kilometres) {
		totalKilometres = totalKilometres + kilometres;
	}

}
