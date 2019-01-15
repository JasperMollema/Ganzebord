import java.util.Scanner;

public class Spelers {
		private Scanner reader = new Scanner(System.in);
	
		public int aantalSpelers() {
			System.out.println("Met hoeveel spelers wil je spelen?");
			return reader.nextInt();
		}
	
	public String[] vraagNamen(int aantal) {
		String [] spelers = new String [aantal];
		for(int i = 0; i<aantal; i++) {
			System.out.println("Geef de naam van speler " + (i+1) + " :");
			spelers[i] = reader.nextLine();
		}
		return spelers;
	}
}
