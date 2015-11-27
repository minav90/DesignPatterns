package observerPattern;

public class ObserverPatternDemo {

	public static void main(String[] args) {
		Subject subject = new Subject();
		
		LittleIndia littleIndia = new LittleIndia(subject);
		IndianTadka indianTadka = new IndianTadka(subject);
		PunjabiRasoi punjabiRasoi = new PunjabiRasoi(subject);

		System.out.println("First Subject state change");
		subject.setState(15);
		System.out.println("Second Subject state change");
		subject.setState(20);
		
	}
	
}
