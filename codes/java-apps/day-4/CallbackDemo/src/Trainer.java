
public class Trainer {
	private Assistant assistant;

	public Trainer() {
		// TODO Auto-generated constructor stub
	}

	public Trainer(Assistant assistant) {
		this.assistant = assistant;
	}

	public Assistant getAssistant() {
		return assistant;
	}

	public void setAssistant(Assistant assistant) {
		this.assistant = assistant;
	}

	public void provideTraining() {

	}

	public void askForAssistance() {
		// what to do: call the helpTrainer and tell the assistant about kind of help
		// that is required
		// how to do: pass the reference of one of the method from Facilities class as
		// an argument to the helpTrainer method
		FacilityDelegate facility = Facilities::getAttendanceSheet;
		String response = this.assistant.helpTrainer(facility, 2);
		System.out.println(response);

	}
}
