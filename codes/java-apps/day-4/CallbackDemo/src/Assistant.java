
public class Assistant {
	private String name;
	public Assistant() {
		// TODO Auto-generated constructor stub
	}
	
	public Assistant(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//the method will accept reference of another method as an argument so that it can call back that method
	public String helpTrainer(FacilityDelegate facility, int count) {
		return facility.facilitate(count);
	}
}
