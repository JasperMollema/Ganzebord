import java.util.Scanner;

public class Menu {
	private Scanner reader = new Scanner(System.in);
	
	public static void startMenu(int aantalSpelers) {
		System.out.println("Met hoeveel spelers wil je Spelen?");
		System.out.println("Je staat op start. Gooi je dobbelsteen (g):");
		Spelers spelers = new Spelers ();
		spelers.voegSpelersToe(aantalSpelers);
		spelers.printSpelers();
	}
	
	public void leesInvoer(int aantalSpelers) {
		
		for(int i=0; i<aantalSpelers; i++) {
			System.out.println("Type de naam van schaatser " + (i+1) + ":");
			reader = new Scanner(System.in);
			String naam= reader.nextLine();
			voegSpelerToe(naam);
		}
	}

	private void voegSpelerToe(String naam) {
		// TODO Auto-generated method stub
		
	}
}
