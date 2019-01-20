import java.util.Arrays;
import java.time.*;
import java.util.List;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		
		List <Speler> spelers = new ArrayList<>();
		Speler jasper = new Speler("Jasper");
		Speler sara = new Speler("Sara");
		spelers.add(jasper);
		spelers.add(sara);
		Speler alexander = new Speler("Alexander");
		spelers.add(alexander);
		SpelBord bord = new SpelBord(spelers);
		bord.maakBord();
		bord.zetSpelersOpBord();
		
		bord.speelBeurt();
		
	}
	
}
	

