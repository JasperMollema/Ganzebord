
public class Dood extends SpelVak{
	
	public Dood(String naam) {
		super (naam);
	}
	
	@Override
	public int specialeActie(Speler speler, int worp) {
		return 0;
	}
	
	@Override
	public int bezetVak(Speler speler, int nieuwePlek) {
		System.out.println(speler + " is overleden en moet opnieuw beginnen! ");
		return -58;
	}

}
