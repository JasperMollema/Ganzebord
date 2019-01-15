import java.util.ArrayList;
import java.util.Random;

public class Spelers {
private ArrayList<Speler> Spelers = new ArrayList<>();
private Random random = new Random();

public void voegSpelerToe(Speler speler) {
	Spelers.add(speler);
	}

public int gooiDobbelsteen() {
	return random.nextInt(5)+1;
	}

public void verplaatsSpeler(Speler speler, int aantalPlekken) {
	speler.verplaats(aantalPlekken);
	}

public void speelRonde() {
	for (Speler speler : Spelers) {
		verplaatsSpeler(speler, gooiDobbelsteen());
		}
	}
}


