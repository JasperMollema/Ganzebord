import java.util.ArrayList;
import java.util.Scanner;


public class Spelers {
private ArrayList<Speler> spelers = new ArrayList<>();
private Scanner reader = new Scanner(System.in);

public void voegSpelersToe(int aantalSpelers) {
	System.out.println("Welkom bij Ganzenbord!");
	for(int i=0; i<aantalSpelers; i++) {
		System.out.println("Type de naam van speler " + (i+1) + ":");
		reader = new Scanner(System.in);
		String naam= reader.nextLine();
		spelers.add(new Speler(naam));
	}
}

public void startSpel(){
	SpelBord bord = new SpelBord(spelers);
	bord.maakBord();
	bord.zetSpelersOpBord();
	bord.speelSpel();
	
	}


}


