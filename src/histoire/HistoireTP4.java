package histoire;

import personnages.Commercant;
import personnages.Humain;

public class HistoireTP4 {
	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", "thé", 20);
		marco.self.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.self.boire();
		
		
		Humain prof=new Humain("Prof", "kombucha", 54);
		prof.direBonjour();
		prof.acheter("une boisson", 12);
		prof.boire();
		prof.acheter("un jeu", 2);
		prof.acheter("un kimono", 50);
		
	}
}
