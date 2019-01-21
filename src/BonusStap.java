
public class BonusStap extends SpelVak{
	private int plaats;

	public BonusStap(String naam, int plaats) {
		super(naam);
		this.plaats = plaats;
	}
	
	private int berekenPlaats(int worp) {
		int nieuwePlaats = worp + plaats;
		if (nieuwePlaats > 63) {
			return 63 - (nieuwePlaats-63);
		}
		return nieuwePlaats;
	}

	
	@Override
	public int specialeActie(Speler speler, int worp) {
		System.out.println(speler + " heeft " + worp + " gegooid. Bonusstapjes!");
		System.out.println("Je gaat " + worp + " voorruit en staat nu op plek " + berekenPlaats(worp));
		return worp;
	}
	
	@Override
	public int bezetVak(Speler speler, int plek) {
		return 0;
	}
}
