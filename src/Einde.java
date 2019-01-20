
public class Einde extends SpelVak{

	public Einde(String naam) {
		super(naam);
		}
	
	@Override
	public void bezetVak(Speler speler, int plek) {
		System.out.println("Het spel is over! " + speler + " staat op " + plek + " en heeft gewonnen!");
	}

	@Override
	public int voerUit(Speler speler) {
		return 0;
	}
}
