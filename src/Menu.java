import java.util.Scanner;

public class Menu {
	private Scanner reader = new Scanner(System.in);
	private static int aantalSpelers;
		
	public void vraagAantalSpelers() {
				System.out.println("Met hoeveel spelers wil je spelen?");
				aantalSpelers = reader.nextInt();
			}
		
	public void maakSpelers() {
		splitArraySpelers(maakArraySpelers());
	}
	private String[] maakArraySpelers() {
			String[] spelers = new String[aantalSpelers];
			String name;
			for(int i = 0; i<aantalSpelers; i++) {
				System.out.println("Geef de naam van speler " + (i+1) + " :");
				name = reader.nextLine();
				spelers[i] = name;
			}
			return spelers;
			
		}
	
	private Speler maakSpeler(String name) {
		
		Speler speler = new Speler (name);
		return speler;
	}
		
	private void splitArraySpelers(String[] spelers) {
			for (String speler : spelers) {
				maakSpeler(speler);
			}
	}

}
