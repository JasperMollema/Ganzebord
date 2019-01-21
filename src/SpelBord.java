import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SpelBord {
	private SpelVak[] bord = new SpelVak[70];
	private List<Integer> bezetteVakjes = new ArrayList<>();
	private List<Speler> spelers = new ArrayList<>();
	private Map<Speler, Integer> spelerPlek = new HashMap<>();
		
	public SpelBord(List<Speler> spelers) {
		this.spelers = spelers;
	}
	
	public void zetSpelersOpBord() {
		for (Speler speler: spelers) {
			bord[0].bezetVak(speler);
			spelerPlek.put(speler, 0);
		}
		bezetteVakjes.add(0);
	}
	
	public void speelSpel() {
		SPEL_LOOP: while (true) {
			for(Speler speler : spelers){
				int vakje = spelerPlek.get(speler);	
				bord[vakje].gaUitVak(speler);
				int worp = speler.gooien();
				int nieuwePlek = worp + vakje;
				nieuwePlek +=  bord[vakje].specialeActie(speler, worp);
				if(nieuwePlek == 63) {
					bord[nieuwePlek].bezetVak(speler, nieuwePlek);
					break SPEL_LOOP;
				}
				else if (nieuwePlek>63) {
					nieuwePlek = 63 - (nieuwePlek -63);
				}
				nieuwePlek += bord[nieuwePlek].bezetVak(speler, nieuwePlek);
				spelerPlek.put(speler, nieuwePlek);
				System.out.println("");
			}
		}
		
	}
	
	
	private void maakSpecialeVakjes() {
		bord [6 ] = new Brug ("Brug");
		bord [10] = new BonusStap("BonusStap1", 10);
		bord [19] = new Herberg("Herberg");
		bord [20] = new BonusStap("BonusStap2", 20);
		bord [30] = new BonusStap("BonusStap3", 30);
		bord [31] = new Put("Put");
		bord [40] = new BonusStap("BonusStap", 40);
		bord [42] = new Doolhof("Doolhof");
		bord [50] = new BonusStap("BonusStap", 50);
		bord [52] = new Gevangenis("Gevangenis");
		bord [58] = new Dood("Dood");
		bord [60] = new BonusStap("BonusStap", 60);
		bord [63] = new Einde("Einde!");			
	}
	
	private void maakNormaleVakjes() {
		for(int i = 0; i<70; i++) {
			if(bord[i] == null) {
				bord[i] = new SpelVak("Normaal");
			}
		}
	}
	
	public void maakBord() {
		maakSpecialeVakjes();
		maakNormaleVakjes();
		}

}