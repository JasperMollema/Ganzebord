import java.util.ArrayList;
import java.util.Scanner;


public class Spelers {
private ArrayList<Speler> spelers = new ArrayList<>();
private Scanner reader = new Scanner(System.in);


public void voegSpelersToe(int aantal){
	for(int i = 0; i < aantal; i++) {
		String naam = reader.nextLine();
		spelers.add(new Speler(naam));
	}
}

public void zetSpelersOpBord(){
	new SpelBord(spelers);
	}

public void startSpel() {
	for(Speler speler : spelers) {
		speler.test();
		System.out.println();
	}
}

public void printSpelers(){
	for(Speler speler: spelers) {
		System.out.println(speler);
	}
}
}


