
public class Doolhof extends SpelVak{
	
	public Doolhof(String naam) {
		super(naam);
	}
	
	public void verdwaald(Speler speler) {
		speler.gaVerder(-3);
	}

}
