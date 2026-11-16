package personnages;

public class Ronin extends Humain {
	private int honneur=1;

	public Ronin(String nom, String boissonFavorite, int quantiteArgent) {
		super(nom, boissonFavorite, quantiteArgent);
	}
	public void donner(Commercant beneficiaire) {
		int don=getQuantiteArgent()/10;
		parler(beneficiaire.getNom()+" prend ces 6 sous.");
		perdreArgent(don);
		beneficiaire.recevoir(don);
	}
	public void provoquer(Yakuza adversaire) {
		int force=honneur*2;
		if (force>=adversaire.getReputation()) {
			parler("Je t’ai eu petit yakusa!");
			gagnerArgent(adversaire.perdre());
			honneur++;
			
		}
		else {
			int perte=getQuantiteArgent();
			perdreArgent(perte);
			adversaire.gagner(perte);
			honneur--;
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
		}
	}
}
