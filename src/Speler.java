import java.util.Random;
import java.util.Scanner;
public class Speler {
	private int plaats;
	private Random random = new Random();
	Scanner reader = new Scanner(System.in);
	String naam;
	boolean slapen;
	
	public boolean magVerder(){
		return true;
	}
	
	public void blijfStaan() {
		
	}
	
	public boolean inHerberg() {
		if (slapen) {
			slapen = false;
			return true;
		}
		else {
			slapen = true;
			return false;
		}
	}
	
	public void sterf() {
		plaats = 0;
	}
	
	public int getPlaats() {
		return plaats;
	}
	
	public int gooien(){
		int worp = random.nextInt(6)+1;
		System.out.println(naam + " heeft " + worp + " gegooid!");
		return worp;
	}
	
	public Speler(String naam) {
		this.naam = naam;
	}
	
	public void gaVerder(int aantal) {
		plaats += aantal;
	}

	public String toString() {
		return naam;
	}
		
	public void test() {
		String plek = "Je staat op plaats ";
		String gooi = " Gooi je dobbelsteen (g)";
		while (true) {
		//String g = reader.nextLine();
		int worp = random.nextInt(6)+1;
		plaats += worp;
		System.out.print("Je hebt " + worp + " gegooid, ");
		if (plaats%10 == 0) {
			plaats +=worp;
			System.out.println("Bonus stapjes! " + plek + plaats + gooi);
		}
		else if (plaats == 63) {
			System.out.print(plek + plaats + "Je hebt gewonnen!".toUpperCase());
			break;
		}
		else if(plaats == 23) {
			System.out.print(plek + "Helaas, je bent in de gevangenis! Het spel is over".toUpperCase());
			break;
		}
		else if(plaats > 63) {
			plaats = 63-(plaats -63);
			System.out.println(plek + plaats + " Niks aan de hand!" + gooi);
		}
		else {
			System.out.println(plek + plaats + " Niks aan de hand!" + gooi);
		}
		}
		

	}
	
}

