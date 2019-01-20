
public class Herberg extends SpelVak{
	
	public Herberg(String naam) {
		super(naam);
	}
	
	@Override
	public int specialeActie (Speler speler, int worp) {
		if(speler.inHerberg()) {
			if(speler.magVerder()) {
				System.out.println(speler+ " mag weer uit de Herberg!");
				spelers.remove(speler);
				return 0;
			}
			else {
				System.out.println(speler + " zit nog in de Herberg en moet deze beurt overslaan");
				return -worp;
			}
		}
		else {
			spelers.add(speler);
			System.out.println(speler +" is in de Herberg belandt en moet een beurt overslaan!");
			return 0;
		}
	}
	
	@Override
	public void gaUitVak(Speler speler) {
		
	}

	@Override
	public void bezetVak(Speler speler, int vaknr) {
		
	}


}
