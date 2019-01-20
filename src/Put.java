
public class Put extends SpelVak{
	
	public Put(String naam) {
		super(naam);
	}
	
	@Override
	public void gaUitVak(Speler speler) {
		if(spelers.size()>1) {
			spelers.remove(speler);
			System.out.println(speler + " mag uit de put!");
		}
		else {
			System.out.println(speler + " zit nog in de put!");
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
			System.out.println(speler + " is in de put beland! Hopen dat iemand je komt redden");
		}
		return 0;
	}
	
}
	
	
	
