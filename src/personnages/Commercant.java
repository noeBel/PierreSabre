package personnages;

public class Commercant {
	public Humain self;
	
	public Commercant(String nom, String boissonFavorite, int quantiteArgent) {
		self = new Humain(nom, boissonFavorite, quantiteArgent);
	}
	public int seFaireExtorquer() {
		int argent=self.getQuantiteArgent();
		self.perdreArgent(argent);
		self.parler("J’ai tout perdu! Le monde est trop injuste...");
		return argent;
	}
	public void recevoir(int argent) {
		self.gagnerArgent(argent);
		self.parler(argent+" sous ! Je te remercie généreux donateur!");
	}
}
