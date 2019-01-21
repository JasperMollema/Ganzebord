import java.util.ArrayList;
import java.util.List;

public class SpelVak {
	public int aantalSpelers;
	protected List <Speler> spelers = new ArrayList<>();
	private String naam;
	
	public SpelVak(String naam) {
		this.naam = naam;
	}
	
	public void gaUitVak(Speler speler) {
		spelers.remove(speler);
		}
	
	public int specialeActie(Speler speler, int worp) {
		System.out.println(speler + " heeft " + worp + " gegooid!");
		return 0;
	}
	
	public void bezetVak(Speler speler) {
		
	}
	
	public int  bezetVak(Speler speler, int vaknr) {
		spelers.add(speler);
		System.out.println(speler + " staat op " + vaknr + ". Niets aan de hand!");
		return 0;
	}
	
	@Override
	public String toString() {
		return naam;
	}

	
	
	

}
