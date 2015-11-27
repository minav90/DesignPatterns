package observerPattern;

public class IndianTadka implements Observer {

	private Subject subject;

	public IndianTadka(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {

		System.out.println("Indian Tadka updated : "+subject.getState());
	}
	
	
	
}
