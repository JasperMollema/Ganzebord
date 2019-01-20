
public class Einde extends SpelVak{

	public Einde(String naam) {
		super(naam);
		}
	
	@Override
	public int bezetVak (Speler speler, int plek) {
		System.out.println("Het spel is over! " + speler + " staat op " + plek + " en heeft gewonnen!");
		return 0;
	}

}
