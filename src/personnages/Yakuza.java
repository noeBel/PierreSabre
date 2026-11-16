package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation=0;
	
	public Yakuza(String nom, String boissonFavorite, int quantiteArgent, String clan) {
		super(nom, boissonFavorite, quantiteArgent);
		this.clan = clan;
	}

	public int getReputation() {
		return reputation;
	}

	public void setReputation(int reputation) {
		this.reputation = reputation;
	}

	public String getClan() {
		return clan;
	}
	
	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom()+", si tu tiens à la vie donne moi ta bourse !");
		int bourse = victime.seFaireExtorquer();
		gagnerArgent(bourse);
		reputation++;
		parler("J’ai piqué les "+bourse+" sous de "+victime.getNom()+", ce qui me fait "+getQuantiteArgent()+" sous dans ma poche. Hi ! Hi !");
	}
	public int perdre() {
		int perte=getQuantiteArgent();
		parler("J’ai perdu mon duel et mes "+perte+" sous, snif... J'ai déshonoré le clan de "+clan+".");
		perdreArgent(perte);
		return perte;
	}
	public void gagner(int gain) {
		parler("Ce ronin pensait vraiment battre "+getNom()+" du clan de "+clan+" ? Je l'ai dépouillé de ses "+gain+" sous.");
	}

	
	
}
