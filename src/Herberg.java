
public class Herberg extends SpelVak{
	
	public Herberg(String naam) {
		super(naam);
	}
	
	public void blijfSlapen(Speler speler) {
		speler.blijfStaan();
	}
	
	@Override
	public int voerUit(Speler speler) {
		if (speler.inHerberg()) {
			System.out.println(speler + " mag weer uit de herberg!");
			spelers.remove(speler);
			return speler.gooien();
		}
		else {
			return 0;
		}
	}

	@Override
	public void bezetVak(Speler speler) {
		spelers.add(speler);
		System.out.println(speler + " is in de herberg beland en moet een beurt overslaan!");
		
	}


}
