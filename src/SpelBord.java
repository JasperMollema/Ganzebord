import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SpelBord {
	SpelVak[] bord = new SpelVak[80];
	List<Integer> bezetteVakjes = new ArrayList<>();
	List<Speler> spelers = new ArrayList<>();
	Map<Speler, Integer> spelerPlek = new HashMap<>();
	int groteBord;
	
	public SpelBord(List<Speler> spelers2) {
		this.spelers = spelers2;
	}
	
	public void zetSpelersOpBord() {
		for (Speler speler: spelers) {
			bord[0].bezetVak(speler);
			spelerPlek.put(speler, 0);
		}
		bezetteVakjes.add(0);
	}
	
	public void speelBeurt() {
		SPEL_LOOP: while (true) {
			for(Speler speler : spelers){
				int vakje = spelerPlek.get(speler);	
				bord[vakje].gaUitVak(speler);
				int worp = 58;//speler.gooien();
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
			}
		}
		
	}
	
	public void zetSpelerOp(int vakje) {
		bezetteVakjes.add(vakje);
	}
	
	private void maakSpecialeVakjes() {
		bord [6 ] = new Brug ("Brug");
		bord [19] = new Herberg("Herberg");
		bord [31] = new Put("Put");
		bord [42] = new Doolhof("Doolhof");
		bord [52] = new Gevangenis("Gevangenis");
		bord [58] = new Dood("Dood");
		bord [63] = new Einde("Einde!");			
	}
	
	private void maakNormaleVakjes() {
		for(int i = 0; i<80; i++) {
			if(bord[i] == null) {
				bord[i] = new SpelVak("Normaal");
			}
		}
	}
	
	public void maakBord() {
		maakSpecialeVakjes();
		maakNormaleVakjes();
		groteBord = bord.length;
	}
	
	public void printBord() {
		for (int i = 0; i<64; i++) {
			System.out.println("Spelvak " + (i+1) + " een " + bord[i].toString() + " vak.");
		}
	}
}