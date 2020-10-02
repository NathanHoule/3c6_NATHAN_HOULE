package atelier2_6;

public abstract class Chat extends Animal {
	
	private int nombreOiseauxAttrapes;

	public Chat(int heuresTotalsDeSommeil, int nombreOiseauxAttrapes) {
		super(heuresTotalsDeSommeil);
		this.nombreOiseauxAttrapes = nombreOiseauxAttrapes;
	}

	@Override
	protected String typeDeCri() {
		return "miaulement";
	}
	
	@Override
	protected int heuresMinimalesDeSommeil() {
		return 3;
	}
	
	@Override
	public String formater() {
		StringBuilder builder = new StringBuilder();
		
		builder.append(super.formater());
		builder.append(" J'ai aussi attrapé " + this.nombreOiseauxAttrapes + " oiseaux.");
		
		return builder.toString();
	}
}
