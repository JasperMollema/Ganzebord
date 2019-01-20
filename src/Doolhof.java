
public class Doolhof extends SpelVak{
	
	public Doolhof(String naam) {
		super(naam);
	}
	
	@Override
	public int specialeActie(Speler speler, int worp) {
		return 0;
	}
	
	@Override
	public int bezetVak(Speler speler, int nieuwePlek) {
		System.out.println(speler + " is in het doolhof beland en gaat terug naar 39!");
		return -3;
	}
	
	
}


