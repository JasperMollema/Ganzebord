
public class Gevangenis extends SpelVak {
	
	public Gevangenis(String naam) {
		super(naam);
	}
	
	@Override
	public void gaUitVak(Speler speler) {
		if(spelers.size()>1) {
			spelers.remove(speler);
			System.out.println(speler + " mag uit de gevangenis!");
		}
		else {
			System.out.println(speler + " zit nog in de gevangenis!");
		}
	}
	
	
	@Override
	public int specialeActie(Speler speler, int worp) {
		if(spelers.contains(speler)) {
			return -worp;
		}
		else {
			return 0;
		}
	}
	
	@Override
	public int bezetVak(Speler speler, int vaknr) {
		if (spelers.contains(speler)) {
		
		}
		else {
			spelers.add(speler);
			System.out.println(speler + " is in de gevangenis beland! Hopen dat iemand je komt redden");
		}
		return 0;
	}
}
