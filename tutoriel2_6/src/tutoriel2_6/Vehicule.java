package tutoriel2_6;

public abstract class Vehicule implements Rouleur, Formateur {

	private double totalKilometres = 0;
	
	protected abstract double consomationLitresParKilometre();
	
	protected abstract String nomVehicule();
	
	protected abstract boolean siNomFeminin();
	
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
	
	public Vehicule(double totalKilometres) {
		this.totalKilometres = totalKilometres;
	}
	
}
