
public class Herberg extends SpelVak{
	
	public Herberg(String naam) {
		super(naam);
	}
	
	@Override
	public int specialeActie (Speler speler, int worp) {
		if (speler.magVerder()) {
				System.out.println(speler+ " mag weer uit de Herberg!");
				System.out.println(speler + " heeft " + worp + " gegooid.");
				spelers.remove(speler);
				return 0;
			
		}
		else {
			spelers.add(speler);
			
			return -worp;
		}
	}
	
	@Override
	public void gaUitVak(Speler speler) {
		
	}

	@Override
	public int bezetVak(Speler speler, int vaknr) {
		System.out.println(speler +" is in de Herberg beland en moet een beurt overslaan!");
		return 0;
	}


}
