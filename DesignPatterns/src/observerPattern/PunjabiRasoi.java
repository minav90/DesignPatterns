package observerPattern;

public class PunjabiRasoi implements Observer{

	private Subject subject;

	public PunjabiRasoi(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {

		System.out.println("Punjabi Rasoi updated : "+ subject.getState());
	}
	
	
	
}
