
public class App {

	public static void main(String[] args) {
		Assistant kuldeepAssistant = new Assistant("Kuldeep");
		Trainer joydipTrainer = new Trainer();
		joydipTrainer.setAssistant(kuldeepAssistant);	
		joydipTrainer.askForAssistance();
	}

}
