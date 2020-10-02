package tutoriel2_6;

public class Auto extends Vehicule {

	public Auto(double totalKilometres) {
		super(totalKilometres);
		
	}

	@Override
	protected double consomationLitresParKilometre() {
		return 8.0;
	}
	
	@Override
	protected boolean siNomFeminin() {
		return false;
	}
	
	@Override
	protected String nomVehicule() {
		return "auto";
	}
	
	@Override
	public String formater() {
		return super.formater() + " J'adore mon " + nomVehicule() + "!";
	}
}
