import java.util.Random;
import java.util.Scanner;
public class Speler {
	private int plaats;
	private Random random = new Random();
	private Scanner reader = new Scanner(System.in);
	private String naam;
	private int beurtenInHerberg;
	
	public Speler(String naam) {
		this.naam = naam;
	}
	
	
	public boolean magVerder(){
		if(beurtenInHerberg<1) {
			beurtenInHerberg ++;
			return false;
		}
		else {
			beurtenInHerberg = 0;
			return true;
		}
			
	}
	
	public int gooien(){
//		System.out.println(naam +" is aan de beurt, toets g om te gooien");
//		String gooi = reader.nextLine();
		int worp = random.nextInt(6)+1;
		return worp;
	}
	

	public String toString() {
		return naam;
	}
		
		
}

