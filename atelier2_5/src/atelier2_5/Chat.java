package atelier2_5;

public abstract class Chat extends Animal {

	@Override
	protected String typeDeCri() {
		return "miaulement";
	}
	
	@Override
	protected int heuresMinimalesDeSommeil() {
		return 3;
	}
}
