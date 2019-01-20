
public class Brug extends SpelVak{
	
	public Brug(String naam) {
		super(naam);
	}

	
	@Override
	public int specialeActie(Speler speler, int worp) {
		return 0;
	}
	
	@Override
	public int bezetVak(Speler speler, int nieuwePlek) {
		System.out.println(speler + " is op de brug beland en mag 6 plekjes "
				+ "voorruit en staat nu op plek 12. Niets aan de hand!");
		return 6;
	}
	
	
}
