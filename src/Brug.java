
public class Brug extends SpelVak{
	
	public Brug(String naam) {
		super(naam);
	}

//	@Override
//	public int voerUit(Speler speler) {
//		System.out.println(speler + " is op de brug belandt en gaat 6 stapjes vooruit");
//		return 6;
//	}
	
	@Override
	public int specialeActie(Speler speler, int worp) {
		System.out.println(speler + " is op de brug belandt en mag 6 plekjes voorruit");
		return 6;
	}
	
}
