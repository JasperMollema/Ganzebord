import java.util.ArrayList;
import java.util.List;

public class SpelVak {
	public int aantalSpelers;
	List <Speler> spelers = new ArrayList<>();
	String naam;
	
	public SpelVak(String naam) {
		this.naam = naam;
	}
	
	public int voerUit(Speler speler) {
		spelers.remove(speler);
		int worp = speler.gooien();
		return worp;
	}
	
	public int specialeActie(Speler speler) {
		return 0;
	}
	
	public void bezetVak(Speler speler) {
		spelers.add(speler);
	}
	
	public void bezetVak(Speler speler, int vaknr) {
		spelers.add(speler);
		//PRINT BOODSCHAP VAN "NIKS AAN DE HAND" JE STAAT OP NORMAAL VAK
		System.out.println(speler + " staat op " + vaknr + ". Niets aan de hand!");
	}
	
	@Override
	public String toString() {
		return naam;
	}

	
	
	

}
