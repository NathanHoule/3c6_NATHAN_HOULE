package atelier2_4;

public class ChatPersan extends Chat {

	@Override
	protected String nomAnimal() {
		return "chat persan";
	}
	
	@Override
	public int heuresMinimalesDeSommeil() {
		return 5;
	}
	
	public String rendreJoli(String mot) {
		return "joli " + mot;
	}
}
