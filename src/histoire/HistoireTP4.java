package histoire;

import personnages.Commercant;
import personnages.Humain;

public class HistoireTP4 {

	public static void main(String[] args) {
		// test 1
		System.out.println("---test 1---");
		Humain prof = new Humain("Prof", "kombucha", 54);
		prof.direBonjour();
		prof.acheter("une boisson", 12);
		prof.boire();
		prof.acheter("un jeu", 2);
		prof.acheter("un kimono", 50);

		// test 2.1
		System.out.println("");
		System.out.println("---test 2.1---");
		Commercant marco = new Commercant("Marco", 20);
		marco.direBonjour();
		marco.seFaireExtrorquer();
		marco.recevoir(15);
		marco.boire();
	}
}
