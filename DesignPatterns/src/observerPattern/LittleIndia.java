package observerPattern;

public class LittleIndia implements Observer{

	private Subject subject;

	public LittleIndia(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {

		System.out.println("Little India updated : "+ subject.getState());
	}
	
}
